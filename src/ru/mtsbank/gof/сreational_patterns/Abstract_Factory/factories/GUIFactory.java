package ru.mtsbank.gof.сreational_patterns.Abstract_Factory.factories;

import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.guielemets.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.guielemets.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
