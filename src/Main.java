import ChainResponsibility.*;
import CommandPattern.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chain of Responsibility ===");

        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior).setNext(senior);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            faq.handle(issue);
        }

        System.out.println("\n=== Command Pattern ===");

        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightOn);
        remote.setCommand("thermostat", setTemp);

        remote.pressButton("light");
        remote.pressButton("thermostat");

        remote.undoButton(); // undo thermostat
    }
}