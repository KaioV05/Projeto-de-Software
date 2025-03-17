package Variáveis;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		double r = sc.nextDouble();
		double a;
		double p;
		a = 3.14 * Math.pow(r, 2);
		p = 2 * 3.14 * r;
		System.out.println("A área é: " + a);
		System.out.println("O perímetro é: " + p);
		sc.close();
	}

}
