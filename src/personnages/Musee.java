package personnages;

public class Musee {
	int nbTrophee = 0;
	public Equipement [] tab = new Equipement[200];

	public void donnerTrophees(Gaulois gaulois , Equipement equipement) {
		tab[nbTrophee] = equipement; 
		nbTrophee++;
	}

}

