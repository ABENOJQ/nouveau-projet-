package com.btssio.ozenne;

public class ArmeSpecifique extends Arme {
	private Effet effetUnique;
	
	public int getDegats() {
		switch (this.effetUnique.getOperateur()) {
		case '+': return Arme.getDegatsDeBase() + this.effetUnique.getValeur();
		case '*': return Arme.getDegatsDeBase()*this.effetUnique.getValeur();
		case '-': return (Arme.getDegatsDeBase()*this.effetUnique.getValeur())-effetUnique.getValeur();
		case '/': return (Arme.getDegatsDeBase()- this.effetUnique.getValeur()) * effetUnique.getValeur();
		default: return Arme.getDegatsDeBase() +10;
		
		}
	}

	

	
	public ArmeSpecifique(String nom, int p_prix,Effet p_effetUnique) {
		super(nom, p_prix);
		this.effetUnique = p_effetUnique;
		// TODO Auto-generated constructor stub
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
