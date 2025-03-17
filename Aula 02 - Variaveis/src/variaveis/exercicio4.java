package variaveis;

import java.util.Scanner;

public class exercicio4 {

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
		 
		 
		 double jurossimples;
		 jurossimples = capital * taxajuros * tempo;
		 
		 double montante = capital + taxajuros;
		 
		 
		 System.out.printf("Valor dos juros: R$ %.2f%n" , taxajuros);
		 System.out.printf("Montante total: R$ %.2f%n" , montante);
		 
		 sc.close();

	}

}
