public interface IGenericFactory<T extends LibraryItem> {
    public abstract T createNewLibraryItem();
}
