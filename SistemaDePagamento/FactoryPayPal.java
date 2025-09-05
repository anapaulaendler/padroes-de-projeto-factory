public class FactoryPayPal extends PagamentoFactory<PagamentoPayPal> {
    private String _email;
    private int _randomNum = (int)(Math.random() * 101);

    @Override
    public PagamentoPayPal criarPagamento() {
        _email = switch (_randomNum % 2) {
            case 0 -> "ana@paypal.com";
            default -> "ana@gmail.com";
        };

        return new PagamentoPayPal(1000, _email);
    }
    
}
