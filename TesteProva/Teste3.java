package br.edu.uft.poo.a2024s2.a17092024;
import java.util.Scanner;
import java.util.Locale;

public class Teste3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		double saldo;
		double reajuste;
		
		System.out.println("Informe o saldo: ");
		saldo = sc.nextDouble();
		
		saldo += saldo*0.01; 
		
		System.out.println("Com o reajuste de 1%: " +saldo);
	}
}
