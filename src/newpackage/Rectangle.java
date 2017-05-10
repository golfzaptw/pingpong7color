package newpackage;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Rectangle extends JPanel implements Shape {

	public void paintComponent(Graphics g) {
		g.drawRect(100, 100, 300, 200);
	}
}
