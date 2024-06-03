package fundamentos_da_poo.get_set_construct;

public class Aluno {
    
    private String nome;
    private int idade;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        //possivel verificação
        nome = newNome;
    }
    
    public int getIdade() {
        //possivel verificação
        return idade;
    }

    public void setIdade(int newIdade) {
        idade = newIdade;
    }
}
