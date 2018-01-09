// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Buckets values based on fixed size ranges. The
 * Bucketing transformation can provide all of this functionality,
 * but requires more configuration. This message is provided as a convenience to
 * the user for simple bucketing strategies.
 * The transformed value will be a hyphenated string of
 * &lt;lower_bound&gt;-&lt;upper_bound&gt;, i.e if lower_bound = 10 and upper_bound = 20
 * all values that are within this bucket will be replaced with "10-20".
 * This can be used on data of type: double, long.
 * If the bound Value type differs from the type of data
 * being transformed, we will first attempt converting the type of the data to
 * be transformed to match the type of the bound before comparing.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.FixedSizeBucketingConfig}
 */
public  final class FixedSizeBucketingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.FixedSizeBucketingConfig)
    FixedSizeBucketingConfigOrBuilder {
  // Use FixedSizeBucketingConfig.newBuilder() to construct.
  private FixedSizeBucketingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FixedSizeBucketingConfig() {
    bucketSize_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FixedSizeBucketingConfig(
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
            com.google.privacy.dlp.v2beta2.Value.Builder subBuilder = null;
            if (lowerBound_ != null) {
              subBuilder = lowerBound_.toBuilder();
            }
            lowerBound_ = input.readMessage(com.google.privacy.dlp.v2beta2.Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lowerBound_);
              lowerBound_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.privacy.dlp.v2beta2.Value.Builder subBuilder = null;
            if (upperBound_ != null) {
              subBuilder = upperBound_.toBuilder();
            }
            upperBound_ = input.readMessage(com.google.privacy.dlp.v2beta2.Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(upperBound_);
              upperBound_ = subBuilder.buildPartial();
            }

            break;
          }
          case 25: {

            bucketSize_ = input.readDouble();
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
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_FixedSizeBucketingConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_FixedSizeBucketingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig.class, com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig.Builder.class);
  }

  public static final int LOWER_BOUND_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta2.Value lowerBound_;
  /**
   * <pre>
   * Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”. [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
   */
  public boolean hasLowerBound() {
    return lowerBound_ != null;
  }
  /**
   * <pre>
   * Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”. [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.Value getLowerBound() {
    return lowerBound_ == null ? com.google.privacy.dlp.v2beta2.Value.getDefaultInstance() : lowerBound_;
  }
  /**
   * <pre>
   * Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”. [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.ValueOrBuilder getLowerBoundOrBuilder() {
    return getLowerBound();
  }

  public static final int UPPER_BOUND_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2beta2.Value upperBound_;
  /**
   * <pre>
   * Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
   */
  public boolean hasUpperBound() {
    return upperBound_ != null;
  }
  /**
   * <pre>
   * Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.Value getUpperBound() {
    return upperBound_ == null ? com.google.privacy.dlp.v2beta2.Value.getDefaultInstance() : upperBound_;
  }
  /**
   * <pre>
   * Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.ValueOrBuilder getUpperBoundOrBuilder() {
    return getUpperBound();
  }

  public static final int BUCKET_SIZE_FIELD_NUMBER = 3;
  private double bucketSize_;
  /**
   * <pre>
   * Size of each bucket (except for minimum and maximum buckets). So if
   * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
   * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
   * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
   * </pre>
   *
   * <code>double bucket_size = 3;</code>
   */
  public double getBucketSize() {
    return bucketSize_;
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
    if (lowerBound_ != null) {
      output.writeMessage(1, getLowerBound());
    }
    if (upperBound_ != null) {
      output.writeMessage(2, getUpperBound());
    }
    if (bucketSize_ != 0D) {
      output.writeDouble(3, bucketSize_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lowerBound_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLowerBound());
    }
    if (upperBound_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpperBound());
    }
    if (bucketSize_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, bucketSize_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig other = (com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig) obj;

    boolean result = true;
    result = result && (hasLowerBound() == other.hasLowerBound());
    if (hasLowerBound()) {
      result = result && getLowerBound()
          .equals(other.getLowerBound());
    }
    result = result && (hasUpperBound() == other.hasUpperBound());
    if (hasUpperBound()) {
      result = result && getUpperBound()
          .equals(other.getUpperBound());
    }
    result = result && (
        java.lang.Double.doubleToLongBits(getBucketSize())
        == java.lang.Double.doubleToLongBits(
            other.getBucketSize()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLowerBound()) {
      hash = (37 * hash) + LOWER_BOUND_FIELD_NUMBER;
      hash = (53 * hash) + getLowerBound().hashCode();
    }
    if (hasUpperBound()) {
      hash = (37 * hash) + UPPER_BOUND_FIELD_NUMBER;
      hash = (53 * hash) + getUpperBound().hashCode();
    }
    hash = (37 * hash) + BUCKET_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBucketSize()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig prototype) {
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
   * Buckets values based on fixed size ranges. The
   * Bucketing transformation can provide all of this functionality,
   * but requires more configuration. This message is provided as a convenience to
   * the user for simple bucketing strategies.
   * The transformed value will be a hyphenated string of
   * &lt;lower_bound&gt;-&lt;upper_bound&gt;, i.e if lower_bound = 10 and upper_bound = 20
   * all values that are within this bucket will be replaced with "10-20".
   * This can be used on data of type: double, long.
   * If the bound Value type differs from the type of data
   * being transformed, we will first attempt converting the type of the data to
   * be transformed to match the type of the bound before comparing.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.FixedSizeBucketingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.FixedSizeBucketingConfig)
      com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_FixedSizeBucketingConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_FixedSizeBucketingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig.class, com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig.newBuilder()
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
      if (lowerBoundBuilder_ == null) {
        lowerBound_ = null;
      } else {
        lowerBound_ = null;
        lowerBoundBuilder_ = null;
      }
      if (upperBoundBuilder_ == null) {
        upperBound_ = null;
      } else {
        upperBound_ = null;
        upperBoundBuilder_ = null;
      }
      bucketSize_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_FixedSizeBucketingConfig_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig build() {
      com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig buildPartial() {
      com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig result = new com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig(this);
      if (lowerBoundBuilder_ == null) {
        result.lowerBound_ = lowerBound_;
      } else {
        result.lowerBound_ = lowerBoundBuilder_.build();
      }
      if (upperBoundBuilder_ == null) {
        result.upperBound_ = upperBound_;
      } else {
        result.upperBound_ = upperBoundBuilder_.build();
      }
      result.bucketSize_ = bucketSize_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig other) {
      if (other == com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig.getDefaultInstance()) return this;
      if (other.hasLowerBound()) {
        mergeLowerBound(other.getLowerBound());
      }
      if (other.hasUpperBound()) {
        mergeUpperBound(other.getUpperBound());
      }
      if (other.getBucketSize() != 0D) {
        setBucketSize(other.getBucketSize());
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
      com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2beta2.Value lowerBound_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.Value, com.google.privacy.dlp.v2beta2.Value.Builder, com.google.privacy.dlp.v2beta2.ValueOrBuilder> lowerBoundBuilder_;
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public boolean hasLowerBound() {
      return lowerBoundBuilder_ != null || lowerBound_ != null;
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.Value getLowerBound() {
      if (lowerBoundBuilder_ == null) {
        return lowerBound_ == null ? com.google.privacy.dlp.v2beta2.Value.getDefaultInstance() : lowerBound_;
      } else {
        return lowerBoundBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public Builder setLowerBound(com.google.privacy.dlp.v2beta2.Value value) {
      if (lowerBoundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lowerBound_ = value;
        onChanged();
      } else {
        lowerBoundBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public Builder setLowerBound(
        com.google.privacy.dlp.v2beta2.Value.Builder builderForValue) {
      if (lowerBoundBuilder_ == null) {
        lowerBound_ = builderForValue.build();
        onChanged();
      } else {
        lowerBoundBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public Builder mergeLowerBound(com.google.privacy.dlp.v2beta2.Value value) {
      if (lowerBoundBuilder_ == null) {
        if (lowerBound_ != null) {
          lowerBound_ =
            com.google.privacy.dlp.v2beta2.Value.newBuilder(lowerBound_).mergeFrom(value).buildPartial();
        } else {
          lowerBound_ = value;
        }
        onChanged();
      } else {
        lowerBoundBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public Builder clearLowerBound() {
      if (lowerBoundBuilder_ == null) {
        lowerBound_ = null;
        onChanged();
      } else {
        lowerBound_ = null;
        lowerBoundBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.Value.Builder getLowerBoundBuilder() {
      
      onChanged();
      return getLowerBoundFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.ValueOrBuilder getLowerBoundOrBuilder() {
      if (lowerBoundBuilder_ != null) {
        return lowerBoundBuilder_.getMessageOrBuilder();
      } else {
        return lowerBound_ == null ?
            com.google.privacy.dlp.v2beta2.Value.getDefaultInstance() : lowerBound_;
      }
    }
    /**
     * <pre>
     * Lower bound value of buckets. All values less than `lower_bound` are
     * grouped together into a single bucket; for example if `lower_bound` = 10,
     * then all values less than 10 are replaced with the value “-10”. [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value lower_bound = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.Value, com.google.privacy.dlp.v2beta2.Value.Builder, com.google.privacy.dlp.v2beta2.ValueOrBuilder> 
        getLowerBoundFieldBuilder() {
      if (lowerBoundBuilder_ == null) {
        lowerBoundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.Value, com.google.privacy.dlp.v2beta2.Value.Builder, com.google.privacy.dlp.v2beta2.ValueOrBuilder>(
                getLowerBound(),
                getParentForChildren(),
                isClean());
        lowerBound_ = null;
      }
      return lowerBoundBuilder_;
    }

    private com.google.privacy.dlp.v2beta2.Value upperBound_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.Value, com.google.privacy.dlp.v2beta2.Value.Builder, com.google.privacy.dlp.v2beta2.ValueOrBuilder> upperBoundBuilder_;
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public boolean hasUpperBound() {
      return upperBoundBuilder_ != null || upperBound_ != null;
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.Value getUpperBound() {
      if (upperBoundBuilder_ == null) {
        return upperBound_ == null ? com.google.privacy.dlp.v2beta2.Value.getDefaultInstance() : upperBound_;
      } else {
        return upperBoundBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public Builder setUpperBound(com.google.privacy.dlp.v2beta2.Value value) {
      if (upperBoundBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        upperBound_ = value;
        onChanged();
      } else {
        upperBoundBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public Builder setUpperBound(
        com.google.privacy.dlp.v2beta2.Value.Builder builderForValue) {
      if (upperBoundBuilder_ == null) {
        upperBound_ = builderForValue.build();
        onChanged();
      } else {
        upperBoundBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public Builder mergeUpperBound(com.google.privacy.dlp.v2beta2.Value value) {
      if (upperBoundBuilder_ == null) {
        if (upperBound_ != null) {
          upperBound_ =
            com.google.privacy.dlp.v2beta2.Value.newBuilder(upperBound_).mergeFrom(value).buildPartial();
        } else {
          upperBound_ = value;
        }
        onChanged();
      } else {
        upperBoundBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public Builder clearUpperBound() {
      if (upperBoundBuilder_ == null) {
        upperBound_ = null;
        onChanged();
      } else {
        upperBound_ = null;
        upperBoundBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.Value.Builder getUpperBoundBuilder() {
      
      onChanged();
      return getUpperBoundFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.ValueOrBuilder getUpperBoundOrBuilder() {
      if (upperBoundBuilder_ != null) {
        return upperBoundBuilder_.getMessageOrBuilder();
      } else {
        return upperBound_ == null ?
            com.google.privacy.dlp.v2beta2.Value.getDefaultInstance() : upperBound_;
      }
    }
    /**
     * <pre>
     * Upper bound value of buckets. All values greater than upper_bound are
     * grouped together into a single bucket; for example if `upper_bound` = 89,
     * then all values greater than 89 are replaced with the value “89+”.
     * [Required].
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Value upper_bound = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.Value, com.google.privacy.dlp.v2beta2.Value.Builder, com.google.privacy.dlp.v2beta2.ValueOrBuilder> 
        getUpperBoundFieldBuilder() {
      if (upperBoundBuilder_ == null) {
        upperBoundBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.Value, com.google.privacy.dlp.v2beta2.Value.Builder, com.google.privacy.dlp.v2beta2.ValueOrBuilder>(
                getUpperBound(),
                getParentForChildren(),
                isClean());
        upperBound_ = null;
      }
      return upperBoundBuilder_;
    }

    private double bucketSize_ ;
    /**
     * <pre>
     * Size of each bucket (except for minimum and maximum buckets). So if
     * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
     * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
     * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
     * </pre>
     *
     * <code>double bucket_size = 3;</code>
     */
    public double getBucketSize() {
      return bucketSize_;
    }
    /**
     * <pre>
     * Size of each bucket (except for minimum and maximum buckets). So if
     * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
     * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
     * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
     * </pre>
     *
     * <code>double bucket_size = 3;</code>
     */
    public Builder setBucketSize(double value) {
      
      bucketSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Size of each bucket (except for minimum and maximum buckets). So if
     * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
     * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
     * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
     * </pre>
     *
     * <code>double bucket_size = 3;</code>
     */
    public Builder clearBucketSize() {
      
      bucketSize_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.FixedSizeBucketingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.FixedSizeBucketingConfig)
  private static final com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig();
  }

  public static com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FixedSizeBucketingConfig>
      PARSER = new com.google.protobuf.AbstractParser<FixedSizeBucketingConfig>() {
    public FixedSizeBucketingConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FixedSizeBucketingConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FixedSizeBucketingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FixedSizeBucketingConfig> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.FixedSizeBucketingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

