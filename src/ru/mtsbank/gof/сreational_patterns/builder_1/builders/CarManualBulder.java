package ru.mtsbank.gof.сreational_patterns.builder_1.builders;

import ru.mtsbank.gof.сreational_patterns.builder_1.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.Transmission;
import ru.mtsbank.gof.сreational_patterns.builder_1.manuals.CarManual;

public class CarManualBulder implements Builder {
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;


    @Override
    public Builder setDoor(int door) {
        this.door = door;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public CarManual build() {
        return new CarManual(this);
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
