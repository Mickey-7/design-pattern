package BehavioralCommandPattern.components;

public class Curtain {
    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    public void openClose() {
        open = !open;
    }
}
