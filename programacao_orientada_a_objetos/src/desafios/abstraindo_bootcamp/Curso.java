package desafios.abstraindo_bootcamp;

public class Curso extends Conteudo {

    // atributo (demais vem da classe pai)
    private int cargaHoraria;

    // getters and setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // to String
    public String toString() {
        return "Curso [" +
                "Titulo= " + getTitulo() +
                ", descrição= " + getDescricao() +
                ", cargaHoraria= " + getCargaHoraria() + "]";
    }

    // construção do calculo de XP
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
