// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugins.proto

package io.paddle.plugin.interop;

/**
 * Protobuf type {@code io.paddle.plugin.interop.ImportPyPackagePluginsRequest}
 */
public final class ImportPyPackagePluginsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.paddle.plugin.interop.ImportPyPackagePluginsRequest)
    ImportPyPackagePluginsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportPyPackagePluginsRequest.newBuilder() to construct.
  private ImportPyPackagePluginsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportPyPackagePluginsRequest() {
    projectId_ = "";
    packages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportPyPackagePluginsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImportPyPackagePluginsRequest(
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

            projectId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              packages_ = new java.util.ArrayList<io.paddle.plugin.interop.PyPackageInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            packages_.add(
                input.readMessage(io.paddle.plugin.interop.PyPackageInfo.parser(), extensionRegistry));
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
        packages_ = java.util.Collections.unmodifiableList(packages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_ImportPyPackagePluginsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_ImportPyPackagePluginsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.paddle.plugin.interop.ImportPyPackagePluginsRequest.class, io.paddle.plugin.interop.ImportPyPackagePluginsRequest.Builder.class);
  }

  public static final int PROJECTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <code>string projectId = 1;</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <code>string projectId = 1;</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGES_FIELD_NUMBER = 2;
  private java.util.List<io.paddle.plugin.interop.PyPackageInfo> packages_;
  /**
   * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.paddle.plugin.interop.PyPackageInfo> getPackagesList() {
    return packages_;
  }
  /**
   * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.paddle.plugin.interop.PyPackageInfoOrBuilder> 
      getPackagesOrBuilderList() {
    return packages_;
  }
  /**
   * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
   */
  @java.lang.Override
  public int getPackagesCount() {
    return packages_.size();
  }
  /**
   * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
   */
  @java.lang.Override
  public io.paddle.plugin.interop.PyPackageInfo getPackages(int index) {
    return packages_.get(index);
  }
  /**
   * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
   */
  @java.lang.Override
  public io.paddle.plugin.interop.PyPackageInfoOrBuilder getPackagesOrBuilder(
      int index) {
    return packages_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    for (int i = 0; i < packages_.size(); i++) {
      output.writeMessage(2, packages_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    for (int i = 0; i < packages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, packages_.get(i));
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
    if (!(obj instanceof io.paddle.plugin.interop.ImportPyPackagePluginsRequest)) {
      return super.equals(obj);
    }
    io.paddle.plugin.interop.ImportPyPackagePluginsRequest other = (io.paddle.plugin.interop.ImportPyPackagePluginsRequest) obj;

    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (!getPackagesList()
        .equals(other.getPackagesList())) return false;
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
    hash = (37 * hash) + PROJECTID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    if (getPackagesCount() > 0) {
      hash = (37 * hash) + PACKAGES_FIELD_NUMBER;
      hash = (53 * hash) + getPackagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest parseFrom(
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
  public static Builder newBuilder(io.paddle.plugin.interop.ImportPyPackagePluginsRequest prototype) {
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
   * Protobuf type {@code io.paddle.plugin.interop.ImportPyPackagePluginsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.paddle.plugin.interop.ImportPyPackagePluginsRequest)
      io.paddle.plugin.interop.ImportPyPackagePluginsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_ImportPyPackagePluginsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_ImportPyPackagePluginsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.paddle.plugin.interop.ImportPyPackagePluginsRequest.class, io.paddle.plugin.interop.ImportPyPackagePluginsRequest.Builder.class);
    }

    // Construct using io.paddle.plugin.interop.ImportPyPackagePluginsRequest.newBuilder()
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
        getPackagesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      if (packagesBuilder_ == null) {
        packages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        packagesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.paddle.plugin.interop.PluginsOuterClass.internal_static_io_paddle_plugin_interop_ImportPyPackagePluginsRequest_descriptor;
    }

    @java.lang.Override
    public io.paddle.plugin.interop.ImportPyPackagePluginsRequest getDefaultInstanceForType() {
      return io.paddle.plugin.interop.ImportPyPackagePluginsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.paddle.plugin.interop.ImportPyPackagePluginsRequest build() {
      io.paddle.plugin.interop.ImportPyPackagePluginsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.paddle.plugin.interop.ImportPyPackagePluginsRequest buildPartial() {
      io.paddle.plugin.interop.ImportPyPackagePluginsRequest result = new io.paddle.plugin.interop.ImportPyPackagePluginsRequest(this);
      int from_bitField0_ = bitField0_;
      result.projectId_ = projectId_;
      if (packagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          packages_ = java.util.Collections.unmodifiableList(packages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.packages_ = packages_;
      } else {
        result.packages_ = packagesBuilder_.build();
      }
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
      if (other instanceof io.paddle.plugin.interop.ImportPyPackagePluginsRequest) {
        return mergeFrom((io.paddle.plugin.interop.ImportPyPackagePluginsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.paddle.plugin.interop.ImportPyPackagePluginsRequest other) {
      if (other == io.paddle.plugin.interop.ImportPyPackagePluginsRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (packagesBuilder_ == null) {
        if (!other.packages_.isEmpty()) {
          if (packages_.isEmpty()) {
            packages_ = other.packages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePackagesIsMutable();
            packages_.addAll(other.packages_);
          }
          onChanged();
        }
      } else {
        if (!other.packages_.isEmpty()) {
          if (packagesBuilder_.isEmpty()) {
            packagesBuilder_.dispose();
            packagesBuilder_ = null;
            packages_ = other.packages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            packagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPackagesFieldBuilder() : null;
          } else {
            packagesBuilder_.addAllMessages(other.packages_);
          }
        }
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
      io.paddle.plugin.interop.ImportPyPackagePluginsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.paddle.plugin.interop.ImportPyPackagePluginsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object projectId_ = "";
    /**
     * <code>string projectId = 1;</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string projectId = 1;</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string projectId = 1;</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string projectId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <code>string projectId = 1;</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<io.paddle.plugin.interop.PyPackageInfo> packages_ =
      java.util.Collections.emptyList();
    private void ensurePackagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        packages_ = new java.util.ArrayList<io.paddle.plugin.interop.PyPackageInfo>(packages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.paddle.plugin.interop.PyPackageInfo, io.paddle.plugin.interop.PyPackageInfo.Builder, io.paddle.plugin.interop.PyPackageInfoOrBuilder> packagesBuilder_;

    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public java.util.List<io.paddle.plugin.interop.PyPackageInfo> getPackagesList() {
      if (packagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(packages_);
      } else {
        return packagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public int getPackagesCount() {
      if (packagesBuilder_ == null) {
        return packages_.size();
      } else {
        return packagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public io.paddle.plugin.interop.PyPackageInfo getPackages(int index) {
      if (packagesBuilder_ == null) {
        return packages_.get(index);
      } else {
        return packagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder setPackages(
        int index, io.paddle.plugin.interop.PyPackageInfo value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.set(index, value);
        onChanged();
      } else {
        packagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder setPackages(
        int index, io.paddle.plugin.interop.PyPackageInfo.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.set(index, builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder addPackages(io.paddle.plugin.interop.PyPackageInfo value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.add(value);
        onChanged();
      } else {
        packagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder addPackages(
        int index, io.paddle.plugin.interop.PyPackageInfo value) {
      if (packagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePackagesIsMutable();
        packages_.add(index, value);
        onChanged();
      } else {
        packagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder addPackages(
        io.paddle.plugin.interop.PyPackageInfo.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.add(builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder addPackages(
        int index, io.paddle.plugin.interop.PyPackageInfo.Builder builderForValue) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.add(index, builderForValue.build());
        onChanged();
      } else {
        packagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder addAllPackages(
        java.lang.Iterable<? extends io.paddle.plugin.interop.PyPackageInfo> values) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, packages_);
        onChanged();
      } else {
        packagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder clearPackages() {
      if (packagesBuilder_ == null) {
        packages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        packagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public Builder removePackages(int index) {
      if (packagesBuilder_ == null) {
        ensurePackagesIsMutable();
        packages_.remove(index);
        onChanged();
      } else {
        packagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public io.paddle.plugin.interop.PyPackageInfo.Builder getPackagesBuilder(
        int index) {
      return getPackagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public io.paddle.plugin.interop.PyPackageInfoOrBuilder getPackagesOrBuilder(
        int index) {
      if (packagesBuilder_ == null) {
        return packages_.get(index);  } else {
        return packagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public java.util.List<? extends io.paddle.plugin.interop.PyPackageInfoOrBuilder> 
         getPackagesOrBuilderList() {
      if (packagesBuilder_ != null) {
        return packagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(packages_);
      }
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public io.paddle.plugin.interop.PyPackageInfo.Builder addPackagesBuilder() {
      return getPackagesFieldBuilder().addBuilder(
          io.paddle.plugin.interop.PyPackageInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public io.paddle.plugin.interop.PyPackageInfo.Builder addPackagesBuilder(
        int index) {
      return getPackagesFieldBuilder().addBuilder(
          index, io.paddle.plugin.interop.PyPackageInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .io.paddle.plugin.interop.PyPackageInfo packages = 2;</code>
     */
    public java.util.List<io.paddle.plugin.interop.PyPackageInfo.Builder> 
         getPackagesBuilderList() {
      return getPackagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.paddle.plugin.interop.PyPackageInfo, io.paddle.plugin.interop.PyPackageInfo.Builder, io.paddle.plugin.interop.PyPackageInfoOrBuilder> 
        getPackagesFieldBuilder() {
      if (packagesBuilder_ == null) {
        packagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.paddle.plugin.interop.PyPackageInfo, io.paddle.plugin.interop.PyPackageInfo.Builder, io.paddle.plugin.interop.PyPackageInfoOrBuilder>(
                packages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        packages_ = null;
      }
      return packagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.paddle.plugin.interop.ImportPyPackagePluginsRequest)
  }

  // @@protoc_insertion_point(class_scope:io.paddle.plugin.interop.ImportPyPackagePluginsRequest)
  private static final io.paddle.plugin.interop.ImportPyPackagePluginsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.paddle.plugin.interop.ImportPyPackagePluginsRequest();
  }

  public static io.paddle.plugin.interop.ImportPyPackagePluginsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportPyPackagePluginsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportPyPackagePluginsRequest>() {
    @java.lang.Override
    public ImportPyPackagePluginsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImportPyPackagePluginsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportPyPackagePluginsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportPyPackagePluginsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.paddle.plugin.interop.ImportPyPackagePluginsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
