package br.edu.uft.poo.a2024s2.a24092024;
import java.util.Scanner;
import java.util.Locale;

public class DesafioPedraPapelTesoura {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		String resposta1, resposta2;
		int i, n;
		
		n = sc.nextInt();
		
		for(i = 0; i<n; i++) {
			resposta1 = sc.next();
			resposta2 = sc.next();
			
			if (resposta1.equals("ataque")&& resposta2.equals("pedra")) {
				System.out.println("Jogador 1 venceu");
			}
			if (resposta1.equals("pedra")&& resposta2.equals("ataque")) {
				System.out.println("Jogador 2 venceu");
			}
			if (resposta1.equals("pedra")&& resposta2.equals("papel")) {
				System.out.println("Jogador 1 venceu");
			}
			if (resposta1.equals("papel")&& resposta2.equals("pedra")) {
				System.out.println("Jogador 2 venceu");
			}
			if (resposta1.equals("papel")&& resposta2.equals("ataque")) {
				System.out.println("Jogador 2 venceu");
			}
			if (resposta1.equals("ataque")&& resposta2.equals("papel")) {
				System.out.println("Jogador 1 venceu");
			}
			if (resposta1.equals("papel")&& resposta2.equals("papel")) {
				System.out.println("Ambos venceram");
			}
			if (resposta1.equals("pedra")&& resposta2.equals("pedra")) {
				System.out.println("Sem ganhador");
			}
			if (resposta1.equals("ataque")&& resposta2.equals("ataque")) {
				System.out.println("Aniquilação mútua");
			}
		}
	}
}
