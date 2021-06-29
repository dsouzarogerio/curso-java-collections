package curso.java.collections.list.aula2.set;

import java.util.Objects;

public class Series implements Comparable<Series>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Series(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
		}
	
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	@Override
	public String toString() {
		return "{nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio +  "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Series serie = (Series) obj;
		
		return nome.equals(serie.nome) && genero.equals(serie.genero) 
													  && tempoEpisodio.equals(serie.tempoEpisodio);
		}

	@Override
	public int compareTo(Series serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0) 
			return tempoEpisodio;
		
			return this.getGenero().compareTo(serie.getGenero());		
	}
	
}