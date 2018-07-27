// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ContainerServer.proto

package com.example.grpc.client;

/**
 * Protobuf type {@code com.example.grpc.client.Docker}
 */
public  final class Docker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.client.Docker)
    DockerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Docker.newBuilder() to construct.
  private Docker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Docker() {
    dockername_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Docker(
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

            dockername_ = s;
            break;
          }
          case 18: {
            com.example.grpc.client.DockerInfo.Builder subBuilder = null;
            if (dockerinfo_ != null) {
              subBuilder = dockerinfo_.toBuilder();
            }
            dockerinfo_ = input.readMessage(com.example.grpc.client.DockerInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dockerinfo_);
              dockerinfo_ = subBuilder.buildPartial();
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
    return com.example.grpc.client.ContainerServer.internal_static_com_example_grpc_client_Docker_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.client.ContainerServer.internal_static_com_example_grpc_client_Docker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.client.Docker.class, com.example.grpc.client.Docker.Builder.class);
  }

  public static final int DOCKERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object dockername_;
  /**
   * <code>string dockername = 1;</code>
   */
  public java.lang.String getDockername() {
    java.lang.Object ref = dockername_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dockername_ = s;
      return s;
    }
  }
  /**
   * <code>string dockername = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDockernameBytes() {
    java.lang.Object ref = dockername_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dockername_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCKERINFO_FIELD_NUMBER = 2;
  private com.example.grpc.client.DockerInfo dockerinfo_;
  /**
   * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
   */
  public boolean hasDockerinfo() {
    return dockerinfo_ != null;
  }
  /**
   * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
   */
  public com.example.grpc.client.DockerInfo getDockerinfo() {
    return dockerinfo_ == null ? com.example.grpc.client.DockerInfo.getDefaultInstance() : dockerinfo_;
  }
  /**
   * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
   */
  public com.example.grpc.client.DockerInfoOrBuilder getDockerinfoOrBuilder() {
    return getDockerinfo();
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
    if (!getDockernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dockername_);
    }
    if (dockerinfo_ != null) {
      output.writeMessage(2, getDockerinfo());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDockernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dockername_);
    }
    if (dockerinfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDockerinfo());
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
    if (!(obj instanceof com.example.grpc.client.Docker)) {
      return super.equals(obj);
    }
    com.example.grpc.client.Docker other = (com.example.grpc.client.Docker) obj;

    boolean result = true;
    result = result && getDockername()
        .equals(other.getDockername());
    result = result && (hasDockerinfo() == other.hasDockerinfo());
    if (hasDockerinfo()) {
      result = result && getDockerinfo()
          .equals(other.getDockerinfo());
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
    hash = (37 * hash) + DOCKERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getDockername().hashCode();
    if (hasDockerinfo()) {
      hash = (37 * hash) + DOCKERINFO_FIELD_NUMBER;
      hash = (53 * hash) + getDockerinfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.client.Docker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.client.Docker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.client.Docker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.client.Docker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.client.Docker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.client.Docker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.client.Docker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.client.Docker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.client.Docker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.client.Docker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.client.Docker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.client.Docker parseFrom(
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
  public static Builder newBuilder(com.example.grpc.client.Docker prototype) {
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
   * Protobuf type {@code com.example.grpc.client.Docker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.client.Docker)
      com.example.grpc.client.DockerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.client.ContainerServer.internal_static_com_example_grpc_client_Docker_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.client.ContainerServer.internal_static_com_example_grpc_client_Docker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.client.Docker.class, com.example.grpc.client.Docker.Builder.class);
    }

    // Construct using com.example.grpc.client.Docker.newBuilder()
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
      dockername_ = "";

      if (dockerinfoBuilder_ == null) {
        dockerinfo_ = null;
      } else {
        dockerinfo_ = null;
        dockerinfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.client.ContainerServer.internal_static_com_example_grpc_client_Docker_descriptor;
    }

    public com.example.grpc.client.Docker getDefaultInstanceForType() {
      return com.example.grpc.client.Docker.getDefaultInstance();
    }

    public com.example.grpc.client.Docker build() {
      com.example.grpc.client.Docker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.client.Docker buildPartial() {
      com.example.grpc.client.Docker result = new com.example.grpc.client.Docker(this);
      result.dockername_ = dockername_;
      if (dockerinfoBuilder_ == null) {
        result.dockerinfo_ = dockerinfo_;
      } else {
        result.dockerinfo_ = dockerinfoBuilder_.build();
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
      if (other instanceof com.example.grpc.client.Docker) {
        return mergeFrom((com.example.grpc.client.Docker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.client.Docker other) {
      if (other == com.example.grpc.client.Docker.getDefaultInstance()) return this;
      if (!other.getDockername().isEmpty()) {
        dockername_ = other.dockername_;
        onChanged();
      }
      if (other.hasDockerinfo()) {
        mergeDockerinfo(other.getDockerinfo());
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
      com.example.grpc.client.Docker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.client.Docker) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dockername_ = "";
    /**
     * <code>string dockername = 1;</code>
     */
    public java.lang.String getDockername() {
      java.lang.Object ref = dockername_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dockername_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dockername = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDockernameBytes() {
      java.lang.Object ref = dockername_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dockername_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dockername = 1;</code>
     */
    public Builder setDockername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dockername_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dockername = 1;</code>
     */
    public Builder clearDockername() {
      
      dockername_ = getDefaultInstance().getDockername();
      onChanged();
      return this;
    }
    /**
     * <code>string dockername = 1;</code>
     */
    public Builder setDockernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dockername_ = value;
      onChanged();
      return this;
    }

    private com.example.grpc.client.DockerInfo dockerinfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.client.DockerInfo, com.example.grpc.client.DockerInfo.Builder, com.example.grpc.client.DockerInfoOrBuilder> dockerinfoBuilder_;
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public boolean hasDockerinfo() {
      return dockerinfoBuilder_ != null || dockerinfo_ != null;
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public com.example.grpc.client.DockerInfo getDockerinfo() {
      if (dockerinfoBuilder_ == null) {
        return dockerinfo_ == null ? com.example.grpc.client.DockerInfo.getDefaultInstance() : dockerinfo_;
      } else {
        return dockerinfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public Builder setDockerinfo(com.example.grpc.client.DockerInfo value) {
      if (dockerinfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dockerinfo_ = value;
        onChanged();
      } else {
        dockerinfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public Builder setDockerinfo(
        com.example.grpc.client.DockerInfo.Builder builderForValue) {
      if (dockerinfoBuilder_ == null) {
        dockerinfo_ = builderForValue.build();
        onChanged();
      } else {
        dockerinfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public Builder mergeDockerinfo(com.example.grpc.client.DockerInfo value) {
      if (dockerinfoBuilder_ == null) {
        if (dockerinfo_ != null) {
          dockerinfo_ =
            com.example.grpc.client.DockerInfo.newBuilder(dockerinfo_).mergeFrom(value).buildPartial();
        } else {
          dockerinfo_ = value;
        }
        onChanged();
      } else {
        dockerinfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public Builder clearDockerinfo() {
      if (dockerinfoBuilder_ == null) {
        dockerinfo_ = null;
        onChanged();
      } else {
        dockerinfo_ = null;
        dockerinfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public com.example.grpc.client.DockerInfo.Builder getDockerinfoBuilder() {
      
      onChanged();
      return getDockerinfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    public com.example.grpc.client.DockerInfoOrBuilder getDockerinfoOrBuilder() {
      if (dockerinfoBuilder_ != null) {
        return dockerinfoBuilder_.getMessageOrBuilder();
      } else {
        return dockerinfo_ == null ?
            com.example.grpc.client.DockerInfo.getDefaultInstance() : dockerinfo_;
      }
    }
    /**
     * <code>.com.example.grpc.client.DockerInfo dockerinfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.client.DockerInfo, com.example.grpc.client.DockerInfo.Builder, com.example.grpc.client.DockerInfoOrBuilder> 
        getDockerinfoFieldBuilder() {
      if (dockerinfoBuilder_ == null) {
        dockerinfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.client.DockerInfo, com.example.grpc.client.DockerInfo.Builder, com.example.grpc.client.DockerInfoOrBuilder>(
                getDockerinfo(),
                getParentForChildren(),
                isClean());
        dockerinfo_ = null;
      }
      return dockerinfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.client.Docker)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.client.Docker)
  private static final com.example.grpc.client.Docker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.client.Docker();
  }

  public static com.example.grpc.client.Docker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Docker>
      PARSER = new com.google.protobuf.AbstractParser<Docker>() {
    public Docker parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Docker(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Docker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Docker> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.client.Docker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

