package Atividades1;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Escolha o número de parcelas:");
        System.out.println("6 meses (+5%)");
        System.out.println("12 meses (+10%)");
        System.out.println("24 meses (+20%)");
        System.out.print("Opção: ");
        int parcelas = scanner.nextInt();

        double valorFinal;

        switch (parcelas) {
            case 6:
                valorFinal = valorEmprestimo * 1.05;
                break;
            case 12:
                valorFinal = valorEmprestimo * 1.10;
                break;
            case 24:
                valorFinal = valorEmprestimo * 1.20;
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                scanner.close();
                return;
        }

        System.out.printf("O valor total a ser pago em %d meses é: R$ %.2f\n", parcelas, valorFinal);

        scanner.close();
    }
}
