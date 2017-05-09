/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author karn
 */
public class register extends javax.swing.JFrame {

    
    public register() {
        initComponents();
               setResizable(false);
        
        
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(380, 10, 900, 500);
                
		setTitle("โปรแกรมลูกโปร่ง 7 สี");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        label_password = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        field_password = new javax.swing.JPasswordField();
        label_title = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(null);

        submit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(510, 300, 300, 50);

        label_password.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_password.setText("Password :");
        getContentPane().add(label_password);
        label_password.setBounds(420, 180, 80, 21);

        label_username.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_username.setText("Username :");
        getContentPane().add(label_username);
        label_username.setBounds(420, 120, 80, 21);

        txt_username.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username);
        txt_username.setBounds(510, 110, 300, 40);

        field_password.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(field_password);
        field_password.setBounds(510, 170, 300, 40);

        label_title.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        label_title.setText("Register");
        getContentPane().add(label_title);
        label_title.setBounds(510, 50, 130, 40);

        label_name.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_name.setText("Name :");
        getContentPane().add(label_name);
        label_name.setBounds(440, 240, 70, 21);

        txt_name.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_name);
        txt_name.setBounds(510, 230, 140, 40);

        txt_surname.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_surname);
        txt_surname.setBounds(670, 230, 140, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/register.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 90, 270, 210);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/background_03.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 990, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
       
        ConnectDB db = new ConnectDB();
        
         try {
            Class.forName(db.driverName);
            
            Connection con=DriverManager.getConnection(db.url,db.user,db.pass);
            System.err.println("ConnectComplete");
            
            Statement s = null; // ประกาศ statement
            s = con.createStatement();
            /***********/
            String sql = "INSERT INTO user "+ "(username,password,name,surname) "
			+ "VALUES ('" + txt_username.getText() + "','"
			+ field_password.getText()+ "','"
			+ txt_name.getText() + "'" + ",'"
			+ txt_surname.getText() + "'      ) ";
					
            
            s.execute(sql);
				
					JOptionPane.showMessageDialog(null,"ทำรายการ Successfully");
                                        
                                        new login().setVisible(true);
             /*********/
                                  
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
                         
         
        
        
       
        
        
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new register().setVisible(true);
                
                    
            }
        });
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField field_password;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_username;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void initComponentls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
