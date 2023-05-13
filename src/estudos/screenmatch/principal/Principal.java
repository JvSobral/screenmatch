package estudos.screenmatch.principal;

import estudos.screenmatch.calculos.Calculadora;
import estudos.screenmatch.calculos.Recomendacao;
import estudos.screenmatch.modelos.Episodio;
import estudos.screenmatch.modelos.Filme;
import estudos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("IronMan",2008);
       // filme1.setNome("IronMan");
        //filme1.setLanc(2008);
        filme1.setDuracao(200);

        filme1.exibeFicha();
        filme1.avalia(5);
        filme1.avalia(6);
        filme1.avalia(9);
        System.out.println("\nTotal de Avaliaçoes: " + filme1.getTotalAvaliacoes());
        System.out.println("Avaliação: " + filme1.getRating() );
        System.out.println("Media: " + filme1.media());


        Serie serie1 = new Serie("Flash",2014);
        serie1.setEp(20);
        serie1.setMinEp(42);
        serie1.setDuracao(42);
        serie1.exibeFicha();
        serie1.avalia(10);
        System.out.println("Total de Avaliações: " + serie1.getTotalAvaliacoes());
        System.out.println("Avaliação: " + serie1.getRating());
        System.out.println("Media: " + serie1.media() + "\n");

        Calculadora c = new Calculadora();
        c.inclui(filme1);
        c.inclui(serie1);
        System.out.println("Tempo de reprodução: " + c.getTempo() + "\n");

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtro(filme1);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(serie1);
        ep.setTotalVizualizacoes(300);
        recomendacao.filtro(ep);


        var filmeJao = new Filme("Vingadores: Ultimato",2020);
        //filmeJao.setNome("Vingadores: Ultimato");
        filmeJao.setDuracao(205);
//        filmeJao.setLanc(2020);
        filmeJao.avalia(10);

        ArrayList<Filme> listaDeFilme =new ArrayList<>();
        listaDeFilme.add(filmeJao);
        listaDeFilme.add(filme1);
        System.out.println("Tamanho da lista:  " + listaDeFilme.size());
        System.out.println("Primeiro Filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme.get(0).toString());








    }
}
