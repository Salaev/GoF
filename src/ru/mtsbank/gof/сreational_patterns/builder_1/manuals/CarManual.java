package ru.mtsbank.gof.сreational_patterns.builder_1.manuals;

import ru.mtsbank.gof.сreational_patterns.builder_1.builders.Builder;
import ru.mtsbank.gof.сreational_patterns.builder_1.builders.CarManualBulder;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.Transmission;
import ru.mtsbank.gof.сreational_patterns.builder_2.Car;

public class CarManual {
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public CarManual(CarManualBulder builder) {
        this.door = builder.getDoor();
        this.seats = builder.getSeats();
        this.transmission = builder.getTransmission();
        this.gpsNavigator = builder.getGpsNavigator();
    }

    public String printManual() {
        StringBuilder infoCar = new StringBuilder();
        infoCar.append("Руководсва автомобилем\n");
        infoCar.append("Количесво дверей в автомобиле - ").append(door).append("\n");
        infoCar.append("Количесво сидений в автомобиле - ").append(seats).append("\n");
        infoCar.append("Трансмисиия - ").append(transmission).append("\n");
        infoCar.append("Навигатор установлен. Модель - ").append(gpsNavigator);
        return infoCar.toString();
    }
}
