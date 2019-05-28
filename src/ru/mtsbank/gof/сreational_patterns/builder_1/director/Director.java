package ru.mtsbank.gof.сreational_patterns.builder_1.director;

import ru.mtsbank.gof.сreational_patterns.builder_1.builders.Builder;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.Transmission;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setDoor(2);
        builder.setGpsNavigator(new GPSNavigator("Sport Navigatitor"));
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
    }

    public void constructCityCar(Builder builder) {
        builder.setDoor(5);
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGpsNavigator(new GPSNavigator());
    }
}
