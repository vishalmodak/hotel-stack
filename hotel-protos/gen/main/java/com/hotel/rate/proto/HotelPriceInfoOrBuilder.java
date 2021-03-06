// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel_rate.proto

package com.hotel.rate.proto;

public interface HotelPriceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hotel.rate.proto.HotelPriceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 hotelId = 1;</code>
   */
  long getHotelId();

  /**
   * <code>.google.protobuf.Timestamp checkinDate = 2;</code>
   */
  boolean hasCheckinDate();
  /**
   * <code>.google.protobuf.Timestamp checkinDate = 2;</code>
   */
  com.google.protobuf.Timestamp getCheckinDate();
  /**
   * <code>.google.protobuf.Timestamp checkinDate = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCheckinDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp checkoutDate = 3;</code>
   */
  boolean hasCheckoutDate();
  /**
   * <code>.google.protobuf.Timestamp checkoutDate = 3;</code>
   */
  com.google.protobuf.Timestamp getCheckoutDate();
  /**
   * <code>.google.protobuf.Timestamp checkoutDate = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCheckoutDateOrBuilder();

  /**
   * <code>double totalPrice = 4;</code>
   */
  double getTotalPrice();

  /**
   * <code>double taxes = 5;</code>
   */
  double getTaxes();

  /**
   * <code>double fees = 6;</code>
   */
  double getFees();

  /**
   * <code>double totalDiscount = 7;</code>
   */
  double getTotalDiscount();

  /**
   * <code>double avgNightlyRate = 8;</code>
   */
  double getAvgNightlyRate();

  /**
   * <code>repeated .com.hotel.rate.proto.RoomRate roomRates = 9;</code>
   */
  java.util.List<com.hotel.rate.proto.RoomRate> 
      getRoomRatesList();
  /**
   * <code>repeated .com.hotel.rate.proto.RoomRate roomRates = 9;</code>
   */
  com.hotel.rate.proto.RoomRate getRoomRates(int index);
  /**
   * <code>repeated .com.hotel.rate.proto.RoomRate roomRates = 9;</code>
   */
  int getRoomRatesCount();
  /**
   * <code>repeated .com.hotel.rate.proto.RoomRate roomRates = 9;</code>
   */
  java.util.List<? extends com.hotel.rate.proto.RoomRateOrBuilder> 
      getRoomRatesOrBuilderList();
  /**
   * <code>repeated .com.hotel.rate.proto.RoomRate roomRates = 9;</code>
   */
  com.hotel.rate.proto.RoomRateOrBuilder getRoomRatesOrBuilder(
      int index);

  /**
   * <code>.com.hotel.rate.proto.Availability availabilityStatus = 10;</code>
   */
  int getAvailabilityStatusValue();
  /**
   * <code>.com.hotel.rate.proto.Availability availabilityStatus = 10;</code>
   */
  com.hotel.rate.proto.Availability getAvailabilityStatus();
}
