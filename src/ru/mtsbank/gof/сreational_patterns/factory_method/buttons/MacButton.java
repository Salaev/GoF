package ru.mtsbank.gof.сreational_patterns.factory_method.buttons;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Button Mac");
    }
}
