package ru.mtsbank.gof.сreational_patterns.abstract_factory;

import ru.mtsbank.gof.сreational_patterns.abstract_factory.App.Application;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.factories.GUIFactory;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.factories.LinuxFactory;
import ru.mtsbank.gof.сreational_patterns.abstract_factory.factories.MacFactory;

public class Main {


    public static void main(String[] args) {
        Application application = configure();
        application.renderAll();
    }

    private static Application configure() {
        Application application;
        GUIFactory factory;
        if (System.getProperty("os.name").equals("Mac os")) {
            factory = new MacFactory();

        } else {
            factory = new LinuxFactory();
        }
        application = new Application(factory);
        return application;
    }
}

