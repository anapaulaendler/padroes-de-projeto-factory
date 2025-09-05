public class PagamentoCriptomoeda extends Pagamento {
    public double valorTransacao;

    public PagamentoCriptomoeda(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean processarPagamento(double valor) {
        this.valorTransacao = valor;
        return super.processarPagamento(valor);
    }

    @Override
    public boolean validarPagamento() {
        return this.saldo > this.valorTransacao;
    }
    
}
