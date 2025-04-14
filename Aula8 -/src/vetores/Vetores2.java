package vetores;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		
		//Criando vetores
		double [] notasAlunos = new double [3];
		Scanner sc = new Scanner(System.in);
		
		//Atrbuir valores laço for
		
		for(int i = 0; i < notasAlunos.length; i++) {
			
			System.out.println("Informe uma nota entre 0 a 10");
			double nota = sc.nextDouble();
			
			//Criar uma validação para inserir somente notas maiores que 10 e menores que 0
			notasAlunos[i] = nota;
			
			if (nota >= 0 && nota <= 10) {
				notasAlunos[i] = nota;
			}

			else {
				System.out.println("Nota Inválida");
			}
			
			for (double notas : notasAlunos) {
				System.out.println(nota);
				break;  
			}
		}
		
		sc.close();
		

	}

}
