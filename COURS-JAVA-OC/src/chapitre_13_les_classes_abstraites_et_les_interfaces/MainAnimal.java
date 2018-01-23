package chapitre_13_les_classes_abstraites_et_les_interfaces;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loup l = new Loup("Gris bleuté", 20);
		l.boire();
		l.manger();
		l.deplacement();
		l.crier();
		System.out.println(l.toString());
		
/*******************************************************************/		
		Chien c = new Chien("Blanc", 30);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println("\n" + c.toString());
		
/******************************************************************/		
		System.out.println("----------------------------------------");
		c.faireCalin();
		c.faireLeBeau();
		c.feireLechouille();
		
		System.out.println("----------------------------------------");
		Rintintin r = new Chien();
		r.faireLeBeau();
		r.faireCalin();
		r.feireLechouille();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
