package Famille;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//Scanner info = new Scanner(System.in);
		Pere Omar = new Pere();
		Mere Mafemme = new Mere();
		
		System.out.println("Saisir les informations du père");
		Omar.saisir();
		String travail = Omar.travailler();
		System.out.println("Les informations du père :");
		Omar.afficher();
		System.out.println("Les infos sur le travail:" + travail);
		System.out.println("Son salaire est :" + Omar.getSalaire());
		System.out.println("Il a : " + Omar.getNbreEnfant() + " enfants.");
		
		System.out.println("Saisir les informations de la mère");
		Mafemme.saisir();
		System.out.println("Les informations de la mère :");
		Mafemme.afficher();
		System.out.println("Elle est sénégalaise :"+ Mafemme.isIndo());
		
		System.out.println("Saisir les informations de l'enfant");
		Enfant moustapha = new Enfant();
		moustapha.setPere(Omar);
		moustapha.setMere(Mafemme);
		moustapha.saisir();
		moustapha.afficher();

	}

}
