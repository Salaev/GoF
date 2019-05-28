package ru.mtsbank.gof.сreational_patterns.builder.director;

import ru.mtsbank.gof.сreational_patterns.builder.builders.Builder;
import ru.mtsbank.gof.сreational_patterns.builder.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder.componets.Transmission;

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
