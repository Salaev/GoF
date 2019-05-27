package ru.mtsbank.gof.Factory_Method.buttons;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Button Mac");
    }
}
