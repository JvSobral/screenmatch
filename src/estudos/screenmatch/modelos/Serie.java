package estudos.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int ep;
    private boolean ativa;
    private int minEp;

    public Serie(String nome, int lanc) {
        super(nome, lanc);
    }


    public int getTemporadas() {

        return temporadas;
    }

    public void setTemporadas(int temporadas) {

        this.temporadas = temporadas;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinEp() {
        return minEp;
    }

    public void setMinEp(int minEp) {
        this.minEp = minEp;
    }

    public String toString() {
        return "\nSérie: " + this.getNome() + " Ano de Inicio : " + "(" + this.getLanc() + ")";

    }
}
