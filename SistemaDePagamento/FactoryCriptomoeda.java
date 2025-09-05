public class FactoryCriptomoeda extends FactoryPagamento<PagamentoCriptomoeda> {

    @Override
    public PagamentoCriptomoeda criarPagamento() {
        return new PagamentoCriptomoeda(1000);
    }
    
}
