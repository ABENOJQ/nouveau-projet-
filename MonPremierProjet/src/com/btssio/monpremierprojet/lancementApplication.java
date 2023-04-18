package com.btssio.monpremierprojet;

import com.btssio.Animal;
import com.btssio.Menagerie;

public class lancementApplication {

	public static void main(String[] args) {
		
		System.out.println("J'utilise Eclipse");
		
		 Animal nemo = new Animal("Nemo","Poisson rouge");
		 Animal felix = new Animal("Felix","Chat");
		 Animal pistache = new Animal("Pistach","Perruche");
		 
		 nemo.sePresenter();
		 nemo.parler("Gloup");
		 nemo.manger();
		 nemo.dormir();
		 
		 felix.sePresenter();
		 felix.parler("Miaou");
		 felix.manger();
		 felix.dormir();
		 
		 pistache.sePresenter();
		 pistache.parler("Cui");
		 pistache.manger();
		 pistache.dormir();
		 
		 Menagerie zoo = new Menagerie();
		 zoo.arriver(nemo);
		 zoo.arriver(felix);
		 zoo.arriver(pistache);
		 
		 System.out.println("\n zoo comporte"+ zoo.getNombreAnimaux()+" animaux");
		 zoo.presenter();
		 
		 System.out.println("\n=> Fèlix s'en va ...\n");
		 zoo.partir(felix);
		 
		 System.out.println("\n zoo comporte"+ zoo.getNombreAnimaux()+" animaux");
		 zoo.presenter();
		 
		 System.out.println("\nLe poisson Némo est rebaptisé 'Maurice'  ...\n");
		 nemo.setNom("Maurice");
		
		 zoo.presenter();
		 
		 
		
		 
		 

	}

}
