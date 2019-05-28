package ru.mtsbank.gof.сreational_patterns.builder_1;

import ru.mtsbank.gof.сreational_patterns.builder_1.builders.CarBuilder;
import ru.mtsbank.gof.сreational_patterns.builder_1.builders.CarManualBulder;
import ru.mtsbank.gof.сreational_patterns.builder_1.cars.Car;
import ru.mtsbank.gof.сreational_patterns.builder_1.director.Director;
import ru.mtsbank.gof.сreational_patterns.builder_1.manuals.CarManual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder("City");
        director.constructCityCar(carBuilder);

        Car car = carBuilder.buidl();
        System.out.println(car);

        CarManualBulder carManualBulder = new CarManualBulder();
        director.constructSportsCar(carManualBulder);

        CarManual carManual = carManualBulder.build();
        System.out.println(carManual.printManual());
    }
}
