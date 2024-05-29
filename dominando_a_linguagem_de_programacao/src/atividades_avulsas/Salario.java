package atividades_avulsas;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float valorSalario = scan.nextFloat();
        float valorBeneficios = scan.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorBeneficios;
        }

        else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.1F * valorBeneficios;
        }

        else {
            valorImposto = 0.15F * valorBeneficios;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2F", saida));

        scan.close();
    }
}
