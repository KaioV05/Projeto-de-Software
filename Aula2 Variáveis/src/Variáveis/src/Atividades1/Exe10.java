package Atividades1;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        while (numero < 0) {
            System.out.print("Por favor, digite um número positivo: ");
            numero = scanner.nextInt();
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}

