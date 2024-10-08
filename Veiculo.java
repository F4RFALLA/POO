package br.edu.uft.poo.a2024s2.a08102024;

public abstract class Veiculo {
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public abstract void ligar();
}
