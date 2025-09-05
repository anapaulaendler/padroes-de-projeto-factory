public class FactoryCartaoCredito extends FactoryPagamento<PagamentoCartaoCredito> {
    private String _numeroCartao;
    private int _randomNum = (int)(Math.random() * 101);

    @Override
    public PagamentoCartaoCredito criarPagamento() {
        _numeroCartao = switch (_randomNum % 2) {
            case 0 -> "1234567890123456";
            default -> "111";
        };

        return new PagamentoCartaoCredito(1000, _numeroCartao);
    }

}
