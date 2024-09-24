package br.edu.uft.poo.a2024s2.a10092024;

public class ExemploBreak {
	public static void main(String[] args) {
		for (int numero = 1; numero <= 5; numero++) {
			if(numero==3)
					//break;
					continue;
			
			System.out.println(numero);
		}
	}
}
