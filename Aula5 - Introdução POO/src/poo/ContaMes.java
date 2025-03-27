package poo;

public class ContaMes {
	
	double alimentacao;
	double luz;
	double agua;
	
	//Métodos
	
	public double somaConta() {
		double gastoMes = alimentacao + luz + agua;
		return gastoMes;
	}

}
