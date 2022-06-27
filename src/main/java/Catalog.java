import java.util.List;
import java.util.Objects;

public class Catalog {
    private List<Media> catalogs;

    public Catalog(List<Media> catalogs) {
        this.catalogs = catalogs;
    }

    public Catalog() {

    }

    public List<Media> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Media> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return catalogs.equals(catalog.catalogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogs);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogs=" + catalogs +
                '}';
    }
}
