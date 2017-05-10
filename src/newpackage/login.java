/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author karn
 */
public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
               setResizable(false);
        
        
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(380, 10, 900, 500);
                
		setTitle("โปรแกรมลูกโปร่ง 7 สี");
                  
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bnt_register = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        label_password = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 14, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/doctor.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(250, 250));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 70, 220, 270);

        bnt_register.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        bnt_register.setText("Register");
        bnt_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_registerActionPerformed(evt);
            }
        });
        getContentPane().add(bnt_register);
        bnt_register.setBounds(590, 270, 140, 50);

        btn_login.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_login.setText("login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(440, 270, 140, 50);

        label_password.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_password.setText("Password:");
        getContentPane().add(label_password);
        label_password.setBounds(350, 190, 90, 21);

        label_name.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_name.setText("Username:");
        getContentPane().add(label_name);
        label_name.setBounds(350, 130, 90, 21);

        txt_username.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username);
        txt_username.setBounds(440, 120, 300, 40);

        txt_password.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_password);
        txt_password.setBounds(440, 180, 300, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/background_03.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -10, 1000, 480);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 50, 600, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_registerActionPerformed
        // TODO add your handling code here:
        new register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnt_registerActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
		String username = txt_username.getText();
                String password = txt_password.getText();
                ResultSet rs;
		int s =CheckLogin(username, password);
		if (s==1) {
			ConnectDB conn =new ConnectDB();
			rs = conn.SelectConnect("user WHERE username ='"+username+"' && password='"+password+"'");
			try {
				while (rs.next()){
					System.out.println("-----------------------------------");
					System.out.println(rs.getString("name"));
                                    if (rs.getString("role").equalsIgnoreCase("1")) {
                                        JOptionPane.showMessageDialog(null,rs.getString("name")+" Login Successfully");
                                        AfterLogin afterLogin = new AfterLogin();
                                        afterLogin.setId(rs.getString("id"));
                                        afterLogin.setName(rs.getString("name"));
                                        new user().setVisible(true);
                                        this.dispose();
                                    }else {
                                        JOptionPane.showMessageDialog(null,rs.getString("name")+" Admin Login Successfully");
                                        AfterLogin afterLogin = new AfterLogin();
                                        afterLogin.setId(rs.getString("id"));
                                        afterLogin.setName(rs.getString("name"));
                                        new admin().setVisible(true);
                                        this.dispose();
                                    }
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                
            
        }
                 
    }//GEN-LAST:event_btn_loginActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new login().setVisible(true);
                
                    
            }
        });
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_register;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_password;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void initComponentls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
}


