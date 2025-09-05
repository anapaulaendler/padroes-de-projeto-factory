public class Book extends LibraryItem {
    public String isbn;
    public String genre;
    
    public Book(String isbn, String genre, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void readSample() {
        System.out.println("This... '" + title + "' [isbn=" + isbn + ", genre=" + genre + ", publicationYear=" + publicationYear + "] by " + author + " sure sounds interesting..." );
    }
}