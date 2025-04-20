package CommandPattern.Commands;

import CommandPattern.devices.Thermostat;

public class SetThermostatCommand implements Command {
    private final Thermostat thermostat;
    private final int newTemp;
    private int prevTemp;

    public SetThermostatCommand(Thermostat thermostat, int temp) {
        this.thermostat = thermostat;
        this.newTemp = temp;
    }

    @Override
    public void execute() {
        prevTemp = thermostat.getTemperature();
        if (prevTemp != newTemp) {
            System.out.println("[Command] Setting temperature to " + newTemp + "°C");
            thermostat.setTemperature(newTemp);
        } else {
            System.out.println("[Command] Temperature already set to " + newTemp + "°C");
        }
    }

    @Override
    public void undo() {
        System.out.println("[Command] Reverting to previous temperature: " + prevTemp + "°C");
        thermostat.setTemperature(prevTemp);
    }
}
