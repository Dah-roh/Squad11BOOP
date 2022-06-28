import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class CatalogMenuImplementationTest {

    static Catalog catalog;
    static Media music;


    @BeforeAll
    static void setUp() {
        //this setup should hold all the variables needed to perform tests for each or all the methods necessary
        //and can be ran before all or each method based on the annotations @BeforeAll, @BeforeEach...
       catalog = new Catalog();
       music = new Media("human", "pop", "someone");
    }

    @Test
    void add() {
        if (catalog.getCatalogs()!=null){
            Assertions.assertNotEquals(catalog.getCatalogs(), null);
            //assert the catalog if statement is not all
            Assertions.assertNotNull(catalog.getCatalogs(),
                    "The catalog should not be null");
            catalog.getCatalogs().add(music);
            Assertions.assertEquals(catalog.getCatalogs()
                    .get(catalog.getCatalogs()
                            .size()-1), music, "This should be a music catalog");
        }
        else {
            catalog.setCatalogs(new ArrayList<>());
            Assertions.assertEquals(catalog.getCatalogs().size(), 0);
            catalog.getCatalogs().add(music);
            Assertions.assertEquals(catalog.getCatalogs()
                    .get(0), music, "This should be a music catalog");
        }
    }



}