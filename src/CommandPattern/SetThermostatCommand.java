package CommandPattern;

public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int newTemp;
    private int prevTemp;

    public SetThermostatCommand(Thermostat thermostat, int temp) {
        this.thermostat = thermostat;
        this.newTemp = temp;
        this.prevTemp = thermostat.getTemperature();
    }

    @Override
    public void execute() {
        thermostat.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(prevTemp);
    }
}
