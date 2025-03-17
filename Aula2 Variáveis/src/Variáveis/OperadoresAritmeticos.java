package Variáveis;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.next(); // Armazenar valores tipo texto
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt(); // Armazenar valores tipo inteiro
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("O seu nome é: " + nome);
		System.out.println("A sua idade é " + idade + " anos");
		System.out.println("O seu peso é: " + peso + "kg");
		sc.close();
	}

}
