package ru.mtsbank.gof.сreational_patterns.builder.componets;

public class GPSNavigator {

    private String name;

    public GPSNavigator() {
        name = "no Name";
    }

    public GPSNavigator(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GPSNavigator{" +
                "name='" + name + '\'' +
                '}';
    }
}
