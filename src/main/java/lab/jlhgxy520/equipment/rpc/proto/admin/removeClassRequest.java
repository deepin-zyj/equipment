// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin.proto

package lab.jlhgxy520.equipment.rpc.proto.admin;

/**
 * Protobuf type {@code lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest}
 */
public  final class removeClassRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest)
    removeClassRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use removeClassRequest.newBuilder() to construct.
  private removeClassRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private removeClassRequest() {
    classId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new removeClassRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private removeClassRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            classId_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lab.jlhgxy520.equipment.rpc.proto.admin.AdminProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_admin_removeClassRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lab.jlhgxy520.equipment.rpc.proto.admin.AdminProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_admin_removeClassRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.class, lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.Builder.class);
  }

  public static final int CLASS_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object classId_;
  /**
   * <pre>
   *教室ID
   * </pre>
   *
   * <code>string class_id = 1;</code>
   * @return The classId.
   */
  public java.lang.String getClassId() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *教室ID
   * </pre>
   *
   * <code>string class_id = 1;</code>
   * @return The bytes for classId.
   */
  public com.google.protobuf.ByteString
      getClassIdBytes() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getClassIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, classId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClassIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, classId_);
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
    if (!(obj instanceof lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest)) {
      return super.equals(obj);
    }
    lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest other = (lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest) obj;

    if (!getClassId()
        .equals(other.getClassId())) return false;
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
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parseFrom(
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
  public static Builder newBuilder(lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest prototype) {
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
   * Protobuf type {@code lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest)
      lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lab.jlhgxy520.equipment.rpc.proto.admin.AdminProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_admin_removeClassRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lab.jlhgxy520.equipment.rpc.proto.admin.AdminProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_admin_removeClassRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.class, lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.Builder.class);
    }

    // Construct using lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.newBuilder()
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
      classId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lab.jlhgxy520.equipment.rpc.proto.admin.AdminProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_admin_removeClassRequest_descriptor;
    }

    @java.lang.Override
    public lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest getDefaultInstanceForType() {
      return lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.getDefaultInstance();
    }

    @java.lang.Override
    public lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest build() {
      lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest buildPartial() {
      lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest result = new lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest(this);
      result.classId_ = classId_;
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
      if (other instanceof lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest) {
        return mergeFrom((lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest other) {
      if (other == lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.getDefaultInstance()) return this;
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
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
      lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object classId_ = "";
    /**
     * <pre>
     *教室ID
     * </pre>
     *
     * <code>string class_id = 1;</code>
     * @return The classId.
     */
    public java.lang.String getClassId() {
      java.lang.Object ref = classId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *教室ID
     * </pre>
     *
     * <code>string class_id = 1;</code>
     * @return The bytes for classId.
     */
    public com.google.protobuf.ByteString
        getClassIdBytes() {
      java.lang.Object ref = classId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *教室ID
     * </pre>
     *
     * <code>string class_id = 1;</code>
     * @param value The classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      classId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *教室ID
     * </pre>
     *
     * <code>string class_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClassId() {
      
      classId_ = getDefaultInstance().getClassId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *教室ID
     * </pre>
     *
     * <code>string class_id = 1;</code>
     * @param value The bytes for classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      classId_ = value;
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


    // @@protoc_insertion_point(builder_scope:lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest)
  }

  // @@protoc_insertion_point(class_scope:lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest)
  private static final lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest();
  }

  public static lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<removeClassRequest>
      PARSER = new com.google.protobuf.AbstractParser<removeClassRequest>() {
    @java.lang.Override
    public removeClassRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new removeClassRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<removeClassRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<removeClassRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
