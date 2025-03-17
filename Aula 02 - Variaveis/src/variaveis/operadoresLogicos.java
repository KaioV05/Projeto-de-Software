package variaveis;

import java.util.Scanner;

public class operadoresLogicos {

	public static void main(String[] args) {
		
		// and - &&
		// or - ||
		// not - !
		
		Scanner sc = new Scanner (System.in);

		
		String loginsalvo = "bkatriz";
		String senhasalva = "1234";
		
		
		System.out.println("Digite seu login:");
		String login = sc.nextLine();
		
		System.out.println("Digite sua senha:");
		String senha = sc.nextLine();
	
		
		if (login.equals(loginsalvo) && senha.equals(senhasalva)) {
			
			System.out.println("Acesso liberado!");}
		 
		else {
		System.out.println("Acesso megado :(");
		}
		

		sc.close();
	}

}
