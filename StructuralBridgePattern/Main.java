package StructuralBridgePattern;

import StructuralBridgePattern.abstractions.AmericanRestaurant;
import StructuralBridgePattern.abstractions.ItalianRestaurant;
import StructuralBridgePattern.abstractions.Restaurant;
import StructuralBridgePattern.implementations.PepperoniPizza;
import StructuralBridgePattern.implementations.VeggiePizza;

public class Main {
    public static void main(String[] args) {
        Restaurant americanRest = new AmericanRestaurant(new PepperoniPizza());
        americanRest.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
