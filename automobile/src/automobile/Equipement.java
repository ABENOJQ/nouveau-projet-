package automobile;


public class Equipement {
	private String designation;
	private double prix;
	private boolean gratuit;//compris dans le prix du véhicule
	
	
	
	
	


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public boolean isGratuit() {
		return gratuit;
	}


	public void setGratuit(boolean gratuit) {
		this.gratuit = gratuit;
	}
	
	
	
	


	public Equipement(String designation, double prix, boolean gratuit) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.gratuit = gratuit;
		
	}


	@Override
	public String toString() {
		return "Equipement [designation=" + designation + ", prix=" + prix + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
