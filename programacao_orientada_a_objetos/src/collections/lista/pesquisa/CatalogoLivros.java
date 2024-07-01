package collections.lista.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  // atributo
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
      return livrosPorIntervaloAnos;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
      return livroPorTitulo;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    Livro livro = null;
    List<Livro> lista = null;

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    // Exibindo livros pelo mesmo autor
    System.out.println("Livros do autor Robert C. Martin:");
    lista = catalogoLivros.pesquisarPorAutor("Robert C. Martin");
    if (!lista.isEmpty()) {
      for (Livro i : lista) {
        System.out.println(i + "\n");
      }
    } else {
      System.out.println("Não há livros desse autor\n");
    }

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor
    // específico)
    System.out.println("Livros do autor Indiana Jones:");
    lista = catalogoLivros.pesquisarPorAutor("Indiana Jones");
    if (!lista.isEmpty()) {
      for (Livro i : lista) {
        System.out.println(i + "\n");
      }
    } else {
      System.out.println("Não há livros desse autor\n");
    }

    // Exibindo livros dentro de um intervalo de anos
    System.out.println("Livros de 2010 a 2022:");
    lista = catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022);
    if (!lista.isEmpty()) {
      for (Livro i : lista) {
        System.out.println(i + "\n");
      }
    } else {
      System.out.println("Não há livros desse período\n");
    }
    
    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no
    // intervalo)
    System.out.println("Livros de 2025 a 2030:");
    lista = catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030);
    if (!lista.isEmpty()) {
      for (Livro i : lista) {
        System.out.println(i + "\n");
      }
    } else {
      System.out.println("Não há livros desse período\n");
    }
    
    // Exibindo livros por título
    System.out.println("Procurando livro: Java Guia do Programador");
    livro = catalogoLivros.pesquisarPorTitulo("Java Guia do Programador");
    if (livro != null) {
        System.out.println(livro + "\n");
    } else {
      System.out.println("Livro não encontrado\n");
    }
    
    // Exibindo livros por título (caso em que não há livros com o título
    // especificado)
    System.out.println("Procurando livro: Coraline");
    livro = catalogoLivros.pesquisarPorTitulo("Coraline");
    if (livro != null) {
        System.out.println(livro + "\n");
    } else {
      System.out.println("Livro não encontrado\n");
    }
  }
}
