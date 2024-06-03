package fundamentos_da_poo;

public class EnumEstados {

    public static void main(String[] args) {
        for(EstadosBrasileiros estado: EstadosBrasileiros.values()) {
            System.out.println(estado.getSigla() + "-" + estado.getNome());
        }

        EstadosBrasileiros rj = EstadosBrasileiros.RIOJANEIRO;
        System.out.println(rj.getNomeMaiusculo());
    }

    public enum EstadosBrasileiros {
        SAOPAULO ("SP", "São Paulo"),
        RIOJANEIRO ("RJ", "Rio de Janeiro"),
        PIAUI ("PI", "Piauí"),
        MARANHAO ("MA", "Maranhão") ;

        private String nome;
        private String sigla;

        private EstadosBrasileiros (String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }

        public String getSigla() {
            return sigla;
        }
        public String getNome() {
            return nome;
        }
        public String getNomeMaiusculo() {
            return nome.toUpperCase();
        }
    }
}
