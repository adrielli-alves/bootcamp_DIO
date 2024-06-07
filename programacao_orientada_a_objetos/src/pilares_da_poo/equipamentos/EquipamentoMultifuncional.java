package pilares_da_poo.equipamentos;

import pilares_da_poo.equipamentos.copiadora.Copiadora;
import pilares_da_poo.equipamentos.digitalizadora.Digitalizadora;
import pilares_da_poo.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Digitalizadora, Copiadora, Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
    
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    
}
