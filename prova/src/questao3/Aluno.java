package questao3;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa {
	
	private String curso;
	private int periodo;
	private ArrayList<String> dps;
	private Date previsaoDeFormatura;

	public Aluno(String nome, String nusp, Date dataIngresso, String curso, int periodo, ArrayList<String> dps,
			Date previsaoDeFormatura) {
		super(nome, nusp, dataIngresso);
		this.curso = curso;
		this.periodo = periodo;
		this.dps = dps;
		this.previsaoDeFormatura = previsaoDeFormatura;
	}

	
	
	
}
