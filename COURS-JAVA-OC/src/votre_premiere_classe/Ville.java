package votre_premiere_classe;

public class Ville {

	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;
	private static int nbreInstances = 0;
	
	public Ville() {
		super();
		System.out.println("\nCréation d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		categorieVille();
		nbreInstances++;
	}

	public Ville(String nomVille, String nomPays, int nbreHabitants) {
		super();
		System.out.println("création d'un ville avec des paramètres !");
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.nbreHabitants = nbreHabitants;
		categorieVille();
		nbreInstances++;
	}
	
	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
		categorieVille();
	}

	public char getCategorie() {
		return categorie;
	}

	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}
	
	public static int getNbreInstances() {
		return nbreInstances;
	}

	public static void setNbreInstances(int nbreInstances) {
		Ville.nbreInstances = nbreInstances;
	}

	private void categorieVille () {
		
		int [] bornesSuperieures = {0, 1000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 10_000_000};
		char[] categories = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		
		while (i < bornesSuperieures.length && getNbreHabitants() >= bornesSuperieures [i]) {
			i++;
			setCategorie(categories [i]);
		}
	}
	
	public String comparer(Ville v1) {
		String str = new String();
		
		if (v1.getNbreHabitants() > this.nbreHabitants) {
			str = v1.getNomVille() + " est une ville plus peuplée que " + this.nomVille; 
		} else {
			str = this.nomVille + " est une ville plus peuplée que " + v1.getNomVille();
		}
		return str;
	}
	
	public String decrisToi () {
		
		return "\n\t" + getNomVille() + " est une ville de " + getNomPays() + ", elle comporte : " + getNbreHabitants() + " habitant(s) => elle est donc de catégorie " + getCategorie() 
		+ "\nLe nombre d'instances de la classe Ville est " + getNbreInstances();
 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
