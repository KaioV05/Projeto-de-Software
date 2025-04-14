package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		// Tipos Primitivos - int, double, char
		// Objetos - String, Integer, Double
		
		List <String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Gustavo");
		listaNomes.add("Bia");
		listaNomes.add("Kaio");
		listaNomes.add("Samira");
		listaNomes.add("Renato");
		
		//Adicionando em uma posição desejada
		listaNomes.add(1, "Henry");
		
		//Verifica o tamanho da lista
		System.out.println(listaNomes.size());
		
		//Remover um item da lista pelo valor
		listaNomes.remove("Gustavo");
		
		//Remover pela posição
		listaNomes.remove(0);
		
		//Percorrer a Array e os Vetores
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		


	}

}
