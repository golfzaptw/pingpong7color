/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dolphinz
 */
public class ConnectDB {
	
	public ResultSet SelectConnect(String collum) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pingpong","root","");
		    System.out.println("Yeddddddd");
		    Statement s = null;
		    s = conn.createStatement();
		    String sql = "SELECT * FROM "+collum;
		    Statement 
		    
		    stmt;
		    stmt=conn.createStatement();
		    
		    ResultSet rs = stmt.executeQuery(sql);
		    return rs;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
