package introducao_a_estruturas_condicionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaExcepcional {
    public static void main(String[] args) {
        try{
            try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                System.out.println("Digite seu nome: ");
                String nome = scanner.next();

                System.out.println("Digite seu sobrenome: ");
                String sobrenome = scanner.next();

                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();

                System.out.println("Digite sua altura: ");
                Double altura = scanner.nextDouble();

                System.out.println("Nome Completo: " + nome + " " + sobrenome);
                System.out.println("Idade: " + idade);
                System.out.println("Altura: " + altura);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

    }
}
