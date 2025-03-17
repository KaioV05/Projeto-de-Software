package Variáveis;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Capital Inicial: ");
		double Capital = sc.nextDouble();
		System.out.println("Digite a taxa de juros: ");
		double Juros = sc.nextDouble();
		System.out.println("Digite os meses: ");
		double Meses = sc.nextDouble();
		double J;
		double M;
		M = Capital * (1 + Math.pow(Juros, Meses));
		J = Capital * Juros * Meses;

		
		System.out.println("Os juros simples é " + J);
		System.out.println("O montante final é " + M);
		sc.close();
	}

}
