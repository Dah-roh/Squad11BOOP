import java.util.ArrayList;
import java.util.List;

public class CatalogMenuImplementation implements CatalogMenu<Media, Catalog>{

    private Catalog catalog =  new Catalog();

    @Override
    public Catalog add(Media media) {
        if (catalog.getCatalogs()!=null){
            catalog.getCatalogs().add(media);
        }
        else {
            catalog.setCatalogs(new ArrayList<>());
            this.catalog.getCatalogs().add(media);
        }
        return catalog;
    }

    @Override
    public Catalog retrieve(String search) {
        return null;
    }

    @Override
    public void delete(Media media) {

    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
