package pilares_da_poo.desafios.Celular;

public class FuncoesCelular implements AparelhoTelefonico, NavegadorWeb, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
