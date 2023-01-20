package com.spring.acc.skyapp.skyapp.entity;

import lombok.Getter;
import lombok.Setter;

public class Temperature {

    @Getter
    @Setter
    private String min;

    @Getter
    @Setter
    private String max;

    @Getter
    @Setter
    private String current;

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private String rainToday;

    public Temperature(String min, String max, String current, String status, String rainToday) {
        this.min = min;
        this.max = max;
        this.current = current;
        this.status = status;
        this.rainToday = rainToday;
    }

}
