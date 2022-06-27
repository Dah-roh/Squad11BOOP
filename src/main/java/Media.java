import java.util.Objects;

public class Media {
    private String name;
    private String genre;
    private String mediaOwner;

    public Media(String name, String genre, String mediaOwner) {
        this.name = name;
        this.genre = genre;
        this.mediaOwner = mediaOwner;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", mediaOwner='" + mediaOwner + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return name.equals(media.name) && genre.equals(media.genre) && mediaOwner.equals(media.mediaOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, mediaOwner);
    }
}
