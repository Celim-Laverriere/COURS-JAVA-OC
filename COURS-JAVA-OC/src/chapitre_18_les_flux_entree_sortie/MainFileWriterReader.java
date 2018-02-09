package chapitre_18_les_flux_entree_sortie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriterReader {

	public static void main(String[] args) {
		
		File file = new File("TestFileWrite.txt");
		FileWriter fw;
		FileReader fr;
		
		try {
			
			fw = new FileWriter(file);
			String str = "Bonjour à tous, mais Zéros ! \n";
			str += "\t Comment allez-vous ? \n";
			
			fw.write(str);
			fw.close();
			
			fr = new FileReader(file);
			str = "";
			int i = 0;
			
			while ((i = fr.read()) != -1) {
				str += (char) i;
			}
			
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			 e.printStackTrace();
		}

	}

}
