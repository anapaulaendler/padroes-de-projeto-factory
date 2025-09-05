public class FactoryApplePay extends FactoryPagamento<PagamentoApplePay> {
    private String _senha;
    private int _randomNum = (int)(Math.random() * 101);

    @Override
    public PagamentoApplePay criarPagamento() {
        _senha = switch (_randomNum % 2) {
            case 0 -> "Aa1";
            default -> "a";
        };

        return new PagamentoApplePay(1000, _senha);
    }

}
