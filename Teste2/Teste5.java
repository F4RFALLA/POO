package TesteParte2;
import java.util.Scanner;
import java.util.Locale;

public class Teste5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		int n = 50;
		int v[] = new int [n];
		int i, entrada, igual=0;
		
		for (i=0; i < n; i++) {
			entrada = sc.nextInt();
			v[i] = entrada;
			
			for(int j=1;j<n;j++){
				if(v[j]==v[i]) {
					igual++;
				
					System.out.println(v[i]);
					
				}
			}
		}
		
		
		
	}
}
