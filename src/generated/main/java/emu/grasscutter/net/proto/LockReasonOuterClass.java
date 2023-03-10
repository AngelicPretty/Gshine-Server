// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LockReason.proto

package emu.grasscutter.net.proto;

public final class LockReasonOuterClass {
  private LockReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code LockReason}
   */
  public enum LockReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LOCK_REASON_LEVEL = 0;</code>
     */
    LOCK_REASON_LEVEL(0),
    /**
     * <code>LOCK_REASON_QUEST = 1;</code>
     */
    LOCK_REASON_QUEST(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LOCK_REASON_LEVEL = 0;</code>
     */
    public static final int LOCK_REASON_LEVEL_VALUE = 0;
    /**
     * <code>LOCK_REASON_QUEST = 1;</code>
     */
    public static final int LOCK_REASON_QUEST_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LockReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LockReason forNumber(int value) {
      switch (value) {
        case 0: return LOCK_REASON_LEVEL;
        case 1: return LOCK_REASON_QUEST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LockReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LockReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LockReason>() {
            public LockReason findValueByNumber(int number) {
              return LockReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LockReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final LockReason[] VALUES = values();

    public static LockReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LockReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LockReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020LockReason.proto*:\n\nLockReason\022\025\n\021LOCK" +
      "_REASON_LEVEL\020\000\022\025\n\021LOCK_REASON_QUEST\020\001B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
