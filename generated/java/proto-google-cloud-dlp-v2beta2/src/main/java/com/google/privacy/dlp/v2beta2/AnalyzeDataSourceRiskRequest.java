// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Request for creating a risk analysis DlpJob.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest}
 */
public  final class AnalyzeDataSourceRiskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest)
    AnalyzeDataSourceRiskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnalyzeDataSourceRiskRequest.newBuilder() to construct.
  private AnalyzeDataSourceRiskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnalyzeDataSourceRiskRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnalyzeDataSourceRiskRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.Builder subBuilder = null;
            if (jobConfig_ != null) {
              subBuilder = jobConfig_.toBuilder();
            }
            jobConfig_ = input.readMessage(com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jobConfig_);
              jobConfig_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_AnalyzeDataSourceRiskRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_AnalyzeDataSourceRiskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.class, com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_CONFIG_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig jobConfig_;
  /**
   * <pre>
   * Configuration for this risk analysis job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
   */
  public boolean hasJobConfig() {
    return jobConfig_ != null;
  }
  /**
   * <pre>
   * Configuration for this risk analysis job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig getJobConfig() {
    return jobConfig_ == null ? com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.getDefaultInstance() : jobConfig_;
  }
  /**
   * <pre>
   * Configuration for this risk analysis job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfigOrBuilder getJobConfigOrBuilder() {
    return getJobConfig();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (jobConfig_ != null) {
      output.writeMessage(2, getJobConfig());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (jobConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJobConfig());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest other = (com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasJobConfig() == other.hasJobConfig());
    if (hasJobConfig()) {
      result = result && getJobConfig()
          .equals(other.getJobConfig());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasJobConfig()) {
      hash = (37 * hash) + JOB_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getJobConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest prototype) {
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
   * Request for creating a risk analysis DlpJob.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest)
      com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_AnalyzeDataSourceRiskRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_AnalyzeDataSourceRiskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.class, com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.newBuilder()
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
      parent_ = "";

      if (jobConfigBuilder_ == null) {
        jobConfig_ = null;
      } else {
        jobConfig_ = null;
        jobConfigBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_AnalyzeDataSourceRiskRequest_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest build() {
      com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest buildPartial() {
      com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest result = new com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest(this);
      result.parent_ = parent_;
      if (jobConfigBuilder_ == null) {
        result.jobConfig_ = jobConfig_;
      } else {
        result.jobConfig_ = jobConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest other) {
      if (other == com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasJobConfig()) {
        mergeJobConfig(other.getJobConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig jobConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig, com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.Builder, com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfigOrBuilder> jobConfigBuilder_;
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public boolean hasJobConfig() {
      return jobConfigBuilder_ != null || jobConfig_ != null;
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig getJobConfig() {
      if (jobConfigBuilder_ == null) {
        return jobConfig_ == null ? com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.getDefaultInstance() : jobConfig_;
      } else {
        return jobConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public Builder setJobConfig(com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig value) {
      if (jobConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jobConfig_ = value;
        onChanged();
      } else {
        jobConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public Builder setJobConfig(
        com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.Builder builderForValue) {
      if (jobConfigBuilder_ == null) {
        jobConfig_ = builderForValue.build();
        onChanged();
      } else {
        jobConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public Builder mergeJobConfig(com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig value) {
      if (jobConfigBuilder_ == null) {
        if (jobConfig_ != null) {
          jobConfig_ =
            com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.newBuilder(jobConfig_).mergeFrom(value).buildPartial();
        } else {
          jobConfig_ = value;
        }
        onChanged();
      } else {
        jobConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public Builder clearJobConfig() {
      if (jobConfigBuilder_ == null) {
        jobConfig_ = null;
        onChanged();
      } else {
        jobConfig_ = null;
        jobConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.Builder getJobConfigBuilder() {
      
      onChanged();
      return getJobConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfigOrBuilder getJobConfigOrBuilder() {
      if (jobConfigBuilder_ != null) {
        return jobConfigBuilder_.getMessageOrBuilder();
      } else {
        return jobConfig_ == null ?
            com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.getDefaultInstance() : jobConfig_;
      }
    }
    /**
     * <pre>
     * Configuration for this risk analysis job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig, com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.Builder, com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfigOrBuilder> 
        getJobConfigFieldBuilder() {
      if (jobConfigBuilder_ == null) {
        jobConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig, com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig.Builder, com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfigOrBuilder>(
                getJobConfig(),
                getParentForChildren(),
                isClean());
        jobConfig_ = null;
      }
      return jobConfigBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    public final Builder setParentWithProjectName(com.google.privacy.dlp.v2beta2.ProjectName value) {
      if (value == null) {
        return setParent("");
      }
      return setParent(value.toString());
    }
    
    public final com.google.privacy.dlp.v2beta2.ProjectName getParentAsProjectName() {
      java.lang.String str = getParent();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.privacy.dlp.v2beta2.ProjectName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest)
  }

  public final com.google.privacy.dlp.v2beta2.ProjectName getParentAsProjectName() {
    java.lang.String str = getParent();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.privacy.dlp.v2beta2.ProjectName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest)
  private static final com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest();
  }

  public static com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyzeDataSourceRiskRequest>
      PARSER = new com.google.protobuf.AbstractParser<AnalyzeDataSourceRiskRequest>() {
    public AnalyzeDataSourceRiskRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnalyzeDataSourceRiskRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnalyzeDataSourceRiskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyzeDataSourceRiskRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

