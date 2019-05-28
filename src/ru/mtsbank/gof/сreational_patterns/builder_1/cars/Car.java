package ru.mtsbank.gof.сreational_patterns.builder_1.cars;

import ru.mtsbank.gof.сreational_patterns.builder_1.builders.CarBuilder;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.Transmission;

public class Car {
    // Обязательные параметры
    private String type;

    // Не обязательные параметры
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public Car(CarBuilder builder) {
        this.type = builder.getType();
        this.door = builder.getDoor();
        this.seats = builder.getSeats();
        this.transmission = builder.getTransmission();
        this.gpsNavigator = builder.getGpsNavigator();
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

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", door=" + door +
                ", seats=" + seats +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}
