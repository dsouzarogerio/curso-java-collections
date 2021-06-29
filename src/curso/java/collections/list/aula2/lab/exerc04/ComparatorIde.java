package curso.java.collections.list.aula2.lab.exerc04;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int ide = l1.getIde().compareTo(l2.getIde()); 
		if (ide != 0) return ide;	
		
		return l1.getNome().compareTo(l2.getNome());
		}
}