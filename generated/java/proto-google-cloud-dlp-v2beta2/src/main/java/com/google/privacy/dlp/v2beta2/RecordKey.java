// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/storage.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Message for a unique key indicating a record that contains a finding.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.RecordKey}
 */
public  final class RecordKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.RecordKey)
    RecordKeyOrBuilder {
  // Use RecordKey.newBuilder() to construct.
  private RecordKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordKey() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RecordKey(
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
            com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder subBuilder = null;
            if (typeCase_ == 1) {
              subBuilder = ((com.google.privacy.dlp.v2beta2.CloudStorageKey) type_).toBuilder();
            }
            type_ =
                input.readMessage(com.google.privacy.dlp.v2beta2.CloudStorageKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.privacy.dlp.v2beta2.CloudStorageKey) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 1;
            break;
          }
          case 18: {
            com.google.privacy.dlp.v2beta2.DatastoreKey.Builder subBuilder = null;
            if (typeCase_ == 2) {
              subBuilder = ((com.google.privacy.dlp.v2beta2.DatastoreKey) type_).toBuilder();
            }
            type_ =
                input.readMessage(com.google.privacy.dlp.v2beta2.DatastoreKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.privacy.dlp.v2beta2.DatastoreKey) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 2;
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
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_RecordKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_RecordKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.RecordKey.class, com.google.privacy.dlp.v2beta2.RecordKey.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite {
    CLOUD_STORAGE_KEY(1),
    DATASTORE_KEY(2),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return CLOUD_STORAGE_KEY;
        case 2: return DATASTORE_KEY;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int CLOUD_STORAGE_KEY_FIELD_NUMBER = 1;
  /**
   * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.CloudStorageKey getCloudStorageKey() {
    if (typeCase_ == 1) {
       return (com.google.privacy.dlp.v2beta2.CloudStorageKey) type_;
    }
    return com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance();
  }
  /**
   * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.CloudStorageKeyOrBuilder getCloudStorageKeyOrBuilder() {
    if (typeCase_ == 1) {
       return (com.google.privacy.dlp.v2beta2.CloudStorageKey) type_;
    }
    return com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance();
  }

  public static final int DATASTORE_KEY_FIELD_NUMBER = 2;
  /**
   * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.DatastoreKey getDatastoreKey() {
    if (typeCase_ == 2) {
       return (com.google.privacy.dlp.v2beta2.DatastoreKey) type_;
    }
    return com.google.privacy.dlp.v2beta2.DatastoreKey.getDefaultInstance();
  }
  /**
   * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder() {
    if (typeCase_ == 2) {
       return (com.google.privacy.dlp.v2beta2.DatastoreKey) type_;
    }
    return com.google.privacy.dlp.v2beta2.DatastoreKey.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2beta2.CloudStorageKey) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (com.google.privacy.dlp.v2beta2.DatastoreKey) type_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.privacy.dlp.v2beta2.CloudStorageKey) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.privacy.dlp.v2beta2.DatastoreKey) type_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.RecordKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.RecordKey other = (com.google.privacy.dlp.v2beta2.RecordKey) obj;

    boolean result = true;
    result = result && getTypeCase().equals(
        other.getTypeCase());
    if (!result) return false;
    switch (typeCase_) {
      case 1:
        result = result && getCloudStorageKey()
            .equals(other.getCloudStorageKey());
        break;
      case 2:
        result = result && getDatastoreKey()
            .equals(other.getDatastoreKey());
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + CLOUD_STORAGE_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getCloudStorageKey().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DATASTORE_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getDatastoreKey().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.RecordKey parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.RecordKey prototype) {
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
   * Message for a unique key indicating a record that contains a finding.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.RecordKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.RecordKey)
      com.google.privacy.dlp.v2beta2.RecordKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_RecordKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_RecordKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.RecordKey.class, com.google.privacy.dlp.v2beta2.RecordKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.RecordKey.newBuilder()
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
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_RecordKey_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.RecordKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.RecordKey.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.RecordKey build() {
      com.google.privacy.dlp.v2beta2.RecordKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.RecordKey buildPartial() {
      com.google.privacy.dlp.v2beta2.RecordKey result = new com.google.privacy.dlp.v2beta2.RecordKey(this);
      if (typeCase_ == 1) {
        if (cloudStorageKeyBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = cloudStorageKeyBuilder_.build();
        }
      }
      if (typeCase_ == 2) {
        if (datastoreKeyBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = datastoreKeyBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.RecordKey) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.RecordKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.RecordKey other) {
      if (other == com.google.privacy.dlp.v2beta2.RecordKey.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case CLOUD_STORAGE_KEY: {
          mergeCloudStorageKey(other.getCloudStorageKey());
          break;
        }
        case DATASTORE_KEY: {
          mergeDatastoreKey(other.getDatastoreKey());
          break;
        }
        case TYPE_NOT_SET: {
          break;
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
      com.google.privacy.dlp.v2beta2.RecordKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.RecordKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.CloudStorageKey, com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder, com.google.privacy.dlp.v2beta2.CloudStorageKeyOrBuilder> cloudStorageKeyBuilder_;
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.CloudStorageKey getCloudStorageKey() {
      if (cloudStorageKeyBuilder_ == null) {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2beta2.CloudStorageKey) type_;
        }
        return com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return cloudStorageKeyBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    public Builder setCloudStorageKey(com.google.privacy.dlp.v2beta2.CloudStorageKey value) {
      if (cloudStorageKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        cloudStorageKeyBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    public Builder setCloudStorageKey(
        com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder builderForValue) {
      if (cloudStorageKeyBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        cloudStorageKeyBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    public Builder mergeCloudStorageKey(com.google.privacy.dlp.v2beta2.CloudStorageKey value) {
      if (cloudStorageKeyBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance()) {
          type_ = com.google.privacy.dlp.v2beta2.CloudStorageKey.newBuilder((com.google.privacy.dlp.v2beta2.CloudStorageKey) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          cloudStorageKeyBuilder_.mergeFrom(value);
        }
        cloudStorageKeyBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    public Builder clearCloudStorageKey() {
      if (cloudStorageKeyBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        cloudStorageKeyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder getCloudStorageKeyBuilder() {
      return getCloudStorageKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.CloudStorageKeyOrBuilder getCloudStorageKeyOrBuilder() {
      if ((typeCase_ == 1) && (cloudStorageKeyBuilder_ != null)) {
        return cloudStorageKeyBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2beta2.CloudStorageKey) type_;
        }
        return com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.CloudStorageKey cloud_storage_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.CloudStorageKey, com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder, com.google.privacy.dlp.v2beta2.CloudStorageKeyOrBuilder> 
        getCloudStorageKeyFieldBuilder() {
      if (cloudStorageKeyBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = com.google.privacy.dlp.v2beta2.CloudStorageKey.getDefaultInstance();
        }
        cloudStorageKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.CloudStorageKey, com.google.privacy.dlp.v2beta2.CloudStorageKey.Builder, com.google.privacy.dlp.v2beta2.CloudStorageKeyOrBuilder>(
                (com.google.privacy.dlp.v2beta2.CloudStorageKey) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();;
      return cloudStorageKeyBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.DatastoreKey, com.google.privacy.dlp.v2beta2.DatastoreKey.Builder, com.google.privacy.dlp.v2beta2.DatastoreKeyOrBuilder> datastoreKeyBuilder_;
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.DatastoreKey getDatastoreKey() {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2beta2.DatastoreKey) type_;
        }
        return com.google.privacy.dlp.v2beta2.DatastoreKey.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return datastoreKeyBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2beta2.DatastoreKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    public Builder setDatastoreKey(com.google.privacy.dlp.v2beta2.DatastoreKey value) {
      if (datastoreKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        datastoreKeyBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    public Builder setDatastoreKey(
        com.google.privacy.dlp.v2beta2.DatastoreKey.Builder builderForValue) {
      if (datastoreKeyBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        datastoreKeyBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    public Builder mergeDatastoreKey(com.google.privacy.dlp.v2beta2.DatastoreKey value) {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != com.google.privacy.dlp.v2beta2.DatastoreKey.getDefaultInstance()) {
          type_ = com.google.privacy.dlp.v2beta2.DatastoreKey.newBuilder((com.google.privacy.dlp.v2beta2.DatastoreKey) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          datastoreKeyBuilder_.mergeFrom(value);
        }
        datastoreKeyBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    public Builder clearDatastoreKey() {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        datastoreKeyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.DatastoreKey.Builder getDatastoreKeyBuilder() {
      return getDatastoreKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder() {
      if ((typeCase_ == 2) && (datastoreKeyBuilder_ != null)) {
        return datastoreKeyBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2beta2.DatastoreKey) type_;
        }
        return com.google.privacy.dlp.v2beta2.DatastoreKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta2.DatastoreKey datastore_key = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.DatastoreKey, com.google.privacy.dlp.v2beta2.DatastoreKey.Builder, com.google.privacy.dlp.v2beta2.DatastoreKeyOrBuilder> 
        getDatastoreKeyFieldBuilder() {
      if (datastoreKeyBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = com.google.privacy.dlp.v2beta2.DatastoreKey.getDefaultInstance();
        }
        datastoreKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.DatastoreKey, com.google.privacy.dlp.v2beta2.DatastoreKey.Builder, com.google.privacy.dlp.v2beta2.DatastoreKeyOrBuilder>(
                (com.google.privacy.dlp.v2beta2.DatastoreKey) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();;
      return datastoreKeyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.RecordKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.RecordKey)
  private static final com.google.privacy.dlp.v2beta2.RecordKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.RecordKey();
  }

  public static com.google.privacy.dlp.v2beta2.RecordKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordKey>
      PARSER = new com.google.protobuf.AbstractParser<RecordKey>() {
    public RecordKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RecordKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordKey> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.RecordKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

