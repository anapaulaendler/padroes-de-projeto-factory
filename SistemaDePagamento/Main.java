public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();
        // Simular pagamento por cartão de crédito
        service.processarPagamento(new FactoryCartaoCredito(), 150.00);
        
        // Simular pagamento por PayPal
        service.processarPagamento(new FactoryPayPal(), 75.00);
        
        // Simular pagamento por Criptomoeda
        service.processarPagamento(new FactoryCriptomoeda(), 300.00);
        // Simular pagamento por Criptomoeda (inválido)
        service.processarPagamento(new FactoryCriptomoeda(), 1300.00);

        // Simular pagamento por Apple Pay
        service.processarPagamento(new FactoryApplePay(), 500.00);
    }
}
