package ru.mtsbank.gof.Abstract_Factory.factories;

import ru.mtsbank.gof.Abstract_Factory.guielemets.buttons.Button;
import ru.mtsbank.gof.Abstract_Factory.guielemets.buttons.LinuxButton;
import ru.mtsbank.gof.Abstract_Factory.guielemets.checkboxes.CheckBox;
import ru.mtsbank.gof.Abstract_Factory.guielemets.checkboxes.LinuxCheckBox;

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
