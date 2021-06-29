package curso.java.collections.list.aula2.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto03 {

	public static void main(String[] args) {
		
		/*
		 * Crie um conjunto contendo as cores do arco-íris
		 * (violeta, anil, azul, verde, amarelo, laranja e vermelho)
		 */
		
		Set<String> arcoIris = new HashSet<>();
		arcoIris.add("violeta");
		arcoIris.add("anil");
		arcoIris.add("azul");
		arcoIris.add("verde");
		arcoIris.add("amarelo");
		arcoIris.add("laranja");
		arcoIris.add("vermelho");
		
		System.out.println(arcoIris);

		// Exiba todas as cores uma abaixo da outra
		for (String iris : arcoIris)
		System.out.println(iris);

		// A quantidade de cores que o arco-íris tem
		System.out.println(arcoIris.size());

		// Exiba as cores em ordem alfabética
		Set<String> arcoIris1 = new TreeSet<>(arcoIris);
		System.out.println(arcoIris1);

		// Exiba as cores na ordem inversa da que foi informada
		Set<String> arcoIris2 = new LinkedHashSet<>(arcoIris1);
		
		List<String> arcoIrisList = new ArrayList<>(arcoIris2);
		Collections.reverse(arcoIrisList);
		System.out.println("Ordem inversa: " + arcoIrisList);

		System.out.println("Exiba todas as cores que começam com a letra v: "); 
		for(String cor : arcoIris) {
			if(cor.startsWith("v")) System.out.println(cor);
		}
		
		//Remova todas as cores que não começam com a letra “v”
		Iterator<String> iterator = arcoIris.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (!(next.startsWith("v"))) 
				iterator.remove(); 		
			}
		System.out.println(arcoIris);
		
		//Limpe o conjunto
		arcoIris.clear();
		System.out.println(arcoIris);
		
		//Confira se o conjunto está vazio
		System.out.println("O conjunto 1 está vazio? " + arcoIris.isEmpty());
		System.out.println("O conjunto 2 está vazio? " + arcoIris1.isEmpty());
		System.out.println("O conjunto 3 está vazio? " + arcoIris2.isEmpty());
		System.out.println("A lista de arco iris está vazia? " + arcoIrisList.isEmpty());
		}}
