package Principal;

public class Estudante {
    private String nome;
    private String cpf;
    private String curso;
    private int idade;

    // Construtor
    public Estudante(String nome, String cpf, String curso, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.idade = idade;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para cadastrar um novo estudante
    public static Estudante cadastrar(String nome, String cpf, String curso, int idade) {
        return new Estudante(nome, cpf, curso, idade);
    }

    // Método para exibir informações do estudante
    public void exibirEstudante() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Estudante estudante = Estudante.cadastrar("RENEY CHAVES", "123.456.789-00", "ANÁLISE E DESENVOLVIMENTO", 20);
        estudante.exibirEstudante();
    }
}