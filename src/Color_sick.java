import java.awt.Color;

import javax.swing.JPanel;

public class Color_sick {
	
	public void GetColor_sick(int sickType , JPanel jPanel) {
		if(sickType == 1){
			jPanel.setOpaque(false);
			jPanel.setBackground(Color.white);
		}else if(sickType == 2){
			jPanel.setOpaque(false);
			jPanel.setBackground(Color.green);
		}else if(sickType == 3){
			jPanel.setOpaque(false);
			jPanel.setBackground(Color.GREEN);
		}else if(sickType == 4){
			jPanel.setOpaque(false);
			jPanel.setBackground(Color.yellow);
		}else if(sickType == 5){
			jPanel.setOpaque(false);
			jPanel.setBackground(Color.orange);
		}else if(sickType == 6){
			jPanel.setOpaque(false);
			jPanel.setBackground(Color.red);
		}else if(sickType == 7){
			jPanel.setOpaque(false);
			jPanel.setBackground(Color.black);
		}else{
			System.out.println("อิดอกมึงต้องมี ซำ ติง วรอง");
		}
	}
	
}
