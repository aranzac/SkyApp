package com.spring.acc.skyapp.skyapp.entity;

import lombok.Getter;
import lombok.Setter;

public class Location {

    @Getter
    @Setter
    private String ip;

    @Getter
    @Setter
    private String country;

    @Getter
    @Setter
    private String state;

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String location;

    @Getter
    @Setter
    private String latitude;

    @Getter
    @Setter
    private String longitude;

    public Location(String ip, String country, String state, String city, String location, String latitude,
            String longitude) {
        this.ip = ip;
        this.country = country;
        this.state = state;
        this.city = city;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
