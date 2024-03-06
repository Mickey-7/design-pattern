package BehavioralTemplatePattern;

public class WorldOfWarcraftLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local WoW files...");
        // Some Warcraft Code...
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating WoW objects...");
        // Some Warcraft Code...
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading WoW sounds...");
        // Some Warcraft Code...
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading WoW profiles...");
        // Some Warcraft Code...
    }
}
