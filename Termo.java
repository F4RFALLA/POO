package exercicioPolinomio;

public class Termo {
    int coeficiente, expoente;
    Termo(){}
    Termo (int a, int i){
        coeficiente = a;
        expoente = i;
    }

    void insere(Termo dados){
        this.coeficiente += dados.coeficiente;
        this.expoente += dados.expoente;
    }

    int calcular(int valor){
        return (int) (this.coeficiente * Math.pow(valor, this.expoente));
    }
}
