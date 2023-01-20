package com.spring.acc.skyapp.skyapp.entity;

import java.sql.Date;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

public class DailyInfo {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private Date date;

    @Getter
    @Setter
    private Location location;

    @Getter
    @Setter
    private String sunrise;

    @Getter
    @Setter
    private String sunset;

    @Getter
    @Setter
    private String solarNoon;

    @Getter
    @Setter
    private String dayLength;

    @Getter
    @Setter
    private String moonrise;

    @Getter
    @Setter
    private Temperature temperature;

    public DailyInfo(int id, Date date, Location location, String sunrise, String sunset, String solarNoon,
            String dayLength, String moonrise, Temperature temperature) {
        this.id = id;
        this.date = date;
        this.location = location;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.solarNoon = solarNoon;
        this.dayLength = dayLength;
        this.moonrise = moonrise;
        this.temperature = temperature;
    }

}
