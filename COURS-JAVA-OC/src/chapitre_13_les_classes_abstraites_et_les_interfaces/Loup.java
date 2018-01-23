package chapitre_13_les_classes_abstraites_et_les_interfaces;

public class Loup extends Canin {

	public Loup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loup (String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	
	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je hurle à la lune en faisant ouhouh !");
	}

	
}
