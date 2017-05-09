/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Dolphinz
 */
public class ConnectDB {
        String db_name="pingpong"; // ชื่อ database
        String user="root";
        String pass="";
        String hostName="localhost";
        String driverName="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://"+hostName+"/"+db_name;
}
