import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.text.AbstractDocument.LeafElement;

import com.mysql.jdbc.Connection;

public class UpdateData {
public static void main(String[] args) {
	LetUp("หำพเหำะ้หพะ้พหะ้หะำ้ห", "5", "tad");
}
	public static void LetUp(String cmd, String status, String name) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pingpong?useUnicode=yes&characterEncoding=UTF-8", "root", "");

			Statement s = null;
			s = conn.createStatement();
			
			if (s.execute("UPDATE user SET sick_type='" + status + "',Commend='" + cmd + "' WHERE name = '" + name+"'")) {

			} else {
				System.out.println("ได้ละค่ะ");
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
