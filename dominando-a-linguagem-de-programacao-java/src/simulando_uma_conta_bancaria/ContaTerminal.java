package simulando_uma_conta_bancaria;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia, nomecliente;
        double saldo;

        System.out.println("Por favor, digite o seu nome:");
        nomecliente = scanner.next();

        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o saldo atual da conta:");
        saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
