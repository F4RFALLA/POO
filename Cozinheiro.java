package lanchonete;

public class Cozinheiro{
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCÃO");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	public void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	
	public void prepararSuco() {
		System.out.println("PREPARANDO SUCO");
	}
	
	public void prepararVitamina() {
		System.out.println("PREPARAR VITAMINA");
	}
	 
	public void prepararCombo() {
		prepararLanche();
		prepararSuco();
	}
	
	public void seleconarIngredientsLanche() {
		System.out.println("SELECIONANDO PÃO, SALADA, OVO E CARNE");
	}
	
	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
	}
	
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	
	public void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LUQUIDIFICADOR");
	}
	
	public void fritarIngredienteLanche() {
		System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");
	}
	
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirPararTrocarGas(Almoxerife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirIngredientes(Almoxerife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}