package ru.mtsbank.gof.Abstract_Factory.guielemets.buttons;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Button Linux");
    }
}
