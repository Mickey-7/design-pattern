package StructuralBridgePattern.abstractions;

import StructuralBridgePattern.implementations.Pizza;

public abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();

    abstract void addToppings();
    abstract void makeCrust();

    public void deliver(){
        makeCrust();
        addSauce();
        addSauce();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }
}
