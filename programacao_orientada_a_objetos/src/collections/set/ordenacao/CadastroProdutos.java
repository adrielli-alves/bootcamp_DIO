package collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosCadastrados;
    
    public CadastroProdutos() {
        this.produtosCadastrados = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosCadastrados.add(new Produto(nome, quantidade, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosCadastrados);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new comparetorPorPreco());
        produtosPorPreco.addAll(produtosCadastrados);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produtosCadastrados = new CadastroProdutos();

        System.out.println("\nAdicionando produtos\n");
        produtosCadastrados.adicionarProduto(1L, "arroz", 15.19d, 2);
        produtosCadastrados.adicionarProduto(2L, "feijao", 7.61d, 1);
        produtosCadastrados.adicionarProduto(3L, "sal", 4.25d, 3);
        produtosCadastrados.adicionarProduto(2L, "acucar", 5.23d, 2);
        
        System.out.println("\nExibindo por nome\n");
        System.out.println(produtosCadastrados.exibirProdutosPorNome());
        System.out.println("\nExibindo por preço\n");
        System.out.println(produtosCadastrados.exibirProdutosPorPreco());
    }
}
