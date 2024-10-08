package br.edu.uft.poo.a2024s2.a08102024;

//aplicação de herança
public class Carro extends Veiculo {
	//como o confereCombustivel e conferindoCambio está privado, o método ligar está encapsulando o confereCombustivel e o conferindoCambio e quando o ligar for chamado
	//ele vai usar os métodos
	public void ligar() {
		confereCombustivel();
		conferindoCambio();
		System.out.println("Carro LIGADO");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	
	private void conferindoCambio() {
		System.out.println("Câmbio no P tá ok");
	}
}
