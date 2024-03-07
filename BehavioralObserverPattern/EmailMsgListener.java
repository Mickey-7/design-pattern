package BehavioralObserverPattern;

public class EmailMsgListener implements Listener {
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Event eventType) {
        // Actually send the email
        System.out.println("Sending mail to "+email+" concerning "+eventType);
    }
}
