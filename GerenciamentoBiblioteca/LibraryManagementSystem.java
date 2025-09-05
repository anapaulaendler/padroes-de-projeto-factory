public class LibraryManagementSystem {
    public static void main(String[] args) {
        /* Apesar de termos três tipos de service, queria reafirmar (e justificar na hora 
        de avaliar kkkk) que a lógica "comum" entre eles, ou seja, emprestar, devolver 
        e um toString da classe mãe LibraryItem, estão todas implementadas na service genérica.
        Dessa forma, posso implementar os métodos individuais de forma mais específica sem ferir 
        a escabilidade do sistema. */

        final String DIVIDER = "--------------";

        BookFactory bookFactory = new BookFactory();
        BookService bookService = new BookService();
        
        System.out.println("Book: ");
        bookService.printToString(bookFactory);
        bookService.readSample(bookFactory);
        bookService.borrowItem(bookFactory);
        bookService.returnItem(bookFactory);

        System.out.println(DIVIDER);

        MagazineFactory magazineFactory = new MagazineFactory();
        MagazineService magazineService = new MagazineService();

        System.out.println("Magazine: ");
        magazineService.printToString(magazineFactory);
        magazineService.flipPages(magazineFactory);
        magazineService.borrowItem(magazineFactory);
        magazineService.returnItem(magazineFactory);

        System.out.println(DIVIDER);

        DigitalMediaFactory digitalMediaFactory = new DigitalMediaFactory();
        DigitalMediaService digitalMediaService = new DigitalMediaService();

        System.out.println("Digital Media: ");
        digitalMediaService.printToString(digitalMediaFactory);
        digitalMediaService.play(digitalMediaFactory);
        digitalMediaService.borrowItem(digitalMediaFactory);
        digitalMediaService.returnItem(digitalMediaFactory);
    }
}
