package ru.mtsbank.gof.сreational_patterns.builder_1.builders;

import ru.mtsbank.gof.сreational_patterns.builder_1.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_1.componets.Transmission;

public interface Builder {
    Builder setDoor(int type);
    Builder setSeats(int seats);
    Builder setTransmission(Transmission transmission);
    Builder setGpsNavigator(GPSNavigator gpsNavigator);
}
