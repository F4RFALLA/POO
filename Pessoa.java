package br.edu.uft.poo.a2024s2.a08102024;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//metodo construtor
	//o nome deverá ser igual ao da classe
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
}
