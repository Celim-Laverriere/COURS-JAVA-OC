package chapitre_18_les_flux_entree_sortie;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTryWithResources {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("test.txt"); FileOutputStream fos = new FileOutputStream("test4.txt")){
			
			byte [] buf = new byte [16];
			int n = 0;
			
			while ((n = fis.read(buf)) >= 0) {
				fos.write(buf);
				
				for (byte bit : buf) 
					System.out.print("\t" + bit + "(" + (char)bit + ")");
					System.out.println("");
			}
			
			System.out.println("Copie terminée !");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
