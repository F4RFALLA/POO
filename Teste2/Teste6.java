package TesteParte2;
import java.util.Scanner;
import java.util.Locale;

public class Teste6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		double fabrica, resultadoFinal;
		
		fabrica = sc.nextInt();
		resultadoFinal = fabrica + (fabrica*0.28)+(fabrica*0.45);
		
		System.out.println("custo final = " + resultadoFinal);
	}
}
