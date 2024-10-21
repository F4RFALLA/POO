package exercicioAnimal;

public abstract class Animal {
    private char cor;
    private String comidaPreferida;

    public char getCor() {
        return cor;
    }
    public void setCor(char cor) {
        this.cor = cor;
    }
    public String getComidaPreferida() {
        return comidaPreferida;
    }
    public void setComidaPreferida(String comidaPreferida) {
        this.comidaPreferida = comidaPreferida;
    }

    public abstract void comer();
}
