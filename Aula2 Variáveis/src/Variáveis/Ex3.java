package Variáveis;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		double n2 = sc.nextDouble();
		System.out.println("Digite a nota 3: ");
		double n3 = sc.nextDouble();
		double media;
		media = (n1 + n2 + n3)/3;
		
		System.out.printf("O valor da média do aluno é: " + media);
		sc.close();
	}

}
