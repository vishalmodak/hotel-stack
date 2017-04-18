// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel.proto

package com.hotel.proto;

/**
 * Protobuf enum {@code com.hotel.proto.Amenity}
 */
public enum Amenity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WIFI = 0;</code>
   */
  WIFI(0),
  /**
   * <code>HIGH_SPEED_INTERNET = 1;</code>
   */
  HIGH_SPEED_INTERNET(1),
  /**
   * <code>POOL = 2;</code>
   */
  POOL(2),
  /**
   * <code>HOT_TUB = 3;</code>
   */
  HOT_TUB(3),
  /**
   * <code>JACUZZI = 4;</code>
   */
  JACUZZI(4),
  /**
   * <code>RESTAURANT = 5;</code>
   */
  RESTAURANT(5),
  /**
   * <code>FITNESS_CENTER = 6;</code>
   */
  FITNESS_CENTER(6),
  /**
   * <code>LAUNDRY = 7;</code>
   */
  LAUNDRY(7),
  /**
   * <code>ROOM_SERVICE = 8;</code>
   */
  ROOM_SERVICE(8),
  /**
   * <code>CASINO = 9;</code>
   */
  CASINO(9),
  /**
   * <code>FREE_PARKING = 10;</code>
   */
  FREE_PARKING(10),
  /**
   * <code>SPA = 11;</code>
   */
  SPA(11),
  /**
   * <code>PET_FRIENDLY = 12;</code>
   */
  PET_FRIENDLY(12),
  ;

  /**
   * <code>WIFI = 0;</code>
   */
  public static final int WIFI_VALUE = 0;
  /**
   * <code>HIGH_SPEED_INTERNET = 1;</code>
   */
  public static final int HIGH_SPEED_INTERNET_VALUE = 1;
  /**
   * <code>POOL = 2;</code>
   */
  public static final int POOL_VALUE = 2;
  /**
   * <code>HOT_TUB = 3;</code>
   */
  public static final int HOT_TUB_VALUE = 3;
  /**
   * <code>JACUZZI = 4;</code>
   */
  public static final int JACUZZI_VALUE = 4;
  /**
   * <code>RESTAURANT = 5;</code>
   */
  public static final int RESTAURANT_VALUE = 5;
  /**
   * <code>FITNESS_CENTER = 6;</code>
   */
  public static final int FITNESS_CENTER_VALUE = 6;
  /**
   * <code>LAUNDRY = 7;</code>
   */
  public static final int LAUNDRY_VALUE = 7;
  /**
   * <code>ROOM_SERVICE = 8;</code>
   */
  public static final int ROOM_SERVICE_VALUE = 8;
  /**
   * <code>CASINO = 9;</code>
   */
  public static final int CASINO_VALUE = 9;
  /**
   * <code>FREE_PARKING = 10;</code>
   */
  public static final int FREE_PARKING_VALUE = 10;
  /**
   * <code>SPA = 11;</code>
   */
  public static final int SPA_VALUE = 11;
  /**
   * <code>PET_FRIENDLY = 12;</code>
   */
  public static final int PET_FRIENDLY_VALUE = 12;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Amenity valueOf(int value) {
    return forNumber(value);
  }

  public static Amenity forNumber(int value) {
    switch (value) {
      case 0: return WIFI;
      case 1: return HIGH_SPEED_INTERNET;
      case 2: return POOL;
      case 3: return HOT_TUB;
      case 4: return JACUZZI;
      case 5: return RESTAURANT;
      case 6: return FITNESS_CENTER;
      case 7: return LAUNDRY;
      case 8: return ROOM_SERVICE;
      case 9: return CASINO;
      case 10: return FREE_PARKING;
      case 11: return SPA;
      case 12: return PET_FRIENDLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Amenity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Amenity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Amenity>() {
          public Amenity findValueByNumber(int number) {
            return Amenity.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.hotel.proto.Hotel.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final Amenity[] VALUES = values();

  public static Amenity valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Amenity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.hotel.proto.Amenity)
}
