package chapitre_14_les_exceptions;

public class MainExceptions {

	public static void main(String[] args) {
		
		int j = 20, i = 0;
		
		try {
		System.out.println(j/i);
		} catch (ArithmeticException e) {
			System.out.println("Division par z�ro ! " + e.getMessage());
		}
		System.out.println("coucou toi");

		try {
			System.out.println("\n => " + (1/0));
		} catch (ClassCastException e) {
			e.printStackTrace();
		} finally {
			System.out.println("action faite syst�matiquement !");
		}
	}

}
