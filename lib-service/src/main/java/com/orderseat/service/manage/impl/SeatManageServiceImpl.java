package com.orderseat.service.manage.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.orderseat.common.enums.ValidEnum;
import com.orderseat.common.utils.system.COMMON;
import com.orderseat.common.utils.system.Random;
import com.orderseat.dal.model.SeatOccupyTimeModel;
import com.orderseat.redis.service.RedisService;
import com.orderseat.service.manage.SeatManageService;
import com.orderseat.service.repository.OrderSeatRepository;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author: tyoukai
 * @date: 2019-11-27 21:08
 * @description: 座位管理实现类
 * @version: v1.0
 */
@Service
public class SeatManageServiceImpl implements SeatManageService {

    @Autowired
    private RedisService redisService;

    @Resource(name="redisExecutor")
    private ThreadPoolTaskExecutor redisExecutorPool;

    @Autowired
    private OrderSeatRepository orderSeatRepository;

    @Value("${redis.getTime}")
    private int getTime;


    @Override
    public List<String> getSeatFromRedis() {
        String redisListPattern = COMMON.REDIS_LIST_NAME_PREFIX + COMMON.REDIS_SEPARATOR;
        Set<String> keys = redisService.keys(redisListPattern);
        // 最终选出来的占座成功的座位列表
        List<String> seatList = new ArrayList<>();

        for (String key : keys) {
            redisExecutorPool.submit(() -> realGetSeatFromRedis(key, seatList));
        }
        return seatList;
    }

    @Override
    public void persistence(List<String> list) {
        for (String seatInfo : list) {
            if (StringUtils.isBlank(seatInfo)) {
                continue;
            }
            JSONObject jsonObject = JSON.parseObject(seatInfo);
            String seatKey = COMMON.REDIS_SEAT_NAME_PREFIX + COMMON.REDIS_SEPARATOR + jsonObject.getString("id");
            if (StringUtils.isNotBlank((String) redisService.get(seatKey))) {
                return;
            }

            try {
                SeatOccupyTimeModel seatOccupyTimeModel = new SeatOccupyTimeModel();
                seatOccupyTimeModel.setSeatId(jsonObject.getString("id"));
                seatOccupyTimeModel.setStartTime(DateUtils.parseDate(jsonObject.getString("startTime"), "yyyyMMdd:HHmmss"));
                seatOccupyTimeModel.setStartTime(DateUtils.parseDate(jsonObject.getString("endTime"), "yyyyMMdd:HHmmss"));
                seatOccupyTimeModel.setUserId(jsonObject.getString("userId"));
                seatOccupyTimeModel.setValid(ValidEnum.TRUE);
                orderSeatRepository.add(seatOccupyTimeModel);

                redisService.set(seatKey, seatInfo, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 从redis的具体队列中获取数据，目前的获取逻辑是：
     *
     * 从队列的前20个值中随机选择一个：防止靠前的请求是某些同学通过程序抢的
     *
     * 暂时不考虑：若队列长度不到20，等到1s，然后从中随机挑选一个， 存在一个问题：如果所有队列的list长度都不到20
     *
     * 那线程池处理就会很慢
     *
     * @param key
     * @param list
     */
    private void realGetSeatFromRedis(String key, List<String> list) {
        String luckyGuy = "";
        long sTime = System.currentTimeMillis();
        // 当取出的数据不为空，并且时间小于1s时
        while (StringUtils.isBlank(luckyGuy) && (System.currentTimeMillis() - sTime) < getTime) {
            int index = Random.getRandomNum(COMMON.REDIS_SCOPE);
            luckyGuy = (String) redisService.lIndex(key, index);
        }
        list.add(luckyGuy);
    }
}
