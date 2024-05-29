package desafios;
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double limiteDiario = scanner.nextDouble();

            // Loop for para iterar sobre os saques
            for (;;) {

                double valorSaque = scanner.nextDouble();

                if (valorSaque == 0) {
                    System.out.println("Transacoes encerradas.");
                    break; // Encerra o loop
                } else if (valorSaque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break; // Encerra o loop
                } else {
                    limiteDiario -= valorSaque;
                    System.out.printf("Saque realizado. Limite restante: %.1f", limiteDiario);
                }
            }
        }

        ;
    }
}