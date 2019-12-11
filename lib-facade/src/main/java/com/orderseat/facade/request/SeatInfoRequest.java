/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.orderseat.facade.request;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-10")
public class SeatInfoRequest implements org.apache.thrift.TBase<SeatInfoRequest, SeatInfoRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SeatInfoRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SeatInfoRequest");

  private static final org.apache.thrift.protocol.TField SEAT_INFO_DTO_FIELD_DESC = new org.apache.thrift.protocol.TField("seatInfoDto", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PAGE_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("pageNum", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("pageSize", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SeatInfoRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SeatInfoRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.orderseat.facade.dto.SeatInfoDto seatInfoDto; // required
  public int pageNum; // required
  public int pageSize; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEAT_INFO_DTO((short)1, "seatInfoDto"),
    PAGE_NUM((short)2, "pageNum"),
    PAGE_SIZE((short)3, "pageSize");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SEAT_INFO_DTO
          return SEAT_INFO_DTO;
        case 2: // PAGE_NUM
          return PAGE_NUM;
        case 3: // PAGE_SIZE
          return PAGE_SIZE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PAGENUM_ISSET_ID = 0;
  private static final int __PAGESIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEAT_INFO_DTO, new org.apache.thrift.meta_data.FieldMetaData("seatInfoDto", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.orderseat.facade.dto.SeatInfoDto.class)));
    tmpMap.put(_Fields.PAGE_NUM, new org.apache.thrift.meta_data.FieldMetaData("pageNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("pageSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SeatInfoRequest.class, metaDataMap);
  }

  public SeatInfoRequest() {
  }

  public SeatInfoRequest(
    com.orderseat.facade.dto.SeatInfoDto seatInfoDto,
    int pageNum,
    int pageSize)
  {
    this();
    this.seatInfoDto = seatInfoDto;
    this.pageNum = pageNum;
    setPageNumIsSet(true);
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SeatInfoRequest(SeatInfoRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSeatInfoDto()) {
      this.seatInfoDto = new com.orderseat.facade.dto.SeatInfoDto(other.seatInfoDto);
    }
    this.pageNum = other.pageNum;
    this.pageSize = other.pageSize;
  }

  public SeatInfoRequest deepCopy() {
    return new SeatInfoRequest(this);
  }

  @Override
  public void clear() {
    this.seatInfoDto = null;
    setPageNumIsSet(false);
    this.pageNum = 0;
    setPageSizeIsSet(false);
    this.pageSize = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public com.orderseat.facade.dto.SeatInfoDto getSeatInfoDto() {
    return this.seatInfoDto;
  }

  public SeatInfoRequest setSeatInfoDto(@org.apache.thrift.annotation.Nullable com.orderseat.facade.dto.SeatInfoDto seatInfoDto) {
    this.seatInfoDto = seatInfoDto;
    return this;
  }

  public void unsetSeatInfoDto() {
    this.seatInfoDto = null;
  }

  /** Returns true if field seatInfoDto is set (has been assigned a value) and false otherwise */
  public boolean isSetSeatInfoDto() {
    return this.seatInfoDto != null;
  }

  public void setSeatInfoDtoIsSet(boolean value) {
    if (!value) {
      this.seatInfoDto = null;
    }
  }

  public int getPageNum() {
    return this.pageNum;
  }

  public SeatInfoRequest setPageNum(int pageNum) {
    this.pageNum = pageNum;
    setPageNumIsSet(true);
    return this;
  }

  public void unsetPageNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGENUM_ISSET_ID);
  }

  /** Returns true if field pageNum is set (has been assigned a value) and false otherwise */
  public boolean isSetPageNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGENUM_ISSET_ID);
  }

  public void setPageNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGENUM_ISSET_ID, value);
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public SeatInfoRequest setPageSize(int pageSize) {
    this.pageSize = pageSize;
    setPageSizeIsSet(true);
    return this;
  }

  public void unsetPageSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  /** Returns true if field pageSize is set (has been assigned a value) and false otherwise */
  public boolean isSetPageSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGESIZE_ISSET_ID);
  }

  public void setPageSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGESIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SEAT_INFO_DTO:
      if (value == null) {
        unsetSeatInfoDto();
      } else {
        setSeatInfoDto((com.orderseat.facade.dto.SeatInfoDto)value);
      }
      break;

    case PAGE_NUM:
      if (value == null) {
        unsetPageNum();
      } else {
        setPageNum((java.lang.Integer)value);
      }
      break;

    case PAGE_SIZE:
      if (value == null) {
        unsetPageSize();
      } else {
        setPageSize((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SEAT_INFO_DTO:
      return getSeatInfoDto();

    case PAGE_NUM:
      return getPageNum();

    case PAGE_SIZE:
      return getPageSize();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SEAT_INFO_DTO:
      return isSetSeatInfoDto();
    case PAGE_NUM:
      return isSetPageNum();
    case PAGE_SIZE:
      return isSetPageSize();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SeatInfoRequest)
      return this.equals((SeatInfoRequest)that);
    return false;
  }

  public boolean equals(SeatInfoRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_seatInfoDto = true && this.isSetSeatInfoDto();
    boolean that_present_seatInfoDto = true && that.isSetSeatInfoDto();
    if (this_present_seatInfoDto || that_present_seatInfoDto) {
      if (!(this_present_seatInfoDto && that_present_seatInfoDto))
        return false;
      if (!this.seatInfoDto.equals(that.seatInfoDto))
        return false;
    }

    boolean this_present_pageNum = true;
    boolean that_present_pageNum = true;
    if (this_present_pageNum || that_present_pageNum) {
      if (!(this_present_pageNum && that_present_pageNum))
        return false;
      if (this.pageNum != that.pageNum)
        return false;
    }

    boolean this_present_pageSize = true;
    boolean that_present_pageSize = true;
    if (this_present_pageSize || that_present_pageSize) {
      if (!(this_present_pageSize && that_present_pageSize))
        return false;
      if (this.pageSize != that.pageSize)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSeatInfoDto()) ? 131071 : 524287);
    if (isSetSeatInfoDto())
      hashCode = hashCode * 8191 + seatInfoDto.hashCode();

    hashCode = hashCode * 8191 + pageNum;

    hashCode = hashCode * 8191 + pageSize;

    return hashCode;
  }

  @Override
  public int compareTo(SeatInfoRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSeatInfoDto()).compareTo(other.isSetSeatInfoDto());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeatInfoDto()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seatInfoDto, other.seatInfoDto);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPageNum()).compareTo(other.isSetPageNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageNum, other.pageNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPageSize()).compareTo(other.isSetPageSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageSize, other.pageSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SeatInfoRequest(");
    boolean first = true;

    sb.append("seatInfoDto:");
    if (this.seatInfoDto == null) {
      sb.append("null");
    } else {
      sb.append(this.seatInfoDto);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pageNum:");
    sb.append(this.pageNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pageSize:");
    sb.append(this.pageSize);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (seatInfoDto == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'seatInfoDto' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (seatInfoDto != null) {
      seatInfoDto.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SeatInfoRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SeatInfoRequestStandardScheme getScheme() {
      return new SeatInfoRequestStandardScheme();
    }
  }

  private static class SeatInfoRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<SeatInfoRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SeatInfoRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEAT_INFO_DTO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.seatInfoDto = new com.orderseat.facade.dto.SeatInfoDto();
              struct.seatInfoDto.read(iprot);
              struct.setSeatInfoDtoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PAGE_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageNum = iprot.readI32();
              struct.setPageNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageSize = iprot.readI32();
              struct.setPageSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SeatInfoRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.seatInfoDto != null) {
        oprot.writeFieldBegin(SEAT_INFO_DTO_FIELD_DESC);
        struct.seatInfoDto.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PAGE_NUM_FIELD_DESC);
      oprot.writeI32(struct.pageNum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.pageSize);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SeatInfoRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SeatInfoRequestTupleScheme getScheme() {
      return new SeatInfoRequestTupleScheme();
    }
  }

  private static class SeatInfoRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<SeatInfoRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SeatInfoRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.seatInfoDto.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPageNum()) {
        optionals.set(0);
      }
      if (struct.isSetPageSize()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPageNum()) {
        oprot.writeI32(struct.pageNum);
      }
      if (struct.isSetPageSize()) {
        oprot.writeI32(struct.pageSize);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SeatInfoRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.seatInfoDto = new com.orderseat.facade.dto.SeatInfoDto();
      struct.seatInfoDto.read(iprot);
      struct.setSeatInfoDtoIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.pageNum = iprot.readI32();
        struct.setPageNumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.pageSize = iprot.readI32();
        struct.setPageSizeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

