package org.example.creational;

import org.example.creational.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {
        // TODO: Create and configure different cars using the Builder pattern

        Car car1 = Car.builder()
                .color("blue")
                .engine("1.0")
                .hasGPS(false)
                .hasSafetyPackage(false)
                .hasSunroof(true)
                .interior("red")
                .transmission("yes")
                .build();

        System.out.println(car1.toString());
    }
}
