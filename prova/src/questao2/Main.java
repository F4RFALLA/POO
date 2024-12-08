package questao2;

public class Main {

	public static void main(String[] args) {
		
		ComplexBudgetItem complexo = new ComplexBudgetItem("pena", 2);
		ComplexBudgetItem complexo2 = new ComplexBudgetItem("maravilha", 4);

		ComplexBudgetItem[] vetor = new ComplexBudgetItem[2];
		
		
		ComplexBudgetItem operacao = new ComplexBudgetItem("null", 0); //meramente para operacionalizar
		
		vetor[0] = complexo;
		vetor[1] = complexo2;
		
		System.out.println(operacao.getValue(vetor));
		
		ComplexBudgetItem print;
		
		print = operacao.findItem("sexo", vetor);
			if(print == null)
				System.out.println("NAO ENCONTRADO");
			else {
				System.out.println(print.getHistory());
			}
			/* LETRA B) utilizamos subclasses, ou seja, herança, porque através disso podemos ter acesso aos atributos
			 * e metodos da classe mão através de ComplexBudgetItem, o que facilita os processos na criação dos métodos 
			 * e objetos. Caso nós utilizássemos composição, teríamos que criar objetos de duas classes diferentes
			 * a fim de relaciona-las. No caso da herança, essa relação é feita através do super.   
			 * 
			 * 
			 * 
			 * 
			 * */
	}

}
