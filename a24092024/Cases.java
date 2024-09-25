package br.edu.uft.poo.a2024s2.a24092024;
import java.util.Scanner;
import java.util.Locale;

public class Cases {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		int salarioBase = 2000;
		int salarioPretendido;
		
		System.out.println("Qual o slário desejado? ");
		salarioPretendido = sc.nextInt();
		
		if (salarioBase > salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO");
		else if (salarioBase == salarioPretendido) 
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		else 
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDITADOS");
	}
}