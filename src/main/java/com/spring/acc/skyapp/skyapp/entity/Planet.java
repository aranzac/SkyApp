package com.spring.acc.skyapp.skyapp.entity;

import lombok.Getter;
import lombok.Setter;

public class Planet {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String constellation;

    @Getter
    @Setter
    private String aboveHorizon;

    @Getter
    @Setter
    private String magnitude;

    @Getter
    @Setter
    private String nakedEye;

    public Planet(String id, String name, String constellation, String aboveHorizon, String magnitude,
            String nakedEye) {
        this.id = id;
        this.name = name;
        this.constellation = constellation;
        this.aboveHorizon = aboveHorizon;
        this.magnitude = magnitude;
        this.nakedEye = nakedEye;
    }

}
