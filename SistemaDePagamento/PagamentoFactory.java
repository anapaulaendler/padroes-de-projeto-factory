public abstract class PagamentoFactory<T extends Pagamento> {
    public abstract T criarPagamento();
}