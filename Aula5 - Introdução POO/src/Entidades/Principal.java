package Entidades;

public class Principal {

	public static void main(String[] args) {
		
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EUB-6530";
		civic.ano = 2022;
		civic.cor = "Preto";
		civic.acelera();
		civic.exibirInfo();
		
		Carro kicks = new Carro();
		
		kicks.fabricante = "Nissan";
		kicks.modelo = "Kicks Sv";
		kicks.placa = "KLF-6830";
		kicks.ano = 2023;
		kicks.cor = "Prata";
		kicks.acelera();
		kicks.exibirInfo();
		
		Carro EcoSport = new Carro();
		
		EcoSport.fabricante = "Ford";
		EcoSport.modelo = "EcoSport";
		EcoSport.placa = "EGA-1234";
		EcoSport.ano = 2018;
		EcoSport.cor = "Preto";
		EcoSport.acelera();
		EcoSport.exibirInfo();
		
		

	}

}
