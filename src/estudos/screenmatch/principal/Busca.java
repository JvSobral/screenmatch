package estudos.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import estudos.screenmatch.exessao.ErroConversaoExection;
import estudos.screenmatch.modelos.Titulo;
import estudos.screenmatch.modelos.TituloOmbd;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Busca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Qual filme você deseja procurar ?");
            busca = sc.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=9a923637";
            System.out.println(endereco);
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


                String json = response.body();
                //System.out.println(json);




                TituloOmbd tituloOmbd = gson.fromJson(json, TituloOmbd.class);
                System.out.println(tituloOmbd);
                //try {
                    Titulo titulo = new Titulo(tituloOmbd);
                    System.out.println("Convertrndo\n");
                    System.out.println(titulo);
                    titulos.add(titulo);


                } catch (NumberFormatException e) {
                    System.out.println("Aconteceu um erro: ");
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro de argumento, Verifique o endereço");
                } catch (ErroConversaoExection e) {
                    System.out.println(e.getMessage());

                }


        }
        System.out.println(titulos);

        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titulos));
        writer.close();
        System.out.println("Programa executado com sucesso");
    }
}
