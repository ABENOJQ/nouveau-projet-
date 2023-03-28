package com.btssio.ozenne;

public class Arme {
	private String nom;
	public final static int degats=10;
	private int Prix;
	
	
	public int getPrix() {
		return Prix;
	}
	public static int getDegatsDeBase() {
		return Arme.degats;
	}
	//public static void setDegatsDeBase(int degats) {
		//Arme.degats =degats;
		//}






	public String getNom() {
		return nom;
	}








	public void setNom(String nom) {
		this.nom = nom;
	}





	public Arme(String nom,int p_prix) {
		super();
		this.nom = nom;
		this.Prix=p_prix;
		
	}








	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
