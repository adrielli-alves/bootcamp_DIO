package pilares_da_poo.veiculo;

public class Carro extends Veiculo {

    public String chassi;

    public void ligar () {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel () {
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio () {
        System.out.println("Comferindo cambio");
    }


}
