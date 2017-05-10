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
		
	Container  contailer =new Container();

		  JComboBox cb = new JComboBox();
		  ConnectDB a = new ConnectDB();
		  ResultSet resulthee = a.SelectConnect("user");
		 
		 
		  try {
			while (resulthee.next()) {
				list1.add(resulthee.getString("name"));
			}  
        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
          for (int i = 0; i < list1.size(); i++) {
			cb.addItem(list1.get(i).toString());
		}
       
          JTextField text = new JTextField("Kuy");
          text.setText("sdfsdfsdf");
          text.setBounds(500, 500, 200, 20);
          cb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(cb.getSelectedItem()+"");
			}
		});
          
          text.setVisible(true);
          frame.add(text);
          contailer.add(text);
          
          
          cb.setSize(200, 20);
          contailer.add(cb);
        
        
        
          frame.add(contailer);
		frame.setVisible(true);
	 }
	
	}
	
	
