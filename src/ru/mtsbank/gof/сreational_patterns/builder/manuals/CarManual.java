package ru.mtsbank.gof.сreational_patterns.builder.manuals;

import ru.mtsbank.gof.сreational_patterns.builder.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder.componets.Transmission;

public class CarManual {
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public CarManual(int door, int seats, Transmission transmission, GPSNavigator gpsNavigator) {
        this.door = door;
        this.seats = seats;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
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
