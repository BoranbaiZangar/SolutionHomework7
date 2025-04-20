package CommandPattern.Commands;

import CommandPattern.devices.Light;

public class TurnOffLightCommand implements Command {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light.isOn()) {
            light.turnOff();
        } else {
            System.out.println("[Command] Light is already OFF");
        }
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
