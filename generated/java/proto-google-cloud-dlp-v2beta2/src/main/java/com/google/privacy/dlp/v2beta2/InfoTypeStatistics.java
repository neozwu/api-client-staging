// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Statistics regarding a specific InfoType.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.InfoTypeStatistics}
 */
public  final class InfoTypeStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.InfoTypeStatistics)
    InfoTypeStatisticsOrBuilder {
  // Use InfoTypeStatistics.newBuilder() to construct.
  private InfoTypeStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InfoTypeStatistics() {
    count_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InfoTypeStatistics(
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
            com.google.privacy.dlp.v2beta2.InfoType.Builder subBuilder = null;
            if (infoType_ != null) {
              subBuilder = infoType_.toBuilder();
            }
            infoType_ = input.readMessage(com.google.privacy.dlp.v2beta2.InfoType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(infoType_);
              infoType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            count_ = input.readInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InfoTypeStatistics_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InfoTypeStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.InfoTypeStatistics.class, com.google.privacy.dlp.v2beta2.InfoTypeStatistics.Builder.class);
  }

  public static final int INFO_TYPE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta2.InfoType infoType_;
  /**
   * <pre>
   * The type of finding this stat is for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
   */
  public boolean hasInfoType() {
    return infoType_ != null;
  }
  /**
   * <pre>
   * The type of finding this stat is for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.InfoType getInfoType() {
    return infoType_ == null ? com.google.privacy.dlp.v2beta2.InfoType.getDefaultInstance() : infoType_;
  }
  /**
   * <pre>
   * The type of finding this stat is for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.InfoTypeOrBuilder getInfoTypeOrBuilder() {
    return getInfoType();
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_;
  /**
   * <pre>
   * Number of findings for this infoType.
   * </pre>
   *
   * <code>int64 count = 2;</code>
   */
  public long getCount() {
    return count_;
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
    if (infoType_ != null) {
      output.writeMessage(1, getInfoType());
    }
    if (count_ != 0L) {
      output.writeInt64(2, count_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (infoType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInfoType());
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, count_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.InfoTypeStatistics)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.InfoTypeStatistics other = (com.google.privacy.dlp.v2beta2.InfoTypeStatistics) obj;

    boolean result = true;
    result = result && (hasInfoType() == other.hasInfoType());
    if (hasInfoType()) {
      result = result && getInfoType()
          .equals(other.getInfoType());
    }
    result = result && (getCount()
        == other.getCount());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasInfoType()) {
      hash = (37 * hash) + INFO_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getInfoType().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.InfoTypeStatistics prototype) {
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
   * Statistics regarding a specific InfoType.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.InfoTypeStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.InfoTypeStatistics)
      com.google.privacy.dlp.v2beta2.InfoTypeStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InfoTypeStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InfoTypeStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.InfoTypeStatistics.class, com.google.privacy.dlp.v2beta2.InfoTypeStatistics.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.InfoTypeStatistics.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (infoTypeBuilder_ == null) {
        infoType_ = null;
      } else {
        infoType_ = null;
        infoTypeBuilder_ = null;
      }
      count_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InfoTypeStatistics_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.InfoTypeStatistics getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.InfoTypeStatistics.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.InfoTypeStatistics build() {
      com.google.privacy.dlp.v2beta2.InfoTypeStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.InfoTypeStatistics buildPartial() {
      com.google.privacy.dlp.v2beta2.InfoTypeStatistics result = new com.google.privacy.dlp.v2beta2.InfoTypeStatistics(this);
      if (infoTypeBuilder_ == null) {
        result.infoType_ = infoType_;
      } else {
        result.infoType_ = infoTypeBuilder_.build();
      }
      result.count_ = count_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.InfoTypeStatistics) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.InfoTypeStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.InfoTypeStatistics other) {
      if (other == com.google.privacy.dlp.v2beta2.InfoTypeStatistics.getDefaultInstance()) return this;
      if (other.hasInfoType()) {
        mergeInfoType(other.getInfoType());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
      com.google.privacy.dlp.v2beta2.InfoTypeStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.InfoTypeStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2beta2.InfoType infoType_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.InfoType, com.google.privacy.dlp.v2beta2.InfoType.Builder, com.google.privacy.dlp.v2beta2.InfoTypeOrBuilder> infoTypeBuilder_;
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public boolean hasInfoType() {
      return infoTypeBuilder_ != null || infoType_ != null;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoType getInfoType() {
      if (infoTypeBuilder_ == null) {
        return infoType_ == null ? com.google.privacy.dlp.v2beta2.InfoType.getDefaultInstance() : infoType_;
      } else {
        return infoTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public Builder setInfoType(com.google.privacy.dlp.v2beta2.InfoType value) {
      if (infoTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        infoType_ = value;
        onChanged();
      } else {
        infoTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public Builder setInfoType(
        com.google.privacy.dlp.v2beta2.InfoType.Builder builderForValue) {
      if (infoTypeBuilder_ == null) {
        infoType_ = builderForValue.build();
        onChanged();
      } else {
        infoTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public Builder mergeInfoType(com.google.privacy.dlp.v2beta2.InfoType value) {
      if (infoTypeBuilder_ == null) {
        if (infoType_ != null) {
          infoType_ =
            com.google.privacy.dlp.v2beta2.InfoType.newBuilder(infoType_).mergeFrom(value).buildPartial();
        } else {
          infoType_ = value;
        }
        onChanged();
      } else {
        infoTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public Builder clearInfoType() {
      if (infoTypeBuilder_ == null) {
        infoType_ = null;
        onChanged();
      } else {
        infoType_ = null;
        infoTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoType.Builder getInfoTypeBuilder() {
      
      onChanged();
      return getInfoTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoTypeOrBuilder getInfoTypeOrBuilder() {
      if (infoTypeBuilder_ != null) {
        return infoTypeBuilder_.getMessageOrBuilder();
      } else {
        return infoType_ == null ?
            com.google.privacy.dlp.v2beta2.InfoType.getDefaultInstance() : infoType_;
      }
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InfoType info_type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.InfoType, com.google.privacy.dlp.v2beta2.InfoType.Builder, com.google.privacy.dlp.v2beta2.InfoTypeOrBuilder> 
        getInfoTypeFieldBuilder() {
      if (infoTypeBuilder_ == null) {
        infoTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.InfoType, com.google.privacy.dlp.v2beta2.InfoType.Builder, com.google.privacy.dlp.v2beta2.InfoTypeOrBuilder>(
                getInfoType(),
                getParentForChildren(),
                isClean());
        infoType_ = null;
      }
      return infoTypeBuilder_;
    }

    private long count_ ;
    /**
     * <pre>
     * Number of findings for this infoType.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     */
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * Number of findings for this infoType.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of findings for this infoType.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.InfoTypeStatistics)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.InfoTypeStatistics)
  private static final com.google.privacy.dlp.v2beta2.InfoTypeStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.InfoTypeStatistics();
  }

  public static com.google.privacy.dlp.v2beta2.InfoTypeStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InfoTypeStatistics>
      PARSER = new com.google.protobuf.AbstractParser<InfoTypeStatistics>() {
    public InfoTypeStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InfoTypeStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InfoTypeStatistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InfoTypeStatistics> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.InfoTypeStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

