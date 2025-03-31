import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String descricao;
    private int quantidade;
    private double valor;

    // Lista para armazenar os produtos
    private static List<Estoque> produtos = new ArrayList<>();

    // Construtor
    public Estoque(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para adicionar um produto ao estoque
    public static void adicionarProduto(String descricao, int quantidade, double valor) {
        Estoque novoProduto = new Estoque(descricao, quantidade, valor);
        produtos.add(novoProduto);
        System.out.println("Produto adicionado: " + descricao);
    }

    // Método para remover um produto pelo nome
    public static void removerProduto(String descricao) {
        produtos.removeIf(produto -> produto.getDescricao().equalsIgnoreCase(descricao));
        System.out.println("Produto removido: " + descricao);
    }

    // Método para exibir todos os produtos no estoque
    public static void exibirProdutos() {
        System.out.println("\n=== Estoque Atual ===");
        if (produtos.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            for (Estoque produto : produtos) {
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Valor: R$ " + produto.getValor());
                System.out.println("---------------------------");
            }
        }
    }

    // Teste do metodo
    public static void main(String[] args) {
        adicionarProduto("Notebook", 5, 3500.00);
        adicionarProduto("Mouse", 20, 150.00);
        adicionarProduto("Teclado", 15, 200.00);

        exibirProdutos();

        removerProduto("Mouse");

        exibirProdutos();
    }
}
