import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.sreenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.sreenmatch.calculo.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Star Wars", 1940);
        filme1.setDuracao(180);
        System.out.println("Duração do filme: " + filme1.getDuracao());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("Total de avaliaçoes" + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie serie = new Serie("The Walking Dead", 2007);
        serie.exibeFichaTecnica();
        serie.setTemporada(12);
        serie.setEpisodiosPorTemporada(9);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração da Serie: " + serie.getDuracao());

        Filme filme2 = new Filme("Vingadores", 2012);
        filme2.setDuracao(190);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualuzacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme("Django livre", 2018);
        filme3.setDuracao(180);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
        System.out.println("Primeiro filme: "+ listaDeFilmes.get(0).getNome());
        System.out.println("Filmes: "+listaDeFilmes);
        System.out.println("toString do filme: "+ listaDeFilmes.get(0).toString());


    }
}
