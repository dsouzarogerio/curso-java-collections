package curso.java.collections.list.aula2.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto02 {

	public static void main(String[] args) {
//		Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 
//		As perguntas são: 
//			"Telefonou para a vítima?"
//			"Esteve no local do crime?"
//			"Mora perto da vítima?"
//			"Devia para a vítima?"
//			"Já trabalhou com a vítima?" 
//		Se a pessoa responder positivamente a:
//		2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" 
//		e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente". 

		List<String> respostas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		System.out.println("----\t Perguntas\t----");
		System.out.println("Telefonou para a vítima?");
		String resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		respostas.add(resposta.toLowerCase());

		System.out.println("Já trabalhou com a vítima?");
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
			System.out.println("CÚMPLICE");
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
