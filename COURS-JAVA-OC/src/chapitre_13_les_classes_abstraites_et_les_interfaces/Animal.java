package chapitre_13_les_classes_abstraites_et_les_interfaces;

public abstract class Animal {

	protected String couleur;
	protected int poids;
	
	protected void manger () {
		System.out.println("Je mange de la viande ! ");
	}
	
	protected void boire () {
		System.out.println("Je bois de l'eau !");
	}
	
	abstract void deplacement ();
	abstract void crier ();
	
	public String toString () {
		String str = "je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pèse " + this.poids + " Kilos";
			return str;
	}
	
	
}
