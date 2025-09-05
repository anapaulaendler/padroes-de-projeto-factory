public class PagamentoPayPal extends Pagamento {
    public String email;

    public PagamentoPayPal(double saldo, String email) {
        this.email = email;
        this.saldo = saldo;
    }

    @Override
    public boolean validarPagamento() {
        String regex = "[A-Za-z0-9_.-]+@paypal\\.com";
        return (this.email.matches(regex));
    }
    
}
