package chapitre_17_la_genericite_en_java;

import java.util.ArrayList;

public class MainGenericite {

	public static void main(String[] args) {
		
		Solo<Integer> val = new Solo<Integer>(12);
		Solo<String> valS = new Solo<String>("Test chaîne de caractère !");
		int nbre = val.getValeur();
		System.out.println(val.getValeur() + " et " + valS.getValeur() + " et " + nbre);
		
		Duo <String, Boolean> dual = new Duo<String, Boolean>("Toto", true);
		System.out.println("\nValeur de l'objet dual : val1 = " + dual.getValeur1() + ", val2 = " + dual.getValeur2());
		
		Duo<Double, Character> dual2 = new Duo<Double, Character>(12.2585, 'c');
		System.out.println("\nValeur de l'objet dual2 : val1 = " + dual2.getValeur1() + ", val2 = " + dual2.getValeur2());
			
		System.out.println("\t\nListe de String");
		System.out.println("-----------------------------------------");
		ArrayList<String> listeString = new ArrayList<String>();		
		listeString.add("Une chaîne");
		listeString.add("Une autre");
		listeString.add("Encore une autre");
		listeString.add("Allez, une autre");
		
		for (String str : listeString) {
			System.out.println(str);
		}
		
		System.out.println("\n Liste de float");
		System.out.println("-----------------------------------------");
		
		ArrayList<Float> listeFloat = new ArrayList<Float>();
		listeFloat.add(12.25f);
		listeFloat.add(15.25f);
		listeFloat.add(2.25f);
		listeFloat.add(128764.25f);
		
		for (Float float1 : listeFloat) {
			System.out.println(float1);
		}
		

		
		
		
		
		
		
		
	}
}
