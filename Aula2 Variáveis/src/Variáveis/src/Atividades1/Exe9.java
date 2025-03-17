package Atividades1;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero, somaPares = 0, somaImpares = 0;

        System.out.println("Digite números inteiros (0 para sair):");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("Número par!");
                somaPares += numero;
            } else {
                System.out.println("Número ímpar!");
                somaImpares += numero;
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        scanner.close();
    }
}

