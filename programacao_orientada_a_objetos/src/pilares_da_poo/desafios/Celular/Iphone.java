package pilares_da_poo.desafios.Celular;

public class Iphone {
    public static void main(String[] args) {
        FuncoesCelular celular = new FuncoesCelular();

        System.out.println("Fuções do celular");
        celular.ligar("11987654321");  
        celular.atender();
        celular.iniciarCorreioVoz();
        
        System.out.println("\nFunções do reprodutor musical");
        celular.tocar();
        celular.pausar();
        celular.selecionarMusica("Carolina - Seu Jorge");

        System.out.println("\nFunções do navegador");
        celular.adicionarNovaAba();
        celular.exibirPagina("https://www.google.com/");
        celular.atualizarPagina();
    }
}
