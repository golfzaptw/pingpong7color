/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karn
 */
public class user extends javax.swing.JFrame {

  
    
    
    public user() {
        initComponents();
               setResizable(false);
        
        
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(380, 10, 900, 500);
                
		setTitle("โปรแกรมลูกโปร่ง 7 สี");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_user = new javax.swing.JTabbedPane();
        jTextField1 = new javax.swing.JTextField();
        tab_suggestion = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        label_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(null);

        tab_user.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tab_user.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tab_userAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        tab_user.addTab("Status", jTextField1);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        tab_suggestion.setViewportView(jTextArea1);

        tab_user.addTab("Suggestion", tab_suggestion);

        getContentPane().add(tab_user);
        tab_user.setBounds(30, 50, 840, 390);

        label_title.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        label_title.setText("User : Kran");
        getContentPane().add(label_title);
        label_title.setBounds(30, 10, 130, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/background_03.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 990, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_userAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tab_userAncestorAdded
        
      
      ShowData(); // run  ฟังชัน ShowData();
     
        
        
    }//GEN-LAST:event_tab_userAncestorAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new user().setVisible(true);
                
                
                    
            }
        });
        
        
      
         
       
         
         
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_title;
    private javax.swing.JScrollPane tab_suggestion;
    private javax.swing.JTabbedPane tab_user;
    // End of variables declaration//GEN-END:variables

    private void initComponentls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
     public  void ShowData(){
                                       
            try {
         
            String sql = " select * from datauser2 "; 
            Connection c=connectDB();
            ResultSet rs=c.createStatement().executeQuery(sql);
            
            rs.first(); // การเรียกเฉพาะข้อมูลตัวแรก
            datatoText(rs);
             showedatacolor(rs);
            
            
            
           // while (rs.next()) {  //
               
                 // System.out.println(rs.getString("name"));  // 
                  
                    
                //}
            
            
                                  
        } catch (Exception e) {
            
   
        }
                         
    
    }
    
  


    public  static  Connection connectDB(){
    
        
        String db_name="datauser"; // ชื่อ database
                         String user="root";
                         String pass="";
                         String hostName="localhost";
                         String driverName="com.mysql.jdbc.Driver";
        
    try{
    
    Class.forName(driverName);
            String url="jdbc:mysql://"+hostName+"/"+db_name;
            Connection con=DriverManager.getConnection(url,user,pass);
            System.err.println("ConnectComplete");
            
            Statement s = null; 
            s = con.createStatement();
            
           return con;
    
    } catch(Exception e){
    
    }
        return null;
    
    }



public  void datatoText(ResultSet rs){ // ฟังชั่นการ setค่า  ลงกล่องข้อความ
    
     try{
         
    jTextArea1.setText(rs.getString("suggestion")); // การ setลงกล่องข้อความ
   
    } catch(Exception e){
    
    }
     

}


public  void  showedatacolor(ResultSet rs){
   try{
       
       
   
       System.out.println("test:"+rs.getString("ststus"));
       String sta = null;
      
       
           

       
       
    String name = rs.getString("ststus");
    if(name.equals("red")){
    
                ShapeFactory shapeFactory = new ShapeFactory();
                JPanel shape1 = shapeFactory.getShape("Circle");
		shape1.setSize(500, 700);
                
                 
		jTextField1.add(shape1);
		shape1.setVisible(true);
             	jTextField1.setBackground(Color.WHITE);
		
              
  
             
		

             
    }else{
    
    }

    } catch(Exception e){
    
    }

}

     
  






}


       
    
    
    
    
    
    
    
    
 
    
    


