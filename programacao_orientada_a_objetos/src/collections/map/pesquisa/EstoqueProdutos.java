package collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto e : estoqueMap.values()) {
            valorTotal += e.getQuantidade() * e.getPreco();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto maiorProduto = null;
        double maiorValor = Double.MIN_VALUE;
        for (Produto e : estoqueMap.values()) {
            if (e.getPreco() > maiorValor) {
                maiorValor = e.getPreco();
                maiorProduto = e;
            }
        }
        return maiorProduto;
    }

    public Produto obterProdutoMaisBarato() {
        Produto menorProduto = null;
        double menorValor = Double.MAX_VALUE;
        for (Produto e : estoqueMap.values()) {
            if (e.getPreco() < menorValor) {
                menorValor = e.getPreco();
                menorProduto = e;
            }
        }
        return menorProduto;
    }

    public Produto obterProdutoMaiorValorTotal() {
        Produto produtoMaiorValorTotal = null;
        double maiorValorTotal = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotal) {
                    maiorValorTotal = valorProdutoEmEstoque;
                    produtoMaiorValorTotal = entry.getValue();
                }
            }
        }
        return produtoMaiorValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorValorTotal();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);

    }
}
