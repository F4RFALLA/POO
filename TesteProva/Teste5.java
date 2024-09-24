package br.edu.uft.poo.a2024s2.a17092024;
import java.util.Scanner;
import java.util.Locale;

public class Teste5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		double salarioMinimo, salario;
		
		System.out.println("Insira o valor do salário mínimo: ");
		salarioMinimo = sc.nextDouble();
		
		System.out.println("Insira o valor do salário: ");
		salario = sc.nextDouble();
		
		System.out.println(salario/salarioMinimo + "SM = R$ " +salarioMinimo);
	}
}
