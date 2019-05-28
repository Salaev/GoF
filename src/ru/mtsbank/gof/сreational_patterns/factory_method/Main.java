package ru.mtsbank.gof.сreational_patterns.factory_method;

import ru.mtsbank.gof.сreational_patterns.factory_method.factory.ButtonFactory;
import ru.mtsbank.gof.сreational_patterns.factory_method.factory.LinuxFactory;
import ru.mtsbank.gof.сreational_patterns.factory_method.factory.MacFactory;

public class Main {
    private static ButtonFactory buttonFactory;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Mac os")) {
            buttonFactory = new MacFactory();
        } else
            buttonFactory = new LinuxFactory();
    }

    private static void runBusinessLogic() {
        System.out.println("Start OS");
        buttonFactory.renderWindow();
    }
}
