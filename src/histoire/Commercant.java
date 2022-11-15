package histoire;
import personnages.Humain;

public class Commercant extends Humain  {

	public Commercant(String nom,int qttArgent) {
		super(nom, "thé", qttArgent);
	}
	
	//Dans la question 2.1.a du TP4 on nous demande quelles sont les 2 solutions : 
	// La première est d'utiliser le .getQttArgent() qui est une methode publique   
	// La deuxième est de mettre l'attribut argent en protected pour pouvoir l'appeler
	
	
	public int seFaireEscroquer() {
		this.perdreArgent(this.qttArgent);
		this.parler("J'ai tout perdu! Le monde est trop injuste... ");
		return this.qttArgent;
	}
	
	
	public void recevoir(int gain) {
		this.gagnerArgent(gain);
		this.parler(gain+" sous ! "+"Je te remercie généreux donateur!");
	}
}