package ru.mtsbank.gof.сreational_patterns.builder_2;


import ru.mtsbank.gof.сreational_patterns.builder_2.componets.GPSNavigator;

public class Main {
    public static void main(String[] args) {
    Car car = Car.createBulder("Sport")
            .setDoor(2)
            .setGpsNavigator(new GPSNavigator("Sony"))
            .build();
        System.out.println(car);

        CarManual carManual = CarManual.createBulder()
                .setDoor(45)
                .build();
        System.out.println(carManual.printManual());
    }
}
