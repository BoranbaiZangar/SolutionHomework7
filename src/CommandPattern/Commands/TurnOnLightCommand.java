package CommandPattern.Commands;

import CommandPattern.devices.Light;

public class TurnOnLightCommand implements Command {
    private final Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (!light.isOn()) {
            light.turnOn();
        } else {
            System.out.println("[Command] Light is already ON");
        }
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
