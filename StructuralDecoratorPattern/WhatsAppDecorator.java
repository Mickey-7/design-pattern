package StructuralDecoratorPattern;

public class WhatsAppDecorator extends BaseNotifierDecorator{
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String msg){
        super.send(msg);
        String phoneNbr = databaseService.getPhoneNbrFromUsername(getUsername());
        System.out.println("Sending "+msg+" by WhatsApp to "+phoneNbr);
    }
}
