package Atv2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Roupas> roupas = new ArrayList<>();
        
        boolean continuar = true;
        while (continuar) {
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            
            System.out.print("Tipo: ");
            String tipo = scanner.nextLine();
            
            System.out.print("Tamanho: ");
            String tamanho = scanner.nextLine();
            
            System.out.print("Quantidade inicial: ");
            int quantidade = scanner.nextInt();
            
            System.out.print("Valor unitário: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); 
            
            Roupas roupa = new Roupas(marca, tipo, tamanho, quantidade, valor);
            roupas.add(roupa);
            
            System.out.print("Deseja adicionar mais roupas? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        
        System.out.println("\nInformações das roupas cadastradas:");
        for (Roupas r : roupas) {
            r.exibirInformacoes();
        }
        
        scanner.close();
    }
}
