package br.edu.uft.poo.a2024s2.a24092024;
import java.util.Scanner;
import java.util.Locale;

public class Nomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int i, n = 10;
		String [] nome = new String[10];
		
		for (i=0; i<n; i++){
			nome[i] = sc.next();
		}
		
		System.out.println(nome[2]);
		System.out.println(nome[7]);
		System.out.println(nome[8]);
	}
}
