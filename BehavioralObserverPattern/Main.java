package BehavioralObserverPattern;

import static BehavioralObserverPattern.Event.NEW_ITEM;
import static BehavioralObserverPattern.Event.SALE;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("geekific@subs.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("GeekificLnS"));
        store.newItemPromotion();
        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("geekific@like.com"));
        store.salePromotion();
    }
}
