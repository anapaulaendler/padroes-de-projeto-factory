public class MagazineService extends GenericService<MagazineFactory> {
    public void flipPages(MagazineFactory factory) {
        factory.createNewLibraryItem().flipPages();
    }
}
