// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel.proto

package com.hotel.proto;

/**
 * Protobuf type {@code com.hotel.proto.HotelsList}
 */
public  final class HotelsList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.hotel.proto.HotelsList)
    HotelsListOrBuilder {
  // Use HotelsList.newBuilder() to construct.
  private HotelsList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelsList() {
    hotel_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HotelsList(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              hotel_ = new java.util.ArrayList<com.hotel.proto.HotelDetails>();
              mutable_bitField0_ |= 0x00000001;
            }
            hotel_.add(
                input.readMessage(com.hotel.proto.HotelDetails.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        hotel_ = java.util.Collections.unmodifiableList(hotel_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hotel.proto.Hotel.internal_static_com_hotel_proto_HotelsList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.proto.Hotel.internal_static_com_hotel_proto_HotelsList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.proto.HotelsList.class, com.hotel.proto.HotelsList.Builder.class);
  }

  public static final int HOTEL_FIELD_NUMBER = 1;
  private java.util.List<com.hotel.proto.HotelDetails> hotel_;
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  public java.util.List<com.hotel.proto.HotelDetails> getHotelList() {
    return hotel_;
  }
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  public java.util.List<? extends com.hotel.proto.HotelDetailsOrBuilder> 
      getHotelOrBuilderList() {
    return hotel_;
  }
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  public int getHotelCount() {
    return hotel_.size();
  }
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  public com.hotel.proto.HotelDetails getHotel(int index) {
    return hotel_.get(index);
  }
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  public com.hotel.proto.HotelDetailsOrBuilder getHotelOrBuilder(
      int index) {
    return hotel_.get(index);
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
    for (int i = 0; i < hotel_.size(); i++) {
      output.writeMessage(1, hotel_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hotel_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hotel_.get(i));
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
    if (!(obj instanceof com.hotel.proto.HotelsList)) {
      return super.equals(obj);
    }
    com.hotel.proto.HotelsList other = (com.hotel.proto.HotelsList) obj;

    boolean result = true;
    result = result && getHotelList()
        .equals(other.getHotelList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getHotelCount() > 0) {
      hash = (37 * hash) + HOTEL_FIELD_NUMBER;
      hash = (53 * hash) + getHotelList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.proto.HotelsList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.proto.HotelsList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.proto.HotelsList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.proto.HotelsList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.proto.HotelsList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.proto.HotelsList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.proto.HotelsList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.proto.HotelsList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.proto.HotelsList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.proto.HotelsList parseFrom(
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
  public static Builder newBuilder(com.hotel.proto.HotelsList prototype) {
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
   * Protobuf type {@code com.hotel.proto.HotelsList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hotel.proto.HotelsList)
      com.hotel.proto.HotelsListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.proto.Hotel.internal_static_com_hotel_proto_HotelsList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.proto.Hotel.internal_static_com_hotel_proto_HotelsList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.proto.HotelsList.class, com.hotel.proto.HotelsList.Builder.class);
    }

    // Construct using com.hotel.proto.HotelsList.newBuilder()
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
        getHotelFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (hotelBuilder_ == null) {
        hotel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hotelBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.proto.Hotel.internal_static_com_hotel_proto_HotelsList_descriptor;
    }

    public com.hotel.proto.HotelsList getDefaultInstanceForType() {
      return com.hotel.proto.HotelsList.getDefaultInstance();
    }

    public com.hotel.proto.HotelsList build() {
      com.hotel.proto.HotelsList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hotel.proto.HotelsList buildPartial() {
      com.hotel.proto.HotelsList result = new com.hotel.proto.HotelsList(this);
      int from_bitField0_ = bitField0_;
      if (hotelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          hotel_ = java.util.Collections.unmodifiableList(hotel_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hotel_ = hotel_;
      } else {
        result.hotel_ = hotelBuilder_.build();
      }
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
      if (other instanceof com.hotel.proto.HotelsList) {
        return mergeFrom((com.hotel.proto.HotelsList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.proto.HotelsList other) {
      if (other == com.hotel.proto.HotelsList.getDefaultInstance()) return this;
      if (hotelBuilder_ == null) {
        if (!other.hotel_.isEmpty()) {
          if (hotel_.isEmpty()) {
            hotel_ = other.hotel_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHotelIsMutable();
            hotel_.addAll(other.hotel_);
          }
          onChanged();
        }
      } else {
        if (!other.hotel_.isEmpty()) {
          if (hotelBuilder_.isEmpty()) {
            hotelBuilder_.dispose();
            hotelBuilder_ = null;
            hotel_ = other.hotel_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hotelBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHotelFieldBuilder() : null;
          } else {
            hotelBuilder_.addAllMessages(other.hotel_);
          }
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
      com.hotel.proto.HotelsList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.proto.HotelsList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.hotel.proto.HotelDetails> hotel_ =
      java.util.Collections.emptyList();
    private void ensureHotelIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        hotel_ = new java.util.ArrayList<com.hotel.proto.HotelDetails>(hotel_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.proto.HotelDetails, com.hotel.proto.HotelDetails.Builder, com.hotel.proto.HotelDetailsOrBuilder> hotelBuilder_;

    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public java.util.List<com.hotel.proto.HotelDetails> getHotelList() {
      if (hotelBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hotel_);
      } else {
        return hotelBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public int getHotelCount() {
      if (hotelBuilder_ == null) {
        return hotel_.size();
      } else {
        return hotelBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public com.hotel.proto.HotelDetails getHotel(int index) {
      if (hotelBuilder_ == null) {
        return hotel_.get(index);
      } else {
        return hotelBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder setHotel(
        int index, com.hotel.proto.HotelDetails value) {
      if (hotelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelIsMutable();
        hotel_.set(index, value);
        onChanged();
      } else {
        hotelBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder setHotel(
        int index, com.hotel.proto.HotelDetails.Builder builderForValue) {
      if (hotelBuilder_ == null) {
        ensureHotelIsMutable();
        hotel_.set(index, builderForValue.build());
        onChanged();
      } else {
        hotelBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder addHotel(com.hotel.proto.HotelDetails value) {
      if (hotelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelIsMutable();
        hotel_.add(value);
        onChanged();
      } else {
        hotelBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder addHotel(
        int index, com.hotel.proto.HotelDetails value) {
      if (hotelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelIsMutable();
        hotel_.add(index, value);
        onChanged();
      } else {
        hotelBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder addHotel(
        com.hotel.proto.HotelDetails.Builder builderForValue) {
      if (hotelBuilder_ == null) {
        ensureHotelIsMutable();
        hotel_.add(builderForValue.build());
        onChanged();
      } else {
        hotelBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder addHotel(
        int index, com.hotel.proto.HotelDetails.Builder builderForValue) {
      if (hotelBuilder_ == null) {
        ensureHotelIsMutable();
        hotel_.add(index, builderForValue.build());
        onChanged();
      } else {
        hotelBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder addAllHotel(
        java.lang.Iterable<? extends com.hotel.proto.HotelDetails> values) {
      if (hotelBuilder_ == null) {
        ensureHotelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hotel_);
        onChanged();
      } else {
        hotelBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder clearHotel() {
      if (hotelBuilder_ == null) {
        hotel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hotelBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public Builder removeHotel(int index) {
      if (hotelBuilder_ == null) {
        ensureHotelIsMutable();
        hotel_.remove(index);
        onChanged();
      } else {
        hotelBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public com.hotel.proto.HotelDetails.Builder getHotelBuilder(
        int index) {
      return getHotelFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public com.hotel.proto.HotelDetailsOrBuilder getHotelOrBuilder(
        int index) {
      if (hotelBuilder_ == null) {
        return hotel_.get(index);  } else {
        return hotelBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public java.util.List<? extends com.hotel.proto.HotelDetailsOrBuilder> 
         getHotelOrBuilderList() {
      if (hotelBuilder_ != null) {
        return hotelBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hotel_);
      }
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public com.hotel.proto.HotelDetails.Builder addHotelBuilder() {
      return getHotelFieldBuilder().addBuilder(
          com.hotel.proto.HotelDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public com.hotel.proto.HotelDetails.Builder addHotelBuilder(
        int index) {
      return getHotelFieldBuilder().addBuilder(
          index, com.hotel.proto.HotelDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
     */
    public java.util.List<com.hotel.proto.HotelDetails.Builder> 
         getHotelBuilderList() {
      return getHotelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.proto.HotelDetails, com.hotel.proto.HotelDetails.Builder, com.hotel.proto.HotelDetailsOrBuilder> 
        getHotelFieldBuilder() {
      if (hotelBuilder_ == null) {
        hotelBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hotel.proto.HotelDetails, com.hotel.proto.HotelDetails.Builder, com.hotel.proto.HotelDetailsOrBuilder>(
                hotel_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        hotel_ = null;
      }
      return hotelBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.hotel.proto.HotelsList)
  }

  // @@protoc_insertion_point(class_scope:com.hotel.proto.HotelsList)
  private static final com.hotel.proto.HotelsList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.proto.HotelsList();
  }

  public static com.hotel.proto.HotelsList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelsList>
      PARSER = new com.google.protobuf.AbstractParser<HotelsList>() {
    public HotelsList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HotelsList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelsList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelsList> getParserForType() {
    return PARSER;
  }

  public com.hotel.proto.HotelsList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
