package introducao_a_estruturas_condicionais;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class EstruturaRepeticao {
    public static void main(String[] args) {

        System.out.println("\nfor");
        // for
        for (int carteirinhos = 1; carteirinhos <= 5; carteirinhos++) {
            System.out.println("Contando carneirinhos " + carteirinhos);
        }

        System.out.println("\nfor em array");
        // for em array
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }

        System.out.println("\nfor each");
        // for each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        System.out.println("\nfor com break");
        // break
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;
            }
            System.out.println(numero);
        }

        System.out.println("\nfor com continue");
        // continue
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue;
            }
            System.out.println(numero);
        }

        System.out.println("\nwhile");
        // while
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João castou toda a mesada em doces");

        System.out.println("\ndo while");
        // do while
        System.out.println("Discando...");
        do {
            System.out.println("Telefone Tocando");
        } while (tocando());
        System.out.println("Alô");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    private static boolean tocando () {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu: " + (atendeu ? "Sim" : "Não"));
        return ! atendeu;
    }
}
