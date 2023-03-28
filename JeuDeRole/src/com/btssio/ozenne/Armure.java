package com.btssio.ozenne;

public class Armure {
	private String nom;
	private int ValeurDeDefense;
	private int Prix;
	
	
	
	public String getNom() {
		return nom;
	}



	public int getValeurDeDefense() {
		return ValeurDeDefense;
	}



	public int getPrix() {
		return Prix;
	}



	public Armure(String nom, int valeurDeDefense, int prix) {
		super();
		this.nom = nom;
		ValeurDeDefense = valeurDeDefense;
		Prix = prix;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
