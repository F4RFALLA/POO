package TesteParte2;
import java.util.Scanner;
import java.util.Locale;

public class Teste1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		double celsius, kelvin, reaumur, rankine, fahrenheit;
		
		celsius=sc.nextDouble();
		
		fahrenheit = celsius * 1.8 + 32;
		kelvin = celsius + 273.15;
		reaumur = celsius * 0.8;
		rankine = celsius * 1.8 + 32 + 459.67;
		
		System.out.println("Em fahrenheit: " + fahrenheit);
		System.out.println("Em kelvin: " + kelvin);
		System.out.println("Em reaumur: " + reaumur);
		System.out.println("Em rankine: " + rankine);
	}
}
