// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel.proto

package com.hotel.proto;

public interface HotelsListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hotel.proto.HotelsList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  java.util.List<com.hotel.proto.HotelDetails> 
      getHotelList();
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  com.hotel.proto.HotelDetails getHotel(int index);
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  int getHotelCount();
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  java.util.List<? extends com.hotel.proto.HotelDetailsOrBuilder> 
      getHotelOrBuilderList();
  /**
   * <code>repeated .com.hotel.proto.HotelDetails hotel = 1;</code>
   */
  com.hotel.proto.HotelDetailsOrBuilder getHotelOrBuilder(
      int index);
}
