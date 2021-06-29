package curso.java.collections.list.aula2.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExemploOrdenacaoSet {
	/*
	 * Crie um conjunto de s�ries favoritas e ordene este conjunto exibindo:
	 * (nome - genero - tempo de epis�dio)
	 * S�rie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
	 * S�rie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
	 * S�rie 3 = Nome: that '70s show, genero: comedia, tempoEpisodio: 25
	 */
	public static void main(String[] args) {
		
		System.out.println("-----\t Ordem aleat�ria \t-----");
		Set<Series> minhasSeries = new HashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "com�dia", 25));
		}};
		for (Series serie : minhasSeries) System.out.println(serie.getNome() + " - " 
						+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("-----\t Ordem inser��o \t-----");
		Set<Series> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "com�dia", 25));
		}};
		for (Series serie : minhasSeries1) System.out.println(serie.getNome() + " - " 
						+ serie.getGenero() + " - " + serie.getTempoEpisodio());	
		
		System.out.println("-----\t Ordem natural (Tempo de Epis�dio)\t-----");
		
		Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
		
		for (Series serie : minhasSeries2) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("-----\t Ordem (Nome/Genero/Tempo de Epis�dio)\t-----");
		
		Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		
		for (Series serie : minhasSeries3) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());	
		
		System.out.println("-----\t Ordem G�nero\t-----");
		Set<Series> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
		minhasSeries4.addAll(minhasSeries);
		
		for (Series serie : minhasSeries4) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("-----\t Ordem TempoEpis�dio\t-----");
		Set<Series> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
		minhasSeries5.addAll(minhasSeries);
		
		for (Series serie : minhasSeries5) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
	}
}