/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminPages;

import ShelterPages.Org1VolunteerPage;
import SignUpPage.AnimalShelterSignPage;
import SignUpPage.UserSignPage;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author iris
 */
public class ShelterAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UserAdmin
     */
    public ShelterAdmin() {
        initComponents();
        Connect();
        shelteraccount_table();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
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
    
    public void shelteraccount_table()
    {
        try {
            pst = con.prepareStatement("select * from shelter");
            rs = pst.executeQuery();
        
            ResultSetMetaData Rsm = (ResultSetMetaData)rs.getMetaData();
            int c;
             c = Rsm.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            
            while(rs.next()) 
            {
                Vector v2 = new Vector();
                
                for(int i = 1; i <= c; i++) {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("uname"));
                    v2.add(rs.getString("password"));
                    v2.add(rs.getString("sheltername"));
                    v2.add(rs.getString("role"));
                }
                
                model.addRow(v2);
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ShelterAdmin.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblsearch = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jlblrole = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlblshelter = new javax.swing.JLabel();
        jtxtpassword = new javax.swing.JPasswordField();
        jlblpassword = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jlblusername = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User Id", "User Name", "Password", "Shelter Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("Shelter Account Information");

        lblsearch.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblsearch.setText("Search:");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnback.setText("Back");

        jlblrole.setText("Role :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "org1", "org2" }));

        jlblshelter.setText("Shelter Name :");

        jlblpassword.setText("Password :");

        jlblusername.setText("Username :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "shelter user", "admin", "volunteer" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlblshelter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblrole, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtusername)
                            .addComponent(jtxtpassword)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblsearch)
                            .addGap(51, 51, 51)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsearch)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblusername))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblpassword))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblshelter))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblrole))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncreate)
                        .addComponent(btnedit)
                        .addComponent(btndelete)
                        .addComponent(btnreset)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
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
            
            shelteraccount_table();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ShelterAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btncreateActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
        
        String uname = jtxtusername.getText();
        String password = jtxtpassword.getText();               
        String sheltername = jComboBox1.getSelectedItem().toString();
        String role = jComboBox2.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("update shelter set uname = ?, password = ?, sheltername = ?, role = ? where id= ?");
            
            int id = Integer.parseInt(model.getValueAt(SelectIndex, 0).toString());
            
            pst.setString(1, uname);
            pst.setString(2, password);
            pst.setString(3, sheltername);
            pst.setString(4, role);
            pst.setInt(5, id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Shelter Account Information Edited!");
            
            jtxtusername.setText("");
            jtxtpassword.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jtxtusername.requestFocus();
            
            shelteraccount_table();
            
            btncreate.setEnabled(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ShelterAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btneditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
        
        jtxtusername.setText(model.getValueAt(SelectIndex, 1).toString());
        jtxtpassword.setText(model.getValueAt(SelectIndex, 2).toString());
        jComboBox1.setSelectedItem(model.getValueAt(SelectIndex, 3).toString());
        jComboBox2.setSelectedItem(model.getValueAt(SelectIndex, 4).toString());
        
        btncreate.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete it ?", "Delete",JOptionPane.YES_NO_OPTION);
        
        if (opt==0){
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            int SelectIndex = jTable1.getSelectedRow();
            
            try {
                pst = con.prepareStatement("delete from shelter where id = ?");
                
                int id = Integer.parseInt(model.getValueAt(SelectIndex, 0).toString());
            
                pst.setInt(1, id);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Shelter Account Information Deleted!");
                
                jtxtusername.setText("");
                jtxtpassword.setText("");
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jtxtusername.requestFocus();

                shelteraccount_table();

                btncreate.setEnabled(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(ShelterAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        
        jtxtusername.setText("");
        jtxtpassword.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jtxtusername.requestFocus();

        shelteraccount_table();

        btncreate.setEnabled(true);
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtsearch.getText()));
        
    }//GEN-LAST:event_txtsearchKeyReleased

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
            java.util.logging.Logger.getLogger(ShelterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShelterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShelterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShelterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShelterAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnreset;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlblpassword;
    private javax.swing.JLabel jlblrole;
    private javax.swing.JLabel jlblshelter;
    private javax.swing.JLabel jlblusername;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JTextField jtxtusername;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
