package histoire;
import personnages.Humain;

public class Yakusa extends Humain {
	
	private String clan;
	private int reputation = 0;
	
	public Yakusa(String nom, String boisson, int qttArgent) {
		super(nom, boisson, qttArgent);
	}
	
	public void extorquer(Commercant victime){
		this.parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		this.qttArgent += victime.getQttArgent();
		victime.seFaireEscroquer();
	}
	
}
