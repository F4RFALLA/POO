package br.edu.uft.poo.a2024s2.a17092024;
import java.util.Scanner;
import java.util.Locale;

public class Teste6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int numero;
		
		numero = sc.nextInt();
		
		System.out.println("antecessor: " + (numero-1) + ", sucessor: " +(numero+1));
	}
}
