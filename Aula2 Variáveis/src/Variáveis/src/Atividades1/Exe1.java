package Atividades1;

import java.util.Random;
import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(10) + 1;

        System.out.print("Tente adivinhar o número (entre 1 e 10): ");
        int tentativa = scanner.nextInt();

        if (tentativa == numeroAleatorio) {
            System.out.println("Parabéns! Você acertou o número.");
        } else {
            System.out.println("Que pena! O número era " + numeroAleatorio + ". Tente novamente!");
        }

        scanner.close();
    }
}
