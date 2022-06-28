public class Main extends CatalogMenuImplementation{

    public static void main(String[] args) {
        Media musicNews = new Media("All time low",
                "Alternative rock",
                "Jon Bellion");
        Media movieNews =  new Media("Uncharted",
                "Action, Comedy, Sci-fi",
                "Tom Holland");
        Main  main1 = new Main();
        main1.add(movieNews);
        System.out.println(main1.getCatalog());
    }
}
