public interface CatalogMenu<W, H> {
    //Generics H return  type(Catalog)  and  T argument/parameter(media)
    H add(W w);

    H retrieve(String search);

    void delete(W w);

}
