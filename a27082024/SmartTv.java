package br.edu.uft.poo.a2024s2.a27082024;

public class SmartTv {
	boolean ligada = false; //se tiver ligada vai retornar "true" 
	int canal = 1;
	int volume = 30;
	
	public void mudarCanal(int novoCanal){
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
}
