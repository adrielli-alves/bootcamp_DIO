package collections.lista.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

/*
Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo.
Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição.
Implemente os seguintes métodos:

adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
*/

public class ListaTarefa {
    // define um atributo com Generics recebendo a classe Tarefa
    // lista do tipo tarefa
    private List<Tarefa> tarefaList;

    // inicia a lista sempre como um array vazio
    // lista de tarefas é uma lista vazia
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // adiciona a tarefa na lista de afazeres
    // chamar o New garante que a tarefa será sempre atualizada, trazendo a
    // descrição informada
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // usa o laço de repetição para identificar se tem valores repetidos iguais a
    // descrição e os remove
    public void removerTarefa(String descricao) {
        // cria uma nova lista com o mesmo formato de tarefas como um array limpo
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        // se a lista de tarefas não estiver fazia (houver pelo menos uma tarefa
        // adicionada)
        if (!tarefaList.isEmpty()) {
            // a cada tarefa na lista de tarefas
            for (Tarefa t : tarefaList) {
                // receba a descrição da tarefa e veja se é igual a descrição que deve ser
                // removida
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    // caso seja igual, adicione a tarefa na lista das que devem ser removidas
                    tarefasParaRemover.add(t);
                }
            }
            // remove da lista principal todas as tarefas que foram incluidas na lista de
            // remoção
            tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    // informa o total de tarefas da lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // imprime a lista de tarefas inteira
    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para o exame");

        // Exibindo o número total de tarefas na lista após tentar remover de uma lista
        // vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        
        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Estudar para o exame");

        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();
    }
}
