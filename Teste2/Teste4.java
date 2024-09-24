package TesteParte2;
import java.util.Scanner;
import java.util.Locale;

public class Teste4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);      
	        System.out.println("Entre com um numero ");
	        int num = sc.nextInt();       
	        for(int i = 2; i <= num; i++) {
	            boolean primo = true;        
	            for(int j = 2; j < i; j++) {            
	                if(i % j == 0) {
	                    primo = false;
	                }
	            }
	            if(primo) {
	                System.out.println(i);
	            }          
	        }
	    }
 }

