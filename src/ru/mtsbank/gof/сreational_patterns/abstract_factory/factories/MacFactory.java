package ru.mtsbank.gof.сreational_patterns.abstract_factory.factories;

import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.buttons.MacButton;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.checkboxes.CheckBox;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.checkboxes.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
