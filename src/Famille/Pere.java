package Famille;

import java.util.Scanner;

public class Pere extends Personne {
	private float salaire;
	private int nbreEnfant;
	
	public String travailler() { 
		Scanner info = new Scanner(System.in);
		super.travailler();
		System.out.println("C'est quel type de contrat");
		String contrat = info.nextLine();
		String trav = this.getPrenom() + " a un contrat de travail "+ contrat;
		return trav;
	}
	
	public void saisir() {
		super.saisir();
		Scanner info = new Scanner(System.in);
		System.out.println("Quel est votre salaire ?");
		this.salaire = info.nextFloat();
		System.out.println("Vous avez combien d'enfants ?");
		this.nbreEnfant = info.nextInt();
	}
	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public int getNbreEnfant() {
		return nbreEnfant;
	}

	public void setNbreEnfant(int nbreEnfant) {
		this.nbreEnfant = nbreEnfant;
	}

}
