package EstruturasCondicionais;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor da sua compra: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Metodo Pagamento");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Debito");
		System.out.println("3 - Credito");
		int metodoPagamento = sc.nextInt();
		
		switch (metodoPagamento) {
		   case 1:
			   double valorFinal = valorCompra * 0.9;
			   System.out.println("O valor da sua compra ficou R$ " + valorFinal);
			   break;
		   case 2:
			   valorFinal = valorCompra * 0.95;
			   System.out.println("O valor da sua compra ficou R$ " + valorFinal);
			   break;
		   case 3:
				System.out.println("1 - A vista");
				System.out.println("2 - 2 Parcelas");
				System.out.println("3 - 3 Parcelas");
				metodoPagamento = sc.nextInt();
				if (metodoPagamento == 1) {
					 System.out.println("O valor da sua compra ficou R$ " + valorCompra);
				}
				else if (metodoPagamento == 2) {
					valorFinal = valorCompra * 5;
					   System.out.println("O valor da sua compra ficou R$ " + valorFinal);
				}
				else if (metodoPagamento == 3) {
					valorFinal = valorCompra * 10;
					   System.out.println("O valor da sua compra ficou R$ " + valorFinal);
				}
				
		
			   break;
		   default:
				System.out.println("Opcao Inválida");
				break;
		
		}
		
		sc.close();

	}

}
