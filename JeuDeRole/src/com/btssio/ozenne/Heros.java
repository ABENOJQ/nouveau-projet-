package com.btssio.ozenne;

public class Heros extends Personnage{
	
	private Arme sonArme;
	protected static int bourse=1000;
	private String caractere;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getBourse() {
		return bourse;
	}













	public String getCaractere() {
		return caractere;
	}













	public Heros(String p_nom, Armure p_armure, String caractere) {
		super(p_nom, p_armure);
		this.caractere = caractere;
	}
	
	

}
