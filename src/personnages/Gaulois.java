package personnages;

public class Gaulois {
	
	private static Gaulois asterix;
	private String nom;
	private int force ;
	private int effetPotion = 1;
	
	
	
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
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}



//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}

	
	
	public static void main(String[] args) {
		Gaulois.asterix = asterix;
		
	}
}

	
}
