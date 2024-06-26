package pilares_da_poo.redes_de_mensagem;

public class MSNMessager extends SericoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
        salvarHistorico();
    }
}
