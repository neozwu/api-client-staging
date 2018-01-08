// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Request message for CreateDeidentifyTemplate.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest}
 */
public  final class CreateDeidentifyTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest)
    CreateDeidentifyTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDeidentifyTemplateRequest.newBuilder() to construct.
  private CreateDeidentifyTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDeidentifyTemplateRequest() {
    parent_ = "";
    templateId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateDeidentifyTemplateRequest(
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
            com.google.privacy.dlp.v2beta2.DeidentifyTemplate.Builder subBuilder = null;
            if (deidentifyTemplate_ != null) {
              subBuilder = deidentifyTemplate_.toBuilder();
            }
            deidentifyTemplate_ = input.readMessage(com.google.privacy.dlp.v2beta2.DeidentifyTemplate.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(deidentifyTemplate_);
              deidentifyTemplate_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            templateId_ = s;
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
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_CreateDeidentifyTemplateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_CreateDeidentifyTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.class, com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
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
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
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

  public static final int DEIDENTIFY_TEMPLATE_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentifyTemplate_;
  /**
   * <pre>
   * The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  public boolean hasDeidentifyTemplate() {
    return deidentifyTemplate_ != null;
  }
  /**
   * <pre>
   * The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.DeidentifyTemplate getDeidentifyTemplate() {
    return deidentifyTemplate_ == null ? com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance() : deidentifyTemplate_;
  }
  /**
   * <pre>
   * The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.DeidentifyTemplateOrBuilder getDeidentifyTemplateOrBuilder() {
    return getDeidentifyTemplate();
  }

  public static final int TEMPLATE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object templateId_;
  /**
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   */
  public java.lang.String getTemplateId() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTemplateIdBytes() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (deidentifyTemplate_ != null) {
      output.writeMessage(2, getDeidentifyTemplate());
    }
    if (!getTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, templateId_);
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
    if (deidentifyTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDeidentifyTemplate());
    }
    if (!getTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, templateId_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest other = (com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasDeidentifyTemplate() == other.hasDeidentifyTemplate());
    if (hasDeidentifyTemplate()) {
      result = result && getDeidentifyTemplate()
          .equals(other.getDeidentifyTemplate());
    }
    result = result && getTemplateId()
        .equals(other.getTemplateId());
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
    if (hasDeidentifyTemplate()) {
      hash = (37 * hash) + DEIDENTIFY_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getDeidentifyTemplate().hashCode();
    }
    hash = (37 * hash) + TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest prototype) {
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
   * Request message for CreateDeidentifyTemplate.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest)
      com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_CreateDeidentifyTemplateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_CreateDeidentifyTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.class, com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.newBuilder()
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

      if (deidentifyTemplateBuilder_ == null) {
        deidentifyTemplate_ = null;
      } else {
        deidentifyTemplate_ = null;
        deidentifyTemplateBuilder_ = null;
      }
      templateId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_CreateDeidentifyTemplateRequest_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest build() {
      com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest buildPartial() {
      com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest result = new com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest(this);
      result.parent_ = parent_;
      if (deidentifyTemplateBuilder_ == null) {
        result.deidentifyTemplate_ = deidentifyTemplate_;
      } else {
        result.deidentifyTemplate_ = deidentifyTemplateBuilder_.build();
      }
      result.templateId_ = templateId_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest other) {
      if (other == com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasDeidentifyTemplate()) {
        mergeDeidentifyTemplate(other.getDeidentifyTemplate());
      }
      if (!other.getTemplateId().isEmpty()) {
        templateId_ = other.templateId_;
        onChanged();
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
      com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest) e.getUnfinishedMessage();
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
     * The parent resource name, for example projects/my-project-id or
     * organizations/my-org-id.
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
     * The parent resource name, for example projects/my-project-id or
     * organizations/my-org-id.
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
     * The parent resource name, for example projects/my-project-id or
     * organizations/my-org-id.
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
     * The parent resource name, for example projects/my-project-id or
     * organizations/my-org-id.
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
     * The parent resource name, for example projects/my-project-id or
     * organizations/my-org-id.
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

    private com.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentifyTemplate_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.DeidentifyTemplate, com.google.privacy.dlp.v2beta2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2beta2.DeidentifyTemplateOrBuilder> deidentifyTemplateBuilder_;
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public boolean hasDeidentifyTemplate() {
      return deidentifyTemplateBuilder_ != null || deidentifyTemplate_ != null;
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate getDeidentifyTemplate() {
      if (deidentifyTemplateBuilder_ == null) {
        return deidentifyTemplate_ == null ? com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance() : deidentifyTemplate_;
      } else {
        return deidentifyTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder setDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeidentifyTemplate value) {
      if (deidentifyTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deidentifyTemplate_ = value;
        onChanged();
      } else {
        deidentifyTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder setDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.DeidentifyTemplate.Builder builderForValue) {
      if (deidentifyTemplateBuilder_ == null) {
        deidentifyTemplate_ = builderForValue.build();
        onChanged();
      } else {
        deidentifyTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder mergeDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeidentifyTemplate value) {
      if (deidentifyTemplateBuilder_ == null) {
        if (deidentifyTemplate_ != null) {
          deidentifyTemplate_ =
            com.google.privacy.dlp.v2beta2.DeidentifyTemplate.newBuilder(deidentifyTemplate_).mergeFrom(value).buildPartial();
        } else {
          deidentifyTemplate_ = value;
        }
        onChanged();
      } else {
        deidentifyTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public Builder clearDeidentifyTemplate() {
      if (deidentifyTemplateBuilder_ == null) {
        deidentifyTemplate_ = null;
        onChanged();
      } else {
        deidentifyTemplate_ = null;
        deidentifyTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate.Builder getDeidentifyTemplateBuilder() {
      
      onChanged();
      return getDeidentifyTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplateOrBuilder getDeidentifyTemplateOrBuilder() {
      if (deidentifyTemplateBuilder_ != null) {
        return deidentifyTemplateBuilder_.getMessageOrBuilder();
      } else {
        return deidentifyTemplate_ == null ?
            com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance() : deidentifyTemplate_;
      }
    }
    /**
     * <pre>
     * The DeidentifyTemplate to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.DeidentifyTemplate, com.google.privacy.dlp.v2beta2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2beta2.DeidentifyTemplateOrBuilder> 
        getDeidentifyTemplateFieldBuilder() {
      if (deidentifyTemplateBuilder_ == null) {
        deidentifyTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.DeidentifyTemplate, com.google.privacy.dlp.v2beta2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2beta2.DeidentifyTemplateOrBuilder>(
                getDeidentifyTemplate(),
                getParentForChildren(),
                isClean());
        deidentifyTemplate_ = null;
      }
      return deidentifyTemplateBuilder_;
    }

    private java.lang.Object templateId_ = "";
    /**
     * <pre>
     * The template id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string template_id = 3;</code>
     */
    public java.lang.String getTemplateId() {
      java.lang.Object ref = templateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The template id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string template_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTemplateIdBytes() {
      java.lang.Object ref = templateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The template id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string template_id = 3;</code>
     */
    public Builder setTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The template id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string template_id = 3;</code>
     */
    public Builder clearTemplateId() {
      
      templateId_ = getDefaultInstance().getTemplateId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The template id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string template_id = 3;</code>
     */
    public Builder setTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    public final Builder setParentWithOrganizationName(com.google.privacy.dlp.v2beta2.OrganizationName value) {
      if (value == null) {
        return setParent("");
      }
      return setParent(value.toString());
    }
    
    public final com.google.privacy.dlp.v2beta2.OrganizationName getParentAsOrganizationName() {
      java.lang.String str = getParent();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.privacy.dlp.v2beta2.OrganizationName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest)
  }

  public final com.google.privacy.dlp.v2beta2.OrganizationName getParentAsOrganizationName() {
    java.lang.String str = getParent();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.privacy.dlp.v2beta2.OrganizationName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest)
  private static final com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest();
  }

  public static com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDeidentifyTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDeidentifyTemplateRequest>() {
    public CreateDeidentifyTemplateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateDeidentifyTemplateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateDeidentifyTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDeidentifyTemplateRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

