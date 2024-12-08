package questao1;

public class Costumer implements AccountChange, BankOperations {

	private String clientCPF;
	private float balance;
	
	
	public Costumer(String cpf, float balance) {
		this.clientCPF = cpf;
		this.balance = balance;
	}


	public String getClientCPF() {
		return clientCPF;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	@Override
	public String getCPF() {
		// TODO Auto-generated method stub
		return clientCPF;
	}


	@Override
	public float getChangeValue() {
		if(balance<0)
			return -balance;
		else
			return balance;
		
	}


	@Override
	public Costumer findCostumer(Costumer[] allCostumer, String cpf) {
		
		for(int i = 0; i < allCostumer.length; i++) {
			if(allCostumer[i].clientCPF.equals(cpf)) {
				return allCostumer[i];
			}
		}
		
		return null;
	}
	
	
	
}
