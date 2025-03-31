package entidades;

public class ContaBancaria {
	
	//Atributos
	private String titular;
	private double saldo;
	
	//Metodos
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String setTitular(String titular) {
		return this.titular = titular;
	}
	
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Titular: " + titular + 
				"\nSaldo: " + saldo;
	}
	

}
