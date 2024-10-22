package exercicioRestaurante;
import java.util.ArrayList;

class Pedido {
    private String nomeCliente;
    private double taxaDeServico;
    private ArrayList<Prato> itensConsumidos;

    public Pedido(String nomeCliente, double taxaDeServico) {
        this.nomeCliente = nomeCliente;
        this.taxaDeServico = taxaDeServico;
        this.itensConsumidos = new ArrayList<>();
    }

    public void adicionarItem(Prato prato) {
        itensConsumidos.add(prato);
    }

    public void calcularTotal() {
        double total = 0;
        for (Prato prato : itensConsumidos) {
            prato.calcularPreco();
            total += prato.preco;
        }
        total += total * taxaDeServico;  // Adiciona a taxa de serviço
        System.out.println("Total do pedido com taxa de serviço: R$" + total);
    }

    public void mostrarFatura() {
        System.out.println("Fatura do cliente " + nomeCliente + ":");
        for (Prato prato : itensConsumidos) {
            System.out.println("Item: " + prato.getClass().getSimpleName() + " - Preço: R$" + prato.preco);
        }
        calcularTotal();
    }
}

