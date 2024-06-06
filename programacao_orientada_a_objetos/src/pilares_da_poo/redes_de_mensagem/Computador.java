package pilares_da_poo.redes_de_mensagem;

public class Computador {
    public static void main(String[] args) {

        SericoMensagemInstantanea smi = null;
        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessager();
        } else if (appEscolhido.equals("fb")) {
            smi = new FacebookMessager();
        } else {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
