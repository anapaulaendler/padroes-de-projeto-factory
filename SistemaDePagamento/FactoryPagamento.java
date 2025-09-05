public abstract class FactoryPagamento<T extends Pagamento> {
    public abstract T criarPagamento();
}