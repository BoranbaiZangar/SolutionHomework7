package CommandPattern.Commands;

import CommandPattern.devices.Light;

public class TurnOffLightCommand implements Command {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn(); // откатываем выключение — включаем снова
    }
}
