public abstract class LibraryItem implements IBorrowable {
    public String title;
    public String author;
    public int publicationYear;

    @Override
    public void borrow() {
        System.out.println("You just borrowed: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("You just returned: " + title);
    }

    @Override
    public String toString() {
        return "LibraryItem [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
    }
}
