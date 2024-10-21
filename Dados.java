import java.util.Scanner;
import java.util.Locale;

public class Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int sexo;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;
        double altura;
        double somaH = 0;
        double mediaHomens = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 0; i<10; i++){
            System.out.print("Escolha o sexto da pessoa (1-Mulher, 2-Homem): ");
            sexo = sc.nextInt();
            System.out.print("Digite a altura: ");
            altura = sc.nextDouble();

            if(sexo == 1){
                quantidadeMulheres++;
            }else if(sexo == 2){
                quantidadeHomens++;
                somaH += altura;
            }else{
                System.out.print("Opção sexo inválido");
            }
            if (altura > maior){
                maior = altura;
            }else if(altura < menor){
                menor = altura;
            }
        }
        mediaHomens = somaH / quantidadeHomens;

        System.out.println("A maior altira do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + quantidadeMulheres + " m");
    }
}
