package BehavioralCommandPattern.commands;

import BehavioralCommandPattern.components.Curtain;

public class OpenCloseCurtainsCommand implements Command{
    private final Curtain curtain;

    public OpenCloseCurtainsCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.openClose();
    }
}
