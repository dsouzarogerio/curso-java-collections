package curso.java.collections.list.aula2.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	//Dada uma lista com 7  notas de um aluno (7, 8.5, 9.3, 5, 7, 0, 3.6), faca:

	public static void main(String[] args) {
/*
 *  Implementa��es
 * Set notas = new HashSet(); --> antes do Java 5
 * HashSet<Double> notas = new HashSet<>();
 * Set<Double> notas = new HashSet<>(); //--> Generics (jdk5) - Diamond Operator(jdk7)
 * 
 */
		//--> Set n�o aceita elementos duplicados 
//		Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); 		
//		notas.add(1d);
//		notas.add(1d);
//		System.out.println(notas);
		
			System.out.println("Crie um conjunto e adicione as notas:");
			//Elementos ser�o impressos em ordem aleat�ria
			//Elementos duplicados n�o ser�o impressos
			Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
			System.out.println(notas.toString());
			
			//indexOf --> Set n�o trabalha com indice, n�o � poss�vel fazer a pesquisa
//			System.out.println("Exiba a posi��o da nota 5.0: " + notas.indexOf(5.0));

				// n�o se trabalha com indice(posi��o) no Set
//				System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");

				// set --> n�o h� como fazer atualizacao usando Set
//				System.out.println("Substitua a nota 5.0 pela nota 6.0:");
//				notas.set(notas.indexOf(5.0), 6.0);
//				System.out.println(notas);

				// contains --> retorna boolean (true or false) se determinado elemento existe
				// na lista
				System.out.println("Confira se a nota 5.0 est� na lista: " + notas.contains(5.0));

				// get --> n�o consegue executar o m�todo em Set apenas em List
//				System.out.println("Exiba a terceira nota: " + notas.get(2));
//				System.out.println(notas.toString());
				
				// Collections.min/max --> n�o existem m�todos nativos em Set para
				// comparacao de valores minimos e maximos
				// por�m sendo Set uma Collection
				// pode-se utilizar metodos de Collections na implementacao
				System.out.println("Exiba a menor nota: " + Collections.min(notas));
				// Collections.max
				System.out.println("Exiba a maior nota: " + Collections.max(notas));
				
				// Soma de valores
				Iterator<Double> iterator = notas.iterator();
				Double soma = 0d;
				while (iterator.hasNext()) {
					Double next = iterator.next();
					soma += next;
				}
				System.out.println("Exiba a soma dos valores: " + soma);

				// Media dos valores
				System.out.println("Exiba a m�dia dos valores: " + (soma / notas.size()));

				// remove --> pode ser usado para remocao pelo elemento ou indice
				System.out.println("Remova a nota 0.0");
				notas.remove(0.0); // remocao do elemento 0.0 ou 0d
				System.out.println(notas);

				// remove na posi��o --> n�o pode ser usado pois Set n�o � indexado
//				System.out.println("Remova a nota na posi��o 0");
//				notas.remove(0);
//				System.out.println(notas);

				// Remocao de uma colecao de elementos
				Iterator<Double> iterator1 = notas.iterator();
				while (iterator1.hasNext()) {
					Double next = iterator1.next();
					if (next < 7)
						iterator1.remove();
				}
				System.out.println(notas);

				//Implementando o conjunto com LinkedHasSet
				//Exibir os elementos na ordem em que foram inseridos
				System.out.println("Exiba todas as notas na ordem em que foram inseridos:");
				Set<Double> notas2 = new LinkedHashSet<>();
				notas2.add(7.0);
				notas2.add(8.5);
				notas2.add(9.3);
				notas2.add(5.0);
				notas2.add(7.0);
				notas2.add(0.0);
				notas2.add(3.6);
				
				System.out.println(notas2);

				//Implementando o conjunto com TreeSet
				//Exibir os elementos na ordem crescente
				System.out.println("Exiba todas as notas na ordem crescente:");
				Set<Double> notas3 = new TreeSet<>(notas2);
				System.out.println(notas3);
				
				// clear --> apagar um conjunto		
				System.out.println("Apague todo o conjunto"); 
				notas.clear();
				System.out.println(notas);
				
				// isEmpty --> retorna boolean (true or false) para validacao se a lista
				// encontra-se vazia ou nao
				System.out.println("Confira se o conjunto est� vazio notas1: " + notas.isEmpty());
				System.out.println("Confira se o conjunto est� vazio notas2: " + notas2.isEmpty());
				System.out.println("Confira se o conjunto est� vazio: notas3" + notas3.isEmpty());
			}
		}