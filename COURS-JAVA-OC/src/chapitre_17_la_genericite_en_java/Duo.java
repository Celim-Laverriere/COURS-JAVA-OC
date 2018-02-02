package chapitre_17_la_genericite_en_java;

public class Duo <T, S> {

	private T valeur1;
	private S valeur2;

	public Duo() {
		super();
		this.setValeur1(null);
		this.setValeur2(null);
	}

	public Duo(T valeur1, S valeur2) {
		super();
		this.setValeur1(valeur1);
		this.setValeur2(valeur2);
	}

	
	public T getValeur1() {
		return valeur1;
	}

	public void setValeur1(T valeur1) {
		this.valeur1 = valeur1;
	}

	public S getValeur2() {
		return valeur2;
	}

	public void setValeur2(S valeur2) {
		this.valeur2 = valeur2;
	}
	
	public void setValeur(T val1, S val2) {
		setValeur1(val1);
		setValeur2(val2);
	}
}
