/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignInPage;

import NutriPage.NutriRecipe_1;
import NutriPage.NutriRecipe_2;
import SignUpPage.NutriSignPage;
import SignUpPage.UserSignPage;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iris
 */
public class HospitalSignIn extends javax.swing.JFrame {

    /**
     * Creates new form UserSignIn
     */
    public HospitalSignIn() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        Connect();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void Connect() 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserSignPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserSignPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlblusername = new javax.swing.JLabel();
        jlblpassword = new javax.swing.JLabel();
        jtxtpassword = new javax.swing.JPasswordField();
        jtxtuname = new javax.swing.JTextField();
        jbtnsignin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jbtnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Sign In");

        jlblusername.setText("User Name:");

        jlblpassword.setText("Password:");

        jbtnsignin.setText("Sign In");
        jbtnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsigninActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose Your Role:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "nutritionist" }));

        jLabel3.setText("Hospital Name:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hos1", "Hos2" }));

        jbtnback.setText("Back");
        jbtnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblpassword)
                            .addComponent(jlblusername)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtpassword)
                            .addComponent(jtxtuname)
                            .addComponent(jComboBox1, 0, 144, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnsignin)
                .addGap(18, 18, 18)
                .addComponent(jbtnback)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblusername)
                    .addComponent(jtxtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblpassword)
                    .addComponent(jtxtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnsignin)
                    .addComponent(jbtnback))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsigninActionPerformed
        // TODO add your handling code here:
        
        String uname = jtxtuname.getText();
        String password = jtxtpassword.getText();
        String hname = jComboBox2.getSelectedItem().toString();
        String role = jComboBox1.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("select * from hospital where uname= ? and password= ? and hname= ? and role= ?");
            pst.setString(1, uname);
            pst.setString(2, password);
            pst.setString(3, hname);
            pst.setString(4, role);
            
            
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                int nid = rs.getInt("id");
                this.setVisible(false);
                if("Hos1".equals(hname)&&"nutritionist".equals(role)){
                NutriRecipe_1 n1 = new NutriRecipe_1();
                n1.setVisible(true);
                }
                else if("Hos2".equals(hname)&&"nutritionist".equals(role)){
                NutriRecipe_2 n2 = new NutriRecipe_2();
                n2.setVisible(true);
                }
            
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Username and Password do not match");
                jtxtuname.setText("");
                jtxtpassword.setText("");
                jComboBox2.setSelectedIndex(-1);
                jComboBox1.setSelectedIndex(-1);
                jtxtuname.requestFocus();
 
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jbtnsigninActionPerformed

    private void jbtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbackActionPerformed
        // TODO add your handling code here:
        
        dispose();
        NutriSignPage hs = new NutriSignPage();
        hs.setVisible(true);
        hs.setTitle("HospitalSignIn");
        
    }//GEN-LAST:event_jbtnbackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnback;
    private javax.swing.JButton jbtnsignin;
    private javax.swing.JLabel jlblpassword;
    private javax.swing.JLabel jlblusername;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JTextField jtxtuname;
    // End of variables declaration//GEN-END:variables
}
