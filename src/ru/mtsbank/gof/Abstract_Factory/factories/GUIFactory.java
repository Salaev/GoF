package ru.mtsbank.gof.Abstract_Factory.factories;

import ru.mtsbank.gof.Abstract_Factory.guielemets.buttons.Button;
import ru.mtsbank.gof.Abstract_Factory.guielemets.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
