package com.btssio.ozenne;

public class Personnage {
	
	private String nom;
	private int pointsDeVie;
	private int positionX, positionY;
	private Arme arme;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}


	
	
	//--Constructeur
	/**
	 * Constructeur de la classe Personnage
	 * @param p_nom nom du personnage
	 * @param p_arme arme du personnage
	 */
	public Personnage(String p_nom, Arme p_arme) {
		//valeur par defaut
		this.positionX =0;
		this.positionY =0;
		this.pointsDeVie =100;
		//argument
		this.nom=p_nom;
		this.arme=p_arme;
	}
	
	
	
	
	
	public boolean enVie() {
		if (this.pointsDeVie <=0)
		{
		return false;
		}
		else {
			return true;
		}
	}
	
	public void recevoirDesDegats(int nombre ) {
		this.pointsDeVie-=-nombre*10;
		System.out.println("je viens de recevoir des degats");
	}
	public void attaquerUnAdversaire(Personnage victime,int des) {
		
		victime.recevoirDesDegats(des);
		System.out.println(this.nom +"a attaqué "+victime.getNom());
	}
	
	public void seDeplacer() { 
		
	}
	public void sePresenter() {
		System.out.println("Bonjour, "+ this.nom+"et mon arme"+this.arme.getNom());
	}
	
public static void main(String[] args) {
	
	System.out.println("Bonjour");
	//instanciation de l'arme
	Arme weapon001 = new Arme("ca");
	//instanciation du personnage
	Personnage user001 = new Personnage("Sultana", weapon001);
	// personnage se présente
	user001.sePresenter();
	
	//System.out.println("nom de base : "+user001.getNom());
	
	//user001.setNom("rob");
	
	//System.out.println("Nouveau nom : "+user001.getNom());
	
	//System.out.println("Vie de base : "+user001.getPointsDeVie());
	
	
	//peut pas car pas de setter
	//user001.setPointsDeVie(80);
	
	//System.out.println("Arme de base : "+user001.getArme().getNom());
	
	//user001.getArme().setNom(" EXC");
	
	//System.out.println("Nouveau nom: "+user001.getArme().getNom());
	
	
	
	
}


}
