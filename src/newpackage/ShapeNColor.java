package newpackage;


import javax.swing.JFrame;
import javax.swing.JPanel;

import javafai.Factory.AbstractFactory;
import javafai.Factory.FactoryProducer;
import javafai.Color.*;

import javafai.Factory.*;

public class ShapeNColor {
    
	public void GetColor_sick(int sickType ,JFrame frame,int LocationX , int LocationY,JPanel jPanel) {

		AbstractFactory color = FactoryProducer.getFactory("Color");
		jPanel = color.getColor(sickType);
		jPanel.setLocation(LocationX, LocationY);
		jPanel.setSize(250, 250);
		frame.add(jPanel);
	}
}
