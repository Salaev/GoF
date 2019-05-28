package ru.mtsbank.gof.сreational_patterns.factory_method.factory;

import ru.mtsbank.gof.сreational_patterns.factory_method.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.factory_method.buttons.LinuxButton;

public class LinuxFactory extends ButtonFactory {
    @Override
    protected Button createButton() {
        return new LinuxButton();
    }
}
