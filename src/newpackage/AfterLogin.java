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
public class AfterLogin {
    public static String sUsername;
    public static String sName;
    
    // Username
    public void setUsername(String username){
    	sUsername = username;
    }
    public static String getUsername(){
    	return sUsername;
    }
    
    // Name
    public void setName(String name){
    	sName = name;
    }
    public static String getName(){
    	return sName;
    }
}
