import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.omg.Messaging.SyncScopeHelper;

import com.mysql.jdbc.Connection;

public class Login {

	public static int CheckLogin(String username , String password){
		ConnectDB conn =new ConnectDB();
		ResultSet rs = conn.SelectConnect("user WHERE username ='"+username+"' && password='"+password+"'");
		
		try {
			if (!rs.next()) {
				System.out.println("username or password has incorrect");
				return 0;
			}else {
				System.out.println("Success");
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String username = "sss";
		String password = "7895";
		int s =CheckLogin(username, password);
		if (s==1) {
			ConnectDB conn =new ConnectDB();
			ResultSet rs = conn.SelectConnect("user WHERE username ='"+username+"' && password='"+password+"'");
			try {
				while (rs.next()){
					System.out.println("-----------------------------------");
					System.out.println(rs.getString("name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
