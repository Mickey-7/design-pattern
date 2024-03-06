package CreationalBuilderDesignPattern;

import CreationalBuilderDesignPattern.model.Builder;
import CreationalBuilderDesignPattern.model.CarBuilder;

/* Director
    - defines the order un which we should cal\ the construction steps
      so that we can reuse specific configurations of the products
      we are building - should only be used when there are similarities
    - optional
*/
public class Director {
    public void buildBugatti(Builder builder){
        builder.brand("Bugatti")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildLambo(Builder builder){
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .nbrOfDoors(2)
                .height(115);
    }
}
