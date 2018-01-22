package chapitre_9_votre_premiere_classe;

import java.security.GeneralSecurityException;

import chapitre_10_heritage.Capitale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/******************** Chapitre 9 - Votre première classe *****************************/	
//		Ville ville = new Ville();
//		
//		Ville ville1 = new Ville("Marseille", "France", 123_456);
//		
//		Ville v = new Ville();
//		Ville v1 = new Ville("Marseille", "France", 1_456_789);
//		Ville v2 = new Ville("Rio", "Brésil", 3_653_987);
//		
//		System.out.println("\n v = " + v.getNomVille() + " ville de " + v.getNbreHabitants() + " habitants se situant en " + v.getNomPays());
//		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
//		System.out.println("\n v1 = " + v1.getNomVille() + " ville de " + v1.getNbreHabitants() + " habitants se situant en " + v1.getNomPays());
//		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
//		System.out.println("\n v2 = " + v2.getNomVille() + " ville de " + v2.getNbreHabitants() + " habitants se situant en " + v2.getNomPays());
//		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
//		
//		Ville temp = new Ville();
//		temp = v1;
//		v1 = v2;
//		v2 = temp;
//		
//		System.out.println("\n v1 = " + v1.getNomVille() + " ville de " + v1.getNbreHabitants() + " habitants se situant en " + v1.getNomPays());
//		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
//		System.out.println("\n v2 = " + v2.getNomVille() + " ville de " + v2.getNbreHabitants() + " habitants se situant en " + v2.getNomPays());
//		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
//		
//		v1.setNomVille("Hong kong");
//		v2.setNomVille("Paris");
//		
//		System.out.println("\n v1 = " + v1.getNomVille() + " ville de " + v1.getNbreHabitants() + " habitants se situant en " + v1.getNomPays());
//		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
//		System.out.println("\n v2 = " + v2.getNomVille() + " ville de " + v2.getNbreHabitants() + " habitants se situant en " + v2.getNomPays());
//		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
//		
//		System.out.println(v.decrisToi()); 
//		System.out.println(v1.decrisToi()); 
//		System.out.println(v2.decrisToi());
//		
//		System.out.println(v2.comparer(v1));
		
		
/******************** Chapitre 10 - L'héritage *****************************/		
		Capitale cap = new Capitale("Paris", "France", 5_253_698, "La tour Eiffel");
		System.out.println(cap.decrisToi());
		
		Ville [] tableau = new Ville[6];
		
		String [] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int [] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		
		for (int i = 0; i < 6; i++) {
			
			if ( i < 3) {
				Ville V = new Ville (tab[i], "France", tab2[i]);
				tableau [i] = V;
			} else {
				Capitale C = new Capitale(tab[i], "France", tab2[i], "la tour Eiffel");
				tableau [i] = C;
			}
		}
		
		for (Ville v : tableau) {
			System.out.println(v.decrisToi() + "\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
