package ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.buttons;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Button Linux");
    }
}
