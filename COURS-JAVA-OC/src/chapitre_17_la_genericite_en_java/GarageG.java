package chapitre_17_la_genericite_en_java;

import java.util.ArrayList;

public class GarageG {

	ArrayList<Voiture> list = new ArrayList<Voiture>();
	
	public void add(ArrayList<? extends Voiture> listVoiture) {
		for (Voiture voiture : listVoiture) {
			list.add(voiture);
		}
		
		System.out.println("Contenu de notre garage : ");
		for (Voiture voiture : listVoiture) {
			System.out.println(voiture.toString());
		}
	}
}
