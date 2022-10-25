package personnages;

public class Gaulois {
	
	Gaulois asterix;
	
	private String nom;
	private int force;
	private int nbTrophees;
	public int effetPotion;	
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
	
	public void faireUneDonnation(Musee musee) {
		if (trophees != null) {
			for (int i =0; i< nbTrophees;i++ ) {
				
			}
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

	

