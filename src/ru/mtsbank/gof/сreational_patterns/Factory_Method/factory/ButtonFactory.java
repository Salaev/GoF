package ru.mtsbank.gof.сreational_patterns.Factory_Method.factory;

import ru.mtsbank.gof.сreational_patterns.Factory_Method.buttons.Button;

public abstract class ButtonFactory {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton();
}
