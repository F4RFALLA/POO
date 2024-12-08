package questao3;

import java.util.ArrayList;

public interface GerenciadorDePessoas {

	public void ordenarDataIngresso();
	public void areasSemelhantes();
	public int emFerias();
	
	public ArrayList<Pessoa> jubilados();
	public ArrayList<Pessoa> emFerias1();
	public boolean periodoIdeal(String id);
	
	
}
