public class MagazineFactory extends GenericFactory<Magazine> {

    @Override
    public Magazine createNewLibraryItem() {
        return new Magazine(101, "This is a Magazine", "Pedro Almodóvar", 2025);
    }
    
}
