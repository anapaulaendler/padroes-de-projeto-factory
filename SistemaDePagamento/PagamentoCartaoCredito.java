public class PagamentoCartaoCredito extends Pagamento {
    public String numeroCartao;

    public PagamentoCartaoCredito(double saldo, String numeroCartao) {
        this.numeroCartao = numeroCartao;
        this.saldo = saldo;
    }

    @Override
    public boolean validarPagamento() {
        return this.numeroCartao.length() == 16;
    }
    
}
