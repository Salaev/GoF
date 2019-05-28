package ru.mtsbank.gof.сreational_patterns.Abstract_Factory.factories;

import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.guielemets.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.guielemets.buttons.MacButton;
import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.guielemets.checkboxes.CheckBox;
import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.guielemets.checkboxes.MacCheckBox;

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
