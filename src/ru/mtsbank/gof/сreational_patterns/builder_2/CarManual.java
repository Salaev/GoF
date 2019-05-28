package ru.mtsbank.gof.сreational_patterns.builder_2;

import ru.mtsbank.gof.сreational_patterns.builder_2.componets.GPSNavigator;
import ru.mtsbank.gof.сreational_patterns.builder_2.componets.Transmission;

public class CarManual {
    private int door;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    private CarManual() {

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

    public static Builder createBulder() {
        return new CarManual().new Builder();
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

    public class Builder {
        private Builder() {
        }

        public Builder setDoor(int door) {
            CarManual.this.door = door;
            return this;
        }

        public Builder setSeats(int seats) {
            CarManual.this.seats = seats;
            return this;
        }

        public Builder setTransmission(Transmission transmission) {
            CarManual.this.transmission = transmission;
            return this;
        }

        public Builder setGpsNavigator(GPSNavigator gpsNavigator) {
            CarManual.this.gpsNavigator = gpsNavigator;
            return this;
        }

        public CarManual build() {
            return CarManual.this;
        }
    }
}
