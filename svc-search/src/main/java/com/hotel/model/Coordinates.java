/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.hotel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinates {
	@JsonProperty("latitude")
	private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    
 	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLatitude() {
		return latitude;
	}

 	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLongitude() {
		return longitude;
	}

    @Override
    public String toString() {
        return "Coordinates [latitude=" + latitude + ", longitude=" + longitude + "]";
    }

}