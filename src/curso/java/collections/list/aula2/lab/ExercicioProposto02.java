package curso.java.collections.list.aula2.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto02 {

	public static void main(String[] args) {
//		Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. 
//		As perguntas s�o: 
//			"Telefonou para a v�tima?"
//			"Esteve no local do crime?"
//			"Mora perto da v�tima?"
//			"Devia para a v�tima?"
//			"J� trabalhou com a v�tima?" 
//		Se a pessoa responder positivamente a:
//		2 quest�es ela deve ser classificada como "Suspeita", entre 3 e 4 como "C�mplice" 
//		e 5 como "Assassina". Caso contr�rio, ela ser� classificado como "Inocente". 

		List<String> respostas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		System.out.println("----\t Perguntas\t----");
		System.out.println("Telefonou para a v�tima?");
		String resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("Mora perto da v�tima?");
		resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("Devia para a v�tima?");
		resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("J� trabalhou com a v�tima?");
		resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println(respostas);

		int cont = 0;
		Iterator<String> contador = respostas.iterator();
		while (contador.hasNext()) {
			String resp = contador.next();
			if (resp.contains("s")) {
				cont++;
			}
		}
		switch (cont) {
		case 2:
			System.out.println("SUSPEITO(A)");
			break;
		case 3:
		case 4:
			System.out.println("C�MPLICE");
			break;
		case 5:
			System.out.println("ASSASSINO(A)");
			break;
		default:
			System.out.println("INOCENTE");
			break;

		}
	}

}
