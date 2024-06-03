package fundamentos_da_poo.lanchonete.atendimento.cozinha;


public class Cozinheiro {
    
    private void SelecionarIngredienteLanche () {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }
    
    private void SelecionarIngredientesSuco () {
        System.out.println("Selecionando fruta, agua e acucar");
    }
    
    private void LavarIngredientes () {
        System.out.println("Lavando ingredientes");
    }
    
    private void FritarIngredientes () {
        System.out.println("Fritando a carne e o ovo do lanche");
    }
    
    private void BaterSuco () {
        System.out.println("Batendo suco no liquidificador");
    }
    
    private void PrepararLanche () {
        SelecionarIngredienteLanche();
        LavarIngredientes();
        FritarIngredientes();
        System.out.println("Preparando lanche natural");
    }
    
    private void PrepararSuco () {
        SelecionarIngredientesSuco();
        LavarIngredientes();
        BaterSuco();
        System.out.println("Preparando o suco");
    }
    
    private void PrepararCombo () {
        PrepararLanche();
        PrepararSuco();
    }

    public void AdicionarLancheBaldao () {
        System.out.println("Adicionando lanche natural no balcao");
    }
    
    public void AdicionarSucoBalcao () {
        System.out.println("Adicionando suco no balcao");
    }
    
    public void AdicionarComboBalcao () {
        PrepararCombo();
        AdicionarLancheBaldao();
        AdicionarSucoBalcao();
    }
    
    protected void PedirTrocaGas (Almoxarife funcionario) {
        funcionario.TrocarGas();
    }
    
    protected void PedirIngredientes (Almoxarife funcionario) {
        funcionario.EntregarIngredientes();
    }
}
