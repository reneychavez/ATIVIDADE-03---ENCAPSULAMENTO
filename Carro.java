import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;

    // Lista para armazenar os carros cadastrados
    private static List<Carro> carros = new ArrayList<>();

    public Carro(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    // Métodos Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para adicionar um carro
    public static void adicionarCarro(String modelo, String marca, String cor) {
        if (modelo.isEmpty() || marca.isEmpty() || cor.isEmpty()) {
            System.out.println("Erro: Todos os campos devem ser preenchidos!");
            return;
        }

        Carro novoCarro = new Carro(modelo, marca, cor);
        carros.add(novoCarro);
        System.out.println("Carro adicionado com sucesso: " + modelo + " - " + marca + " - " + cor);
    }

    // Método para exibir todos os carros
    public static void exibirCarros() {
        System.out.println("\n=== Lista de Carros Cadastrados ===");
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            for (Carro carro : carros) {
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("---------------------------");
            }
        }
    }

    // Método para testar a classe
    public static void main(String[] args) {
        adicionarCarro("Civic", "Honda", "Preto");
        adicionarCarro("Corolla", "Toyota", "Branco");
        adicionarCarro("Uno", "Fiat", "Prata");

        exibirCarros();
    }
}
