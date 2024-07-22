package desafios.abstraindo_bootcamp;

// classe pai abstrata 
public abstract class Conteudo {

    // atributos
    // XP é protected pois é manipulado nas outras classes
    protected final int XP_PADRAO = 10;
    private String titulo;
    private String descricao;
    
    // metodo abstrato
    public abstract double calcularXP();
    
    // getters and setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
