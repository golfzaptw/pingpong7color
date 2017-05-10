package newpackage;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle extends JPanel implements Shape {

	public void paintComponent(Graphics g) {
		g.drawOval(600, 300, 30, 30);
	}
}
