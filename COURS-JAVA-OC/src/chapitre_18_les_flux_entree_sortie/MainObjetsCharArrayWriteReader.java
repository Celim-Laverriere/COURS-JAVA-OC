package chapitre_18_les_flux_entree_sortie;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class MainObjetsCharArrayWriteReader {

	public static void main(String[] args) {
		
		CharArrayWriter caw = new CharArrayWriter();
		CharArrayReader car;
		
		try {
			
			caw.write("Coucou les Zéros");
			System.out.println(caw);
			caw.close();
			
			car = new CharArrayReader(caw.toCharArray());
			int i;
			String str = "";
			
			while ((i = car.read()) != -1) {
				str += (char) i;
			}
			
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
