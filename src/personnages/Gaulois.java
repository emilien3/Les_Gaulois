package personnages;

public class Gaulois {
	
	
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion;	
    private Equipement[] trophees = new Equipement[100];
	
	
	
	// Auto-generated method stub


	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	// End of Auto-generated method
	
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() +  texte);
	}
	
	
	private String prendreParole() {
        return "Le gaulois " + nom + " : ";
}
	
	
	/*public void frapper(Romain romain) {
		System.out.println( nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}*/
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
			}
		

	}



	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion =forcePotion;
		
		parler("Merci Druide, je sens que ma force est "+ effetPotion +" fois décuplée si la force de la potion est de "+ effetPotion);
	}
	
//	public void faireUneDonnation(Musee musee, ) {
//		
//		if (trophee != null) {
//			for (int i = 0 ; i < Nbtrophee; i++) {
//				
//			}
//		}
//	}
	
	public void faireUneDonnation(Musee musee) {
		if (nbTrophees != 0) {
			System.out.println("Le gaulois " + getNom() +" : << Je donne au musee tous mes trophees :\n" );
			for (int i =0;i < nbTrophees ; i++) {
				Equipement troph = trophees[i];
				donnerTrophees( this, troph );
				System.out.println ("- "+ troph +"\n");
			}
			System.out.println(">>");
		}
		else {
			System.out.println("Le gaulois "+ getNom() + " n'a pas de trophees");
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix", 8);
		Romain minus = new Romain ("Minus", 6);
		System.out.println(asterix.nom);
		
		
		asterix.parler("bonjour");
		asterix.boirePotion(6);
		asterix.frapper(minus);
		
	}

}

	

