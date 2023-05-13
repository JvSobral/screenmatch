package estudos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import estudos.screenmatch.exessao.ErroConversaoExection;

public class Titulo implements Comparable <Titulo>{
    private String nome;
    private int lanc;
    private boolean incluidoNoPlano;
    private int rating;
    private int totalAvaliacoes;
    private int duracao;

    public Titulo(String nome, int lanc) {
        this.nome = nome;
        this.lanc = lanc;
    }



    public Titulo(TituloOmbd tituloOmbd) {
        this.nome = tituloOmbd.title();

        if (tituloOmbd.year().length() > 4) {
            throw new ErroConversaoExection("Falha na conversão do ano! Exesso de caracteres");

        }
        this.lanc = Integer.valueOf(tituloOmbd.year());
        this.duracao = Integer.valueOf(tituloOmbd.runtime().substring(0,2).trim());
    }

    public void exibeFicha() {
        System.out.println("\nNome: " + nome);
        System.out.println("Ano de Lançamento: " + lanc);
        System.out.println("Duração: " + Integer.toString(duracao) + " min");
    }


    public void avalia(double rating){
        this.rating += rating;
        totalAvaliacoes ++;
    }

    public double media(){

        return rating / totalAvaliacoes;
    }

    public String getNome() {

        return nome;
    }

    public int getLanc() {

        return lanc;
    }

    public boolean isIncluidoNoPlano() {

        return incluidoNoPlano;
    }

    public int getRating() {

        return rating;
    }

    public int getTotalAvaliacoes() {

        return totalAvaliacoes;
    }

    public int getDuracao() {

        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLanc(int lanc) {
        this.lanc = lanc;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.getNome().compareTo(outro.getNome());
    }

    @Override
    public String toString() {
        return "(nome: " + nome + " Ano de Lancamento: " + lanc + " Duração: " + Integer.toString(duracao) + " min)";

    }
}

