package estruturado;

public class ContaMesEstruturada {

	public static void main(String[] args) {
		
		double janAlim, janEnergia, janAgua, FevAlim, FevEnergia, FevAgua;
		
		//Gastos em Janeiro
		janAlim = 1000;
		janEnergia = 300;
		janAgua = 300;
		
		//Gastos em Fevereiro
		FevAlim = 1500;
		FevEnergia = 500;
		FevAgua = 500;
		
		//Total de gastos em ambos os meses
		double gastoJan = janAgua + janAlim + janEnergia;
		double gastoFev = FevAgua + FevAlim + FevEnergia;
		
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
