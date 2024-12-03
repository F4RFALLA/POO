public class Aluno {
    private int primeiraNota;
    private int segundaNota;
    private String nome;

    // Construtor
    public Aluno(String nome, int primeiraNota, int segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    // Getters e Setters
    public int getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(int primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public int getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(int segundaNota) {
        this.segundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2.0;
    }
}
