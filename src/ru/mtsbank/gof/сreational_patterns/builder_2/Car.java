package ru.mtsbank.gof.сreational_patterns.builder_2;

import ru.mtsbank.gof.сreational_patterns.builder_2.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_2.componets.Transmission;

public class Car {
    private String type;
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    private Car(String type) {
        this.type = type;

    }

    public static Builder createBulder(String type) {
        return new Car(type).new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setDoor(int door) {
            Car.this.door = door;
            return this;
        }

        public Builder setSeats(int seats) {
            Car.this.seats = seats;
            return this;
        }

        public Builder setTransmission(Transmission transmission) {
            Car.this.transmission = transmission;
            return this;
        }

        public Builder setGpsNavigator(GPSNavigator gpsNavigator) {
            Car.this.gpsNavigator = gpsNavigator;
            return this;
        }

        public Car build() {
            return Car.this;
        }
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
