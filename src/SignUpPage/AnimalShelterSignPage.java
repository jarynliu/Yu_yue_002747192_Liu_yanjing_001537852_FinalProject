/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUpPage;

import PrePage.HomePage;
import SignInPage.ShelterAdminSignIn;
import SignInPage.ShelterSignIn;
import com.mysql.cj.protocol.Resultset;
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
 * @author pkuhore
 */
public class AnimalShelterSignPage extends javax.swing.JFrame {

    /**
     * Creates new form StrayAnimalsPage
     */
    public AnimalShelterSignPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        Connect();
    }
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement unameList;
    
    
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

        jlblrole = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jbtnsignin = new javax.swing.JButton();
        jlbltitle = new javax.swing.JLabel();
        jbtnsignup = new javax.swing.JButton();
        jlblusername = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jlblpassword = new javax.swing.JLabel();
        jtxtpassword = new javax.swing.JPasswordField();
        jlblshelter = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jlblsignin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblrole.setText("Role :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "shelter user", "admin", "volunteer" }));

        jbtnsignin.setText("Sign In");
        jbtnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsigninActionPerformed(evt);
            }
        });

        jlbltitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jlbltitle.setText("Sign Up Your Account");

        jbtnsignup.setText("Sign Up");
        jbtnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsignupActionPerformed(evt);
            }
        });

        jlblusername.setText("Username :");

        jlblpassword.setText("Password :");

        jlblshelter.setText("Shelter Name :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "org1", "org2" }));

        jButton1.setText("Back to HomePage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlblsignin.setText("Already have an account? Please sign in here!");

        jLabel1.setText("If you are an admin, please click here.");

        jButton2.setText("Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlblshelter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jlblrole, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtusername)
                                .addComponent(jtxtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jlbltitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jbtnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblsignin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jlbltitle)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblusername)
                    .addComponent(jtxtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblpassword)
                    .addComponent(jtxtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblshelter)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblrole)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnsignup))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblsignin)
                    .addComponent(jbtnsignin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsignupActionPerformed
        // TODO add your handling code here:
        
        String uname = jtxtusername.getText();
        String password = jtxtpassword.getText();
        String sheltername = jComboBox1.getSelectedItem().toString();
        String role = jComboBox2.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("insert into shelter(uname,password,sheltername,role)value(?,?,?,?)");
            
///////////////////////////////////////////////DataValidationg/////////////////////////////////////////////////////////////////////////////////////////////////            
            
            String sql = "select * from shelter where uname = ?";
            unameList = con.prepareStatement(sql);
            unameList.setString(1, uname);
            ResultSet rs = unameList.executeQuery();
                        
            if (uname == null || uname.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Name.");
                return;}
            else if (!rs.next()){
            } else {
                JOptionPane.showMessageDialog(this, "The Name is Occupied.Please Change one.");
                return;
            }pst.setString(1, uname);
            
            if (password == null || password.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Password.");
                return;
            }pst.setString(2, password);
 
////////////////////////////////////////////DataValidation//////////////////////////////////////////////////////////////////////////////////////////////////////////            
        
            pst.setString(3, sheltername);
            pst.setString(4, role);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Successfully Sign Up!");
            
            jtxtusername.setText("");
            jtxtpassword.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jtxtusername.requestFocus();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AnimalShelterSignPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jbtnsignupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        HomePage homepage = new HomePage();
        homepage.setTitle("Pet Community");
        homepage.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsigninActionPerformed
        // TODO add your handling code here:
        
        dispose();
        ShelterSignIn ss = new ShelterSignIn();
        ss.setVisible(true);
        ss.setTitle("ShelterSignIn");

        
    }//GEN-LAST:event_jbtnsigninActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ShelterAdminSignIn sas = new ShelterAdminSignIn();
        sas.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AnimalShelterSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalShelterSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalShelterSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalShelterSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalShelterSignPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnsignin;
    private javax.swing.JButton jbtnsignup;
    private javax.swing.JLabel jlblpassword;
    private javax.swing.JLabel jlblrole;
    private javax.swing.JLabel jlblshelter;
    private javax.swing.JLabel jlblsignin;
    private javax.swing.JLabel jlbltitle;
    private javax.swing.JLabel jlblusername;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
