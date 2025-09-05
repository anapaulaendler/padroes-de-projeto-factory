public class Magazine extends LibraryItem {
    public int issueNumber;

    public Magazine(int issueNumber, String title, String author, int publicationYear) {
        this.issueNumber = issueNumber;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void flipPages() {
        for (int i = 100; i < 105; i++) {
            System.out.println("Currently reading page: " + i);
        }
    }
}
