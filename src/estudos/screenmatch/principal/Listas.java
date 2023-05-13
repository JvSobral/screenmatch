package estudos.screenmatch.principal;

import estudos.screenmatch.modelos.Filme;
import estudos.screenmatch.modelos.Serie;
import estudos.screenmatch.modelos.Titulo;

import java.util.*;

public class Listas {

    public static void main(String[] args) {
        Filme filme1 = new Filme("IronMan",2008);
        filme1.avalia(10);
        Serie serie1 = new Serie("Flash",2014);
        serie1.avalia(8);
        var filmeJao = new Filme("Vingadores: Ultimato",2020);
        filmeJao.avalia(10);


        List <String> artista = new ArrayList<>();
        List<Titulo> lista =new LinkedList<>();

        artista.add("Adam Sandler");
        artista.add("Robert Donwney JR");
        artista.add("Chris Evans");
        System.out.println(artista);
        Collections.sort(artista);
        System.out.println("Apos ordenação:" + artista);
        lista.add(filmeJao);
        lista.add(filme1);
        lista.add(serie1);
        lista.sort(Comparator.comparing(Titulo::getLanc));
        System.out.println("By Ano: " + lista);



        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }






        }
    }
}
