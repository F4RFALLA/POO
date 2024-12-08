package questao3;

import java.util.Date;

public class Geral extends Funcionario {
	private String funcao;
	private boolean ferias;

	public Geral(String nome, String nusp, Date dataIngresso, double salario, int anos, String funcao, boolean ferias) {
		super(nome, nusp, dataIngresso, salario, anos);
		this.funcao = funcao;
		this.ferias = ferias;
	}
	
	

}
