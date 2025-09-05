public class DigitalMediaService extends GenericService<DigitalMediaFactory> {
    public void play(DigitalMediaFactory factory) {
        factory.createNewLibraryItem().play();
    }
}
