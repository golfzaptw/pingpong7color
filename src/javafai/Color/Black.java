package javafai.Color;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Black extends JPanel implements Colour {

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(java.awt.Color.black);
		g.fillOval(0, 0, 250, 250);
	}

}
