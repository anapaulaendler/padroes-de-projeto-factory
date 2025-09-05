public class GenericService<T extends GenericFactory<?>> implements IGenericService<T> {

    @Override
    public void borrowItem(T factory) {
        factory.createNewLibraryItem().borrow();
    }

    @Override
    public void returnItem(T factory) {
        factory.createNewLibraryItem().returnItem();
    }

    @Override
    public void printToString(T factory) {
        System.out.println(factory.createNewLibraryItem().toString());
    }
    
}
