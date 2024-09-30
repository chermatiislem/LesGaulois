package personnages;

import java.util.Arrays;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois =0;
	public Village(String nom,int nbVillageoisMaximum) {
	this.nom = nom;
	villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) 
	{
		this.chef = chef;
	}
	
	public String getNom() {
	return nom;
	}
	public void ajouterHabitant(Gaulois habitantajouter) {
		if (nbVillageois < villageois.length) {
		villageois[nbVillageois]= habitantajouter;
		nbVillageois++;
		}
	}
	@Override
	public String toString() {
		return "Village [nom=" + nom + ", chef=" + chef + ", villageois=" + Arrays.toString(villageois)
				+ ", nbVillageois=" + nbVillageois + "]";
	}
	public Gaulois trouverHabitant(int nmVillageois)
	{
		return villageois[nmVillageois];
		
		
	}
	public static void main(String[] args) {
		Village village =new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//ca produit une erreur car le 30 eme habitant est le numero 29 dan le tableau
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		Gaulois Asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(Asterix);
		village.setChef(abraracourcix);
		Gaulois gaulois = village.trouverHabitant(0);
		System.out.println(gaulois);
		
		
		
		
	}
}
