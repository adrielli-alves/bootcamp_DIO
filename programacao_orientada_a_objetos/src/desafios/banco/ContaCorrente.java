package desafios.banco;

public class ContaCorrente extends Conta {

    void imprimirExtrato () {
        System.out.println("###### Extrato da conta corrente ######");
        super.imprimirSaldo();
    }

}
