package ru.mtsbank.gof.сreational_patterns.builder.cars;

import ru.mtsbank.gof.сreational_patterns.builder.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder.componets.Transmission;

public class Car {
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public Car(int door, int seats, Transmission transmission, GPSNavigator gpsNavigator) {
        this.door = door;
        this.seats = seats;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    public int getDoor() {
        return door;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", seats=" + seats +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}
