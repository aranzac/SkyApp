package com.spring.acc.skyapp.skyapp.entity;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

public class VisibleObjects {
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Location location;

    @Getter
    @Setter
    private Date date;

    @Getter
    @Setter
    private String time;

    @Getter
    @Setter
    private Planet planet;

    public VisibleObjects(String id, Location location, Date date, String time, Planet planet) {
        this.id = id;
        this.location = location;
        this.date = date;
        this.time = time;
        this.planet = planet;
    }

}
