package lanchonete;

public class Estabelecimento {
	public static void main (String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararCombo();
		cozinheiro.prepararLanche();
		
		Almoxerife almoxerife = new Almoxerife();
		almoxerife.controlearEntrada();
		almoxerife.controlarSaida();
		almoxerife.entregarIngredientes();
		almoxerife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		cliente.consultarSaldoAplicativo();
		cliente.pegarPedidoBalcao();
		//cozinheiro.pedirPararTrocarGas(atendente);
		cozinheiro.pedirIngredientes(almoxerife);
		
		
	}
}
