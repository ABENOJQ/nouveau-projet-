package com.btssio.monpremierprojet;

import com.btssio.Animal;
import com.btssio.Chien;
import com.btssio.Menagerie;


public class LancementChenil {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal unChien = new Chien("oga", "Teckel",25);
		Chien medor = new Chien("Médor", "Bâtard", 19);
		Chien saucisse = new Chien("Saucisse", "Teckel",  9);
		Chien pongo = new Chien("Pongo", "Dalmatien", 70);
		Chien perdita = new Chien("Perdita", "dalmatien", 50);
		
		
		System.out.println(" La caravanne passe....");
		medor.aboyer();
		saucisse.aboyer();
		System.out.println("Quelle est la taille de Saucisse ?" + saucisse.getTaille() + "cm\n");;
		pongo.aboyer();
		perdita.aboyer();
		
		Menagerie leChenil = new Menagerie();
		
		leChenil.arriver(unChien);
		leChenil.arriver(perdita);
		leChenil.arriver(medor);
		leChenil.arriver(saucisse);
		leChenil.arriver(pongo);
		
		System.out.println(unChien.getEspece());
		 
	
		
		
		
		
		
		leChenil.presenter();
	    
	
		
		
		
		
		
		
		
	}

}
