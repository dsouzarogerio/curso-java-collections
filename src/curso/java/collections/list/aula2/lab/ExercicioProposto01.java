package curso.java.collections.list.aula2.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import curso.java.collections.list.aula2.Gato;

public class ExercicioProposto01 {

	public static void main(String[] args) {
//		Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano e armazene-as em uma lista. 
//		Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia, e em que m�s elas
//		ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).

		Scanner scan = new Scanner(System.in);
		List<Double> temperaturaSemestral = new ArrayList<>();

		double soma = 0.0;

		for (int i = 1; i <= 6; i++) {
			System.out.println("Digite a temperatura do m�s " + i + " : ");
			double temp = scan.nextDouble();
			temperaturaSemestral.add(temp);
			soma += temp;
		}
		double mediaTemp = soma / temperaturaSemestral.size();

		System.out.println("Temperatura semestral: " + temperaturaSemestral);
		System.out.println("Media temperatura semestral: " + mediaTemp);

		for (Double temp : temperaturaSemestral) {
			if (temp > mediaTemp) {
				int index = temperaturaSemestral.indexOf(temp);

				switch (index) {
				case 0:
					System.out.println((index + 1) + " - Janeiro: " + temp + "�C");
					break;
				case 1:
					System.out.println((index + 1) + " - Fevereiro: " + temp + "�C");
					break;
				case 2:
					System.out.println((index + 1) + " - Mar�o: " + temp + "�C");
					break;
				case 3:
					System.out.println((index + 1) + " - Abril: " + temp + "�C");
					break;
				case 4:
					System.out.println((index + 1) + " - Maio: " + temp + "�C");
					break;
				case 5:
					System.out.println((index + 1) + " - Junho: " + temp + "�C");
					break;
				default:
					break;
				}
			}
		}
	}
}