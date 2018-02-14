package chapitre_23_une_animation;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauAnimation extends JPanel{

	private int posX = -50;
	private int posY = -50;
	
	public void paintComponent (Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.RED);
		g.fillOval(posX, posY, 50, 50);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
