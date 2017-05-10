package javafai.Factory;

import java.awt.Color;

import javax.swing.JPanel;
import javafai.Color.*;

public class ColorFactory extends AbstractFactory {

	
public	JPanel getColor(int sickType) {
		if(sickType == 1){
			return new White();
		}else if(sickType == 2){
			return	new Green();
		}else if(sickType == 3){
			return new Green();
		}else if(sickType == 4){
			return new Yellow();
		}else if(sickType == 5){
			return new Orange();
		}else if(sickType == 6){
			return new Red();
		}else if(sickType == 7){
			return new Black();
		}
		return null;
	}

public	JPanel getShape() {
		// TODO Auto-generated method stub
		return null;
	}

}
