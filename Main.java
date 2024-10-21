package exercicioPolinomio;

public class Main {
    public static void main(String[] args) {
        Termo novo = new Termo();

        System.out.println("valor do polinômio novo é: " + novo.calcular(2));
        Termo teste = new Termo(2,2);

        novo.insere(teste);
        System.out.println("Valor do polinomio novo é: " + novo.calcular(2));

        Termo testeNovo = new Termo(2,3);

        Polinomio polinomio1 = new Polinomio(novo);
        System.out.println("Valor do polinomio é: " + polinomio1.calcular(2));

        Polinomio polinomio2 = new Polinomio(testeNovo);
        System.out.println("Valor do polinomio é: " + polinomio2.calcular(2));

        polinomio1.fusao(polinomio2);

        for (Termo termo : polinomio1.termos){
            System.out.println("Valor de um termo do polinomio 1: "+termo.calcular(2));
        }
        System.out.println("Valor do polinomio 1 é: " + polinomio1.calcular(2));
    }
}
