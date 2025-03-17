package Atividades1;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o número de itens adquiridos: ");
        int numItens = scanner.nextInt();

        double desconto = 0;

        if (valorCompra > 1000) {
            desconto = 0.20;
        } else if (valorCompra > 500 || numItens > 5) {
            desconto = 0.10;
        } else if (valorCompra > 300 || numItens > 3) {
            desconto = 0.05;
        }

        double valorFinal = valorCompra - (valorCompra * desconto);

        System.out.printf("Valor final da compra: R$ %.2f (Desconto aplicado: %.0f%%)\n", valorFinal, desconto * 100);

        scanner.close();
    }
}

