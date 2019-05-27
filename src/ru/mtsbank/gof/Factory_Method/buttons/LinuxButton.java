package ru.mtsbank.gof.Factory_Method.buttons;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Button Linux");
    }
}
