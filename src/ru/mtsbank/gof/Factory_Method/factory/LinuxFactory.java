package ru.mtsbank.gof.Factory_Method.factory;

import ru.mtsbank.gof.Factory_Method.buttons.Button;
import ru.mtsbank.gof.Factory_Method.buttons.LinuxButton;

public class LinuxFactory extends ButtonFactory {
    @Override
    protected Button createButton() {
        return new LinuxButton();
    }
}
