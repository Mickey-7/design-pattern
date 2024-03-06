package BehavioralCommandPattern.commands;

import BehavioralCommandPattern.components.Light;

public class SwitchLightsCommand implements Command{
    private final Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.switchLights();
    }
}
