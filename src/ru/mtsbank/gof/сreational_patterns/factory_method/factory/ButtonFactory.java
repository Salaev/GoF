package ru.mtsbank.gof.сreational_patterns.factory_method.factory;

import ru.mtsbank.gof.сreational_patterns.factory_method.buttons.Button;

public abstract class ButtonFactory {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton();
}
