package com.develop_minura.service;

import java.util.ArrayList;

import com.develop_minura.model.Utilizador;

public class SUtilizador {
	
	private ArrayList<Utilizador> arUtilizador;
	
	public SUtilizador(){
		super();
		this.arUtilizador = new ArrayList<Utilizador>();
	}
	
	public boolean addUtilizador(Utilizador u){

		boolean exists = false;
		
		for(Utilizador ut : arUtilizador){
			if(ut.equals(u)){
				exists = true;
			}
		}
		
		if(exists != true){
			this.arUtilizador.add(u);
			return true;
		}else{
			return false;
		}
	}

	public ArrayList<Utilizador> getArUtilizador() {
		return arUtilizador;
	}

	public void setArUtilizador(ArrayList<Utilizador> arUtilizador) {
		this.arUtilizador = arUtilizador;
	}
}
