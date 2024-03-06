package CreationalBuilderDesignPattern;

import CreationalBuilderDesignPattern.model.Builder;
import CreationalBuilderDesignPattern.model.Car;
import CreationalBuilderDesignPattern.model.CarBuilder;
import CreationalBuilderDesignPattern.model.CarSchemaBuilder;

public class Main {
    public static void main(String[] args) {

        // without director
        CarBuilder builder = new CarBuilder();
        builder
                .id(2122)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue");
        System.out.println(builder.build());



        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.buildBugatti(carBuilder);
        carBuilder.model("Chiron");
        System.out.println(carBuilder.build());

        CarSchemaBuilder carSchemaBuilder = new CarSchemaBuilder();
        director.buildLambo(carSchemaBuilder);
        carSchemaBuilder.engine("90").nbrOfDoors(3);
        System.out.println(carSchemaBuilder.build());


    }

}

/* Builder Design Pattern
    - produces different types and representation
      of an object using the same construction process
    - extract the object construction or creation code out of its
      own class and move it to separate objects called builders

    - separate the construction of an object from its representation
    - create a builder class containing the same fields of object you need
    - add several setter-methods for fields and build method responsible for creating object
    - think about creating a director if same creation code is used to create several object

*/

/* UML Diagram - Builder Design Patter

Director
+ make1(builder)
+ make2(builder)
        |
        V
<<interface>> Builder
+ stepA()
+ stepB()
+ stepC()
...
+ stepZ()
    -> ConcreteBuilderA
        + stepA()
        + stepB()
        + stepC()
        ...
        + stepZ()
        + build()
            -> ProductA
    -> ConcreteBuilderB
        + stepA()
        + stepB()
        + stepC()
        ...
        + stepZ()
        + build()
            -> ProductB


*/
