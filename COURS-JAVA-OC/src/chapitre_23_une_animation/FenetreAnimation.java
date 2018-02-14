package chapitre_23_une_animation;

import javax.swing.JFrame;

public class FenetreAnimation extends JFrame {

	private PanneauAnimation panA = new PanneauAnimation();
	
	public FenetreAnimation () {
		this.setTitle("Fenêtre d'animatons !!!");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panA);
		this.setVisible(true);
		go();
	}
	
	private void go() {
		
		for (int i = -50; i < panA.getWidth(); i++) {
			int x = panA.getPosX(), y = panA.getPosY();
			x++;
			y++;
			panA.setPosX(x);
			panA.setPosY(y);
			panA.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
