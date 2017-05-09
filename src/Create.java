import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Create {

	public void createData(String id,String status){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pingpong","root","");
		   
		    Statement s = null;
		    s = conn.createStatement();
		   
		   if (s.execute("UPDATE user SET sick_type='"+status+"' WHERE id = "+id)) {
			System.out.println("มึงเสือกผิดที่ละควยถอก");
		}else {System.out.println("ได้ละอิดอก");}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
