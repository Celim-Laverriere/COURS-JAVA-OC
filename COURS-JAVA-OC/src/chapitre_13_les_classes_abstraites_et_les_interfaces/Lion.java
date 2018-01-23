package chapitre_13_les_classes_abstraites_et_les_interfaces;

public class Lion extends Felin {

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lion (String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je rugis dans la savane !");
	}

}
