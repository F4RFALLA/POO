package TesteParte2;
import java.util.Scanner;
import java.util.Locale;

public class Teste3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		int codigo = 1234;
		int senha = 9999; 
		
		System.out.println("digite codigo: ");
		int resposta1= sc.nextInt();
		
		if(resposta1 != codigo) {
			System.out.println("usuario invalido!");
		}
		else {
			System.out.println("insira senha: ");
			int resposta2 = sc.nextInt();
			
			if(resposta2!= senha) {
				System.out.println("senha incorreta");
			}
			else {
				System.out.println("acesso permitido");
			}
		}
	}
}
