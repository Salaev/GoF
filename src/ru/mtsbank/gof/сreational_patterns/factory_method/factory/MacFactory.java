package ru.mtsbank.gof.сreational_patterns.factory_method.factory;

import ru.mtsbank.gof.сreational_patterns.factory_method.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.factory_method.buttons.MacButton;

public class MacFactory extends ButtonFactory {
    @Override
    protected Button createButton() {
        return new MacButton();
    }
}
