package chapitre_22_notre_premiere_fenetre;

import javax.swing.JFrame;

public class MainJFrame {

	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame();
		
		fenetre.setTitle("Ma prmière fenêtre Java !");
		fenetre.setSize(400, 100);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);

	}

}
