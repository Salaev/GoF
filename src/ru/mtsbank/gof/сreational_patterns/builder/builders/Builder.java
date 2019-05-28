package ru.mtsbank.gof.сreational_patterns.builder.builders;

import ru.mtsbank.gof.сreational_patterns.builder.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder.componets.Transmission;

public interface Builder {
    void setDoor(int type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setGpsNavigator(GPSNavigator gpsNavigator);
}
