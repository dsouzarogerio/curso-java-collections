package curso.java.collections.list.aula2.lab.exerc04;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto04 {
	/*
	 * Crie uma classe LinguagemFavorita que possua os atributos 
	 * nome, anoDeCriacao e ide. Em seguida, crie um conjunto com 
	 * 3 linguagens e fa�a um programa que ordene esse conjunto por:
	 */
	public static void main(String[] args) {
		
		//Ordem aleat�ria
		Set<LinguagemFavorita> linguagem = new HashSet<>() {{
			add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
			add(new LinguagemFavorita("C#", 2000, "VStudio"));
			add(new LinguagemFavorita(".Net", 2014, "VStudio"));
		}};
		
		System.out.println("---\tOrdem aleat�ria:\t---");
		
		for (LinguagemFavorita programacao : linguagem) {
			System.out.println(programacao.getNome() + " - " 
										+ programacao.getAnoDeCriacao() + " - " + programacao.getIde());		
		}
		
		//Ordem de Inser��o
		Set<LinguagemFavorita> linguagem1 = new LinkedHashSet<>() {{
		add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
		add(new LinguagemFavorita(".Net", 2014, "VStudio"));
		add(new LinguagemFavorita("C#", 2000, "VStudio"));
		}};
		
		System.out.println("\n---\tOrdem de Inser��o:\t---");
		
		for (LinguagemFavorita programacao : linguagem1) {
			System.out.println(programacao.getNome() + " - " 
										+ programacao.getAnoDeCriacao() + " - " + programacao.getIde());		
		}
		//Ordem Natural (nome)
		Set<LinguagemFavorita> linguagem2 = new TreeSet<>(linguagem);
		
		System.out.println("\n---\tOrdena��o natural por nome:\t---");
		
		for (LinguagemFavorita programacao : linguagem2) {
			System.out.println(programacao.getNome() + " - " 
										+ programacao.getAnoDeCriacao() + " - " + programacao.getIde());		
		}
		//Ordenar por IDE
		Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new ComparatorIde());
		linguagem3.addAll(linguagem);
		
		System.out.println("\n---\tOrdenar por IDE:\t---");
		
		for (LinguagemFavorita programacao : linguagem3) {
			System.out.println(programacao.getNome() + " - " 
										+ programacao.getAnoDeCriacao() + " - " + programacao.getIde());
		}
		//Ano de cria��o e nome
		Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
		linguagem4.addAll(linguagem);
		
		System.out.println("\n---\tOrdenar por Ano de cria��o e nome:\t---");
		
		for (LinguagemFavorita programacao : linguagem4) {
			System.out.println(programacao.getNome() + " - " 
										+ programacao.getAnoDeCriacao() + " - " + programacao.getIde());
		}
		
		//Nome, ano de criacao e IDE
		Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
		linguagem5.addAll(linguagem);
		
		System.out.println("\n---\tOrdenar por Nome, ano de criacao e IDE:\t---");
		
		for (LinguagemFavorita programacao : linguagem5) {
			System.out.println(programacao.getNome() + " - " 
										+ programacao.getAnoDeCriacao() + " - " + programacao.getIde());
		}	
	}
}