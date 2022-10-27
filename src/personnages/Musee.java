package personnages;

public class Musee {
	
	private int nbTrophee = 0;
	private Trophee [] tab = new Trophee[200];

	public void donnerTrophees(Gaulois gaulois , Equipement equipement) {
		Trophee trophee = new Trophee(gaulois, equipement );
		tab[nbTrophee] = trophee;
		nbTrophee ++;
	}
}

