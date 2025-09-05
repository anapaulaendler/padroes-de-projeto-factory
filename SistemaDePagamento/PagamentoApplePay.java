public class PagamentoApplePay extends Pagamento {
    public String senha;
    
    public PagamentoApplePay(double saldo, String senha) {
        this.saldo = saldo;
        this.senha = senha;
    }

    @Override
    public boolean validarPagamento() {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";
        return (this.senha.matches(regex));
    }
    
}
