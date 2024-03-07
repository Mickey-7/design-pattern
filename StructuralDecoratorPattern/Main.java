package StructuralDecoratorPattern;

public class Main {
    public static void main(String[] args) {
        INotifier notifyAll = new FacebookNotifier(new WhatsAppDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!");

        System.out.println("===================================");

        INotifier notifyFbMail = new FacebookNotifier(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!");

    }
}
