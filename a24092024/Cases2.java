package br.edu.uft.poo.a2024s2.a24092024;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cases2 {
			
	public static void main(String[] args) {
		Case2();
	}
	
	static void Case2(){
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int salarioBase = 2000;
		int salarioPretendido;
		String [] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
		
		System.out.println("Qual o slário desejado? ");
		salarioPretendido = sc.nextInt();
		
		if (salarioBase > salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO");
		else if (salarioBase == salarioPretendido) 
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		else 
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDITADOS");
	}
	
	//método que simula valor pretendido
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}
