package br.edu.uft.poo.a2024s2.a17092024;
import java.util.Scanner;
import java.util.Locale;

public class Teste4 {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		double ipi, valorUnitarioPeca1, valorUnitarioPeca2, total = 0;
		int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
		
		System.out.println("Insira a porcentagem IPI: ");
		ipi = sc.nextDouble();
		
		System.out.println("Insira código da peça 1: ");
		codigoPeca1 = sc.nextInt();
		
		System.out.println("Insira valor unitário da peça 1: ");
		valorUnitarioPeca1 = sc.nextDouble();
		
		System.out.println("Insira quantidade da peça 1: ");
		quantidadePeca1 = sc.nextInt();
		
		System.out.println("Insira código da peça 2: ");
		codigoPeca2 = sc.nextInt();
		
		System.out.println("Insira valor unitário da peça 2: ");
		valorUnitarioPeca2 = sc.nextDouble();
		
		System.out.println("Insira quantidade da peça 2: ");
		quantidadePeca2 = sc.nextInt();
		
		total = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2) * (ipi/100 + 1);
		
		System.out.println("o total da compra é: "+total);
	}
}
