package ru.mtsbank.gof.сreational_patterns.Factory_Method.factory;

import ru.mtsbank.gof.сreational_patterns.Factory_Method.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.Factory_Method.buttons.LinuxButton;

public class LinuxFactory extends ButtonFactory {
    @Override
    protected Button createButton() {
        return new LinuxButton();
    }
}
