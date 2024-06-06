package pilares_da_poo.redes_de_mensagem;

public class FacebookMessager extends SericoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistorico();
    }
}
