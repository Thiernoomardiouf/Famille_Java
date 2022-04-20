package Famille;
import java.util.*;

public class Personne implements IPersonne{
	protected String nom;
	protected String prenom;
	protected int age;
	@Override
	public String manger() {
		Scanner info = new Scanner(System.in);
		System.out.println("Donner ce que vous manger");
		String mange = info.nextLine();
		return mange;
		
	}
	@Override
	public String travailler() {
		Scanner info = new Scanner(System.in);
		System.out.println("Donner votre travaille");
		String travail = info.nextLine();
		return travail;
	}
	@Override
	public void saisir() {
		Scanner info = new Scanner(System.in);
		System.out.println("Personne: Donner votre nom");
		this.nom = info.nextLine();
		System.out.println("Personne: Donner votre pernom");
		this.prenom = info.nextLine();
		System.out.println("Personne: Donner votre age");
		this.age = info.nextInt();
		
	}
	@Override
	public void afficher() {
		System.out.println("La personne est :" + prenom +" " + nom);
		System.out.println("Elle est agée de :"+ age);
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
