package desafios;

import java.util.ArrayList;
import java.util.List;

public class Desafio3 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(5);
        numeros.add(6);
        numeros.add(9);
        numeros.add(5);

        List<Integer> numerosPares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }

        System.out.println("Lista de números: " + numeros);
        System.out.println("Números pares: " + numerosPares);
    }
}

