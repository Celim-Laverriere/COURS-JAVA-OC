package chapitre_19_Java_et_la_reflexivite;

public class Paire {

	private String valeur1, valeur2;

	
	public Paire() {
		super();
		this.valeur1 = null;
		this.valeur2 = null;
		System.out.println("Instanciation !");
	}


	public Paire(String valeur1, String valeur2) {
		super();
		this.valeur1 = valeur1;
		this.valeur2 = valeur2;
		System.out.println("Instanciation avec des paramètres !");
	}


	public String getValeur1() {
		return valeur1;
	}


	public void setValeur1(String valeur1) {
		this.valeur1 = valeur1;
	}


	public String getValeur2() {
		return valeur2;
	}


	public void setValeur2(String valeur2) {
		this.valeur2 = valeur2;
	}
	
	public String toString () {
		return "Je suis un objet qui a pour valeur : "+ this.valeur1 + " - " + this.valeur2;
	}
	
}
