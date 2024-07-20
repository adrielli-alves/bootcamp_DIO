package desafios.banco;

import java.util.Scanner;
import java.util.Locale;

public class Banco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
            ContaCorrente cc = new ContaCorrente();
            ContaPoupanca cp = new ContaPoupanca();

            // definição de variável para continuar gerando contas
            boolean continua = true;
            double valor;
            while (continua) {

                int tipoConta = 0;
                while (tipoConta != 1 && tipoConta != 2 && tipoConta != 3) {
                    System.out.println("Informe o tipo de conta que deseja abrir inserindo o número correspondente:\n" +
                            "1) Conta Corrente \n" +
                            "2) Conta Poupança \n" +
                            "3) Encerrar atividade");
                    tipoConta = scanner.nextInt();
                    if (tipoConta != 1 && tipoConta != 2 && tipoConta != 3) {
                        System.out.println("Opção inválida, selecione novamente");
                    }
                }

                if (tipoConta == 1) {

                    System.out.println("Informe o nome do titular: ");
                    String nome = scanner.next();
                    System.out.println("Informe a idade do titular: ");
                    int idade = scanner.nextInt();
                    String sexo;
                    int tipoSexo = 0;

                    while (tipoSexo != 1 && tipoSexo != 2) {
                        System.out.println("Informe o sexo do titular:\n" + "1) Masculino\n" + "2) Feminino");
                        tipoSexo = scanner.nextInt();
                        if (tipoSexo != 1 && tipoSexo != 2) {
                            System.out.println("Sexo inválido");
                        }
                    }

                    if (tipoSexo == 1) {
                        sexo = "Masculino";
                    } else {
                        sexo = "Feminino";
                    }

                    cc.cliente.setNome(nome);
                    cc.cliente.setIdade(idade);
                    cc.cliente.setSexo(sexo);

                    System.out.println("Informe o valor que será depositado: ");
                    valor = scanner.nextDouble();
                    cc.depositar(valor);
                    
                    System.out.println("Informe o valor que será sacado: ");
                    valor = scanner.nextDouble();
                    cc.sacar(valor);
                    
                    System.out.println("Informe o valor que será transferido: ");
                    valor = scanner.nextDouble();
                    cc.transferir(valor, cp);
                    
                    cc.imprimirExtrato();
                    cp.imprimirExtrato();

                }

                if (tipoConta == 2) {

                    System.out.println("Informe o nome do titular: ");
                    String nome = scanner.next();
                    System.out.println("Informe a idade do titular: ");
                    int idade = scanner.nextInt();
                    String sexo;
                    int tipoSexo = 0;

                    while (tipoSexo != 1 && tipoSexo != 2) {
                        System.out.println("Informe o sexo do titular:\n" + "1) Masculino\n" + "2) Feminino");
                        tipoSexo = scanner.nextInt();
                        System.out.println(tipoSexo);
                        if (tipoSexo != 1 && tipoSexo != 2) {
                            System.out.println("Sexo inválido");
                        }
                    }

                    if (tipoSexo == 1) {
                        sexo = "Masculino";
                    } else {
                        sexo = "Feminino";
                    }

                    cp.cliente.setNome(nome);
                    cp.cliente.setIdade(idade);
                    cp.cliente.setSexo(sexo);
                    
                    System.out.println("Informe o valor que será depositado: ");
                    valor = scanner.nextInt();
                    cp.depositar(valor);
                    
                    System.out.println("Informe o valor que será sacado: ");
                    valor = scanner.nextInt();
                    cp.sacar(valor);
                    
                    System.out.println("Informe o valor que será transferido: ");
                    valor = scanner.nextInt();
                    cp.transferir(valor, cc);
                    
                    cp.imprimirExtrato();
                    cc.imprimirExtrato();
                }

                if (tipoConta == 3) {
                    continua = false;
                }
            }
        }
    }
}
