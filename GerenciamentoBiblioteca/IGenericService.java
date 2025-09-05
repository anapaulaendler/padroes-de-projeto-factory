public interface IGenericService<T extends GenericFactory<?>> {
    public void borrowItem(T factory);
    public void returnItem(T factory);
    public void printToString(T factory);
}
