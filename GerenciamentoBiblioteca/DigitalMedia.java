public class DigitalMedia extends LibraryItem {
    public String format;
    private int _randomNum = (int)(Math.random() * 101);

    public DigitalMedia(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void play() {
        format = switch (_randomNum % 3) {
            case 1 -> "MP3";
            case 2 -> "MP4";
            default -> "WAV";
        };

        System.out.println("You're listening to a " + format + " file.");
    }
}
