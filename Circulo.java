package exercicioFigura;

public class Circulo  extends Figura{
    private double raio;

    Circulo(double raio, String cor){
        this.raio = raio;
        this.setCor(cor);
    }
    void Triangulo(double raio, String cor){
        this.raio = raio;
        this.setCor(cor);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    public double area(){
        return Math.PI * raio;
    }

    public double getDiametro(){
        return 2 * Math.PI * raio;
    }
    public String toString(){
        return String.format(" area: %.2f, diametro: %.2f", area(), getDiametro());
    }



}