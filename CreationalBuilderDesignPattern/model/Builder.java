package CreationalBuilderDesignPattern.model;

public interface Builder {
    Builder id(int id);
    Builder height(int height);
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Builder engine(String engine);
    Builder nbrOfDoors(int nbrOfDoors);

}
