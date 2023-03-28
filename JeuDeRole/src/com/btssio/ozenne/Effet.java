package com.btssio.ozenne;

public class Effet {
	private String Description;
	private int Valeur;
	private char Operateur;
	
	

	public String getDescription() {
		return Description;
	}



	public int getValeur() {
		return Valeur;
	}



	public char getOperateur() {
		return Operateur;
	}



	public Effet(String description, int valeur, char operateur) {
		super();
		Description = description;
		Valeur = valeur;
		Operateur = operateur;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
