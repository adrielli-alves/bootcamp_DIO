package pilares_da_poo.redes_de_mensagem;

public class MSNMessager {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
    }
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem");
        salvarHistoricoMensagem();
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico de mensagens");
    }
}
