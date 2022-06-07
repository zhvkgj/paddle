// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugins.proto

package io.paddle.plugin.interop;

/**
 * Protobuf type {@code io.paddle.plugin.interop.TaskInfo}
 */
public final class TaskInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.paddle.plugin.interop.TaskInfo)
    TaskInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskInfo.newBuilder() to construct.
  private TaskInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskInfo() {
    id_ = "";
    group_ = "";
    depsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            group_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              depsIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            depsIds_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        depsIds_ = depsIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_TaskInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_TaskInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.paddle.plugin.interop.TaskInfo.class, io.paddle.plugin.interop.TaskInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUP_FIELD_NUMBER = 2;
  private volatile java.lang.Object group_;
  /**
   * <code>string group = 2;</code>
   * @return The group.
   */
  @java.lang.Override
  public java.lang.String getGroup() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }
  /**
   * <code>string group = 2;</code>
   * @return The bytes for group.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupBytes() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      group_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPSIDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList depsIds_;
  /**
   * <code>repeated string depsIds = 3;</code>
   * @return A list containing the depsIds.
   */
  public com.google.protobuf.ProtocolStringList
      getDepsIdsList() {
    return depsIds_;
  }
  /**
   * <code>repeated string depsIds = 3;</code>
   * @return The count of depsIds.
   */
  public int getDepsIdsCount() {
    return depsIds_.size();
  }
  /**
   * <code>repeated string depsIds = 3;</code>
   * @param index The index of the element to return.
   * @return The depsIds at the given index.
   */
  public java.lang.String getDepsIds(int index) {
    return depsIds_.get(index);
  }
  /**
   * <code>repeated string depsIds = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the depsIds at the given index.
   */
  public com.google.protobuf.ByteString
      getDepsIdsBytes(int index) {
    return depsIds_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(group_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, group_);
    }
    for (int i = 0; i < depsIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, depsIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(group_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, group_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < depsIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(depsIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDepsIdsList().size();
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
    if (!(obj instanceof io.paddle.plugin.interop.TaskInfo)) {
      return super.equals(obj);
    }
    io.paddle.plugin.interop.TaskInfo other = (io.paddle.plugin.interop.TaskInfo) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getGroup()
        .equals(other.getGroup())) return false;
    if (!getDepsIdsList()
        .equals(other.getDepsIdsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    if (getDepsIdsCount() > 0) {
      hash = (37 * hash) + DEPSIDS_FIELD_NUMBER;
      hash = (53 * hash) + getDepsIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.paddle.plugin.interop.TaskInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.paddle.plugin.interop.TaskInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.paddle.plugin.interop.TaskInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.paddle.plugin.interop.TaskInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code io.paddle.plugin.interop.TaskInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.paddle.plugin.interop.TaskInfo)
      io.paddle.plugin.interop.TaskInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_TaskInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_TaskInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.paddle.plugin.interop.TaskInfo.class, io.paddle.plugin.interop.TaskInfo.Builder.class);
    }

    // Construct using io.paddle.plugin.interop.TaskInfo.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      group_ = "";

      depsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_TaskInfo_descriptor;
    }

    @java.lang.Override
    public io.paddle.plugin.interop.TaskInfo getDefaultInstanceForType() {
      return io.paddle.plugin.interop.TaskInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.paddle.plugin.interop.TaskInfo build() {
      io.paddle.plugin.interop.TaskInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.paddle.plugin.interop.TaskInfo buildPartial() {
      io.paddle.plugin.interop.TaskInfo result = new io.paddle.plugin.interop.TaskInfo(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.group_ = group_;
      if (((bitField0_ & 0x00000001) != 0)) {
        depsIds_ = depsIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.depsIds_ = depsIds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.paddle.plugin.interop.TaskInfo) {
        return mergeFrom((io.paddle.plugin.interop.TaskInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.paddle.plugin.interop.TaskInfo other) {
      if (other == io.paddle.plugin.interop.TaskInfo.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        onChanged();
      }
      if (!other.depsIds_.isEmpty()) {
        if (depsIds_.isEmpty()) {
          depsIds_ = other.depsIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDepsIdsIsMutable();
          depsIds_.addAll(other.depsIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.paddle.plugin.interop.TaskInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.paddle.plugin.interop.TaskInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object group_ = "";
    /**
     * <code>string group = 2;</code>
     * @return The group.
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string group = 2;</code>
     * @return The bytes for group.
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string group = 2;</code>
     * @param value The group to set.
     * @return This builder for chaining.
     */
    public Builder setGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      group_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string group = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroup() {
      
      group_ = getDefaultInstance().getGroup();
      onChanged();
      return this;
    }
    /**
     * <code>string group = 2;</code>
     * @param value The bytes for group to set.
     * @return This builder for chaining.
     */
    public Builder setGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      group_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList depsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDepsIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        depsIds_ = new com.google.protobuf.LazyStringArrayList(depsIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @return A list containing the depsIds.
     */
    public com.google.protobuf.ProtocolStringList
        getDepsIdsList() {
      return depsIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @return The count of depsIds.
     */
    public int getDepsIdsCount() {
      return depsIds_.size();
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @param index The index of the element to return.
     * @return The depsIds at the given index.
     */
    public java.lang.String getDepsIds(int index) {
      return depsIds_.get(index);
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the depsIds at the given index.
     */
    public com.google.protobuf.ByteString
        getDepsIdsBytes(int index) {
      return depsIds_.getByteString(index);
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @param index The index to set the value at.
     * @param value The depsIds to set.
     * @return This builder for chaining.
     */
    public Builder setDepsIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDepsIdsIsMutable();
      depsIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @param value The depsIds to add.
     * @return This builder for chaining.
     */
    public Builder addDepsIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDepsIdsIsMutable();
      depsIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @param values The depsIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllDepsIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureDepsIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, depsIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDepsIds() {
      depsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string depsIds = 3;</code>
     * @param value The bytes of the depsIds to add.
     * @return This builder for chaining.
     */
    public Builder addDepsIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDepsIdsIsMutable();
      depsIds_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.paddle.plugin.interop.TaskInfo)
  }

  // @@protoc_insertion_point(class_scope:io.paddle.plugin.interop.TaskInfo)
  private static final io.paddle.plugin.interop.TaskInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.paddle.plugin.interop.TaskInfo();
  }

  public static io.paddle.plugin.interop.TaskInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskInfo>
      PARSER = new com.google.protobuf.AbstractParser<TaskInfo>() {
    @java.lang.Override
    public TaskInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.paddle.plugin.interop.TaskInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

