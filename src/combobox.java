import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.PerConnectionLRUFactory;




public class combobox {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		 JFrame frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(800, 600);
	
		 ShapeNColor sa = new ShapeNColor();
		 JPanel s = sa.GetColor_sick(2, frame, 50, 50);
		frame.add(s);
		frame.setVisible(true);
	 }
	
	}
	
	
