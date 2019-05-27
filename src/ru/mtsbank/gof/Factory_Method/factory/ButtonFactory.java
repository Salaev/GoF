package ru.mtsbank.gof.Factory_Method.factory;

import ru.mtsbank.gof.Factory_Method.buttons.Button;

public abstract class ButtonFactory {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton();
}
