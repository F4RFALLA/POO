package exercicioRestaurante;

public class Main {
    public static void main(String[] args) {
        // Criando alguns itens
        Pizza pizza = new Pizza("Tomate", "Queijo", "Recheada");
        Lanche lanche = new Lanche("Brioche", "Frango", "Maionese");
        Salgadinho salgadinho = new Salgadinho("Carne", "Massa de Trigo");

        // Criando um pedido
        Pedido pedido = new Pedido("João", 0.10);  // 10% de taxa de serviço
        pedido.adicionarItem(pizza);
        pedido.adicionarItem(lanche);
        pedido.adicionarItem(salgadinho);

        // Mostrando a fatura
        pedido.mostrarFatura();
    }
}

