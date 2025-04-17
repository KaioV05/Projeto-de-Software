package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Banana");
        palavras.add("Maçã");
        palavras.add("Abacate");
        palavras.add("Manga");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a letra que deseja remover das palavras: ");
        String letra = scanner.nextLine().toLowerCase();

        List<String> palavrasFiltradas = new ArrayList<>();

        for (String palavra : palavras) {
            if (!palavra.toLowerCase().contains(letra)) {
                palavrasFiltradas.add(palavra);
            }
        }

        System.out.println("\nPalavras originais: " + palavras);
        System.out.println("Removendo palavras que contêm \"" + letra + "\": " + palavrasFiltradas);
    }
}

