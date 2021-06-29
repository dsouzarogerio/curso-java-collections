package curso.java.collections.list.aula2.lab.exerc04;

import java.util.Comparator;

public class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
		if(anoCriacao != 0) return anoCriacao;
		
		return l1.getNome().compareTo(l2.getNome());
	}

}
