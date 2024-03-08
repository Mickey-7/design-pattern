package BehavioralStrategyPattern.strategy;

import BehavioralStrategyPattern.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details...
        creditCard = new CreditCard("cardNumber","expiryDate","cvv");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit card...
        System.out.println("Validating Card Info: "+creditCard);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" using Credit Card");
        creditCard.setAmount(creditCard.getAmount()- amount);
    }
}
