package chapitre_18_les_flux_entree_sortie;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class MainObjectInputStreamObjectOutputStream {

	public static void main(String[] args) {
		
		ObjectInput ois;
		ObjectOutput oos;
		
		try {
			
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(
							new File("Game.txt"))));
					
			oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
			oos.writeObject(new Game("Tome Raider", "Plateforme", 23.45));
			oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
			oos.close();
			
			ois = new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(
							new File("Game.txt"))));
			
			try {
				
				System.out.println("Affichage des jeux : ");
				System.out.println("*******************************");
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
