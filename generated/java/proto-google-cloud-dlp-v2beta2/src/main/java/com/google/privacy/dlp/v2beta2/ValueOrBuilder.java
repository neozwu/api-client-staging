// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta2.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 integer_value = 1;</code>
   */
  long getIntegerValue();

  /**
   * <code>double float_value = 2;</code>
   */
  double getFloatValue();

  /**
   * <code>string string_value = 3;</code>
   */
  java.lang.String getStringValue();
  /**
   * <code>string string_value = 3;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>bool boolean_value = 4;</code>
   */
  boolean getBooleanValue();

  /**
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   */
  boolean hasTimestampValue();
  /**
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   */
  com.google.protobuf.Timestamp getTimestampValue();
  /**
   * <code>.google.protobuf.Timestamp timestamp_value = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder();

  /**
   * <code>.google.type.TimeOfDay time_value = 6;</code>
   */
  boolean hasTimeValue();
  /**
   * <code>.google.type.TimeOfDay time_value = 6;</code>
   */
  com.google.type.TimeOfDay getTimeValue();
  /**
   * <code>.google.type.TimeOfDay time_value = 6;</code>
   */
  com.google.type.TimeOfDayOrBuilder getTimeValueOrBuilder();

  /**
   * <code>.google.type.Date date_value = 7;</code>
   */
  boolean hasDateValue();
  /**
   * <code>.google.type.Date date_value = 7;</code>
   */
  com.google.type.Date getDateValue();
  /**
   * <code>.google.type.Date date_value = 7;</code>
   */
  com.google.type.DateOrBuilder getDateValueOrBuilder();

  public com.google.privacy.dlp.v2beta2.Value.TypeCase getTypeCase();
}
