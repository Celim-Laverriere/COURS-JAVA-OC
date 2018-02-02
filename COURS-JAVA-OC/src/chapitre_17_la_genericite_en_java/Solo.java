package chapitre_17_la_genericite_en_java;

public class Solo <T> {

	private T valeur;
	

	public Solo() {
		super();
		this.valeur = null;
	}

	public Solo(T valeur) {
		super();
		this.setValeur(valeur);
	}

	public T getValeur() {
		return valeur;
	}

	public void setValeur(T valeur) {
		this.valeur = valeur;
	}
	
}
