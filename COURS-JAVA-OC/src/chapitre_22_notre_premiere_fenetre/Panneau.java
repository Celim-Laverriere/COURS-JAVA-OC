package chapitre_22_notre_premiere_fenetre;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {

	public void paintComponent(Graphics g) {
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		
		System.out.println("Je suis exécutée");
		g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
		g.drawRect(10, 10, 50, 60);
		g.fillRect(65, 65, 30, 40);
		g.drawRoundRect(65, 10, 40, 50, 10, 10);
		g.fillRoundRect(200, 10, 30, 40, 5, 5);
		g.drawLine(0, 0, this.getWidth(), this.getHeight());
		g.drawLine(0, this.getHeight(), this.getWidth(), 0);
		
		int [] x = {20, 30, 50, 60, 60, 50, 30, 20};
		int [] y = {30, 20, 20, 30, 50, 60, 60, 50};
		g.drawPolyline(x, y, 8);
		
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.setColor(Color.BLUE);
		g.drawString("Tiens ! Le Site du Zéro ! ", 80, 40);
		
		try {
			Image img = ImageIO.read(new File("image.jpg"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Graphics2D g2d = (Graphics2D)g;
//		GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.CYAN, true);
//		g2d.setPaint(gp);
//		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
//	    Graphics2D g2d = (Graphics2D)g;
//	    GradientPaint gp, gp2, gp3, gp4, gp5, gp6; 
//	    gp = new GradientPaint(0, 0, Color.RED, 20, 0, Color.magenta, true);
//	    gp2 = new GradientPaint(20, 0, Color.magenta, 40, 0, Color.blue, true);
//	    gp3 = new GradientPaint(40, 0, Color.blue, 60, 0, Color.green, true);
//	    gp4 = new GradientPaint(60, 0, Color.green, 80, 0, Color.yellow, true);
//	    gp5 = new GradientPaint(80, 0, Color.yellow, 100, 0, Color.orange, true);
//	    gp6 = new GradientPaint(100, 0, Color.orange, 120, 0, Color.red, true);
//
//	    g2d.setPaint(gp);
//	    g2d.fillRect(0, 0, 20, this.getHeight());               
//	    g2d.setPaint(gp2);
//	    g2d.fillRect(20, 0, 20, this.getHeight());
//	    g2d.setPaint(gp3);
//	    g2d.fillRect(40, 0, 20, this.getHeight());
//	    g2d.setPaint(gp4);
//	    g2d.fillRect(60, 0, 20, this.getHeight());
//	    g2d.setPaint(gp5);
//	    g2d.fillRect(80, 0, 20, this.getHeight());
//	    g2d.setPaint(gp6);
//	    g2d.fillRect(100, 0, 40, this.getHeight());
		
	}
}
