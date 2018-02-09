package chapitre_18_les_flux_entree_sortie;

import java.io.Serializable;

public class Game implements Serializable  {

	private String nom, style;
	private double prix;
	private Notice notice;
	
	public Game(String nom, String style, double prix) {
		super();
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice();
	}
	
	public String toString () {
		return " Nom du jeu : " + this.nom + "\n Style de jeu : " + this.style + "\n Prix du jeu : " + this.prix + this.notice + "\n";
	}
	
		
}


