package com.btssio.ozenne;

public class Arme {

	private String nom;
	private int degats;







	public String getNom() {
		return nom;
	}








	public void setNom(String nom) {
		this.nom = nom;
	}








	public int getDegats() {
		return degats;
	}








	public void setDegats(int degats) {
		this.degats = degats;
	}








	public Arme(String nom) {
		super();
		this.nom = nom;
		this.degats = 10;
	}








	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
