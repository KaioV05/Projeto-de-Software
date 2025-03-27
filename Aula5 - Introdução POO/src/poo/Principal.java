package poo;

public class Principal {

	public static void main(String[] args) {
		
		ContaMes janeiro = new ContaMes();
		ContaMes fevereiro = new ContaMes();
		
		janeiro.agua = 300;
		janeiro.alimentacao = 1000;
		janeiro.luz = 300;
		
		fevereiro.agua = 250;
		fevereiro.alimentacao = 1280;
		fevereiro.luz = 220;
		
		double gastoJan = janeiro.somaConta();
		double gastoFev = fevereiro.somaConta();
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de janeiro foi maior");
		}
		else if (gastoFev > gastoJan) {
			System.out.println("O gasto de fevereiro foi maior");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
		
		

	}

}
