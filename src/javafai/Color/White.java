package javafai.Color;

import java.awt.Graphics;

import javax.swing.JPanel;

public class White extends JPanel implements Colour {

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(java.awt.Color.white);
		g.fillOval(0, 0, 250, 250);
	}

}