import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Color.*;

import Factory.*;

public class ShapeNColor {
	public void GetColor_sick(int sickType ,JFrame frame,int LocationX , int LocationY) {

		AbstractFactory color = FactoryProducer.getFactory("Color");
		JPanel Color_OMG = color.getColor(sickType);
		Color_OMG.setLocation(LocationX, LocationY);
		Color_OMG.setSize(250, 250);
		frame.add(Color_OMG);
	}
}
