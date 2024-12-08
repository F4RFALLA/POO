package questao4;

public class Main {

	public static void main(String[] args) {


		
		

	}

	public Result[] contabilizar(Animal[] A, Tools objeto){
		 String[] classificador = objeto.speciesClassification(A);
		
		Result[] resultado = new Result[classificador.length];
		for(int i = 0; i < classificador.length; i ++) {
			
			
		resultado[i] = resultado[i].filterSpecies(A, classificador[i]); 	
		}
		
		return null;
	}
	
}
