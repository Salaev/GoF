package ru.mtsbank.gof.сreational_patterns.Factory_Method;

import ru.mtsbank.gof.сreational_patterns.Factory_Method.factory.ButtonFactory;
import ru.mtsbank.gof.сreational_patterns.Factory_Method.factory.LinuxFactory;
import ru.mtsbank.gof.сreational_patterns.Factory_Method.factory.MacFactory;

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
