package EstruturasCondicionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A sua media foi de: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if (media >= 5) {
			System.out.println("Recuperação");
			
			System.out.print("Digite a nota da recuperação: ");
			double notaRec = sc.nextDouble();
			
			double mediaf = (media + notaRec) / 2;
			
			if(mediaf >= 7){
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}
		else {
			System.out.println("Reprovado");
		}
		
		sc.close();
		
		
	}

}
