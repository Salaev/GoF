package ru.mtsbank.gof.сreational_patterns.Abstract_Factory;

import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.App.Application;
import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.factories.GUIFactory;
import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.factories.LinuxFactory;
import ru.mtsbank.gof.сreational_patterns.Abstract_Factory.factories.MacFactory;

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

