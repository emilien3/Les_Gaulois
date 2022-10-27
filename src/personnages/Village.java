package personnages;

public class Village {
	private String nom;
	private Chef chef;
	public int nbVillageois = 0;
	private Gaulois[] villageois;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum]; 
		
	}
	
	public void setChef (Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	private void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois +=1;	
	}
	
	private Gaulois trouverHabitant(int nVillageois){
		return villageois[nVillageois];
	}
	
	private void afficherVillageois () {
		System.out.println("Dans village du chef " + chef.getNom() +" vivent les légendaires gaulois :");
		for(int i = 0 ; i < nbVillageois ; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main (String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		
//		Gaulois gaulois = village.trouverHabitant(30);
//		
		
		
		Chef abraracourcix = new Chef ("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois ("Asterix", 8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		Ca affiche null. Il n'y a aucun gaulois en place 1 donc c'est normal.
		
		village.afficherVillageois();
		
		
		
		
	}

}



