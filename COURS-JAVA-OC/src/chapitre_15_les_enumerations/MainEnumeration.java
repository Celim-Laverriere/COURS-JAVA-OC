package chapitre_15_les_enumerations;

public class MainEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Langage lang : Langage.values()) {
			if (Langage.JAVA.equals(lang)) {
				System.out.println("J'aime le : " + lang);
			} else {
				System.out.println(lang);
			}
		}
		
		Langage l1 = Langage.JAVA;
		Langage l2 = Langage.PHP;
		Langage l3 = Langage.CPlus;
		
		System.out.println("\n**************************");
		l1.getName();
		l1.getEditor();
		l1.getNumSerie();
		
		System.out.println("\n**************************");
		l2.getEditor();
		l2.getNumSerie();
		l2.getName();
		
		System.out.println("\n**************************");
		l3.getNumSerie();
		l3.getName();
		l3.getEditor();
		
		System.out.println("\n**************************");
		System.out.println(Langage.JAVA );
	}

}
