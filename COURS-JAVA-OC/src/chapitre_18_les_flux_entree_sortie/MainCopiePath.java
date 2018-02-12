package chapitre_18_les_flux_entree_sortie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
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
		
		Path source3 = Paths.get("test.txt");
		
		try (InputStream input = Files.newInputStream(source3)){
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 try (BufferedReader reader = Files.newBufferedReader(source3, StandardCharsets.UTF_8)){
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 try (FileSystem zipFS = FileSystems.newFileSystem(Paths.get("monFichier.zip"), null)){
			
			 Files.deleteIfExists(zipFS.getPath("test2.txt"));
			 
			 Path path = zipFS.getPath("nouveau.txt");
			 String message = "Hello world !!!";
			 Files.write(path, message.getBytes());
			 
			 
			 try (DirectoryStream<Path> stream = Files.newDirectoryStream(zipFS.getPath("/"))) {
				
				 for (Path entry : stream) {
					System.out.println(entry);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
			 Files.copy(Paths.get("fichierSurDisque.txt"), zipFS.getPath("fichierDansZIP.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
		 
		 
	}

}
