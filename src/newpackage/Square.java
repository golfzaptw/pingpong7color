package newpackage;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Square extends JPanel implements Shape {

	public void paintComponent(Graphics g) {
		g.drawRect(150, 150, 300, 300);
	}
}
