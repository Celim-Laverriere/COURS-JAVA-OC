package chapitre_14_les_exceptions;

public class NombreHabitantException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1372001260729610724L;

	public NombreHabitantException () {
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
	}
	
	public NombreHabitantException (int nbre) {
		System.err.println("Instanciation avec un nombre d'habitants négatif !");
		System.err.println("\t = > " + nbre);
	}
}
