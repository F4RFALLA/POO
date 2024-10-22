package exercicioRestaurante;

class Pizza extends Prato {
    private String molho;
    private String recheio;
    private String borda;

    public Pizza(String molho, String recheio, String borda) {
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
    }

    @Override
    public void calcularPreco() {
        // Exemplo de cálculo de preço com base nos ingredientes
        this.preco = 15;  // Definindo um valor fixo, mas poderia ser baseado nos ingredientes
        System.out.println("Preço da Pizza: R$" + this.preco);
    }
}

