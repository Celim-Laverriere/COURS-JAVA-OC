package chapitre_9_votre_premiere_classe;

import java.security.GeneralSecurityException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville ville = new Ville();
		
		Ville ville1 = new Ville("Marseille", "France", 123_456);
		
		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", "France", 1_456_789);
		Ville v2 = new Ville("Rio", "Brésil", 3_653_987);
		
		System.out.println("\n v = " + v.getNomVille() + " ville de " + v.getNbreHabitants() + " habitants se situant en " + v.getNomPays());
		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
		System.out.println("\n v1 = " + v1.getNomVille() + " ville de " + v1.getNbreHabitants() + " habitants se situant en " + v1.getNomPays());
		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
		System.out.println("\n v2 = " + v2.getNomVille() + " ville de " + v2.getNbreHabitants() + " habitants se situant en " + v2.getNomPays());
		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
		
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		
		System.out.println("\n v1 = " + v1.getNomVille() + " ville de " + v1.getNbreHabitants() + " habitants se situant en " + v1.getNomPays());
		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
		System.out.println("\n v2 = " + v2.getNomVille() + " ville de " + v2.getNbreHabitants() + " habitants se situant en " + v2.getNomPays());
		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
		
		v1.setNomVille("Hong kong");
		v2.setNomVille("Paris");
		
		System.out.println("\n v1 = " + v1.getNomVille() + " ville de " + v1.getNbreHabitants() + " habitants se situant en " + v1.getNomPays());
		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
		System.out.println("\n v2 = " + v2.getNomVille() + " ville de " + v2.getNbreHabitants() + " habitants se situant en " + v2.getNomPays());
		System.out.println("\nLe nombre d'instances de la classe Ville est " + Ville.getNbreInstances());
		
		System.out.println(v.decrisToi()); 
		System.out.println(v1.decrisToi()); 
		System.out.println(v2.decrisToi());
		
		System.out.println(v2.comparer(v1));
	}

}
