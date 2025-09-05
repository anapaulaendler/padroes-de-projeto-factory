public class PagamentoService {

    public void processarPagamento(PagamentoFactory<? extends Pagamento> pagamentoFactory, double valorTransacao) {
        if (pagamentoFactory.criarPagamento().processarPagamento(valorTransacao)) {
            System.out.println("Pagamento processado com sucesso.");
        } else {
            System.out.println("Erro ao processar o pagamento.");
        }
    }
}