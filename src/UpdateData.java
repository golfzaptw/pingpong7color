import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.text.AbstractDocument.LeafElement;

import com.mysql.jdbc.Connection;

public class UpdateData {

	public void LetUp(String cmd, String status, String id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pingpong", "root", "");

			Statement s = null;
			s = conn.createStatement();

			if (s.execute("UPDATE user SET sick_type='" + status + "',Commend='" + cmd + "' WHERE id = " + id)) {

			} else {
				System.out.println("ได้ละดอกกกกกกก");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
