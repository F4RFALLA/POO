package questao1;

public class Main {

	public static void main(String[] args) {
	
		Costumer[] C = new Costumer[2];
		
		Costumer primeiro = new Costumer("932", 200);
		Costumer segundo = new Costumer("250", 100);
		
		C[0] = primeiro;
		C[1] = segundo;
		
		AccountChange[] M = new AccountChange[2];
		if(C.length != M.length)
				System.exit(0);
		
		
		
		BankOperations operacao = C[0];
		
		

			updateBalance(C, M, operacao);
			operacao = C[1];
			updateBalance(C, M, operacao);
			
			
	}
	
	public static void updateBalance(Costumer[] C, AccountChange[] M, BankOperations operacao) {
		/*for(int i = 0; i < C.length; i ++) {
			M[i] = C[i];
		}*/
		
		
			M[0] = operacao.findCostumer(C, C[0].getCPF());
				if(M[0] == null)
					return;
			
			System.out.println(M[0].getCPF());
		
	}
	

}
