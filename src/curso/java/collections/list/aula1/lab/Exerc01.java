package curso.java.collections.list.aula1.lab;

import java.util.LinkedList;

public class Exerc01 {

	public static void main(String[] args) {
		System.out.println("=========== Exercicios ===========");
		/*
		 * Utilize os métodos do LinkedList e resolva: 1. Crie uma list notas2 e coloque
		 * os elementos da list ArrayList na nova lista 2. Mostre a primeira nota sem
		 * removê-la 3. Mostre a primeira nota e remova-a
		 */
		System.out.println("Lista notas2");

		LinkedList<Double> notas2 = new LinkedList<>();
		
		notas2.add(7.0);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);
		notas2.add(0.0);
		notas2.add(3.6);
		
		System.out.println(notas2);

		System.out.println("Mostre a primeira nota sem removê-la: " + notas2.peekFirst());
		System.out.println(notas2);

		System.out.println("Mostre a primeira nota e remova-a: " + notas2.pollFirst());
		System.out.println(notas2);
	}
}