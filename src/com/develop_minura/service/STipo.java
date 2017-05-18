package com.develop_minura.service;

import java.util.ArrayList;

import com.develop_minura.model.Tipo;

public class STipo {
	
	private ArrayList<Tipo> arTipo;

	public STipo() {
		super();
		this.arTipo = new ArrayList<Tipo>();
		this.fillTipo();
	}
	
	public void fillTipo(){
		Tipo tp = new Tipo(this.arTipo.size(), "anon");
		this.arTipo.add(tp);
		Tipo t = new Tipo(this.arTipo.size(), "user");
		this.arTipo.add(t);
		Tipo i = new Tipo(this.arTipo.size(), "vendedor");
		this.arTipo.add(i);
		Tipo p = new Tipo(this.arTipo.size(), "responsavel");
		this.arTipo.add(p);
		Tipo o = new Tipo(this.arTipo.size(), "administrador");
		this.arTipo.add(o);
	}

	public ArrayList<Tipo> getArTipo() {
		return arTipo;
	}

	public void setArTipo(ArrayList<Tipo> arTipo) {
		this.arTipo = arTipo;
	}
	
	
}
