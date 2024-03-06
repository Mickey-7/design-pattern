package BehavioralCommandPattern.components;

import BehavioralCommandPattern.commands.Command;

public abstract class Component {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
