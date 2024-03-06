package CreationalFactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
    }
}


// use it if you have no idea of the exact types
// of the objects your code will work with

// makes it easy to extend the product construction code
// independently of from the rest of the application

// allows introducing new products
// without breaking existing code

// centralizes the product creation code
// in one place in the program