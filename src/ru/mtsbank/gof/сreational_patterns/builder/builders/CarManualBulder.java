package ru.mtsbank.gof.сreational_patterns.builder.builders;

import ru.mtsbank.gof.сreational_patterns.builder.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder.componets.Transmission;
import ru.mtsbank.gof.сreational_patterns.builder.manuals.CarManual;

public class CarManualBulder implements Builder {
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;


    @Override
    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public CarManual getResult() {
        return new CarManual(door, seats, transmission, gpsNavigator);
    }
}
