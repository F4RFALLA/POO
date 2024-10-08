package br.edu.uft.poo.a2024s2.a08102024;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		
		jeep.ligar();
		jeep.setChassi("hjjygh");
		
		Moto z900 = new Moto();
		z900.setChassi("gaga5gaga5gaga");
		z900.ligar();
		
		
		Veiculo coringa = jeep;
		//Veiculo coringa = z900;
		coringa.ligar();
	}
}
