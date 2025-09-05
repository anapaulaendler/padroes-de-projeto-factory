public abstract class Pagamento implements IPagamento {
    public double saldo;

    @Override
    public boolean processarPagamento(double valor) {
        if (validarPagamento()) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
