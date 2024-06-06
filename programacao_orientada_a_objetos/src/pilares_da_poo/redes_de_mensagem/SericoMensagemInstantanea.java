package pilares_da_poo.redes_de_mensagem;

public abstract class SericoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void  validarConectadoInternet() {
        System.out.println("Validando conexão da internet");
    }
    protected void  salvarHistorico() {
        System.out.println("Salvando histórico de mensagens");
    }
}
