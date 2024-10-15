package br.edu.uft.poo.a2024s2.a15102024;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMenssagem();
	public abstract void receberMenssagem();
	
	private void validarConectadoInternet() {
		System.out.println("Validando conexão");	
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico");	
	}
}
