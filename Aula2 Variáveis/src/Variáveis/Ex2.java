package Variáveis;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Capital Inicial: ");
		double Capital = sc.nextDouble();
		System.out.println("Digite a taxa de juros: ");
		double Juros = sc.nextDouble();
		System.out.println("Digite os meses: ");
		double Meses = sc.nextDouble();
		double M;
		M = Capital * (1 + Math.pow(Juros, Meses));

		
		System.out.printf("%.2f", + M);
		sc.close();
	}

}
