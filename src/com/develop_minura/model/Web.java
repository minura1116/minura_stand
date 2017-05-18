package com.develop_minura.model;

public class Web {
	
	private int 	ID;
	private String	nome;
	private Utilizador responsavel;
	
	public Web(int iD, String nome, Utilizador responsavel) {
		super();
		ID = iD;
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Utilizador getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Utilizador responsavel) {
		this.responsavel = responsavel;
	}					
}
