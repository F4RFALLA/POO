package questao2;

public class ComplexBudgetItem extends BudgetItem {

	
	
	
	
	public ComplexBudgetItem(String history, float value) {
		super(history, value);
		
	}


	public void Constructor(ComplexBudgetItem[] vetor) {
	
	
	}
	
	public float getValue(ComplexBudgetItem[] vetor) {
	float soma = 0;
	for(int i = 0; i < vetor.length; i ++) {
	soma = soma +vetor[i].getValue();	
	}
		
		return soma;
	}
	public ComplexBudgetItem  findItem(String item,ComplexBudgetItem[] vetor ) {
		
		for(int i = 0; i < vetor.length; i ++) {
			if(vetor[i].getHistory().equals(item)) {
				return vetor[i];
			}			
		}
		return null;
		
	}
	
	
}
