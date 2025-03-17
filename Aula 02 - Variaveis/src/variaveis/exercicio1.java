package variaveis;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite a temperatura em celcius: ");
		double celcius = sc.nextDouble();
		double fahrenheit;
		double kelvin;
		
		fahrenheit = (celcius * 9/5) + 32;
		kelvin = celcius + 273.15;
		
		System.out.println("Temepratura em fahreneit: " + fahrenheit);
		System.out.println("Temepratura em kelvin: " + kelvin);
		
		sc.close();
		
	
	}

}
