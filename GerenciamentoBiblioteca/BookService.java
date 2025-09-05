public class BookService extends GenericService<BookFactory> {
    public void readSample(BookFactory factory) {
        factory.createNewLibraryItem().readSample();
    }
}
