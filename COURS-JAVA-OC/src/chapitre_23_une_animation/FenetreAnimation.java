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
		
//		for (;;) {
//			int x = panA.getPosX(), y = panA.getPosY();
//			x++;
//			y++;
//			panA.setPosX(x);
//			panA.setPosY(y);
//			panA.repaint();
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			if (x == panA.getWidth() || y == panA.getHeight()) {
//				panA.setPosX(-50);
//				panA.setPosY(-50);
//			}
//		}
		
		/***********************************************/
		
		int x = panA.getPosX(), y = panA.getPosY();
		
		boolean blackX = false;
		boolean blackY = false;
		
		while (true) {
			
			if (x < 1) {
				blackX = false;
			}
			
			if (x > panA.getWidth()-50) {
				blackX = true;
			}
			
			if (y < 1 ) {
				blackY = false;
			}
			
			if (y > panA.getHeight()-50) {
				blackY = true;
			}
			
			if (!blackX) {
				panA.setPosX(++x);
			} else {
				panA.setPosX(--x);
			}
			
			if (!blackY) {
				panA.setPosY(++y);
			} else {
				panA.setPosY(--y);
			}
			
			panA.repaint();
			
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
