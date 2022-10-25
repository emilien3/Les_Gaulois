package personnages;

public class Trophee {
	
	Gaulois gaulois; 
	Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement;
	}
	
	public Equipement getEquipement() {
		return equipement;
	}
	
	public Gaulois getGaulois() {
		return gaulois;
	}
	
	public String donnerNom(Gaulois gaulois) {
		return gaulois.getNom();
	}
}
