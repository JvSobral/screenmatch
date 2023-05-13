package estudos.screenmatch.calculos;

public class Recomendacao {
    public void filtro (Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento\n");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Bem avaliado no momento\n");

        } else {
            System.out.println("Guade na sua lista de filmes\n");
        }

    }
}
