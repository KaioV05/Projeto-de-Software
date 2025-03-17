package Atividades1;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.println("Escolha a moeda para a qual deseja converter:");
        System.out.println("1 - Dólar (R$ 1 = US$ 0.20)");
        System.out.println("2 - Euro (R$ 1 = € 0.18)");
        System.out.println("3 - Libra (R$ 1 = £ 0.15)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double valorConvertido;
        String moeda = "";

        switch (opcao) {
            case 1:
                valorConvertido = valorReais * 0.20;
                moeda = "dólares (US$)";
                break;
            case 2:
                valorConvertido = valorReais * 0.18;
                moeda = "euros (€)";
                break;
            case 3:
                valorConvertido = valorReais * 0.15;
                moeda = "libras (£)";
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                scanner.close();
                return;
        }

        System.out.printf("O valor convertido é: %.2f %s\n", valorConvertido, moeda);

        scanner.close();
    }
}

