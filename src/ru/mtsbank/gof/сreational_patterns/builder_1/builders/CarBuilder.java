package ru.mtsbank.gof.сreational_patterns.builder_1.builders;

import ru.mtsbank.gof.сreational_patterns.builder_1.cars.Car;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.Transmission;

public class CarBuilder implements Builder {
    private String type;
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public CarBuilder(String type) {
        this.type = type;
    }

    @Override
    public CarBuilder setDoor(int door) {
        this.door = door;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car buidl() {
        return new Car(this);
    }

    public String getType() {
        return type;
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


}
