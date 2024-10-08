package lanchonete;

public class Atendente {
	public void servindoMesa() { //privasdo
		//...
		System.out.println("SERVINDO MESA");	
	}
	
	public void pegarLancheCozinha() { //privado
		System.out.println("PEGANDO O LÇANCHE NA COZINHA");
	}
	
	public void receberPagamento() { //privado
		System.out.println("RECEBENDO PAGAMENTO");
	}
	
	public void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	
	public void pegarPedidoBalcao() { //privado
		System.out.println("PEGANDO PEDIDO NO BALCÃO");
	}
}
