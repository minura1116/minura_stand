package com.develop_minura.model;

public class Pessoa {
	
	private	int		ID;
	private String	nome,
					sobrenome,
					nacionalidade,
					morada,
					localidade,
					cp,
					contacto,
					email;
	
	public Pessoa(String nome, String sobrenome, String nacionalidade, String morada, String localidade,
			String cp, String contacto, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nacionalidade = nacionalidade;
		this.morada = morada;
		this.localidade = localidade;
		this.cp = cp;
		this.contacto = contacto;
		this.email = email;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
