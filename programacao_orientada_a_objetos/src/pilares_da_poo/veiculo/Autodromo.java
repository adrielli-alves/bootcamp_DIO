package pilares_da_poo.veiculo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("454687");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("776787");
        z400.ligar();
    }
}
