package exercicioRestaurante;

class Lanche extends Prato {
    private String pao;
    private String recheio;
    private String molho;

    public Lanche(String pao, String recheio, String molho) {
        this.pao = pao;
        this.recheio = recheio;
        this.molho = molho;
    }

    @Override
    public void calcularPreco() {
        this.preco = 10;  // Preço base, poderia depender dos ingredientes
        System.out.println("Preço do Lanche: R$" + this.preco);
    }
}

