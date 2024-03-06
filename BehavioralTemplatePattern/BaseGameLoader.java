package BehavioralTemplatePattern;

public abstract class BaseGameLoader {
    public void load(){
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();
    protected void cleanTempFiles(){
        System.out.println("Cleaning temporary files...");
        // Some Code...
    }
    abstract void initializeProfiles();
}
