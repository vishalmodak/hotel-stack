package com.hotel.avail;

public class HotelPricingInfo {

    private String hotelId;
    private Double price;
    private String availability;
    private Integer inventory;
    
    public HotelPricingInfo(String hotelId, Double price, String availability, Integer inventory) {
        super();
        this.hotelId = hotelId;
        this.price = price;
        this.availability = availability;
        this.inventory = inventory;
    }

    public String getHotelId() {
        return hotelId;
    }

    public Double getPrice() {
        return price;
    }

    public String getAvailability() {
        return availability;
    }

    public Integer getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "HotelPricingInfo [hotelId=" + hotelId + ", price=" + price
                + ", availability=" + availability + "]";
    }
    
}
