// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ContainerServer.proto

package tr.com.argela.grpcserver;

/**
 * Protobuf type {@code tr.com.argela.grpcserver.Container}
 */
public  final class Container extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tr.com.argela.grpcserver.Container)
    ContainerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Container.newBuilder() to construct.
  private Container(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Container() {
    ip_ = "";
    dockerlist_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Container(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              dockerlist_ = new java.util.ArrayList<tr.com.argela.grpcserver.Docker>();
              mutable_bitField0_ |= 0x00000002;
            }
            dockerlist_.add(
                input.readMessage(tr.com.argela.grpcserver.Docker.parser(), extensionRegistry));
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
        dockerlist_ = java.util.Collections.unmodifiableList(dockerlist_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tr.com.argela.grpcserver.ContainerServer.internal_static_tr_com_argela_grpcserver_Container_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tr.com.argela.grpcserver.ContainerServer.internal_static_tr_com_argela_grpcserver_Container_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tr.com.argela.grpcserver.Container.class, tr.com.argela.grpcserver.Container.Builder.class);
  }

  private int bitField0_;
  public static final int IP_FIELD_NUMBER = 1;
  private volatile java.lang.Object ip_;
  /**
   * <code>string ip = 1;</code>
   */
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <code>string ip = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCKERLIST_FIELD_NUMBER = 2;
  private java.util.List<tr.com.argela.grpcserver.Docker> dockerlist_;
  /**
   * <pre>
   *repeated maps to an array
   * </pre>
   *
   * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
   */
  public java.util.List<tr.com.argela.grpcserver.Docker> getDockerlistList() {
    return dockerlist_;
  }
  /**
   * <pre>
   *repeated maps to an array
   * </pre>
   *
   * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
   */
  public java.util.List<? extends tr.com.argela.grpcserver.DockerOrBuilder> 
      getDockerlistOrBuilderList() {
    return dockerlist_;
  }
  /**
   * <pre>
   *repeated maps to an array
   * </pre>
   *
   * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
   */
  public int getDockerlistCount() {
    return dockerlist_.size();
  }
  /**
   * <pre>
   *repeated maps to an array
   * </pre>
   *
   * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
   */
  public tr.com.argela.grpcserver.Docker getDockerlist(int index) {
    return dockerlist_.get(index);
  }
  /**
   * <pre>
   *repeated maps to an array
   * </pre>
   *
   * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
   */
  public tr.com.argela.grpcserver.DockerOrBuilder getDockerlistOrBuilder(
      int index) {
    return dockerlist_.get(index);
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
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
    }
    for (int i = 0; i < dockerlist_.size(); i++) {
      output.writeMessage(2, dockerlist_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
    }
    for (int i = 0; i < dockerlist_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, dockerlist_.get(i));
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
    if (!(obj instanceof tr.com.argela.grpcserver.Container)) {
      return super.equals(obj);
    }
    tr.com.argela.grpcserver.Container other = (tr.com.argela.grpcserver.Container) obj;

    boolean result = true;
    result = result && getIp()
        .equals(other.getIp());
    result = result && getDockerlistList()
        .equals(other.getDockerlistList());
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
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    if (getDockerlistCount() > 0) {
      hash = (37 * hash) + DOCKERLIST_FIELD_NUMBER;
      hash = (53 * hash) + getDockerlistList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tr.com.argela.grpcserver.Container parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tr.com.argela.grpcserver.Container parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tr.com.argela.grpcserver.Container parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tr.com.argela.grpcserver.Container parseFrom(
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
  public static Builder newBuilder(tr.com.argela.grpcserver.Container prototype) {
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
   * Protobuf type {@code tr.com.argela.grpcserver.Container}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tr.com.argela.grpcserver.Container)
      tr.com.argela.grpcserver.ContainerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tr.com.argela.grpcserver.ContainerServer.internal_static_tr_com_argela_grpcserver_Container_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tr.com.argela.grpcserver.ContainerServer.internal_static_tr_com_argela_grpcserver_Container_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tr.com.argela.grpcserver.Container.class, tr.com.argela.grpcserver.Container.Builder.class);
    }

    // Construct using tr.com.argela.grpcserver.Container.newBuilder()
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
        getDockerlistFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      ip_ = "";

      if (dockerlistBuilder_ == null) {
        dockerlist_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        dockerlistBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tr.com.argela.grpcserver.ContainerServer.internal_static_tr_com_argela_grpcserver_Container_descriptor;
    }

    public tr.com.argela.grpcserver.Container getDefaultInstanceForType() {
      return tr.com.argela.grpcserver.Container.getDefaultInstance();
    }

    public tr.com.argela.grpcserver.Container build() {
      tr.com.argela.grpcserver.Container result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public tr.com.argela.grpcserver.Container buildPartial() {
      tr.com.argela.grpcserver.Container result = new tr.com.argela.grpcserver.Container(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.ip_ = ip_;
      if (dockerlistBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          dockerlist_ = java.util.Collections.unmodifiableList(dockerlist_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.dockerlist_ = dockerlist_;
      } else {
        result.dockerlist_ = dockerlistBuilder_.build();
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
      if (other instanceof tr.com.argela.grpcserver.Container) {
        return mergeFrom((tr.com.argela.grpcserver.Container)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tr.com.argela.grpcserver.Container other) {
      if (other == tr.com.argela.grpcserver.Container.getDefaultInstance()) return this;
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        onChanged();
      }
      if (dockerlistBuilder_ == null) {
        if (!other.dockerlist_.isEmpty()) {
          if (dockerlist_.isEmpty()) {
            dockerlist_ = other.dockerlist_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDockerlistIsMutable();
            dockerlist_.addAll(other.dockerlist_);
          }
          onChanged();
        }
      } else {
        if (!other.dockerlist_.isEmpty()) {
          if (dockerlistBuilder_.isEmpty()) {
            dockerlistBuilder_.dispose();
            dockerlistBuilder_ = null;
            dockerlist_ = other.dockerlist_;
            bitField0_ = (bitField0_ & ~0x00000002);
            dockerlistBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDockerlistFieldBuilder() : null;
          } else {
            dockerlistBuilder_.addAllMessages(other.dockerlist_);
          }
        }
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
      tr.com.argela.grpcserver.Container parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tr.com.argela.grpcserver.Container) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object ip_ = "";
    /**
     * <code>string ip = 1;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ip = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ip = 1;</code>
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ip = 1;</code>
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }
    /**
     * <code>string ip = 1;</code>
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ip_ = value;
      onChanged();
      return this;
    }

    private java.util.List<tr.com.argela.grpcserver.Docker> dockerlist_ =
      java.util.Collections.emptyList();
    private void ensureDockerlistIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        dockerlist_ = new java.util.ArrayList<tr.com.argela.grpcserver.Docker>(dockerlist_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        tr.com.argela.grpcserver.Docker, tr.com.argela.grpcserver.Docker.Builder, tr.com.argela.grpcserver.DockerOrBuilder> dockerlistBuilder_;

    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public java.util.List<tr.com.argela.grpcserver.Docker> getDockerlistList() {
      if (dockerlistBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dockerlist_);
      } else {
        return dockerlistBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public int getDockerlistCount() {
      if (dockerlistBuilder_ == null) {
        return dockerlist_.size();
      } else {
        return dockerlistBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public tr.com.argela.grpcserver.Docker getDockerlist(int index) {
      if (dockerlistBuilder_ == null) {
        return dockerlist_.get(index);
      } else {
        return dockerlistBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder setDockerlist(
        int index, tr.com.argela.grpcserver.Docker value) {
      if (dockerlistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDockerlistIsMutable();
        dockerlist_.set(index, value);
        onChanged();
      } else {
        dockerlistBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder setDockerlist(
        int index, tr.com.argela.grpcserver.Docker.Builder builderForValue) {
      if (dockerlistBuilder_ == null) {
        ensureDockerlistIsMutable();
        dockerlist_.set(index, builderForValue.build());
        onChanged();
      } else {
        dockerlistBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder addDockerlist(tr.com.argela.grpcserver.Docker value) {
      if (dockerlistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDockerlistIsMutable();
        dockerlist_.add(value);
        onChanged();
      } else {
        dockerlistBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder addDockerlist(
        int index, tr.com.argela.grpcserver.Docker value) {
      if (dockerlistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDockerlistIsMutable();
        dockerlist_.add(index, value);
        onChanged();
      } else {
        dockerlistBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder addDockerlist(
        tr.com.argela.grpcserver.Docker.Builder builderForValue) {
      if (dockerlistBuilder_ == null) {
        ensureDockerlistIsMutable();
        dockerlist_.add(builderForValue.build());
        onChanged();
      } else {
        dockerlistBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder addDockerlist(
        int index, tr.com.argela.grpcserver.Docker.Builder builderForValue) {
      if (dockerlistBuilder_ == null) {
        ensureDockerlistIsMutable();
        dockerlist_.add(index, builderForValue.build());
        onChanged();
      } else {
        dockerlistBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder addAllDockerlist(
        java.lang.Iterable<? extends tr.com.argela.grpcserver.Docker> values) {
      if (dockerlistBuilder_ == null) {
        ensureDockerlistIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dockerlist_);
        onChanged();
      } else {
        dockerlistBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder clearDockerlist() {
      if (dockerlistBuilder_ == null) {
        dockerlist_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        dockerlistBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public Builder removeDockerlist(int index) {
      if (dockerlistBuilder_ == null) {
        ensureDockerlistIsMutable();
        dockerlist_.remove(index);
        onChanged();
      } else {
        dockerlistBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public tr.com.argela.grpcserver.Docker.Builder getDockerlistBuilder(
        int index) {
      return getDockerlistFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public tr.com.argela.grpcserver.DockerOrBuilder getDockerlistOrBuilder(
        int index) {
      if (dockerlistBuilder_ == null) {
        return dockerlist_.get(index);  } else {
        return dockerlistBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public java.util.List<? extends tr.com.argela.grpcserver.DockerOrBuilder> 
         getDockerlistOrBuilderList() {
      if (dockerlistBuilder_ != null) {
        return dockerlistBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dockerlist_);
      }
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public tr.com.argela.grpcserver.Docker.Builder addDockerlistBuilder() {
      return getDockerlistFieldBuilder().addBuilder(
          tr.com.argela.grpcserver.Docker.getDefaultInstance());
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public tr.com.argela.grpcserver.Docker.Builder addDockerlistBuilder(
        int index) {
      return getDockerlistFieldBuilder().addBuilder(
          index, tr.com.argela.grpcserver.Docker.getDefaultInstance());
    }
    /**
     * <pre>
     *repeated maps to an array
     * </pre>
     *
     * <code>repeated .tr.com.argela.grpcserver.Docker dockerlist = 2;</code>
     */
    public java.util.List<tr.com.argela.grpcserver.Docker.Builder> 
         getDockerlistBuilderList() {
      return getDockerlistFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        tr.com.argela.grpcserver.Docker, tr.com.argela.grpcserver.Docker.Builder, tr.com.argela.grpcserver.DockerOrBuilder> 
        getDockerlistFieldBuilder() {
      if (dockerlistBuilder_ == null) {
        dockerlistBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            tr.com.argela.grpcserver.Docker, tr.com.argela.grpcserver.Docker.Builder, tr.com.argela.grpcserver.DockerOrBuilder>(
                dockerlist_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        dockerlist_ = null;
      }
      return dockerlistBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tr.com.argela.grpcserver.Container)
  }

  // @@protoc_insertion_point(class_scope:tr.com.argela.grpcserver.Container)
  private static final tr.com.argela.grpcserver.Container DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tr.com.argela.grpcserver.Container();
  }

  public static tr.com.argela.grpcserver.Container getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Container>
      PARSER = new com.google.protobuf.AbstractParser<Container>() {
    public Container parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Container(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Container> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Container> getParserForType() {
    return PARSER;
  }

  public tr.com.argela.grpcserver.Container getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
