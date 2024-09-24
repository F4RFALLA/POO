package TesteParte2;
import java.util.Scanner;
import java.util.Locale;

public class Teste2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		double altura, maiorAltura = 0, menorAltura = 2, mediaHomem = 0;
		int sexo, quantidadeMulher = 0, quantidadeHomem = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira o sexo (1-Masculino 2-Feminino): ");
			sexo = sc.nextInt();
			
			System.out.println("Insira a altura: ");
			altura = sc.nextDouble();
			
			if (sexo == 2) {
				quantidadeMulher++;
			}else {
				quantidadeHomem++;
				mediaHomem += altura;
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			if(altura < menorAltura) {
				menorAltura = altura;
			}
		}
		mediaHomem = mediaHomem/quantidadeHomem;
		System.out.println(maiorAltura + " ," + menorAltura + " ," + mediaHomem + " ," + quantidadeMulher);
		
	}
}
