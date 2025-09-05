public class FactoryCriptomoeda extends PagamentoFactory<PagamentoCriptomoeda> {

    @Override
    public PagamentoCriptomoeda criarPagamento() {
        return new PagamentoCriptomoeda(1000);
    }
    
}
