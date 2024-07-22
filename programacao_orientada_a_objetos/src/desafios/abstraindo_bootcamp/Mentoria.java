package desafios.abstraindo_bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    // atributo (demais vem da classe pai)
    private LocalDate data;

    // getters and setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // to String
    public String toString() {
        return "Mentoria [Titulo= " + getTitulo()
                + ", descrição= " + getDescricao() +
                " data= " + getData();
    }

    // construção do calculo de XP
    public double calcularXP() {
        return XP_PADRAO + 20;
    }
}
