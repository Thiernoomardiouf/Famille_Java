package Famille;

import java.util.Scanner;

public class Enfant {
	public Enfant() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Mere mere;
	private Pere pere;
	private String classe;
	private String ecole;
	
	public Enfant(Pere per, Mere mer) {
		this.mere=mer;
		this.pere=per;
	}
	
	public Mere getMere() {
		return mere;
	}
	public void setMere(Mere mere) {
		this.mere = mere;
	}
	public Pere getPere() {
		return pere;
	}
	public void setPere(Pere pere) {
		this.pere = pere;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public void saisir() {
		Scanner info = new Scanner(System.in);
		System.out.println("Donner le nom de votre classe");
		this.classe = info.nextLine();
		System.out.println("Donner le nom de votre école");
		this.ecole = info.nextLine();
	}
	public void afficher() {
		System.out.println("La mère de l'enfant est :"+ mere.getPrenom() + " "+ mere.getNom() );
		System.out.println("Le père de l'enfant est :"+ pere.getPrenom() + " "+ pere.getNom() );
		System.out.println("Il est en classe de " +  classe + " et son école "+ ecole);
	}

}
