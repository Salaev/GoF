package ru.mtsbank.gof.сreational_patterns.abstract_factory.App;

import ru.mtsbank.gof.сreational_patterns.abstract_factory.factories.GUIFactory;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.buttons.Button;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.guielemets.checkboxes.CheckBox;

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
