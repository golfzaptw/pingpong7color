import java.lang.Thread.State;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

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
