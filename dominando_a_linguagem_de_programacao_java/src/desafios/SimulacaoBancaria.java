package desafios;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean continuar = true;

        while (continuar) {
            // System.out.println("Escolha dentre as opções abaixo qual ação deseja
            // realizar: \n1. Depositar \n2. Sacar \n3. Consultar Saldo \n4. Encerrar");
            int opcao = scanner.nextInt();
            System.err.println();

            switch (opcao) {
                case 1:
                    // System.out.println("Insira o valor a ser depositado: ");
                    Double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.printf("Saldo atual: %.1f \n\n", saldo);
                    break;

                case 2:
                    // System.out.println("Insira o valor a ser sacado: ");
                    Double valorSacado = scanner.nextDouble();
                    if (valorSacado > saldo) {
                        System.out.println("Saldo insuficiente. \n\n");
                    } else {
                        saldo -= valorSacado;
                        System.out.printf("Saldo atual: %.1f \n\n", saldo);
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: %.1f \n\n", saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}