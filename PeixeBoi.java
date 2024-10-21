package exercicioAnimal;

public class PeixeBoi extends Animal {

    private int tamanho;
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void nadar () {
        System.out.println("peixe boi nadando");
    }
    public void comer(){
        System.out.println("peixe boi comendo");
    };


}