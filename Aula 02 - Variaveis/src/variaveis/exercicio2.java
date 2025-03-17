package variaveis;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o capial inicial: ");
		double capital = sc.nextDouble();
		
		System.out.println("Digite os juros em %: ");
		double taxajuros = sc.nextDouble();
		
		System.out.println("Digite o tempo em meses: ");
		double tempo = sc.nextDouble();
		
		double decimal;
		 decimal = taxajuros /100;
		 
		 double montante = capital * Math.pow(( 1 + decimal), tempo);
		 
		 System.out.printf("O montante final é de: R$ %.2f%n", tempo, montante);
		 
		 sc.close();
		
		

	}

}
