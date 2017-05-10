package newpackage;


import javax.swing.JFrame;
import javax.swing.JPanel;

import javafai.Factory.AbstractFactory;
import javafai.Factory.FactoryProducer;
import javafai.Color.*;

import javafai.Factory.*;

public class ShapeNColor {
	public JPanel GetColor_sick(int sickType ,JFrame frame,int LocationX , int LocationY) {

		AbstractFactory color = FactoryProducer.getFactory("Color");
		JPanel Color_OMG = color.getColor(sickType);
		Color_OMG.setLocation(LocationX, LocationY);
		Color_OMG.setSize(250, 250);
		return Color_OMG;
	}
}

