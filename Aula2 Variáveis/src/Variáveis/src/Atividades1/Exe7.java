package Atividades1;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double ladoC = scanner.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Os valores informados formam um triângulo válido.");

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("O triângulo é Equilátero (todos os lados iguais).");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O triângulo é Isósceles (dois lados iguais).");
            } else {
                System.out.println("O triângulo é Escaleno (todos os lados diferentes).");
            }
        } else {
            System.out.println("Os valores informados NÃO formam um triângulo válido.");
        }

        scanner.close();
    }
}

