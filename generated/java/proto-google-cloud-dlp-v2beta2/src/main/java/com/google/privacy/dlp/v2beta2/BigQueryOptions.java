// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/storage.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Options defining BigQuery table and row identifiers.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.BigQueryOptions}
 */
public  final class BigQueryOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.BigQueryOptions)
    BigQueryOptionsOrBuilder {
  // Use BigQueryOptions.newBuilder() to construct.
  private BigQueryOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BigQueryOptions() {
    identifyingFields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BigQueryOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.privacy.dlp.v2beta2.BigQueryTable.Builder subBuilder = null;
            if (tableReference_ != null) {
              subBuilder = tableReference_.toBuilder();
            }
            tableReference_ = input.readMessage(com.google.privacy.dlp.v2beta2.BigQueryTable.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tableReference_);
              tableReference_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              identifyingFields_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta2.FieldId>();
              mutable_bitField0_ |= 0x00000002;
            }
            identifyingFields_.add(
                input.readMessage(com.google.privacy.dlp.v2beta2.FieldId.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        identifyingFields_ = java.util.Collections.unmodifiableList(identifyingFields_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.BigQueryOptions.class, com.google.privacy.dlp.v2beta2.BigQueryOptions.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_REFERENCE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta2.BigQueryTable tableReference_;
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  public boolean hasTableReference() {
    return tableReference_ != null;
  }
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.BigQueryTable getTableReference() {
    return tableReference_ == null ? com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance() : tableReference_;
  }
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder getTableReferenceOrBuilder() {
    return getTableReference();
  }

  public static final int IDENTIFYING_FIELDS_FIELD_NUMBER = 2;
  private java.util.List<com.google.privacy.dlp.v2beta2.FieldId> identifyingFields_;
  /**
   * <pre>
   * References to fields uniquely identifying rows within the table.
   * Nested fields in the format, like `person.birthdate.year`, are allowed.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2beta2.FieldId> getIdentifyingFieldsList() {
    return identifyingFields_;
  }
  /**
   * <pre>
   * References to fields uniquely identifying rows within the table.
   * Nested fields in the format, like `person.birthdate.year`, are allowed.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2beta2.FieldIdOrBuilder> 
      getIdentifyingFieldsOrBuilderList() {
    return identifyingFields_;
  }
  /**
   * <pre>
   * References to fields uniquely identifying rows within the table.
   * Nested fields in the format, like `person.birthdate.year`, are allowed.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
   */
  public int getIdentifyingFieldsCount() {
    return identifyingFields_.size();
  }
  /**
   * <pre>
   * References to fields uniquely identifying rows within the table.
   * Nested fields in the format, like `person.birthdate.year`, are allowed.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.FieldId getIdentifyingFields(int index) {
    return identifyingFields_.get(index);
  }
  /**
   * <pre>
   * References to fields uniquely identifying rows within the table.
   * Nested fields in the format, like `person.birthdate.year`, are allowed.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.FieldIdOrBuilder getIdentifyingFieldsOrBuilder(
      int index) {
    return identifyingFields_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tableReference_ != null) {
      output.writeMessage(1, getTableReference());
    }
    for (int i = 0; i < identifyingFields_.size(); i++) {
      output.writeMessage(2, identifyingFields_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableReference_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTableReference());
    }
    for (int i = 0; i < identifyingFields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, identifyingFields_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.BigQueryOptions)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.BigQueryOptions other = (com.google.privacy.dlp.v2beta2.BigQueryOptions) obj;

    boolean result = true;
    result = result && (hasTableReference() == other.hasTableReference());
    if (hasTableReference()) {
      result = result && getTableReference()
          .equals(other.getTableReference());
    }
    result = result && getIdentifyingFieldsList()
        .equals(other.getIdentifyingFieldsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTableReference()) {
      hash = (37 * hash) + TABLE_REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getTableReference().hashCode();
    }
    if (getIdentifyingFieldsCount() > 0) {
      hash = (37 * hash) + IDENTIFYING_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifyingFieldsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.BigQueryOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Options defining BigQuery table and row identifiers.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.BigQueryOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.BigQueryOptions)
      com.google.privacy.dlp.v2beta2.BigQueryOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.BigQueryOptions.class, com.google.privacy.dlp.v2beta2.BigQueryOptions.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.BigQueryOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getIdentifyingFieldsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (tableReferenceBuilder_ == null) {
        tableReference_ = null;
      } else {
        tableReference_ = null;
        tableReferenceBuilder_ = null;
      }
      if (identifyingFieldsBuilder_ == null) {
        identifyingFields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        identifyingFieldsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryOptions_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.BigQueryOptions getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.BigQueryOptions.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.BigQueryOptions build() {
      com.google.privacy.dlp.v2beta2.BigQueryOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.BigQueryOptions buildPartial() {
      com.google.privacy.dlp.v2beta2.BigQueryOptions result = new com.google.privacy.dlp.v2beta2.BigQueryOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (tableReferenceBuilder_ == null) {
        result.tableReference_ = tableReference_;
      } else {
        result.tableReference_ = tableReferenceBuilder_.build();
      }
      if (identifyingFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          identifyingFields_ = java.util.Collections.unmodifiableList(identifyingFields_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.identifyingFields_ = identifyingFields_;
      } else {
        result.identifyingFields_ = identifyingFieldsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2beta2.BigQueryOptions) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.BigQueryOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.BigQueryOptions other) {
      if (other == com.google.privacy.dlp.v2beta2.BigQueryOptions.getDefaultInstance()) return this;
      if (other.hasTableReference()) {
        mergeTableReference(other.getTableReference());
      }
      if (identifyingFieldsBuilder_ == null) {
        if (!other.identifyingFields_.isEmpty()) {
          if (identifyingFields_.isEmpty()) {
            identifyingFields_ = other.identifyingFields_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureIdentifyingFieldsIsMutable();
            identifyingFields_.addAll(other.identifyingFields_);
          }
          onChanged();
        }
      } else {
        if (!other.identifyingFields_.isEmpty()) {
          if (identifyingFieldsBuilder_.isEmpty()) {
            identifyingFieldsBuilder_.dispose();
            identifyingFieldsBuilder_ = null;
            identifyingFields_ = other.identifyingFields_;
            bitField0_ = (bitField0_ & ~0x00000002);
            identifyingFieldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIdentifyingFieldsFieldBuilder() : null;
          } else {
            identifyingFieldsBuilder_.addAllMessages(other.identifyingFields_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2beta2.BigQueryOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.BigQueryOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.privacy.dlp.v2beta2.BigQueryTable tableReference_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.BigQueryTable, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder, com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder> tableReferenceBuilder_;
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public boolean hasTableReference() {
      return tableReferenceBuilder_ != null || tableReference_ != null;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.BigQueryTable getTableReference() {
      if (tableReferenceBuilder_ == null) {
        return tableReference_ == null ? com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance() : tableReference_;
      } else {
        return tableReferenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder setTableReference(com.google.privacy.dlp.v2beta2.BigQueryTable value) {
      if (tableReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableReference_ = value;
        onChanged();
      } else {
        tableReferenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder setTableReference(
        com.google.privacy.dlp.v2beta2.BigQueryTable.Builder builderForValue) {
      if (tableReferenceBuilder_ == null) {
        tableReference_ = builderForValue.build();
        onChanged();
      } else {
        tableReferenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder mergeTableReference(com.google.privacy.dlp.v2beta2.BigQueryTable value) {
      if (tableReferenceBuilder_ == null) {
        if (tableReference_ != null) {
          tableReference_ =
            com.google.privacy.dlp.v2beta2.BigQueryTable.newBuilder(tableReference_).mergeFrom(value).buildPartial();
        } else {
          tableReference_ = value;
        }
        onChanged();
      } else {
        tableReferenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder clearTableReference() {
      if (tableReferenceBuilder_ == null) {
        tableReference_ = null;
        onChanged();
      } else {
        tableReference_ = null;
        tableReferenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.BigQueryTable.Builder getTableReferenceBuilder() {
      
      onChanged();
      return getTableReferenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder getTableReferenceOrBuilder() {
      if (tableReferenceBuilder_ != null) {
        return tableReferenceBuilder_.getMessageOrBuilder();
      } else {
        return tableReference_ == null ?
            com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance() : tableReference_;
      }
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.BigQueryTable, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder, com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder> 
        getTableReferenceFieldBuilder() {
      if (tableReferenceBuilder_ == null) {
        tableReferenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.BigQueryTable, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder, com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder>(
                getTableReference(),
                getParentForChildren(),
                isClean());
        tableReference_ = null;
      }
      return tableReferenceBuilder_;
    }

    private java.util.List<com.google.privacy.dlp.v2beta2.FieldId> identifyingFields_ =
      java.util.Collections.emptyList();
    private void ensureIdentifyingFieldsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        identifyingFields_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta2.FieldId>(identifyingFields_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.FieldId, com.google.privacy.dlp.v2beta2.FieldId.Builder, com.google.privacy.dlp.v2beta2.FieldIdOrBuilder> identifyingFieldsBuilder_;

    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta2.FieldId> getIdentifyingFieldsList() {
      if (identifyingFieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(identifyingFields_);
      } else {
        return identifyingFieldsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public int getIdentifyingFieldsCount() {
      if (identifyingFieldsBuilder_ == null) {
        return identifyingFields_.size();
      } else {
        return identifyingFieldsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.FieldId getIdentifyingFields(int index) {
      if (identifyingFieldsBuilder_ == null) {
        return identifyingFields_.get(index);
      } else {
        return identifyingFieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder setIdentifyingFields(
        int index, com.google.privacy.dlp.v2beta2.FieldId value) {
      if (identifyingFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.set(index, value);
        onChanged();
      } else {
        identifyingFieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder setIdentifyingFields(
        int index, com.google.privacy.dlp.v2beta2.FieldId.Builder builderForValue) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.set(index, builderForValue.build());
        onChanged();
      } else {
        identifyingFieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder addIdentifyingFields(com.google.privacy.dlp.v2beta2.FieldId value) {
      if (identifyingFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(value);
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder addIdentifyingFields(
        int index, com.google.privacy.dlp.v2beta2.FieldId value) {
      if (identifyingFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(index, value);
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder addIdentifyingFields(
        com.google.privacy.dlp.v2beta2.FieldId.Builder builderForValue) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(builderForValue.build());
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder addIdentifyingFields(
        int index, com.google.privacy.dlp.v2beta2.FieldId.Builder builderForValue) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.add(index, builderForValue.build());
        onChanged();
      } else {
        identifyingFieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder addAllIdentifyingFields(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2beta2.FieldId> values) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, identifyingFields_);
        onChanged();
      } else {
        identifyingFieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder clearIdentifyingFields() {
      if (identifyingFieldsBuilder_ == null) {
        identifyingFields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        identifyingFieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public Builder removeIdentifyingFields(int index) {
      if (identifyingFieldsBuilder_ == null) {
        ensureIdentifyingFieldsIsMutable();
        identifyingFields_.remove(index);
        onChanged();
      } else {
        identifyingFieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.FieldId.Builder getIdentifyingFieldsBuilder(
        int index) {
      return getIdentifyingFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.FieldIdOrBuilder getIdentifyingFieldsOrBuilder(
        int index) {
      if (identifyingFieldsBuilder_ == null) {
        return identifyingFields_.get(index);  } else {
        return identifyingFieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2beta2.FieldIdOrBuilder> 
         getIdentifyingFieldsOrBuilderList() {
      if (identifyingFieldsBuilder_ != null) {
        return identifyingFieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(identifyingFields_);
      }
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.FieldId.Builder addIdentifyingFieldsBuilder() {
      return getIdentifyingFieldsFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2beta2.FieldId.getDefaultInstance());
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.FieldId.Builder addIdentifyingFieldsBuilder(
        int index) {
      return getIdentifyingFieldsFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2beta2.FieldId.getDefaultInstance());
    }
    /**
     * <pre>
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.FieldId identifying_fields = 2;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta2.FieldId.Builder> 
         getIdentifyingFieldsBuilderList() {
      return getIdentifyingFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.FieldId, com.google.privacy.dlp.v2beta2.FieldId.Builder, com.google.privacy.dlp.v2beta2.FieldIdOrBuilder> 
        getIdentifyingFieldsFieldBuilder() {
      if (identifyingFieldsBuilder_ == null) {
        identifyingFieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.FieldId, com.google.privacy.dlp.v2beta2.FieldId.Builder, com.google.privacy.dlp.v2beta2.FieldIdOrBuilder>(
                identifyingFields_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        identifyingFields_ = null;
      }
      return identifyingFieldsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.BigQueryOptions)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.BigQueryOptions)
  private static final com.google.privacy.dlp.v2beta2.BigQueryOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.BigQueryOptions();
  }

  public static com.google.privacy.dlp.v2beta2.BigQueryOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryOptions>
      PARSER = new com.google.protobuf.AbstractParser<BigQueryOptions>() {
    public BigQueryOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BigQueryOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BigQueryOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryOptions> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.BigQueryOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

