package curso.java.collections.list.aula2.set;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Series> {

	@Override
	public int compare(Series s1, Series s2) {
		
		int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
		if(tempoEpisodio != 0)
		return tempoEpisodio;
		
		return s1.getNome().compareToIgnoreCase(s2.getNome());
	}

}
