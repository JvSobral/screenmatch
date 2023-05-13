package estudos.screenmatch.modelos;

import estudos.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
   private String diretor;

    public Filme(String nome, int lanc) {
        super(nome, lanc);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return getRating() / 2;
    }

    @Override
    public String toString() {
        return "\nFilme: " + this.getNome() + " Ano de Lançamento: " + "(" + this.getLanc() + ")";

    }
}
