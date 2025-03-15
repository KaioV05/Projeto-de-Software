package Atividades1;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite quantos anos de experiência como motorista você tem: ");
        int experiencia = scanner.nextInt();

        double valorSeguro;

        if (idade < 25 && experiencia < 2) {
            if (sexo == 'M') {
                valorSeguro = 2000;
            } else {
                valorSeguro = 1800;
            }
        } else {
            valorSeguro = 1200;
        }

        System.out.printf("O valor do seguro é: R$ %.2f\n", valorSeguro);

        scanner.close();
    }
}

