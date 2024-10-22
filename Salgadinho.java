package exercicioRestaurante;

class Salgadinho extends Prato {
    private String recheio;
    private String massa;

    public Salgadinho(String recheio, String massa) {
        this.recheio = recheio;
        this.massa = massa;
    }

    @Override
    public void calcularPreco() {
        this.preco = 5;  // Preço base
        System.out.println("Preço do Salgadinho: R$" + this.preco);
    }
}

