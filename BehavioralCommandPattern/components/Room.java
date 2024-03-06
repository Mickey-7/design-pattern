package BehavioralCommandPattern.components;

public class Room extends Component {
    private final Curtain curtain;

    public Room() {
        this.curtain = new Curtain();
    }

    public Curtain getCurtain() {
        return curtain;
    }

    public boolean curtainsOpen(){
        return curtain.isOpen();
    }
}
