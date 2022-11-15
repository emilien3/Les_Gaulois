package personnages;

public class Humain {
	
	private String nom ;
	private String boisson ;
	protected int qttArgent ;
	
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
		return "("+nom+")" + " - ";
	}
	
	protected void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() +" et j'aime boire du " + getBoisson() );
	}
	
	public void boire() {
		parler( "Mmmm, un bon verre de " + getBoisson()+ " ! GLOUPS !") ;
	}
	
	public void acheter(String bien, int prix){
		if (this.getQttArgent()>= prix){
			this.parler("J'ai "+ this.getQttArgent()+" sous en poche. Je vais pouvoir m'offrir une boisson à " + prix + " sous.");
			qttArgent -= prix ;
			}
		else {
			this.parler("Je n'ai plus que "+ this.getQttArgent()+" sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
		}
	}
	
	public void gagnerArgent(int gain) {
		qttArgent += gain;
	}
	
	public void perdreArgent(int perte) {
		qttArgent -= perte;
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
