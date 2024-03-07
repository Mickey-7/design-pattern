package StructuralDecoratorPattern;

public class FacebookNotifier extends BaseNotifierDecorator{
    public FacebookNotifier(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String mgs){
        super.send(mgs);
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending "+mgs+" on Facebook to "+fbName);
    }
}
