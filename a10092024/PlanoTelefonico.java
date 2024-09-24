
package br.edu.uft.poo.a2024s2.a10092024;
import java.util.Scanner;

public class PlanoTelefonico {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String plano;
		
		System.out.println("Digite o plano desejado? (BASIC, MIDIA, TURBO): ");
		plano = sc.next();
		
		switch(plano) {
		
		case "BASIC":{
			System.out.println("100 minutos de ligação");
			break;
		}
		
		case "MIDIA":{
			System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis");
			break;
		}
		
		case "TURBO":{
			System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis + 5GB de YouTube");
			break;
		}
		
		default:
			System.out.println("Plano não existente");
		}
		
	}
}
