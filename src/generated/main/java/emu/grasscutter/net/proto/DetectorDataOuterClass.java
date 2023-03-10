// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DetectorData.proto

package emu.grasscutter.net.proto;

public final class DetectorDataOuterClass {
  private DetectorDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DetectorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DetectorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isHintValid = 2;</code>
     * @return The isHintValid.
     */
    boolean getIsHintValid();

    /**
     * <code>uint32 configId = 9;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>.Vector hintCenterPos = 3;</code>
     * @return Whether the hintCenterPos field is set.
     */
    boolean hasHintCenterPos();
    /**
     * <code>.Vector hintCenterPos = 3;</code>
     * @return The hintCenterPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getHintCenterPos();
    /**
     * <code>.Vector hintCenterPos = 3;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();

    /**
     * <code>uint32 materialId = 10;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>bool isAllCollected = 13;</code>
     * @return The isAllCollected.
     */
    boolean getIsAllCollected();

    /**
     * <code>uint32 groupId = 14;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 hintRadius = 5;</code>
     * @return The hintRadius.
     */
    int getHintRadius();
  }
  /**
   * Protobuf type {@code DetectorData}
   */
  public static final class DetectorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DetectorData)
      DetectorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DetectorData.newBuilder() to construct.
    private DetectorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DetectorData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DetectorData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DetectorData(
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
            case 16: {

              isHintValid_ = input.readBool();
              break;
            }
            case 26: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (hintCenterPos_ != null) {
                subBuilder = hintCenterPos_.toBuilder();
              }
              hintCenterPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hintCenterPos_);
                hintCenterPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              hintRadius_ = input.readUInt32();
              break;
            }
            case 72: {

              configId_ = input.readUInt32();
              break;
            }
            case 80: {

              materialId_ = input.readUInt32();
              break;
            }
            case 104: {

              isAllCollected_ = input.readBool();
              break;
            }
            case 112: {

              groupId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DetectorDataOuterClass.internal_static_DetectorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DetectorDataOuterClass.internal_static_DetectorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData.class, emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData.Builder.class);
    }

    public static final int ISHINTVALID_FIELD_NUMBER = 2;
    private boolean isHintValid_;
    /**
     * <code>bool isHintValid = 2;</code>
     * @return The isHintValid.
     */
    @java.lang.Override
    public boolean getIsHintValid() {
      return isHintValid_;
    }

    public static final int CONFIGID_FIELD_NUMBER = 9;
    private int configId_;
    /**
     * <code>uint32 configId = 9;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int HINTCENTERPOS_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector hintCenterPos_;
    /**
     * <code>.Vector hintCenterPos = 3;</code>
     * @return Whether the hintCenterPos field is set.
     */
    @java.lang.Override
    public boolean hasHintCenterPos() {
      return hintCenterPos_ != null;
    }
    /**
     * <code>.Vector hintCenterPos = 3;</code>
     * @return The hintCenterPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getHintCenterPos() {
      return hintCenterPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }
    /**
     * <code>.Vector hintCenterPos = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
      return getHintCenterPos();
    }

    public static final int MATERIALID_FIELD_NUMBER = 10;
    private int materialId_;
    /**
     * <code>uint32 materialId = 10;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int ISALLCOLLECTED_FIELD_NUMBER = 13;
    private boolean isAllCollected_;
    /**
     * <code>bool isAllCollected = 13;</code>
     * @return The isAllCollected.
     */
    @java.lang.Override
    public boolean getIsAllCollected() {
      return isAllCollected_;
    }

    public static final int GROUPID_FIELD_NUMBER = 14;
    private int groupId_;
    /**
     * <code>uint32 groupId = 14;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int HINTRADIUS_FIELD_NUMBER = 5;
    private int hintRadius_;
    /**
     * <code>uint32 hintRadius = 5;</code>
     * @return The hintRadius.
     */
    @java.lang.Override
    public int getHintRadius() {
      return hintRadius_;
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
      if (isHintValid_ != false) {
        output.writeBool(2, isHintValid_);
      }
      if (hintCenterPos_ != null) {
        output.writeMessage(3, getHintCenterPos());
      }
      if (hintRadius_ != 0) {
        output.writeUInt32(5, hintRadius_);
      }
      if (configId_ != 0) {
        output.writeUInt32(9, configId_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(10, materialId_);
      }
      if (isAllCollected_ != false) {
        output.writeBool(13, isAllCollected_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(14, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHintValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isHintValid_);
      }
      if (hintCenterPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getHintCenterPos());
      }
      if (hintRadius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, hintRadius_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, configId_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, materialId_);
      }
      if (isAllCollected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isAllCollected_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, groupId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData other = (emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData) obj;

      if (getIsHintValid()
          != other.getIsHintValid()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (hasHintCenterPos() != other.hasHintCenterPos()) return false;
      if (hasHintCenterPos()) {
        if (!getHintCenterPos()
            .equals(other.getHintCenterPos())) return false;
      }
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getIsAllCollected()
          != other.getIsAllCollected()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getHintRadius()
          != other.getHintRadius()) return false;
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
      hash = (37 * hash) + ISHINTVALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHintValid());
      hash = (37 * hash) + CONFIGID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      if (hasHintCenterPos()) {
        hash = (37 * hash) + HINTCENTERPOS_FIELD_NUMBER;
        hash = (53 * hash) + getHintCenterPos().hashCode();
      }
      hash = (37 * hash) + MATERIALID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + ISALLCOLLECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllCollected());
      hash = (37 * hash) + GROUPID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + HINTRADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getHintRadius();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData prototype) {
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
     * Protobuf type {@code DetectorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DetectorData)
        emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DetectorDataOuterClass.internal_static_DetectorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DetectorDataOuterClass.internal_static_DetectorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData.class, emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData.newBuilder()
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
        isHintValid_ = false;

        configId_ = 0;

        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }
        materialId_ = 0;

        isAllCollected_ = false;

        groupId_ = 0;

        hintRadius_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DetectorDataOuterClass.internal_static_DetectorData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData build() {
        emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData buildPartial() {
        emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData result = new emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData(this);
        result.isHintValid_ = isHintValid_;
        result.configId_ = configId_;
        if (hintCenterPosBuilder_ == null) {
          result.hintCenterPos_ = hintCenterPos_;
        } else {
          result.hintCenterPos_ = hintCenterPosBuilder_.build();
        }
        result.materialId_ = materialId_;
        result.isAllCollected_ = isAllCollected_;
        result.groupId_ = groupId_;
        result.hintRadius_ = hintRadius_;
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
        if (other instanceof emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData) {
          return mergeFrom((emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData other) {
        if (other == emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData.getDefaultInstance()) return this;
        if (other.getIsHintValid() != false) {
          setIsHintValid(other.getIsHintValid());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.hasHintCenterPos()) {
          mergeHintCenterPos(other.getHintCenterPos());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getIsAllCollected() != false) {
          setIsAllCollected(other.getIsAllCollected());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getHintRadius() != 0) {
          setHintRadius(other.getHintRadius());
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
        emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isHintValid_ ;
      /**
       * <code>bool isHintValid = 2;</code>
       * @return The isHintValid.
       */
      @java.lang.Override
      public boolean getIsHintValid() {
        return isHintValid_;
      }
      /**
       * <code>bool isHintValid = 2;</code>
       * @param value The isHintValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsHintValid(boolean value) {
        
        isHintValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isHintValid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHintValid() {
        
        isHintValid_ = false;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 configId = 9;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 configId = 9;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 configId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector hintCenterPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       * @return Whether the hintCenterPos field is set.
       */
      public boolean hasHintCenterPos() {
        return hintCenterPosBuilder_ != null || hintCenterPos_ != null;
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       * @return The hintCenterPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          return hintCenterPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        } else {
          return hintCenterPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       */
      public Builder setHintCenterPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hintCenterPos_ = value;
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       */
      public Builder setHintCenterPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = builderForValue.build();
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       */
      public Builder mergeHintCenterPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (hintCenterPos_ != null) {
            hintCenterPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(hintCenterPos_).mergeFrom(value).buildPartial();
          } else {
            hintCenterPos_ = value;
          }
          onChanged();
        } else {
          hintCenterPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       */
      public Builder clearHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
          onChanged();
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
        
        onChanged();
        return getHintCenterPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
        if (hintCenterPosBuilder_ != null) {
          return hintCenterPosBuilder_.getMessageOrBuilder();
        } else {
          return hintCenterPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        }
      }
      /**
       * <code>.Vector hintCenterPos = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getHintCenterPosFieldBuilder() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getHintCenterPos(),
                  getParentForChildren(),
                  isClean());
          hintCenterPos_ = null;
        }
        return hintCenterPosBuilder_;
      }

      private int materialId_ ;
      /**
       * <code>uint32 materialId = 10;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 materialId = 10;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 materialId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAllCollected_ ;
      /**
       * <code>bool isAllCollected = 13;</code>
       * @return The isAllCollected.
       */
      @java.lang.Override
      public boolean getIsAllCollected() {
        return isAllCollected_;
      }
      /**
       * <code>bool isAllCollected = 13;</code>
       * @param value The isAllCollected to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllCollected(boolean value) {
        
        isAllCollected_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isAllCollected = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllCollected() {
        
        isAllCollected_ = false;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 groupId = 14;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 groupId = 14;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int hintRadius_ ;
      /**
       * <code>uint32 hintRadius = 5;</code>
       * @return The hintRadius.
       */
      @java.lang.Override
      public int getHintRadius() {
        return hintRadius_;
      }
      /**
       * <code>uint32 hintRadius = 5;</code>
       * @param value The hintRadius to set.
       * @return This builder for chaining.
       */
      public Builder setHintRadius(int value) {
        
        hintRadius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hintRadius = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearHintRadius() {
        
        hintRadius_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DetectorData)
    }

    // @@protoc_insertion_point(class_scope:DetectorData)
    private static final emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData();
    }

    public static emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DetectorData>
        PARSER = new com.google.protobuf.AbstractParser<DetectorData>() {
      @java.lang.Override
      public DetectorData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DetectorData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DetectorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DetectorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DetectorDataOuterClass.DetectorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DetectorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DetectorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DetectorData.proto\032\014Vector.proto\"\246\001\n\014D" +
      "etectorData\022\023\n\013isHintValid\030\002 \001(\010\022\020\n\010conf" +
      "igId\030\t \001(\r\022\036\n\rhintCenterPos\030\003 \001(\0132\007.Vect" +
      "or\022\022\n\nmaterialId\030\n \001(\r\022\026\n\016isAllCollected" +
      "\030\r \001(\010\022\017\n\007groupId\030\016 \001(\r\022\022\n\nhintRadius\030\005 " +
      "\001(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_DetectorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DetectorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DetectorData_descriptor,
        new java.lang.String[] { "IsHintValid", "ConfigId", "HintCenterPos", "MaterialId", "IsAllCollected", "GroupId", "HintRadius", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
