package personnages;

public class Humain {
	
	private String nom ;
	private String boisson ;
	private int qttArgent ;
	
	public Humain(String nom, String boisson, int qttArgent) {
		this.nom = nom;
		this.boisson = boisson;
		this.qttArgent = qttArgent;
	}

	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public int getQttArgent() {
		return qttArgent;
	}
	
	private String prendreParole() {
		return nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle " + getNom() +" et j�aime boire du " + getBoisson() );
	}
	
	public void boire() {
		parler( "Mmmm, un bon verre de " + getBoisson()+ " ! GLOUPS !") ;
	}
	
//	public void acheter(String bien, int prix){
//		qttArgent = ;
//	}
	
	public void gagnerArgent(int gain) {
		qttArgent += gain;
	}
	
	public void perdreArgent(int perte) {
		qttArgent -= perte;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
