package questao3;

import java.util.Date;

public class Funcionario extends Pessoa{
	private double salario;
	private int anos;

	public Funcionario(String nome, String nusp, Date dataIngresso, double salario, int anos) {
		super(nome, nusp, dataIngresso);
		this.salario = salario;
		this.anos = anos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}
	
	public void calcularAjust(double porcentagem) {
		double decimal = porcentagem/100;
		
		setSalario(getSalario()*decimal); 
	}
	
	
	
	
	
}
