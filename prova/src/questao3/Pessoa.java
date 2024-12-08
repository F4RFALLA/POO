package questao3;

import java.util.Date;

public class Pessoa {
	
	
private String nome;
private String nusp;
private Date dataIngresso;




public Pessoa(String nome, String nusp, Date dataIngresso) {
	super();
	this.nome = nome;
	this.nusp = nusp;
	this.dataIngresso = dataIngresso;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNusp() {
	return nusp;
}
public void setNusp(String nusp) {
	this.nusp = nusp;
}
public Date getDataIngresso() {
	return dataIngresso;
}
public void setDataIngresso(Date dataIngresso) {
	this.dataIngresso = dataIngresso;
}
	
	





}
