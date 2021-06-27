package curso.java.collections.list.aula1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemplosList {

	public static void main(String[] args) {
//Dada uma lista com 7  notas de um aluno (7, 8.5, 9.3, 5, 7, 0, 3.6), faca:

//Formas de implementacao
//	List notas = new ArrayList(); //antes do Java 5
//	ArrayList<Double> notas = new ArrayList<>();
//	List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

		/*
		 * List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		 * notas.add(10d); --> erro de execucao ao adicionar dados na lista
		 * System.out.println(notas);
		 */

		/*
		 * List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); notas.add(1d);
		 * notas.remove(5d); System.out.println(notas); //erro de execucao ao manipuar
		 * os dados (insercao ou remocao)
		 */

		System.out.println("Cire uma lista e adicione sete notas: ");
		List<Double> notas = new ArrayList<>(); // Generic (jdk 5) - Diamond operator (jdk 7) --> mais usada na
												// programacao
		// add --> para insercao de dados
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);

		// toString --> para exibicao na tela formato string
		System.out.println(notas.toString());

		// indexOf --> retorna o indice de um ou de todos os elementos
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

		// add --> insercao de um elemento numa posicao especifica
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d); // --> 4 = indice e 8.0 = elemento
		System.out.println(notas);

		// set --> atualizacao de um elemento numa determinada posicao
		System.out.println("Substitua a nota 5.0 pela nota 6.0:");
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println(notas);

		// contains --> retorna boolean (true or false) se determinado elemento existe
		// na lista
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

		// for ... each --> exibir os elementos na ordem em que foram inseridos
		// iteracao sequencial de notas e devolucao em novo objeto (nota) com valor de
		// cada elemento
		System.out.println("Exiba todas as notas na ordem em que foram inseridos:");
		for (Double nota : notas) {
			System.out.println(nota);
		}
		// get --> retorna um elemento de um indice especifico
		System.out.println("Exiba a terceira nota: " + notas.get(2));
		System.out.println(notas.toString());

		// Collections.min --> não existem métodos nativos em List para
		// comparacao de valores minimos e maximos
		// porém sendo List uma Collection
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
		System.out.println("Exiba a média dos valores: " + (soma / notas.size()));

		// remove --> pode ser usado para remocao pelo elemento ou indice
		System.out.println("Remova a nota 0.0");
		notas.remove(0.0); // remocao do elemento 0.0 ou 0d
		System.out.println(notas);

		System.out.println("Remova a nota na posição 0");
		notas.remove(0);
		System.out.println(notas);

		// Remocao de uma colecao de elementos
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7)
				iterator1.remove();
		}
		System.out.println(notas);

		// clear --> apagar toda a lista
		/*
		 * System.out.println("Apague toda a lista"); notas.clear();
		 * System.out.println(notas);
		 */

		// isEmpty --> retorna boolean (true or false) para validacao se a lista
		// encontra-se vazia ou nao
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
	}
}
