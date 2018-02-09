package chapitre_18_les_flux_entree_sortie;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MainNio {

	public static void main(String[] args) {
		
		FileInputStream fis;
		BufferedInputStream bis;
		FileChannel fc;
		ObjectInput ios;
		
		try {
			
			fis = new FileInputStream(new File("dictionnaire.txt"));
			bis = new BufferedInputStream(fis);
			
//			byte [] buff = new byte [64];
//			int n = 0;
//			String str = "";
//			
//			while ((n = fis.read(buff)) >= 0) {
//			
//				for (byte b : buff) {
//					str += (char)b;
//					System.out.println("");
//				}
//				
//				System.out.println(str);
//			}
			
			long time = System.currentTimeMillis();
			
			while (bis.read() != -1) {
			
			}
			
			System.err.println("Temps d'exécution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));
			
			fis = new FileInputStream(new File("dictionnaire.txt"));
			fc = fis.getChannel();
			
			int size = (int)fc.size();
			
			ByteBuffer bBuff = ByteBuffer.allocate(size);
			
			time = System.currentTimeMillis();
			
			fc.read(bBuff);
			
			bBuff.flip();
			
			System.out.println("Temps d'exécution avec un nouveua buffer : " + (System.currentTimeMillis() - time));
			
			byte [] tabByte = bBuff.array();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
