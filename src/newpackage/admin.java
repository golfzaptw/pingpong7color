/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JFrame;

/**
 *
 * @author karn
 */
public class admin extends javax.swing.JFrame {

    
    public admin() {
        initComponents();
               setResizable(false);
        
        
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(380, 10, 900, 500);
                
		setTitle("โปรแกรมลูกโปร่ง 7 สี");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        label_fbs = new javax.swing.JLabel();
        label_user = new javax.swing.JLabel();
        txt_hba1c = new javax.swing.JTextField();
        label_title = new javax.swing.JLabel();
        label_bp = new javax.swing.JLabel();
        txt_bp = new javax.swing.JTextField();
        txt_hba1c_2 = new javax.swing.JTextField();
        jCom_user = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        label_hba1c = new javax.swing.JLabel();
        label_suggestion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_suggestion = new javax.swing.JTextArea();
        member_status = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_fbs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(null);

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
        label_fbs.setText("FBS :");
        getContentPane().add(label_fbs);
        label_fbs.setBounds(100, 120, 40, 30);

        label_user.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_user.setText("Select User : ");
        getContentPane().add(label_user);
        label_user.setBounds(50, 80, 110, 21);

        txt_hba1c.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_hba1c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hba1cActionPerformed(evt);
            }
        });
        getContentPane().add(txt_hba1c);
        txt_hba1c.setBounds(150, 200, 80, 30);

        label_title.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        label_title.setText("Admin");
        getContentPane().add(label_title);
        label_title.setBounds(30, 20, 130, 40);

        label_bp.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_bp.setText("BP :");
        getContentPane().add(label_bp);
        label_bp.setBounds(110, 160, 40, 30);

        txt_bp.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_bp);
        txt_bp.setBounds(150, 160, 80, 30);

        txt_hba1c_2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_hba1c_2);
        txt_hba1c_2.setBounds(260, 200, 80, 30);

        jCom_user.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jCom_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kran", "na", "ja", "ei", "eiz" }));
        jCom_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCom_userActionPerformed(evt);
            }
        });
        getContentPane().add(jCom_user);
        jCom_user.setBounds(150, 70, 190, 40);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("/");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 200, 10, 30);

        label_hba1c.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_hba1c.setText("HbA1C :");
        getContentPane().add(label_hba1c);
        label_hba1c.setBounds(80, 200, 70, 30);

        label_suggestion.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        label_suggestion.setText("Suggestion :");
        getContentPane().add(label_suggestion);
        label_suggestion.setBounds(50, 240, 90, 30);

        txt_suggestion.setColumns(20);
        txt_suggestion.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_suggestion.setRows(5);
        jScrollPane1.setViewportView(txt_suggestion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 240, 300, 130);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setText("Member Status");
        member_status.add(jLabel5);

        getContentPane().add(member_status);
        member_status.setBounds(470, 30, 390, 390);

        txt_fbs.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(txt_fbs);
        txt_fbs.setBounds(150, 120, 80, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/background_03.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 990, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void txt_hba1cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hba1cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hba1cActionPerformed

    private void jCom_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCom_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCom_userActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new admin().setVisible(true);
                
                    
            }
        });
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCom_user;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_bp;
    private javax.swing.JLabel label_fbs;
    private javax.swing.JLabel label_hba1c;
    private javax.swing.JLabel label_suggestion;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_user;
    private javax.swing.JPanel member_status;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txt_bp;
    private javax.swing.JTextField txt_fbs;
    private javax.swing.JTextField txt_hba1c;
    private javax.swing.JTextField txt_hba1c_2;
    private javax.swing.JTextArea txt_suggestion;
    // End of variables declaration//GEN-END:variables

    private void initComponentls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
