package ru.mtsbank.gof.сreational_patterns.factory_method.buttons;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Button Linux");
    }
}
