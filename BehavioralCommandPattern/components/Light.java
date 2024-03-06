package BehavioralCommandPattern.components;

public class Light {
    private boolean switchedOn = false;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void switchLights() {
        switchedOn = !switchedOn;
    }
}
