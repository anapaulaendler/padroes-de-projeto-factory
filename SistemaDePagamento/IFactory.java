public interface IFactory<T extends Pagamento> {
    T criarPagamento();
}
