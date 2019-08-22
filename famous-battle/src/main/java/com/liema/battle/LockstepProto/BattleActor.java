// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LSMessage.proto

package LockstepProto;

/**
 * Protobuf type {@code LockstepProto.BattleActor}
 */
public  final class BattleActor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LockstepProto.BattleActor)
    BattleActorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattleActor.newBuilder() to construct.
  private BattleActor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattleActor() {
    cardIds_ = emptyIntList();
    roleName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattleActor();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BattleActor(
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
          case 8: {

            roleId_ = input.readInt64();
            break;
          }
          case 16: {

            iq_ = input.readSInt32();
            break;
          }
          case 24: {

            agi_ = input.readSInt32();
            break;
          }
          case 32: {

            str_ = input.readSInt32();
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cardIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            cardIds_.addInt(input.readSInt32());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              cardIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              cardIds_.addInt(input.readSInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 48: {

            school_ = input.readSInt32();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            roleName_ = s;
            break;
          }
          case 64: {

            rankId_ = input.readSInt32();
            break;
          }
          case 72: {

            starCount_ = input.readSInt32();
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
        cardIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return LockstepProto.LSMessage.internal_static_LockstepProto_BattleActor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LockstepProto.LSMessage.internal_static_LockstepProto_BattleActor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LockstepProto.BattleActor.class, LockstepProto.BattleActor.Builder.class);
  }

  public static final int ROLEID_FIELD_NUMBER = 1;
  private long roleId_;
  /**
   * <code>int64 roleId = 1;</code>
   */
  public long getRoleId() {
    return roleId_;
  }

  public static final int IQ_FIELD_NUMBER = 2;
  private int iq_;
  /**
   * <code>sint32 iq = 2;</code>
   */
  public int getIq() {
    return iq_;
  }

  public static final int AGI_FIELD_NUMBER = 3;
  private int agi_;
  /**
   * <code>sint32 agi = 3;</code>
   */
  public int getAgi() {
    return agi_;
  }

  public static final int STR_FIELD_NUMBER = 4;
  private int str_;
  /**
   * <code>sint32 str = 4;</code>
   */
  public int getStr() {
    return str_;
  }

  public static final int CARDIDS_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.IntList cardIds_;
  /**
   * <code>repeated sint32 cardIds = 5;</code>
   */
  public java.util.List<java.lang.Integer>
      getCardIdsList() {
    return cardIds_;
  }
  /**
   * <code>repeated sint32 cardIds = 5;</code>
   */
  public int getCardIdsCount() {
    return cardIds_.size();
  }
  /**
   * <code>repeated sint32 cardIds = 5;</code>
   */
  public int getCardIds(int index) {
    return cardIds_.getInt(index);
  }
  private int cardIdsMemoizedSerializedSize = -1;

  public static final int SCHOOL_FIELD_NUMBER = 6;
  private int school_;
  /**
   * <code>sint32 school = 6;</code>
   */
  public int getSchool() {
    return school_;
  }

  public static final int ROLENAME_FIELD_NUMBER = 7;
  private volatile java.lang.Object roleName_;
  /**
   * <code>string roleName = 7;</code>
   */
  public java.lang.String getRoleName() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roleName_ = s;
      return s;
    }
  }
  /**
   * <code>string roleName = 7;</code>
   */
  public com.google.protobuf.ByteString
      getRoleNameBytes() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RANKID_FIELD_NUMBER = 8;
  private int rankId_;
  /**
   * <code>sint32 rankId = 8;</code>
   */
  public int getRankId() {
    return rankId_;
  }

  public static final int STARCOUNT_FIELD_NUMBER = 9;
  private int starCount_;
  /**
   * <code>sint32 starCount = 9;</code>
   */
  public int getStarCount() {
    return starCount_;
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
    getSerializedSize();
    if (roleId_ != 0L) {
      output.writeInt64(1, roleId_);
    }
    if (iq_ != 0) {
      output.writeSInt32(2, iq_);
    }
    if (agi_ != 0) {
      output.writeSInt32(3, agi_);
    }
    if (str_ != 0) {
      output.writeSInt32(4, str_);
    }
    if (getCardIdsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(cardIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < cardIds_.size(); i++) {
      output.writeSInt32NoTag(cardIds_.getInt(i));
    }
    if (school_ != 0) {
      output.writeSInt32(6, school_);
    }
    if (!getRoleNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, roleName_);
    }
    if (rankId_ != 0) {
      output.writeSInt32(8, rankId_);
    }
    if (starCount_ != 0) {
      output.writeSInt32(9, starCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roleId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, roleId_);
    }
    if (iq_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(2, iq_);
    }
    if (agi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(3, agi_);
    }
    if (str_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(4, str_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < cardIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeSInt32SizeNoTag(cardIds_.getInt(i));
      }
      size += dataSize;
      if (!getCardIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      cardIdsMemoizedSerializedSize = dataSize;
    }
    if (school_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(6, school_);
    }
    if (!getRoleNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, roleName_);
    }
    if (rankId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(8, rankId_);
    }
    if (starCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(9, starCount_);
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
    if (!(obj instanceof LockstepProto.BattleActor)) {
      return super.equals(obj);
    }
    LockstepProto.BattleActor other = (LockstepProto.BattleActor) obj;

    if (getRoleId()
        != other.getRoleId()) return false;
    if (getIq()
        != other.getIq()) return false;
    if (getAgi()
        != other.getAgi()) return false;
    if (getStr()
        != other.getStr()) return false;
    if (!getCardIdsList()
        .equals(other.getCardIdsList())) return false;
    if (getSchool()
        != other.getSchool()) return false;
    if (!getRoleName()
        .equals(other.getRoleName())) return false;
    if (getRankId()
        != other.getRankId()) return false;
    if (getStarCount()
        != other.getStarCount()) return false;
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
    hash = (37 * hash) + ROLEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRoleId());
    hash = (37 * hash) + IQ_FIELD_NUMBER;
    hash = (53 * hash) + getIq();
    hash = (37 * hash) + AGI_FIELD_NUMBER;
    hash = (53 * hash) + getAgi();
    hash = (37 * hash) + STR_FIELD_NUMBER;
    hash = (53 * hash) + getStr();
    if (getCardIdsCount() > 0) {
      hash = (37 * hash) + CARDIDS_FIELD_NUMBER;
      hash = (53 * hash) + getCardIdsList().hashCode();
    }
    hash = (37 * hash) + SCHOOL_FIELD_NUMBER;
    hash = (53 * hash) + getSchool();
    hash = (37 * hash) + ROLENAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoleName().hashCode();
    hash = (37 * hash) + RANKID_FIELD_NUMBER;
    hash = (53 * hash) + getRankId();
    hash = (37 * hash) + STARCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getStarCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LockstepProto.BattleActor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.BattleActor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.BattleActor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.BattleActor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.BattleActor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.BattleActor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.BattleActor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LockstepProto.BattleActor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LockstepProto.BattleActor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LockstepProto.BattleActor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LockstepProto.BattleActor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LockstepProto.BattleActor parseFrom(
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
  public static Builder newBuilder(LockstepProto.BattleActor prototype) {
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
   * Protobuf type {@code LockstepProto.BattleActor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LockstepProto.BattleActor)
      LockstepProto.BattleActorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LockstepProto.LSMessage.internal_static_LockstepProto_BattleActor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LockstepProto.LSMessage.internal_static_LockstepProto_BattleActor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LockstepProto.BattleActor.class, LockstepProto.BattleActor.Builder.class);
    }

    // Construct using LockstepProto.BattleActor.newBuilder()
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
      roleId_ = 0L;

      iq_ = 0;

      agi_ = 0;

      str_ = 0;

      cardIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      school_ = 0;

      roleName_ = "";

      rankId_ = 0;

      starCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LockstepProto.LSMessage.internal_static_LockstepProto_BattleActor_descriptor;
    }

    @java.lang.Override
    public LockstepProto.BattleActor getDefaultInstanceForType() {
      return LockstepProto.BattleActor.getDefaultInstance();
    }

    @java.lang.Override
    public LockstepProto.BattleActor build() {
      LockstepProto.BattleActor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public LockstepProto.BattleActor buildPartial() {
      LockstepProto.BattleActor result = new LockstepProto.BattleActor(this);
      int from_bitField0_ = bitField0_;
      result.roleId_ = roleId_;
      result.iq_ = iq_;
      result.agi_ = agi_;
      result.str_ = str_;
      if (((bitField0_ & 0x00000001) != 0)) {
        cardIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cardIds_ = cardIds_;
      result.school_ = school_;
      result.roleName_ = roleName_;
      result.rankId_ = rankId_;
      result.starCount_ = starCount_;
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
      if (other instanceof LockstepProto.BattleActor) {
        return mergeFrom((LockstepProto.BattleActor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LockstepProto.BattleActor other) {
      if (other == LockstepProto.BattleActor.getDefaultInstance()) return this;
      if (other.getRoleId() != 0L) {
        setRoleId(other.getRoleId());
      }
      if (other.getIq() != 0) {
        setIq(other.getIq());
      }
      if (other.getAgi() != 0) {
        setAgi(other.getAgi());
      }
      if (other.getStr() != 0) {
        setStr(other.getStr());
      }
      if (!other.cardIds_.isEmpty()) {
        if (cardIds_.isEmpty()) {
          cardIds_ = other.cardIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCardIdsIsMutable();
          cardIds_.addAll(other.cardIds_);
        }
        onChanged();
      }
      if (other.getSchool() != 0) {
        setSchool(other.getSchool());
      }
      if (!other.getRoleName().isEmpty()) {
        roleName_ = other.roleName_;
        onChanged();
      }
      if (other.getRankId() != 0) {
        setRankId(other.getRankId());
      }
      if (other.getStarCount() != 0) {
        setStarCount(other.getStarCount());
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
      LockstepProto.BattleActor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (LockstepProto.BattleActor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long roleId_ ;
    /**
     * <code>int64 roleId = 1;</code>
     */
    public long getRoleId() {
      return roleId_;
    }
    /**
     * <code>int64 roleId = 1;</code>
     */
    public Builder setRoleId(long value) {
      
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 roleId = 1;</code>
     */
    public Builder clearRoleId() {
      
      roleId_ = 0L;
      onChanged();
      return this;
    }

    private int iq_ ;
    /**
     * <code>sint32 iq = 2;</code>
     */
    public int getIq() {
      return iq_;
    }
    /**
     * <code>sint32 iq = 2;</code>
     */
    public Builder setIq(int value) {
      
      iq_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 iq = 2;</code>
     */
    public Builder clearIq() {
      
      iq_ = 0;
      onChanged();
      return this;
    }

    private int agi_ ;
    /**
     * <code>sint32 agi = 3;</code>
     */
    public int getAgi() {
      return agi_;
    }
    /**
     * <code>sint32 agi = 3;</code>
     */
    public Builder setAgi(int value) {
      
      agi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 agi = 3;</code>
     */
    public Builder clearAgi() {
      
      agi_ = 0;
      onChanged();
      return this;
    }

    private int str_ ;
    /**
     * <code>sint32 str = 4;</code>
     */
    public int getStr() {
      return str_;
    }
    /**
     * <code>sint32 str = 4;</code>
     */
    public Builder setStr(int value) {
      
      str_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 str = 4;</code>
     */
    public Builder clearStr() {
      
      str_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList cardIds_ = emptyIntList();
    private void ensureCardIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cardIds_ = mutableCopy(cardIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated sint32 cardIds = 5;</code>
     */
    public java.util.List<java.lang.Integer>
        getCardIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(cardIds_) : cardIds_;
    }
    /**
     * <code>repeated sint32 cardIds = 5;</code>
     */
    public int getCardIdsCount() {
      return cardIds_.size();
    }
    /**
     * <code>repeated sint32 cardIds = 5;</code>
     */
    public int getCardIds(int index) {
      return cardIds_.getInt(index);
    }
    /**
     * <code>repeated sint32 cardIds = 5;</code>
     */
    public Builder setCardIds(
        int index, int value) {
      ensureCardIdsIsMutable();
      cardIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated sint32 cardIds = 5;</code>
     */
    public Builder addCardIds(int value) {
      ensureCardIdsIsMutable();
      cardIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated sint32 cardIds = 5;</code>
     */
    public Builder addAllCardIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureCardIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cardIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated sint32 cardIds = 5;</code>
     */
    public Builder clearCardIds() {
      cardIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int school_ ;
    /**
     * <code>sint32 school = 6;</code>
     */
    public int getSchool() {
      return school_;
    }
    /**
     * <code>sint32 school = 6;</code>
     */
    public Builder setSchool(int value) {
      
      school_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 school = 6;</code>
     */
    public Builder clearSchool() {
      
      school_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object roleName_ = "";
    /**
     * <code>string roleName = 7;</code>
     */
    public java.lang.String getRoleName() {
      java.lang.Object ref = roleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string roleName = 7;</code>
     */
    public com.google.protobuf.ByteString
        getRoleNameBytes() {
      java.lang.Object ref = roleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roleName = 7;</code>
     */
    public Builder setRoleName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roleName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string roleName = 7;</code>
     */
    public Builder clearRoleName() {
      
      roleName_ = getDefaultInstance().getRoleName();
      onChanged();
      return this;
    }
    /**
     * <code>string roleName = 7;</code>
     */
    public Builder setRoleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roleName_ = value;
      onChanged();
      return this;
    }

    private int rankId_ ;
    /**
     * <code>sint32 rankId = 8;</code>
     */
    public int getRankId() {
      return rankId_;
    }
    /**
     * <code>sint32 rankId = 8;</code>
     */
    public Builder setRankId(int value) {
      
      rankId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 rankId = 8;</code>
     */
    public Builder clearRankId() {
      
      rankId_ = 0;
      onChanged();
      return this;
    }

    private int starCount_ ;
    /**
     * <code>sint32 starCount = 9;</code>
     */
    public int getStarCount() {
      return starCount_;
    }
    /**
     * <code>sint32 starCount = 9;</code>
     */
    public Builder setStarCount(int value) {
      
      starCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 starCount = 9;</code>
     */
    public Builder clearStarCount() {
      
      starCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:LockstepProto.BattleActor)
  }

  // @@protoc_insertion_point(class_scope:LockstepProto.BattleActor)
  private static final LockstepProto.BattleActor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LockstepProto.BattleActor();
  }

  public static LockstepProto.BattleActor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattleActor>
      PARSER = new com.google.protobuf.AbstractParser<BattleActor>() {
    @java.lang.Override
    public BattleActor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BattleActor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattleActor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattleActor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public LockstepProto.BattleActor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
