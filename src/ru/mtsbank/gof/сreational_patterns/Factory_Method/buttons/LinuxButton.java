package ru.mtsbank.gof.сreational_patterns.Factory_Method.buttons;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Button Linux");
    }
}
