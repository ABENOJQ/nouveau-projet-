package automobile;
import java.util.ArrayList;
public class Automobile {
	private String modele;
	private String marque;
	private double prix;
	private String etat; //neuf ou occasion
	private String carburant;
	private int kmCompteur;
	private int annee;
	private String puissance;
	private ArrayList<Equipement> lesEquipements;
	
	
	
	
	public ArrayList<Equipement> getLesEquipements() {
		return lesEquipements;
	}
	public void setLesEquipements(ArrayList<Equipement> lesEquipements) {
		this.lesEquipements = lesEquipements;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		
		this.prix = prix;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	public int getKmCompteur() {
		return kmCompteur;
	}
	public void setKmCompteur(int kmCompteur) {
		this.kmCompteur = kmCompteur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getPuissance() {
		return puissance;
	}
	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}
	@Override
	public String toString() {
		return "Automobile [modele=" + modele + ", marque=" + marque + ", prix=" + prix + "]";
	}
	public boolean ajouterUnEquipement(Equipement equipementAAjouter) {
		if (!lesEquipements.contains(equipementAAjouter))
			{
				this.lesEquipements.add(equipementAAjouter);//ajoute un equipement à la liste
				System.out.println("L'equipement "+ equipementAAjouter.getDesignation() +" vient d'être ajouté au vehicule "+ this.toString());
				
				if (equipementAAjouter.isGratuit()==false)
				{
					this.prix+=equipementAAjouter.getPrix();
				}
				
			}
		else {
			System.out.println("l'equipement est deja dedans");
		}
		return true; //renvoie vrai si la fonction réussi
	}
	public boolean supprimerUnEquipement(Equipement equipementASupprimer) {
		
		
		if (lesEquipements.contains(equipementASupprimer))
		{
			this.lesEquipements.remove(equipementASupprimer);//supprime un equipement à la liste
			System.out.println("L'equipement "+ equipementASupprimer.getDesignation() +" vient d'être supprimé au vehicule "+ this.toString());
			//regarde si l'équipement est gratuit s'il ne l'est pas il enlève sont prix au prix total du vehicule
			if (!equipementASupprimer.isGratuit())
			{
				this.prix-=equipementASupprimer.getPrix();
			}
			
		}
	else {
		System.out.println("Il n'y a pas cette equipement");
	}
	return true; //renvoie vrai si la fonction réussi
}
	public void afficherLesEquipements() {
		System.out.println(this.toString());
		System.out.println("Les équipements sont :");
		//fais une boucle qui bouge jusqu'à ce qu'elle atteigne la taille de la liste
		
		for(int i=0;i<this.lesEquipements.size();i++) {
			//affiche l'equipement index i
			System.out.println(lesEquipements.get(i));
		}
	}
	
	public void afficherLesEquipementsGratuits() {
		System.out.println(this.toString());
		System.out.println("les équipements gratuits sont:");
		
		//boucle qui affiche les equipements qui sont gratuit
		for(Equipement equipementLu: this.lesEquipements) {
			if(equipementLu.isGratuit()) {
				System.out.println(equipementLu);
			}
		}
	}
	
	public double getTotalEquipements() {
		int total=0;
		//boucle qui calcul le prix de chaque équipement pour trouver le total
		for(Equipement equipementlu : this.lesEquipements){
			if(!equipementlu.isGratuit()) {
				total += equipementlu.getPrix();
			}
		}
		return total;
	}
	//recherche un équipement dans la liste des equipements
	public boolean MethodeMystere(String designationRecherchee, Equipement[] params) {
		//déclaration de booléen ok à false
		boolean ok = false;
		//initialisation d'un compteur i à 0
		int i =0;
		//boucle qui s'arrete si i dépasse la taille de la collection ou que ok soit égale à true
		while(i<this.lesEquipements.size() && !ok) {
			//si l'équipement recherché est égal à l'équipement recherché
			if(this.lesEquipements.get(i).getDesignation().equals(designationRecherchee)) {
				//rajoute l'équipement dans un tableau
				params[0]=(lesEquipements.get(i));
				//affectation de la variable ok à true
				ok=true;
				
			}
			//augmentation du compteur de 1
			i++;
		}
	//renvoie la valeur de ok
	return ok;
	}
	public Automobile(String modele, String marque, double prix, String etat, String carburant, int kmCompteur,
			int annee, String puissance) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.prix = prix;
		this.etat = etat;
		this.carburant = carburant;
		this.kmCompteur = kmCompteur;
		this.annee = annee;
		this.puissance = puissance;
		this.lesEquipements= new ArrayList<Equipement>();
	}
	
	public static void main(String[] args) {
		Automobile voiture1=new Automobile("Mercedes AMG","Mercedes",25000,"neuf","diesel",0,1985,"300W");
		Automobile voiture2=new Automobile("Peugeot AMG","Peugeot",12000,"occasion","SP95",500,200,"200W");
		
		System.out.println("la voiture est"+voiture1.toString());
		System.out.println("la voiture est"+voiture2.toString());
		
		Equipement equip1=new Equipement("gant",0,true);
		Equipement equip2=new Equipement("jambiere",50.60,false);
		
		System.out.println("les equipements sont "+equip1.toString());
		System.out.println("les equipements sont "+equip2.toString());
		
		voiture1.ajouterUnEquipement(equip1);
		voiture1.ajouterUnEquipement(equip2);
		System.out.println("les equip "+voiture1.getLesEquipements());
		
		voiture1.supprimerUnEquipement(equip2);
		
		System.out.println("le prix des équipements de la voiture1  est "+voiture1.getTotalEquipements());
		voiture1.ajouterUnEquipement(equip2);
		voiture1.afficherLesEquipements();
		voiture1.afficherLesEquipementsGratuits();
		
		
		
	}
	
}

