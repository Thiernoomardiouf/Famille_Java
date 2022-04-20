package Famille;

import java.util.Scanner;

public class Mere extends Personne {
	 private boolean indo;
	 
     public boolean indoAfficheer() {
 		return indo;
     }

	public boolean isIndo() {
		return indo;
	}

	public void setIndo(boolean indo) {
		this.indo = indo;
	}
	public void saisir() {
		super.saisir();
		Scanner info = new Scanner(System.in);
		System.out.println("Vous étes sénégalais ?");
		this.indo = info.nextBoolean();
	}
}
