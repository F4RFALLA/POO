import java.util.Scanner;

public class Ex1Primos {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int num = valor.nextInt();
        int i;

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("não é primo");
            }
            else{
                System.out.println("é primo");
            }
            break;
        }
    }
}