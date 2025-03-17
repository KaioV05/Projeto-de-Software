package variaveis;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		double area;
		double perimetro;
		
		area = 3.14 * Math.pow(raio, 2);
		perimetro = 2 * 3.14 * raio;
		
		System.out.println("A área é de: " + area);
		System.out.println("O perímetro é de: " + perimetro);
		
		
		sc.close();

	}

}
