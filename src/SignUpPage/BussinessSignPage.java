/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUpPage;

import PrePage.HomePage;
import SignInPage.BusinessSignIn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pkuhore
 */
public class BussinessSignPage extends javax.swing.JFrame {

    /**
     * Creates new form BussinessPage
     */
    public BussinessSignPage() {
        initComponents();
        Connect();
    }
    
    Connection con;
    PreparedStatement pst;
    
    
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

        jlbltitle = new javax.swing.JLabel();
        jlblusername = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jlblpassword = new javax.swing.JLabel();
        jtxtpassword = new javax.swing.JPasswordField();
        jlblstore = new javax.swing.JLabel();
        jtxtstorename = new javax.swing.JComboBox<>();
        jlblrole = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jbtnsignin = new javax.swing.JButton();
        jbtnsignup = new javax.swing.JButton();
        jbtnhomepage = new javax.swing.JButton();
        jlblsignin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbltitle.setText("Sign Up Your Account");

        jlblusername.setText("Username :");

        jlblpassword.setText("Password :");

        jlblstore.setText("Store Name:");

        jtxtstorename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "store1", "store2" }));

        jlblrole.setText("Role :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "sale" }));

        jbtnsignin.setText("Sign In");
        jbtnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsigninActionPerformed(evt);
            }
        });

        jbtnsignup.setText("Sign Up");
        jbtnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsignupActionPerformed(evt);
            }
        });

        jbtnhomepage.setText("Back to Homepage");
        jbtnhomepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnhomepageActionPerformed(evt);
            }
        });

        jlblsignin.setText("Already have an account? Please sign in here!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblrole, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblstore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtusername)
                                    .addComponent(jtxtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(jtxtstorename, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jbtnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnhomepage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jlbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(290, 290, 290))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlblsignin)
                .addGap(18, 18, 18)
                .addComponent(jbtnsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnhomepage)
                .addGap(37, 37, 37)
                .addComponent(jlbltitle)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblusername)
                    .addComponent(jtxtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblpassword)
                    .addComponent(jtxtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblstore)
                    .addComponent(jtxtstorename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblrole)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jbtnsignup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnsignin)
                    .addComponent(jlblsignin))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsignupActionPerformed
        // TODO add your handling code here:
        
        String uname = jtxtusername.getText();
        String password = jtxtpassword.getText();
        String storename = jtxtstorename.getSelectedItem().toString();
        String role = jComboBox2.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("insert into business(uname,password,storename,role)value(?,?,?,?)");
            pst.setString(1, uname);
            pst.setString(2, password);
            pst.setString(3, storename);
            pst.setString(4, role);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Successfully Sign Up!");
            
            jtxtusername.setText("");
            jtxtpassword.setText("");
            jtxtstorename.setSelectedIndex(-1);
            jComboBox2.setSelectedIndex(-1);
            jtxtusername.requestFocus();
            
        } catch (SQLException ex) {
            Logger.getLogger(BussinessSignPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jbtnsignupActionPerformed

    private void jbtnhomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnhomepageActionPerformed
        // TODO add your handling code here:
        dispose();
        HomePage homepage = new HomePage();
        homepage.setTitle("Pet Community");
        homepage.setVisible(true);
    }//GEN-LAST:event_jbtnhomepageActionPerformed

    private void jbtnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsigninActionPerformed
        // TODO add your handling code here:
        
        dispose();
        BusinessSignIn bs = new BusinessSignIn();
        bs.setVisible(true);
        
        
    }//GEN-LAST:event_jbtnsigninActionPerformed

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
            java.util.logging.Logger.getLogger(BussinessSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BussinessSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BussinessSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BussinessSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BussinessSignPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JButton jbtnhomepage;
    private javax.swing.JButton jbtnsignin;
    private javax.swing.JButton jbtnsignup;
    private javax.swing.JLabel jlblpassword;
    private javax.swing.JLabel jlblrole;
    private javax.swing.JLabel jlblsignin;
    private javax.swing.JLabel jlblstore;
    private javax.swing.JLabel jlbltitle;
    private javax.swing.JLabel jlblusername;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JComboBox<String> jtxtstorename;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
