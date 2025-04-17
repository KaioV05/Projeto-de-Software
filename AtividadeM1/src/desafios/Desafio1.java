package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();
        nomes.add("Bia");
        nomes.add("Kaio");
        nomes.add("Renato");
        nomes.add("Samira");
        nomes.add("Sarah");

        System.out.print("Digite a letra para filtrar os nomes: ");
        String letra = scanner.nextLine().toUpperCase();

        List<String> nomesFiltrados = new ArrayList<>();

        for (String nome : nomes) {
            if (nome.toUpperCase().startsWith(letra)) {
                nomesFiltrados.add(nome);
            }
        }

        System.out.println("\nNomes encontrados que começam com \"" + letra + "\": " + nomesFiltrados);
        System.out.println("Total de nomes: " + nomesFiltrados.size());

        scanner.close();
    }
}
