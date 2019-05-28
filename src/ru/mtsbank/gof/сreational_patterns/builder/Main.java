package ru.mtsbank.gof.сreational_patterns.builder;

import ru.mtsbank.gof.сreational_patterns.builder.builders.CarBuilder;
import ru.mtsbank.gof.сreational_patterns.builder.builders.CarManualBulder;
import ru.mtsbank.gof.сreational_patterns.builder.cars.Car;
import ru.mtsbank.gof.сreational_patterns.builder.director.Director;
import ru.mtsbank.gof.сreational_patterns.builder.manuals.CarManual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car);

        CarManualBulder carManualBulder = new CarManualBulder();
        director.constructSportsCar(carManualBulder);

        CarManual carManual = carManualBulder.getResult();
        System.out.println(carManual.printManual());
    }
}
