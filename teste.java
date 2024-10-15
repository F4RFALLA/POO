package br.edu.uft.poo.a2024s2.a15102024;

public class teste {

	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "!";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();
		else if (appEscolhido.equals("fcb"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("disc"))
			smi = new Discord();
		else if (appEscolhido.equals("bing"))
			smi = new Bingo();
		
	}	
}
