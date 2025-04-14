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
	
	public void depositar (double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		else {
			System.out.println("Valor depositado inválido");
		}
		
		public void sacar (double valor) {
			if (valor > 0) {
				this.saldo -= valor;
			}
			else {
				System.out.println("Valor sacado inválido");
			}
	}

	@Override
	public String toString() {
		return "Titular: " + titular + 
				"\nSaldo: " + saldo;
	}
	
	
	

}
