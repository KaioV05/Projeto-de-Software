package Variáveis;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Celsius: ");
		double Celsius = sc.nextDouble();
		double Fahrenheit;
		double Kelvin;
		Fahrenheit = (Celsius * 9/5) + 31;
		Kelvin = Celsius + 273.15;
		
		System.out.println("O valor em Fahrenheit: " + Fahrenheit);
		System.out.println("O valor em Kelvin: " + Kelvin);
		sc.close();
	}

}
