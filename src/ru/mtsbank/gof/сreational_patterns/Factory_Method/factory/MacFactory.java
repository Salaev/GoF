package ru.mtsbank.gof.сreational_patterns.Factory_Method.factory;

import ru.mtsbank.gof.сreational_patterns.Factory_Method.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.Factory_Method.buttons.MacButton;

public class MacFactory extends ButtonFactory {
    @Override
    protected Button createButton() {
        return new MacButton();
    }
}
