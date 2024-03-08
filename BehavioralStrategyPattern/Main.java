package BehavioralStrategyPattern;

import BehavioralStrategyPattern.strategy.PaymentByCreditCard;
import BehavioralStrategyPattern.strategy.PaymentByPayPal;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);


        System.out.println("==========================================");

        paymentService.setPaymentStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);
    }
}
