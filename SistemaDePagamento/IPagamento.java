public interface IPagamento {
    public boolean processarPagamento(double valor);
    public boolean validarPagamento();
}