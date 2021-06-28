package curso.java.collections.list.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgramaGato {

	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>(){{
			add(new Gato("Jon", 12, "preto"));	
			add(new Gato("Simba", 6, "tigrado"));	
			add(new Gato("Jon", 18, "amarelo"));	
		}};
//		meusGatos.sort(Comparator.comparing(Gato :: getNome));
		
		System.out.println("---\tOrdem de Inserção\t---");
		System.out.println(meusGatos);
		
		//Collections.shuffle --> ordenação randomica dos elementos da lista
		System.out.println("---\tOrdem aleatória\t---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);

		//Collections.sort --> ordena a lista de forma ascendente, 
		//precisa da implementacao do método compareTo da interface Comparable
		System.out.println("---\tOrdem natural\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		//Usando a interface comparator para a implemetacao dos metodos de comparacao seguintes
		System.out.println("---\tOrdem por idade\t---");
//		Collections.sort(meusGatos, new ComparatorIdade()); //---> funciona tanto com Collections quanto 
		meusGatos.sort(new ComparatorIdade()); 				 //com esta implementacao
		System.out.println(meusGatos);

		System.out.println("---\tOrdem por cor\t---");
		Collections.sort(meusGatos, new ComparatorCor()); //---> funciona tanto com Collections quanto 
//		meusGatos.sort(new ComparatorCor()); 			  //---> com esta implementacao
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem por nome, cor e idade\t---");
//		Collections.sort(meusGatos, new ComparatorNomeCorIdade()); //---> funciona tanto com Collections quanto 
		meusGatos.sort(new ComparatorNomeCorIdade()); 				  //com esta implementacao
		System.out.println(meusGatos);
}}
