package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void parler(String texte) {
		String parole = prendreParole();
		
	}
	private String prendreParole() {

		return null;
	}
    public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix",8);
		System.out.println(Asterix);
		Village village = new Village("b1",30);
		village.ajouterHabitant(Asterix);
		System.out.println(village);
		
	}
    

}
