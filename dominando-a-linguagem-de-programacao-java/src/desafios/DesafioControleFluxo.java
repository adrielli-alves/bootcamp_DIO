package desafios;

import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;
            // realizar o for para imprimir os números com base na variável contagem
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } else
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

    }
}
