package BehavioralTemplatePattern;

public class Main {
    public static void main(String[] args) {
        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("==========================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();
    }
}
