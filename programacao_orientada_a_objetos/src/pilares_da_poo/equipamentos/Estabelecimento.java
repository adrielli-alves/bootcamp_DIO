package pilares_da_poo.equipamentos;

import pilares_da_poo.equipamentos.copiadora.Copiadora;
import pilares_da_poo.equipamentos.digitalizadora.Digitalizadora;
import pilares_da_poo.equipamentos.impressora.Impressora;

public class Estabelecimento {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
