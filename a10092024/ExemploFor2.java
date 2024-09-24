package br.edu.uft.poo.a2024s2.a10092024;

public class ExemploFor2 {
	public static void main(String[] args) {
		String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
		
		for (int x = 0; x < alunos.length; x++) {
			System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
			
			//forma abreviada
			//for (String aluno : alunos){
				//System.out.println(aluno);
		//}
		}
	}
}
