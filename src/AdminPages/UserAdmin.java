/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminPages;

import ShelterPages.Org1VolunteerPage;
import SignUpPage.UserSignPage;
import UserPage.UserRecipe;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author iris
 */
public class UserAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UserAdmin
     */
    public UserAdmin() {
        initComponents();
        Connect();
        useraccount_table();
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
    
    public void useraccount_table()
    {
        try {
            pst = con.prepareStatement("select * from user");
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
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("ptype"));
                    v2.add(rs.getString("birthday"));
                    v2.add(rs.getString("pbreed"));
                    v2.add(rs.getString("password"));
                    v2.add(rs.getString("email"));
                    v2.add(rs.getString("role"));
                }
                
                model.addRow(v2);
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
        jlblname = new javax.swing.JLabel();
        jlblptype = new javax.swing.JLabel();
        jlblpetbreeder = new javax.swing.JLabel();
        jtxtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jcbxrole = new javax.swing.JComboBox<>();
        jtxtbday = new com.toedter.calendar.JDateChooser();
        jtxtemail = new javax.swing.JTextField();
        jtxtbreed = new javax.swing.JTextField();
        jtxtname = new javax.swing.JTextField();
        jlblemail = new javax.swing.JLabel();
        jlblbirthday = new javax.swing.JLabel();
        jlblpassword = new javax.swing.JLabel();
        jtxtptype = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblsearch = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User Id", "User Name", "Pet Type", "Birthday", "Pet Breed", "Password", "Email", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jlblname.setText("User Name:");

        jlblptype.setText("Pet Type:");

        jlblpetbreeder.setText("Pet Breed:");

        jLabel1.setText("Choose your Role:");

        jcbxrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin" }));
        jcbxrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxroleActionPerformed(evt);
            }
        });

        jlblemail.setText("Email:");

        jlblbirthday.setText("Birthday :");

        jlblpassword.setText("Password:");

        jtxtptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cat", "Dog" }));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("User Account Information");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblptype)
                                    .addComponent(jlblbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtbreed)
                                    .addComponent(jtxtpassword)
                                    .addComponent(jtxtemail)
                                    .addComponent(jtxtbday, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jtxtptype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtname)))
                            .addComponent(jlblpetbreeder, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jcbxrole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblsearch)
                                .addGap(51, 51, 51)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsearch)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblname)
                                    .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblptype)
                                    .addComponent(jtxtptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jlblbirthday))
                            .addComponent(jtxtbday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblpetbreeder)
                            .addComponent(jtxtbreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblpassword)
                            .addComponent(jtxtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblemail)
                            .addComponent(jtxtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcbxrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncreate)
                            .addComponent(btnedit)
                            .addComponent(btndelete)
                            .addComponent(btnreset))
                        .addGap(36, 36, 36))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbxroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxroleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxroleActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        
        String name = jtxtname.getText();
        String ptype = jtxtptype.getSelectedItem().toString();
        String pbreed = jtxtbreed.getText();
        String password = jtxtpassword.getText();
        String email = jtxtemail.getText();
        String role = jcbxrole.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("insert into user(name,ptype,birthday,pbreed,password,email,role)value(?,?,?,?,?,?,?)");
///////////////////////////////////////////////////////////DataValidation///////////////////////////////////////////////////////////////////////////////////            
            String sql = "select * from user where name = ?";
            unameList = con.prepareStatement(sql);
            unameList.setString(1, name);
            ResultSet rs = unameList.executeQuery();
   
            
             if (name == null || name.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Name.");
                return;}
            else if (!rs.next()){
            } else {
                JOptionPane.showMessageDialog(this, "The Name is Occupied.Please Change one.");
                return;
            }pst.setString(1, name);
            
            try{
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                String birthday = dateformat.format(jtxtbday.getDate());
                pst.setString(3, birthday);}
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please input your birthday");
            }
            
            if (pbreed == null || pbreed.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Pet Breed.");
                return;
            }pst.setString(4, pbreed); 
       
            if (password == null || password.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Password.");
                return;
            }pst.setString(5, password);  
            
            
            
            if (email == null || email.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Email.");
                return;
            }
            boolean flag;
            try {
                String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
                Pattern regex = Pattern.compile(check);
                Matcher matcher = regex.matcher(email);
                flag = matcher.matches();
            } catch (Exception e) {
                flag = false;
            }
            if (!flag) {
                JOptionPane.showMessageDialog(this, "Please Input Right Email.");
                return;
            }pst.setString(6, email);
            
//////////////////////////////////////////////////////////DataValidation//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            

            pst.setString(2, ptype);
            pst.setString(7, role);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Successfully Created!");
            
            jtxtname.setText("");
            jtxtptype.setSelectedIndex(0);
            jtxtbreed.setText("");
            jtxtpassword.setText("");
            jtxtemail.setText("");
            jcbxrole.setSelectedIndex(0);
            jtxtname.requestFocus();
            
            useraccount_table();
                               
            
        } catch (SQLException ex) {
            Logger.getLogger(UserSignPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btncreateActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
        
        String name = jtxtname.getText();
        String ptype = jtxtptype.getSelectedItem().toString();      
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = dateformat.format(jtxtbday.getDate());    
        
        String pbreed = jtxtbreed.getText();
        String password = jtxtpassword.getText();
        String email = jtxtemail.getText();
        String role = jcbxrole.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("update user set name = ?, ptype = ?, birthday = ?, pbreed = ?, password = ?, email = ?, role = ? where id= ?");
            
            int id = Integer.parseInt(model.getValueAt(SelectIndex, 0).toString());
            
            pst.setString(1, name);
            pst.setString(2, ptype);
            pst.setString(3, birthday);
            pst.setString(4, pbreed);
            pst.setString(5, password);
            pst.setString(6, email);
            pst.setString(7, role);
            pst.setInt(8, id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "User Account Information Edited!");
            
            jtxtname.setText("");
            jtxtptype.setSelectedIndex(0);
            jtxtbday.setDate(null);
            jtxtbreed.setText("");
            jtxtpassword.setText("");
            jtxtemail.setText("");
            jcbxrole.setSelectedIndex(0);
            jtxtname.requestFocus();
            
            useraccount_table();
            
            btncreate.setEnabled(true);

        } catch (SQLException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btneditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
        
        jtxtname.setText(model.getValueAt(SelectIndex, 1).toString());
        jtxtptype.setSelectedItem(model.getValueAt(SelectIndex, 2).toString());
        
        String birthday =model.getValueAt(SelectIndex, 3).toString();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        } catch (ParseException ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtxtbday.setDate(date);
        
        jtxtbreed.setText(model.getValueAt(SelectIndex, 4).toString());
        jtxtpassword.setText(model.getValueAt(SelectIndex, 5).toString());
        jtxtemail.setText(model.getValueAt(SelectIndex, 6).toString());
        jcbxrole.setSelectedItem(model.getValueAt(SelectIndex, 7).toString());
        
        btncreate.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete it ?", "Delete",JOptionPane.YES_NO_OPTION);
        
        if (opt==0){
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            int SelectIndex = jTable1.getSelectedRow();
        
            try {
                pst = con.prepareStatement("delete from user where id = ?");
                
                int id = Integer.parseInt(model.getValueAt(SelectIndex, 0).toString());
            
                pst.setInt(1, id);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "User Account Information Deleted!");
            
                jtxtname.setText("");
                jtxtptype.setSelectedIndex(0);
                jtxtbday.setDate(null);
                jtxtbreed.setText("");
                jtxtpassword.setText("");
                jtxtemail.setText("");
                jcbxrole.setSelectedIndex(0);
                jtxtname.requestFocus();
            
                useraccount_table();

                btncreate.setEnabled(true);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        
        jtxtname.setText("");
        jtxtptype.setSelectedIndex(0);
        jtxtbday.setDate(null);
        jtxtbreed.setText("");
        jtxtpassword.setText("");
        jtxtemail.setText("");
        jcbxrole.setSelectedIndex(0);
        jtxtname.requestFocus();
            
        useraccount_table();

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
            java.util.logging.Logger.getLogger(UserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbxrole;
    private javax.swing.JLabel jlblbirthday;
    private javax.swing.JLabel jlblemail;
    private javax.swing.JLabel jlblname;
    private javax.swing.JLabel jlblpassword;
    private javax.swing.JLabel jlblpetbreeder;
    private javax.swing.JLabel jlblptype;
    private com.toedter.calendar.JDateChooser jtxtbday;
    private javax.swing.JTextField jtxtbreed;
    private javax.swing.JTextField jtxtemail;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JComboBox<String> jtxtptype;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
