package newpackage;


import javax.swing.JPanel;

public class ShapeFactory {
	public JPanel getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
