package Principal;

import entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria vitor = new ContaBancaria("Vitor", 100000);
		ContaBancaria joao = new ContaBancaria("Joao",20000);
		
		vitor.setTitular("Vitor Albertin");
		vitor.setSaldo(500);
		
		
		System.out.println(vitor);
		System.out.println(joao);

	}

}
