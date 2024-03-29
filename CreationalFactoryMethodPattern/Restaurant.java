package CreationalFactoryMethodPattern;

public abstract class Restaurant {
    public Burger orderBurger(){
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}

