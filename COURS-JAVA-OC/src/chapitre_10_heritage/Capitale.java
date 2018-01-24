package chapitre_10_heritage;

import chapitre_14_les_exceptions.NomVilleException;
import chapitre_14_les_exceptions.NombreHabitantException;
import chapitre_9_votre_premiere_classe.Ville;

public class Capitale extends Ville {

	private String monument;
	
	public Capitale () {
		this.setNomVille ("toto");
		this.setMonument("aucun");
	}
	
	public Capitale(String nomVille, String nomPays, int nbreHabitants, String monument) throws NombreHabitantException, NomVilleException {
		super(nomVille, nomPays, nbreHabitants);
		if (nbreHabitants < 0) {
			throw new NombreHabitantException();
		} else {
			
			this.setMonument(monument);
		}
		
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
