package chapitre_22_notre_premiere_fenetre;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	public Fenetre () {
		this.setTitle("Ma première fenêtre Java !");
		this.setSize(700, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel pan = new JPanel();
		//pan.setBackground(Color.ORANGE);
		//this.setContentPane(pan);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
	
}
