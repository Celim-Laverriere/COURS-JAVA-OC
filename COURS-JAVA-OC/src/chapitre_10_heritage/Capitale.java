package chapitre_10_heritage;

import chapitre_9_votre_premiere_classe.Ville;

public class Capitale extends Ville {

	private String monument;
	
	public Capitale () {
		this.setNomVille ("toto");
		this.setMonument("aucun");
	}
	
	public Capitale(String nomVille, String nomPays, int nbreHabitants, String monument) {
		super(nomVille, nomPays, nbreHabitants);
		// TODO Auto-generated constructor stub
		this.setMonument(monument);
	}



	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	public String decrisToi () {
		String str = super.decrisToi() + "\n \t ==>> " + getMonument() + " en est un monument !";
		System.out.println("Invocation de super.decrisToi()");
		return str;
	}
}
