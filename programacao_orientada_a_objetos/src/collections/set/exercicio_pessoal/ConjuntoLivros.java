package collections.set.exercicio_pessoal;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoLivros {
    //atributo
    private Set<Livro> conjuntoLivros;

    public ConjuntoLivros() {
        this.conjuntoLivros = new HashSet<>();
    }

    public void adicionarLivro(String nomeLivro, String nomeAutor, int anoLivro, int idadeRecomendada) {
        conjuntoLivros.add(new Livro(nomeLivro, nomeAutor, anoLivro, idadeRecomendada));
    }
    
    public void removerLivroPorNomeLivro (String nomeLivro) {
        Livro livroRemover = null;
        if (!conjuntoLivros.isEmpty()) {
            for (Livro l : conjuntoLivros) {
                if (l.getNomeLivro() == nomeLivro) {
                    livroRemover = l;
                    break;
                }
            }
            conjuntoLivros.remove(livroRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public int contarLivros() {
        return conjuntoLivros.size();
    }

    public void exibirLivros() {
        if (!conjuntoLivros.isEmpty()) {
            System.out.println(conjuntoLivros);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {

    ConjuntoLivros conjuntoLivros = new ConjuntoLivros();

    // Exibindo o número de convidados no conjunto (deve ser zero)
    System.out.println("Existem " + conjuntoLivros.contarLivros() + " livro(s) dentro do Set");

    // Adicionando convidados ao conjunto
    conjuntoLivros.adicionarLivro("Assombrando Adeline", "H. D. Carlton", 2022, 18);
    conjuntoLivros.adicionarLivro("Corte de Espinhos e Rosas", "Sarah J. Mass", 2015, 14);
    conjuntoLivros.adicionarLivro("Saboroso Cadaver", "Agustina Bazterrica", 2022, 18);
    conjuntoLivros.adicionarLivro("Delirio", "Maya Banks", 2013, 18);
    conjuntoLivros.adicionarLivro("Delirio", "Lauren Oliver", 2012, 16);

    // Exibindo os convidados no conjunto
    System.out.println("Livros no conjunto:");
    conjuntoLivros.exibirLivros();

    // Exibindo o número atualizado de convidados no conjunto
    System.out.println("Existem " + conjuntoLivros.contarLivros() + " livro(s) dentro do Set");

    // Removendo um convidado do conjunto por código de convite
    conjuntoLivros.removerLivroPorNomeLivro("Delirio");
    System.out.println("Existem " + conjuntoLivros.contarLivros() + " livro(s) dentro do Set");

    // Exibindo os convidados atualizados no conjunto
    System.out.println("Livros no conjunto:");
    conjuntoLivros.exibirLivros();
    }
}



