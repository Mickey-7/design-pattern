package BehavioralCommandPattern;

import BehavioralCommandPattern.commands.OpenCloseCurtainsCommand;
import BehavioralCommandPattern.commands.SwitchLightsCommand;
import BehavioralCommandPattern.components.FloorLamp;
import BehavioralCommandPattern.components.Room;

public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtain()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp floorLamp = new FloorLamp();
        floorLamp.setCommand(new SwitchLightsCommand(floorLamp.getLight()));
        floorLamp.executeCommand();
        System.out.println(floorLamp.isLightOn());
    }
}


