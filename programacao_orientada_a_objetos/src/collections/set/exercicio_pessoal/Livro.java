package collections.set.exercicio_pessoal;

public class Livro {
    //atributos
    private String nomeLivro;
    private String nomeAutor;
    private int anoLivro;
    private int idadeRecomendada;

    public Livro(String nomeLivro, String nomeAutor, int anoLivro, int idadeRecomendada) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.anoLivro = anoLivro;
        this.idadeRecomendada = idadeRecomendada;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public int getAnoLivro() {
        return anoLivro;
    }

    public int getIdadeRecomendada() {
        return idadeRecomendada;
    }

    @Override
    public String toString() {
        return "Livro [nomeLivro=" + nomeLivro + ", nomeAutor=" + nomeAutor + ", anoLivro=" + anoLivro
                + ", idadeRecomendada=" + idadeRecomendada + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeLivro == null) ? 0 : nomeLivro.hashCode());
        result = prime * result + ((nomeAutor == null) ? 0 : nomeAutor.hashCode());
        result = prime * result + anoLivro;
        result = prime * result + idadeRecomendada;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nomeLivro == null) {
            if (other.nomeLivro != null)
                return false;
        } else if (!nomeLivro.equals(other.nomeLivro))
            return false;
        if (nomeAutor == null) {
            if (other.nomeAutor != null)
                return false;
        } else if (!nomeAutor.equals(other.nomeAutor))
            return false;
        if (anoLivro != other.anoLivro)
            return false;
        if (idadeRecomendada != other.idadeRecomendada)
            return false;
        return true;
    }

    
}


