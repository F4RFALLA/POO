package questao2;

public class BudgetItem {
	
	private String history;
	private float value;
	public BudgetItem(String history, float value) {
		super();
		this.history = history;
		this.value = value;
	}
	
	
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	
	
}
