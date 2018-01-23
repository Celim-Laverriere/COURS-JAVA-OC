package chapitre_13_les_classes_abstraites_et_les_interfaces;

public class Tigre extends Felin {

	public Tigre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tigre (String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je grogne très fort !");
	}

}
