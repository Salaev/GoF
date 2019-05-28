package ru.mtsbank.gof.сreational_patterns.abstract_factory.factories;

import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
