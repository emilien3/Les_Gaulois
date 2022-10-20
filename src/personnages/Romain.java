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
	
	/*
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
	}*/
	
		
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
	
	//Modification du TP 4 :
	
	public Equipement[] recevoirCoup(int forceCoup) {
        Equipement[] equipementEjecte = null;
        // précondition
        assert force > 0;
        int oldForce = force;
        forceCoup = calculResistanceEquipement(forceCoup);
        force -= forceCoup;
        
        if (force > 0) { 
        	parler("Aïe");

             } else {
             equipementEjecte = ejecterEquipement();
             parler("J'abandonne...");
        }
        
        
       // post condition la force à diminuer
       assert force < oldForce;
       return equipementEjecte;
}
	
	
	private int calculResistanceEquipement(int forceCoup) {
        String texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
        int resistanceEquipement = 0;
        if (nbEquipement != 0) {
             texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
             for (int i = 0; i < nbEquipement; i++) {
                  if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
                       resistanceEquipement += 8;
                       } else {
                       System.out.println("Equipement casque");
                       resistanceEquipement += 5;
                       }
                  }
             texte+= resistanceEquipement + "!";
             }
        parler(texte);
        forceCoup -= resistanceEquipement;
        return forceCoup;
}
	

	private Equipement[] ejecterEquipement() { 
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				} else {
					equipementEjecte[nbEquipementEjecte] =equipements[i];
					nbEquipementEjecte++;
					equipements[i] = null;
					}
			}
		return equipementEjecte;
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