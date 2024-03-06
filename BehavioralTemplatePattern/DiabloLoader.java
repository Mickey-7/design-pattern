package BehavioralTemplatePattern;

public class DiabloLoader extends BaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading Diablo files...");
        // Some Diablo Code...
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Diablo objects...");
        // Some Diablo Code...
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading Diablo sounds...");
        // Some Diablo Code...
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading Diablo profiles...");
        // Some Diablo Code...
    }
}
