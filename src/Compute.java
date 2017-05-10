import java.sql.*;
public class Compute {
	public static void main(String[] args) {
		ConnectDB conn = new ConnectDB();
		ResultSet rs = conn.SelectConnect("sick_ness");
		
		try {
			while (rs.next()) {
				String colod = rs.getString("color");
				System.out.println(colod);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}
}
