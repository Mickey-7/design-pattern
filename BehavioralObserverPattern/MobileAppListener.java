package BehavioralObserverPattern;

public class MobileAppListener implements Listener{
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update(Event eventType) {
        // Actually send the push notification to username
        System.out.println("Sending mobile app notification to "+username+" concerning "+eventType);
    }
}
