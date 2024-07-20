package desafios.banco;

public class ContaPoupanca extends Conta {

    void imprimirExtrato () {
        System.out.println("###### Extrato da conta poupança ######");
        super.imprimirSaldo();
    }
    
}
