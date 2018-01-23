package chapitre_13_les_classes_abstraites_et_les_interfaces;

public class Chat extends Felin {

	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Chat (String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je miaule sur les toits !");
	}
}
