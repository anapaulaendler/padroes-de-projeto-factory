public class BookFactory extends GenericFactory<Book> {

    @Override
    public Book createNewLibraryItem() {
        return new Book("9780060114183", "Classics, Fiction, Magical Realism", "One Hundred Years of Solitude", "Gabriel García Márquez", 1967);
    }
    
}
