public class DigitalMediaFactory extends GenericFactory<DigitalMedia> {

    @Override
    public DigitalMedia createNewLibraryItem() {
        return new DigitalMedia("2666", "Roberto Bolaño", 2004);
    }
    
}
