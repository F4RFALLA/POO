package br.edu.uft.poo.a2024s2.a17092024;
import java.util.Scanner;
import java.util.Locale;
public class Teste1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		int ano, mes, dia, total;
		
		ano = sc.nextInt();
		mes = sc.nextInt();
		dia = sc.nextInt();
		
		total = ano*365 + mes*30 + dia;
		
		System.out.println(ano + " anos, " + mes + " meses, " + dia + " dias = " + total + " dias");
	}
}
