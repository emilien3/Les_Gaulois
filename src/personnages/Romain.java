package personnages;

public class Romain {
	
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force >0; 
		int v = force ;
		force -= forceCoup;
		if (force > 0){
			parler("Aie");
		} 
		else{
			parler("J'abandonne...");
		}
		assert v> force ;
	}
	
		
	public void sEquiper(Equipement equipement){
		switch(equipement) {
		
			case CASQUE:
				if (nbEquipement == 2){
					System.out.println( "Le soldat "+ nom + " est déjà bien protégé ! ");
				}
				else if ((nbEquipement == 1 )&& (equipements[0] == equipement)) {
					System.out.println( "Le soldat "+ nom + " possède déjà un "+ equipement.nom + " !");
				}
				else {
					equipements[nbEquipement]= equipement;
					nbEquipement++;
					System.out.println( "Le soldat "+ nom + " s’équipe avec un " + equipement.nom + " .");
				}
				break;
				
			case BOUCLIER:
				if (nbEquipement == 2){
					System.out.println( "Le soldat "+ nom + " est déjà bien protégé ! ");
				}
				else if ((nbEquipement == 1 )&& (equipements[0] == equipement)){
					System.out.println( "Le soldat "+ nom + " possède déjà un "+ equipement.nom + " !");				
					}
				else {
					equipements[nbEquipement]= equipement;
					nbEquipement++;
					System.out.println( "Le soldat "+ nom + " s’équipe avec un " + equipement.nom + " .");
					}
				break;
				
			default : 
				System.out.println( "default");
				break;
		}
	}
	
	
	public static void main (String[] args) {
		
		Romain minus = new Romain ("Minus", 6);
		assert minus.force >=0 ; 
				
		System.out.println(minus.nom);
				
		minus.parler("bonjour");
		minus.recevoirCoup(6);
		
		Equipement bouclier = Equipement.BOUCLIER; 
		Equipement casque = Equipement.CASQUE;
		
		minus.sEquiper(casque);
		minus.sEquiper(casque);
		minus.sEquiper(bouclier);
		minus.sEquiper(casque);
	
		
		
		

	}





}