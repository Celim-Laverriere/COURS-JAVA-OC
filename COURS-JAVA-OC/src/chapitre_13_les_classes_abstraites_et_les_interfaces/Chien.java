package chapitre_13_les_classes_abstraites_et_les_interfaces;

public class Chien extends Canin implements Rintintin{

	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chien (String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	
	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("J'aboie sans raison !");
		
	}

	@Override
	public void faireCalin() {
		// TODO Auto-generated method stub
		System.out.println("Je te fais un Gros Câlin !!!");
	}

	@Override
	public void feireLechouille() {
		// TODO Auto-generated method stub
		System.out.println("Je fais de grosses léchouilles !");
	}

	@Override
	public void faireLeBeau() {
		// TODO Auto-generated method stub
		System.out.println("Je fais le beau !");
	}

}
