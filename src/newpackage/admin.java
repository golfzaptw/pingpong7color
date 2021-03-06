/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static newpackage.login.CheckLogin;

/**
 *
 * @author karn
 */
public class admin extends javax.swing.JFrame {

    static ArrayList<String> list1 = new ArrayList<>();
    Connection con;
    Statement st;
    ResultSet rs;
    JComboBox jc = new JComboBox();

    public admin() {
        initComponents();
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(380, 10, 900, 500);

        setTitle("โปรแกรมลูกโปร่ง 7 สี");

        ConnectDB a = new ConnectDB();
        ResultSet resulthee = a.SelectConnect("user");

        try {
            while (resulthee.next()) {
                list1.add(resulthee.getString("name"));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i < list1.size(); i++) {
            cbb_user.addItem(list1.get(i).toString());
        }
        cbb_user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                username.setText(cbb_user.getSelectedItem() + "");
                //admin เปลี่ยน user ทำให้ช่องว่าง
                txt_fbs.setText("");
                txt_HBA1C.setText("");
                txt_hba1c.setText("");
                txt_hba1c_2.setText("");
                txt_suggestion.setText("");
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new java.awt.Button();
        submit = new javax.swing.JButton();
        label_fbs = new javax.swing.JLabel();
        label_user = new javax.swing.JLabel();
        txt_HBA1C = new javax.swing.JTextField();
        username_admin = new javax.swing.JLabel();
        label_title1 = new javax.swing.JLabel();
        label_bp = new javax.swing.JLabel();
        label_fbs1 = new javax.swing.JLabel();
        label_fbs2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txt_hba1c = new javax.swing.JTextField();
        txt_hba1c_2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        label_hba1c = new javax.swing.JLabel();
        label_suggestion = new javax.swing.JLabel();
        cbb_user = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_suggestion = new javax.swing.JTextArea();
        member_status = new javax.swing.JPanel();
        show_status = new javax.swing.JLabel();
        txt_fbs = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(null);

        logout.setActionCommand("Logout");
        logout.setLabel("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(770, 10, 90, 40);

        submit.setBackground(new java.awt.Color(51, 204, 255));
        submit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(150, 380, 300, 40);

        label_fbs.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_fbs.setForeground(new java.awt.Color(255, 255, 255));
        label_fbs.setText("FBS :");
        getContentPane().add(label_fbs);
        label_fbs.setBounds(100, 120, 40, 30);

        label_user.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_user.setForeground(new java.awt.Color(255, 255, 255));
        label_user.setText("Select User : ");
        getContentPane().add(label_user);
        label_user.setBounds(50, 80, 110, 21);

        txt_HBA1C.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_HBA1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HBA1CActionPerformed(evt);
            }
        });
        getContentPane().add(txt_HBA1C);
        txt_HBA1C.setBounds(150, 200, 80, 30);

        username_admin.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        getContentPane().add(username_admin);
        username_admin.setBounds(130, 20, 130, 40);

        label_title1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        label_title1.setText("Admin :");
        getContentPane().add(label_title1);
        label_title1.setBounds(30, 10, 130, 40);

        label_bp.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_bp.setForeground(new java.awt.Color(255, 255, 255));
        label_bp.setText("BP :");
        getContentPane().add(label_bp);
        label_bp.setBounds(110, 160, 40, 30);

        label_fbs1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_fbs1.setForeground(new java.awt.Color(255, 255, 255));
        label_fbs1.setText("mg / dL");
        getContentPane().add(label_fbs1);
        label_fbs1.setBounds(250, 120, 60, 30);

        label_fbs2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_fbs2.setForeground(new java.awt.Color(255, 255, 255));
        label_fbs2.setText("mmHg");
        getContentPane().add(label_fbs2);
        label_fbs2.setBounds(360, 160, 60, 30);

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(500, 60, 370, 370);

        txt_hba1c.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_hba1c);
        txt_hba1c.setBounds(150, 160, 80, 30);

        txt_hba1c_2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_hba1c_2);
        txt_hba1c_2.setBounds(260, 160, 80, 30);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("/");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 160, 10, 30);

        label_hba1c.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_hba1c.setForeground(new java.awt.Color(255, 255, 255));
        label_hba1c.setText("HbA1C :");
        getContentPane().add(label_hba1c);
        label_hba1c.setBounds(80, 200, 70, 30);

        label_suggestion.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_suggestion.setForeground(new java.awt.Color(255, 255, 255));
        label_suggestion.setText("Suggestion :");
        getContentPane().add(label_suggestion);
        label_suggestion.setBounds(50, 240, 90, 30);

        cbb_user.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cbb_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_userActionPerformed(evt);
            }
        });
        getContentPane().add(cbb_user);
        cbb_user.setBounds(150, 70, 180, 40);

        txt_suggestion.setColumns(20);
        txt_suggestion.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_suggestion.setRows(5);
        jScrollPane1.setViewportView(txt_suggestion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 240, 300, 130);

        show_status.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        show_status.setText("Member Status");
        member_status.add(show_status);

        getContentPane().add(member_status);
        member_status.setBounds(150, 340, 300, 30);

        txt_fbs.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_fbs);
        txt_fbs.setBounds(150, 120, 80, 30);

        username.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(username);
        username.setBounds(340, 80, 70, 30);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 60, 450, 370);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/background_03.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 990, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        //เมื่อกด submit
        pingpong test = new pingpong();
        Color_sick c = new Color_sick();
        UpdateData update = new UpdateData();
        try {
            int fbs = Integer.parseInt(txt_fbs.getText());
            //รับเป็นเลขทศนิยมได้
            double hba1c = Double.parseDouble(txt_HBA1C.getText());
            int hb_up = Integer.parseInt(txt_hba1c.getText());
            int hb_down = Integer.parseInt(txt_hba1c_2.getText());
            String comment = txt_suggestion.getText();
            String username = cbb_user.getSelectedItem() + "";

            System.out.println("FBS = " + fbs);
            System.out.println("BP = " + hb_up + " / " + hb_down);
            System.out.println("HBA1C = " + hba1c);
            System.out.println("comment : " + comment);

            //ประกาศค่าสีเอาไว้ไห้ user 
            int color_user = test.selectPingpong(fbs, hb_up, hb_down, hba1c);
            show_status.setText(color_user + "");

            update.LetUp(comment, color_user + "", username);

            c.GetColor_sick(color_user, member_status);

            ShapeNColor sc = new ShapeNColor();
            ConnectDB conn = new ConnectDB();

            rs = conn.SelectConnect("user WHERE name ='" + username + "'");

            //jTextArea1.setText(rs.getString("suggestion"));
            JPanel jpp = sc.GetColor_sick(color_user, this, 60, 60);
            jTextField1.add(jpp);
            jTextField1.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error = " + e);
            txt_fbs.setText("");
            txt_HBA1C.setText("");
            txt_hba1c.setText("");
            txt_hba1c_2.setText("");
            txt_suggestion.setText("");
        }

    }//GEN-LAST:event_submitActionPerformed

    private void txt_HBA1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HBA1CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HBA1CActionPerformed

    private void cbb_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_userActionPerformed
        // TODO add your handling code here:]

    }//GEN-LAST:event_cbb_userActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbb_user;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_bp;
    private javax.swing.JLabel label_fbs;
    private javax.swing.JLabel label_fbs1;
    private javax.swing.JLabel label_fbs2;
    private javax.swing.JLabel label_hba1c;
    private javax.swing.JLabel label_suggestion;
    private javax.swing.JLabel label_title1;
    private javax.swing.JLabel label_user;
    private java.awt.Button logout;
    private javax.swing.JPanel member_status;
    private javax.swing.JLabel show_status;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txt_HBA1C;
    private javax.swing.JTextField txt_fbs;
    private javax.swing.JTextField txt_hba1c;
    private javax.swing.JTextField txt_hba1c_2;
    private javax.swing.JTextArea txt_suggestion;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username_admin;
    // End of variables declaration//GEN-END:variables

    private void initComponentls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String nameInDatabase() throws SQLException {
        String name;
        ResultSet rs;
        ConnectDB conn = new ConnectDB();
        rs = conn.SelectConnect("user");
        try {
            while (rs.next()) {
                System.out.println("-----------------------------------");
                System.out.println(rs.getString("name"));
                if (rs.getString("role").equalsIgnoreCase("1")) {
                    JOptionPane.showMessageDialog(null, rs.getString("name") + " Login Successfully");
                    AfterLogin afterLogin = new AfterLogin();
                    afterLogin.setId(rs.getString("id"));
                    afterLogin.setName(rs.getString("name"));
                    new user().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, rs.getString("name") + " Admin Login Successfully");
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

        return rs.getString("name");
    }
}
