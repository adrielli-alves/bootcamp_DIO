package collections.lista.operacoes_basicas;

public class Tarefa {
  // define o atributo descrição
  private String descricao;

  // atualiza o atributo
  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  // retorna o atributo
  public String getDescricao() {
    return descricao;
  }

  // quando for impresso a lista de tarefas, será com tipo String, não com o local de armazenamento
  public String toString() {
    return descricao;
  }
}
