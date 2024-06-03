package fundamentos_da_poo.lanchonete.atendimento;

public class Atendente {
    
    private void PegarLancheCozinha () {
        System.out.println("Pegando o lanche na cozinha");
    }
    
    public void ServindoMesa () {
        PegarLancheCozinha();
        System.out.println("Servindo a mesa");
    }
    
    public void ReceberPagamento () {
        System.out.println("Recebendo o pagamento");
    }
    
    public void PegarPedidoBaldao () {
        System.out.println("Pegando o pedido no balcao");
    }
}
