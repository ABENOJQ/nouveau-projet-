package com.btssio.ozenne;

import java.util.Random;
import java.util.Scanner;

public class Jeu {
	private Personnage joueur1;
	private Personnage joueur2;
	
	
	
	public Jeu(Personnage joueur1, Personnage joueur2) {
		super();
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
	}
	
	

	public Personnage getJoueur1() {
		return joueur1;
	}



	public void setJoueur1(Personnage joueur1) {
		this.joueur1 = joueur1;
	}



	public Personnage getJoueur2() {
		return joueur2;
	}



	public void setJoueur2(Personnage joueur2) {
		this.joueur2 = joueur2;
	}



	public boolean finDePartie(Personnage p1, Personnage p2) {
	       if (p1.enVie()==true && p2.enVie()==true)
	           return false;
	       else
	           return true;
	   }

	
	 public int lancerDe () throws InterruptedException{
	       Random rd = new Random();
	       Thread.sleep(300);
	       return 1+ rd.nextInt(6);
	   }

		
	
	
	public int lancerleDe() throws InterruptedException {
		Random rd = new Random();
		Thread.sleep(300);
		return 1+ rd.nextInt(6);
		
	}
	   public void lancerPartie() throws InterruptedException {
	       Scanner clavier = new Scanner(System.in);
	       System.out.println("La partie commence");




	       joueur1.sePresenter();
	       System.out.println(joueur1.getNom()+", lance les dés !");
	       int lancerdés1 = lancerDe();
	       System.out.println("Resultat : "+lancerdés1);


	       joueur2.sePresenter();
	       System.out.println(joueur2.getNom()+", lance les dés !");
	       int lancerdés2 = lancerDe();
	       System.out.println("Resultat : "+ lancerdés1);




	       int i = 0;
	       if (lancerdés2 > lancerdés1) {
	           i = 1;
	           System.out.println(joueur2.getNom()+" joue en premier.");
	       }
	       else
	           System.out.println(joueur1.getNom()+" joue en premier.");


	       //Tant que  le jeu n'est pas terminé.
	       while(finDePartie(joueur1, joueur2)==false) {


	           //Quand c'est le tour de joueur1
	           if (i==0) {
	               System.out.println("C'est ton tours, "+ joueur1.getNom());
	               joueur1.attaquerUnAdversaire(joueur2,lancerDe());
	               i = 1;
	           }
	           //Quand c'est le tour de joueur2
	           else {
	               System.out.println("C'est ton tours, "+ joueur2.getNom());
	               joueur2.attaquerUnAdversaire(joueur1,lancerDe());
	               i = 0;
	           }


	       }


	           System.out.println("Un joueur est mort");
	       if(joueur1.enVie()==true)
	           System.out.println(joueur1.getNom()+" a gagné");
	       else
	           System.out.println(joueur2.getNom()+" a gagné");
	   }

	
	

	public static void main(String[] args) throws InterruptedException {
		
		//Arme premierearme = new Arme("SUU");
		//Personnage premierperso = new Personnage("SUSA",premierearme);
		
		
		//Arme deuxiemearme= new Arme("EXCAAAA");
		//deuxiemeperso = new Personnage("SUSO", deuxiemearme);
			
		//premierperso.getNom();
		int i;
		
		for (i = 0; i < 5; i++) {
			
			System.out.println("Bienvenue dans Eclipse !");
			
		}
		
		System.out.println("C'est la fin !");
		}
	
	Effet renforcement =new Effet("renforce l'arme de 10 poitn de dégat",10,'+');
	Arme epeeCourte = new Arme("épéeCourte",150);
	ArmeSpecifique epeeRenforce=new ArmeSpecifique("épéeRenforcé",300,renforcement);
	
	
	}
	
	


