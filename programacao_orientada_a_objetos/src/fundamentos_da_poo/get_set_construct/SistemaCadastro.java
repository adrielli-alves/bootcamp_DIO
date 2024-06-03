package fundamentos_da_poo.get_set_construct;

public class SistemaCadastro {
    public static void main(String[] args) {
        //Aluno
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Junior");
        felipe.setIdade(8);
        
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");

        //Pessoa
        Pessoa marcos = new Pessoa("455465758", "MARCOS");
        marcos.setEndereco("Rua da Esquina, 123");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
