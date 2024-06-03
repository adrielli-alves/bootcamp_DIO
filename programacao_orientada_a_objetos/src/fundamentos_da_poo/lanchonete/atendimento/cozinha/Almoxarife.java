package fundamentos_da_poo.lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void ControlarEntrada() {
        System.out.println("Controlando a entrada dos itens");
    }

    private void ControlarSaida() {
        System.out.println("Controlando a saida dos itens");
    }
    
    protected void EntregarIngredientes() {
        ControlarEntrada();
        ControlarSaida();
        System.out.println("Entregando ingredientes");
    }
    
    protected void TrocarGas() {
        System.out.println("Almoxarife trocando o gas");
    }
}
