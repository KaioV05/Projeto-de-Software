package variaveis;

import java.util.Scanner;

public class compras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o valor da sua compra: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Método Pagamento");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Débito");
		System.out.println("3 - Crédito");
		
		int metodoPagamento = sc.nextInt();
		
		
		switch (metodoPagamento) {
		
		case 1:
			double valorFinal = valorCompra * 0.9;
			System.out.println("O valor da sua compra ficou:" + valorFinal);
			break;
		
		case 2:
			valorFinal = valorCompra * 0.95;
			System.out.println("O valor da sua compra ficou:" + valorFinal);
			break;
			
		case 3:
			System.out.println("Metodo parcelamento");
			System.out.println("1 - A vista");
			System.out.println("2 - 2x + 5% de juros");
			System.out.println("3 - 3x + 10% de juros");
			int metodoParcelamento = sc.nextInt();
			
			switch (metodoParcelamento) {
			
			case 1:
				System.out.println("O valor da sua compra ficou: " + valorCompra);
				break;
				
			case 2:
				valorFinal = valorCompra * 1.05;
				System.out.println("O valor da sua compra ficou: " + valorFinal);
				break;
				
				
			case 3:
				valorFinal = valorCompra * 1.1;
				System.out.println("O valor da sua compra ficou: " + valorFinal);
				break;
				 default:
					 
					 System.out.println("Opção inválida");
					 break;
			}
			
			
			break;
			default:
			
			System.out.println("Opção Inválida");
			break;
			}
		
		sc.close();
		
	
	}

}
