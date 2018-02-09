package chapitre_18_les_flux_entree_sortie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MainCopiePath {

	public static void main(String[] args) {
		
		Path source = Paths.get("dictionnaire.txt");
		Path cible = Paths.get("dictionnaire2.txt");

		try {
			Files.copy(source, cible, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Path source1 = Paths.get("dictionnaire.txt");
		Path cible1 = Paths.get("testDeplace.txt");
		
		try {
			Files.move(source1, cible1, StandardCopyOption.REPLACE_EXISTING);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Path source2 = Paths.get("test3.txt");
		
		try {
			Files.delete(source2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
