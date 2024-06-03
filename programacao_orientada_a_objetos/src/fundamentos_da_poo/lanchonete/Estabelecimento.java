package fundamentos_da_poo.lanchonete;

import fundamentos_da_poo.lanchonete.area_cliente.Cliente;
import fundamentos_da_poo.lanchonete.atendimento.Atendente;
import fundamentos_da_poo.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();

        //cozinheiro
        cozinheiro.AdicionarLancheBaldao();
        cozinheiro.AdicionarSucoBalcao();
        cozinheiro.AdicionarComboBalcao();

        //atendente
        atendente.ReceberPagamento();
        atendente.ServindoMesa();

        //cliente
        cliente.EscolherLanche();
        cliente.FazerPedido();
        cliente.PagarConta();
    }
}
