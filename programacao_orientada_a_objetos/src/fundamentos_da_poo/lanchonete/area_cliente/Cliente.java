package fundamentos_da_poo.lanchonete.area_cliente;

public class Cliente {
    public void EscolherLanche () {
        System.out.println("Escolhendo o lanche");
    }
    
    public void FazerPedido () {
        System.out.println("Fazendo o pedido");
    }
    
    private void ConsultarSaldoAplicativo () {
        System.out.println("Consultando saldo no aplicativo");
    }
    
    public void PagarConta () {
        ConsultarSaldoAplicativo();
        System.out.println("Pagando a conta");
    }
}
