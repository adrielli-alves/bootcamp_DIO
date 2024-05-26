/*Possível melhorias do código:
 * Gerar um array que receba os nomes dos candidatos que não foram selecionados e fazer uma nova tentativa,
 * possibilitando que sejam chamados como finalistas caso os escolhidos anteriormente não respondam as
 * tentativas de contato
 */

package processo_seletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelecaoDeCantidatos {
    public static void main(String[] args) {
        // Nome de todos os candidatos
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        // Salário ofertado pela empresa
        double salarioOfertado = 2000.0;
        // Lista com nome dos finalistas
        String[] finalistasNome = new String[5];
        // Quantidade máxima de escolhidos: 5
        int candidatosEscolhidos = 0;
        // Index para identificação do candidato da lista de nomes inicial
        int candidatoAtual = 0;

        // Se foram escolhidos menos de 5 candidatos e ainda não foram considerados
        // todos da lista
        while (candidatosEscolhidos < 5 && candidatoAtual < candidatos.length) {

            // O salário desejado pelo candidado é gerado randomicamente
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1800, 2200);
            System.out.println("O candidato " + candidatos[candidatoAtual] + " pretende receber um salário de R$"
                    + salarioPretendido);

            // Valida se o salário desejado é menor que o ofertado
            if (salarioPretendido <= salarioOfertado) {
                System.out.println("O candidato " + candidatos[candidatoAtual] + " foi escolhido \n");
                // Adiciona o nome do finalista a lista
                finalistasNome[candidatosEscolhidos] = candidatos[candidatoAtual];
                // Incrementa o contador
                candidatosEscolhidos++;
            } else {
                System.out.println("O candidato " + candidatos[candidatoAtual] + " não foi escolhido \n");
            }
            // Passa ao próximo candidato para realizar a validação e repete o processo
            candidatoAtual++;

        }

        System.out.println("\n");
        for (String candidato : finalistasNome) {
            System.out.println("Candidato escolhido: " + candidato);
        }

        // Tentando entrar em contato com os finalistas
        for (String finalista : finalistasNome) {
            System.out.println("Tentando contato com " + finalista);
            int tentativasRealizadas = 1;
            boolean atendeu = false;
            // Enquanto o finalista não atender e o número de tentativas não exceder 3
            while (!atendeu && tentativasRealizadas <= 3) {
                atendeu = new Random().nextInt(3) == 1;
                tentativasRealizadas++;
            }
            if (atendeu) {
                System.out.println("Contato realizado na " + tentativasRealizadas + "º tentativa");
            } else
                System.out.println("Contato não realizado");
        }
    }
}
