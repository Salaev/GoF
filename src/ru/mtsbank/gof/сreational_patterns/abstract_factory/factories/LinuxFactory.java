package ru.mtsbank.gof.сreational_patterns.abstract_factory.factories;

import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.buttons.LinuxButton;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.checkboxes.CheckBox;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.checkboxes.LinuxCheckBox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
