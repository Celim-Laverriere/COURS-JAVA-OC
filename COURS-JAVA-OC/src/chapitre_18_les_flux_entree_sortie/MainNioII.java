package chapitre_18_les_flux_entree_sortie;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class MainNioII {

	public static void main(String[] args) {
		
		Path path = Paths.get("test.txt");
		System.out.println("Chemin absolu du fichier : " + path.toAbsolutePath());
		System.out.println("Est-ce qu'il existe ? " + Files.exists(path));
		System.out.println("Nom du fichier : " + path.getFileName());
		System.out.println("Est-ce un r�pertoire ? " + Files.isDirectory(path));
		
		//On r�cup�re maintenant la liste des r�pertoires dans une collection typ�e
		//Via l'objet FileSystem qui repr�sente le syst�me de fichier de l'OS h�bergeant la JVM
		Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

		//Maintenant, il ne nous reste plus qu'� parcourir
		for(Path chemin : roots){
		  System.out.println(chemin);
		  //Pour lister un r�pertoire, il faut utiliser l'objet DirectoryStream
		  //L'objet Files permet de cr�er ce type d'objet afin de pouvoir l'utiliser
		  try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin)){
			
		    int i = 0;
		    for(Path nom : listing){
		      System.out.print("\t\t" + ((Files.isDirectory(nom)) ? nom+"/" : nom));
		      i++;
		      if(i%4 == 0)System.out.println("\n");
		    }
				
		  } catch (IOException e) {
		    e.printStackTrace();
		  }

		}

	}
}
