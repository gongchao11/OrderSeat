/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.orderseat.facade.response;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-11-21")
public class result implements org.apache.thrift.TBase<result, result._Fields>, java.io.Serializable, Cloneable, Comparable<result> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("result");

  private static final org.apache.thrift.protocol.TField SEAT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("seatId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new resultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new resultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String seatId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEAT_ID((short)1, "seatId"),
    STATUS((short)2, "status");

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
        case 1: // SEAT_ID
          return SEAT_ID;
        case 2: // STATUS
          return STATUS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEAT_ID, new org.apache.thrift.meta_data.FieldMetaData("seatId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(result.class, metaDataMap);
  }

  public result() {
  }

  public result(
    java.lang.String seatId,
    java.lang.String status)
  {
    this();
    this.seatId = seatId;
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public result(result other) {
    if (other.isSetSeatId()) {
      this.seatId = other.seatId;
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
  }

  public result deepCopy() {
    return new result(this);
  }

  @Override
  public void clear() {
    this.seatId = null;
    this.status = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSeatId() {
    return this.seatId;
  }

  public result setSeatId(@org.apache.thrift.annotation.Nullable java.lang.String seatId) {
    this.seatId = seatId;
    return this;
  }

  public void unsetSeatId() {
    this.seatId = null;
  }

  /** Returns true if field seatId is set (has been assigned a value) and false otherwise */
  public boolean isSetSeatId() {
    return this.seatId != null;
  }

  public void setSeatIdIsSet(boolean value) {
    if (!value) {
      this.seatId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStatus() {
    return this.status;
  }

  public result setStatus(@org.apache.thrift.annotation.Nullable java.lang.String status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SEAT_ID:
      if (value == null) {
        unsetSeatId();
      } else {
        setSeatId((java.lang.String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SEAT_ID:
      return getSeatId();

    case STATUS:
      return getStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SEAT_ID:
      return isSetSeatId();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof result)
      return this.equals((result)that);
    return false;
  }

  public boolean equals(result that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_seatId = true && this.isSetSeatId();
    boolean that_present_seatId = true && that.isSetSeatId();
    if (this_present_seatId || that_present_seatId) {
      if (!(this_present_seatId && that_present_seatId))
        return false;
      if (!this.seatId.equals(that.seatId))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSeatId()) ? 131071 : 524287);
    if (isSetSeatId())
      hashCode = hashCode * 8191 + seatId.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(result other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSeatId()).compareTo(other.isSetSeatId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeatId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seatId, other.seatId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("result(");
    boolean first = true;

    sb.append("seatId:");
    if (this.seatId == null) {
      sb.append("null");
    } else {
      sb.append(this.seatId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (seatId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'seatId' was not present! Struct: " + toString());
    }
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public resultStandardScheme getScheme() {
      return new resultStandardScheme();
    }
  }

  private static class resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<result> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, result struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEAT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.seatId = iprot.readString();
              struct.setSeatIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.status = iprot.readString();
              struct.setStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, result struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.seatId != null) {
        oprot.writeFieldBegin(SEAT_ID_FIELD_DESC);
        oprot.writeString(struct.seatId);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeString(struct.status);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public resultTupleScheme getScheme() {
      return new resultTupleScheme();
    }
  }

  private static class resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<result> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, result struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.seatId);
      oprot.writeString(struct.status);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, result struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.seatId = iprot.readString();
      struct.setSeatIdIsSet(true);
      struct.status = iprot.readString();
      struct.setStatusIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
