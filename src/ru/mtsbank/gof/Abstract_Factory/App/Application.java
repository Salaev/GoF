package ru.mtsbank.gof.Abstract_Factory.App;

import ru.mtsbank.gof.Abstract_Factory.factories.GUIFactory;
import ru.mtsbank.gof.Abstract_Factory.guielemets.buttons.Button;
import ru.mtsbank.gof.Abstract_Factory.guielemets.checkboxes.CheckBox;

public class Application {
    private Button button;

    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void renderAll() {
        button.render();
        checkBox.render();
    }
}
