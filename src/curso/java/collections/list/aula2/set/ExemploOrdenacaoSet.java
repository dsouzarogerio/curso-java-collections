package curso.java.collections.list.aula2.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExemploOrdenacaoSet {
	/*
	 * Crie um conjunto de séries favoritas e ordene este conjunto exibindo:
	 * (nome - genero - tempo de episódio)
	 * Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
	 * Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
	 * Série 3 = Nome: that '70s show, genero: comedia, tempoEpisodio: 25
	 */
	public static void main(String[] args) {
		
		System.out.println("-----\t Ordem aleatória \t-----");
		Set<Series> minhasSeries = new HashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "comédia", 25));
		}};
		for (Series serie : minhasSeries) System.out.println(serie.getNome() + " - " 
						+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("-----\t Ordem inserção \t-----");
		Set<Series> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "comédia", 25));
		}};
		for (Series serie : minhasSeries1) System.out.println(serie.getNome() + " - " 
						+ serie.getGenero() + " - " + serie.getTempoEpisodio());	
		
		System.out.println("-----\t Ordem natural (Tempo de Episódio)\t-----");
		
		Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
		
		for (Series serie : minhasSeries2) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("-----\t Ordem (Nome/Genero/Tempo de Episódio)\t-----");
		
		Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		
		for (Series serie : minhasSeries3) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());	
		
		System.out.println("-----\t Ordem Gênero\t-----");
		Set<Series> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
		minhasSeries4.addAll(minhasSeries);
		
		for (Series serie : minhasSeries4) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("-----\t Ordem TempoEpisódio\t-----");
		Set<Series> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
		minhasSeries5.addAll(minhasSeries);
		
		for (Series serie : minhasSeries5) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
	}
}