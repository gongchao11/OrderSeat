/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.orderseat.facade.enums;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-10")
public enum ValidEnum implements org.apache.thrift.TEnum {
  TRUE(0),
  FALSE(1);

  private final int value;

  private ValidEnum(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static ValidEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return TRUE;
      case 1:
        return FALSE;
      default:
        return null;
    }
  }
}
