package br.edu.uft.poo.a2024s2.a10092024;

public class SistemaMedia {
	public static void main (String[] args) {
		String sigla = "M";
		
		switch(sigla) {
		
		case "p":{
			System.out.println("PEQUENO");
			break;
		}
		
		case "M":{
			System.out.println("MEDIO");
			break;
		}
		
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		
		default:
			System.out.println("INDEFINIDO");
		}
	}
}
