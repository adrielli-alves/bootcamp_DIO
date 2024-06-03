package fundamentos_da_poo.get_set_construct;

public class Pessoa {

    //método construtor com argumentos
    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    //método construtor sem argumentos
    public Pessoa () {
    }

    private String nome;
    private String cpf;
    private String endereco;

    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
