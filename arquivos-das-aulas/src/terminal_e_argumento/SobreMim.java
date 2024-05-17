package terminal_e_argumento;

public class SobreMim {
    public static void main(String[] args) {
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

        /**
         * Ao rodar o programa no terminal, é necessário informar os dados do array para que sejam identificados
         * Exemplo:
         * Já no cmd, dentro da pasta bin, inserir a informação:
         * java SobreMim Adrielli Alves 21 1.55
         *
         * Por esse arquivo estar dentro de uma pasta, é necessário inserir esse caminho no cmd:
         * terminal_e_argumento.SobreMim
         * 
         * Para que as informações sejam apresentadas na IDE, abrir o arquivo launch.json
         * na pasta .vscode e editar (ou adicionar) o campo args no campo de código correspondente
         * 
         */
    }
    
}
