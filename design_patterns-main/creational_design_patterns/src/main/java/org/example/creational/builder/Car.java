package org.example.creational.builder;

// TODO implement logic

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Car {
    private String engine;
    private String transmission;
    private String interior;
    private String color;
    private boolean hasSunroof;
    private boolean hasGPS;
    private boolean hasSafetyPackage;
}
