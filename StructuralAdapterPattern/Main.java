package StructuralAdapterPattern;

public class Main {
    public static void main(String[] args) {

        XmlData xmlData = new XmlData();

        /* Old UI */
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(xmlData);
        multiRestoApp.displayRecommendation(xmlData);

        System.out.println("=================================");

        /* New UI */
        IMultiRestoApp adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(xmlData);
        adapter.displayRecommendation(xmlData);

    }
}
