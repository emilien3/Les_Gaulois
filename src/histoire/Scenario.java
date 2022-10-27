package histoire;
import personnages.Gaulois;
import personnages.Musee;
import personnages.Romain;
import personnages.Druide;
import personnages.Equipement;


public class Scenario {
	
	
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois ("Asterix", 8);
		Gaulois obelix = new Gaulois ("Obélix", 16);
		Romain minus = new Romain ("Minus", 6);
		Druide panoramix = new Druide ("Panoramix", 5, 10);
		Musee musee = new Musee();
		
		Equipement bouclier = Equipement.BOUCLIER;
		Equipement casque = Equipement.CASQUE;
		
		minus.sEquiper(bouclier );
		minus.sEquiper(casque);
		
		panoramix.parler("Je vais aller préparer une petite potion...");
		
		panoramix.preparerPotion();
	
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.faireUneDonnation(musee);
	}

}
