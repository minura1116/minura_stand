package com.develop_minura.service;

import java.util.ArrayList;

import com.develop_minura.model.Web;

public class SWeb {
	private ArrayList<Web> arWeb;

	public SWeb() {
		super();
		this.arWeb = new ArrayList<Web>();
	}

	public ArrayList<Web> getArWeb() {
		return arWeb;
	}

	public void setArWeb(ArrayList<Web> arWeb) {
		this.arWeb = arWeb;
	}
	
	public void addArWeb(Web w){
		w.setID(this.getArWeb().size());
		this.getArWeb().add(w);
	}
	
}
