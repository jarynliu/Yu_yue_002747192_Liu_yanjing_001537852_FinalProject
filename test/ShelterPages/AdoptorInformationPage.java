/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ShelterPages;

import Tool.JTextFieldHintListener;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pkuhore
 */
public class AdoptorInformationPage extends javax.swing.JFrame {

    /**
     * Creates new form ShelterPage
     */
    String gender;
    String haveorhad;
    String howmany;
    String pettype = "";
    
    public AdoptorInformationPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlblid = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jlblgender = new javax.swing.JLabel();
        jbtnfemale = new javax.swing.JRadioButton();
        jbtnmale = new javax.swing.JRadioButton();
        jbtnnot2say = new javax.swing.JRadioButton();
        jlblhadpets = new javax.swing.JLabel();
        jbtnhadpetsyes = new javax.swing.JRadioButton();
        jbtnhadpetsno = new javax.swing.JRadioButton();
        jlblhowmany = new javax.swing.JLabel();
        jbthowmany0 = new javax.swing.JRadioButton();
        jbthowmany1 = new javax.swing.JRadioButton();
        jbthowmany2 = new javax.swing.JRadioButton();
        jbthowmany3 = new javax.swing.JRadioButton();
        jlblpettype = new javax.swing.JLabel();
        jckbdog = new javax.swing.JCheckBox();
        jckbcat = new javax.swing.JCheckBox();
        jckbothers = new javax.swing.JCheckBox();
        jlblphone = new javax.swing.JLabel();
        jtxtphone = new javax.swing.JTextField();
        jlbladdress = new javax.swing.JLabel();
        jtxtaddress = new javax.swing.JTextField();
        jlblage = new javax.swing.JLabel();
        jtxtage = new javax.swing.JTextField();
        jlbltitle = new javax.swing.JLabel();
        jlblinfo = new javax.swing.JLabel();
        jbtnsubmit = new javax.swing.JButton();
        jlblname = new javax.swing.JLabel();
        jlblshelterpetname = new javax.swing.JLabel();
        jtxtshelterpetname = new javax.swing.JTextField();
        jlblorg = new javax.swing.JLabel();
        jcb = new javax.swing.JComboBox<>();
        jtxtname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblid.setText("ID :");

        jlblgender.setText("Gender :");

        buttonGroup1.add(jbtnfemale);
        jbtnfemale.setText("Female");

        buttonGroup1.add(jbtnmale);
        jbtnmale.setText("Male");

        buttonGroup1.add(jbtnnot2say);
        jbtnnot2say.setText("Prefer not to say");

        jlblhadpets.setText("Have or had a pet :");

        buttonGroup2.add(jbtnhadpetsyes);
        jbtnhadpetsyes.setText("Yes");

        buttonGroup2.add(jbtnhadpetsno);
        jbtnhadpetsno.setText("No");

        jlblhowmany.setText("How many pets now :");

        buttonGroup3.add(jbthowmany0);
        jbthowmany0.setText("0");

        buttonGroup3.add(jbthowmany1);
        jbthowmany1.setText("1");

        buttonGroup3.add(jbthowmany2);
        jbthowmany2.setText("2");

        buttonGroup3.add(jbthowmany3);
        jbthowmany3.setText("More than 2");

        jlblpettype.setText("PetType :");

        jckbdog.setText("Dog");

        jckbcat.setText("Cat");

        jckbothers.setText("Others (If you have no pet, just choose this.)");

        jlblphone.setText("PhoneNumber :");

        jtxtphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtphoneKeyPressed(evt);
            }
        });

        jlbladdress.setText("Home Adress :");

        jtxtaddress.addFocusListener(new JTextFieldHintListener(jtxtaddress, "There is a home interview if you adopt a pet from our shelter."));

        jlblage.setText("Age :");

        jtxtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtageKeyPressed(evt);
            }
        });

        jlbltitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36)); // NOI18N
        jlbltitle.setText("Additional Information");

        jlblinfo.setText("If you want to adopt a pet, you need to submit the informations above.");

        jbtnsubmit.setText("Submit");
        jbtnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsubmitActionPerformed(evt);
            }
        });

        jlblname.setText("Name:");

        jlblshelterpetname.setText("Shelter Pet Name:");

        jlblorg.setText("Organization:");

        jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "organization1", "organization2" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlblgender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblid, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblhowmany, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblpettype, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblphone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblhadpets, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblshelterpetname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblorg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtaddress)
                            .addComponent(jtxtphone)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jckbdog)
                                    .addComponent(jbthowmany0))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jckbcat)
                                        .addGap(18, 18, 18)
                                        .addComponent(jckbothers))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbthowmany1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbthowmany2)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtnhadpetsno)
                                            .addComponent(jbthowmany3)))))
                            .addComponent(jbtnhadpetsyes)
                            .addComponent(jtxtid)
                            .addComponent(jtxtage)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnfemale)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnmale)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnnot2say, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtnsubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtshelterpetname, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtname)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jlbltitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jlblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jlbltitle)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblname)
                    .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblid)
                            .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblgender)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnfemale)
                                .addComponent(jbtnmale)
                                .addComponent(jbtnnot2say)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblage, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblhadpets)
                            .addComponent(jbtnhadpetsyes)
                            .addComponent(jbtnhadpetsno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblhowmany)
                            .addComponent(jbthowmany0)
                            .addComponent(jbthowmany1)
                            .addComponent(jbthowmany2)
                            .addComponent(jbthowmany3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblpettype)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jckbdog)
                                .addComponent(jckbcat)
                                .addComponent(jckbothers)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblphone)
                            .addComponent(jtxtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbladdress)
                            .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jlblshelterpetname))
                    .addComponent(jtxtshelterpetname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblorg)
                    .addComponent(jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jbtnsubmit)
                .addGap(18, 18, 18)
                .addComponent(jlblinfo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsubmitActionPerformed
        // TODO add your handling code here:
        System.out.println("jieguowei"+jtxtname.getText());
        System.out.println("运行了吗");
        if("".equals(jtxtname.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input your name");
        
        }
        else if("".equals(jtxtid.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input your ID");
        
        }
        else if(jbtnfemale.isSelected()==false&&jbtnmale.isSelected()==false&&jbtnnot2say.isSelected()==false){
                
                 JOptionPane.showMessageDialog(this, "Please select your gender");
                
                }
        else if("".equals(jtxtage.getText().trim())){
            JOptionPane.showMessageDialog(this, "Please input your age");
        }
        else if(jbtnhadpetsyes.isSelected()==false&&jbtnhadpetsno.isSelected()==false){
                
                 JOptionPane.showMessageDialog(this, "Please select if you have or had a pet");
                
                }
        else if(jbthowmany0.isSelected()==false&&jbthowmany1.isSelected()==false&&jbthowmany2.isSelected()==false&&jbthowmany3.isSelected()==false){
                
                 JOptionPane.showMessageDialog(this, "Please select how many pets do you have");
                
                }
        else if(jckbdog.isSelected()==false&&jckbcat.isSelected()==false&&jckbothers.isSelected()==false){
                
                 JOptionPane.showMessageDialog(this, "Please select your pet type");
                
                }
        
        else if("".equals(jtxtphone.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input the phone number");
        
        }
        else if("".equals(jtxtaddress.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input the home address");
        
        }
        else if("".equals(jtxtshelterpetname.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input the name of the pet in the shelter");
        
        }
        else if("".equals(jcb.getSelectedItem().toString())){
        
            JOptionPane.showMessageDialog(this, "Please select the organizatioin");
        
        }
       else{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query = "insert into appointment(name,id,gender,age,haveorhadpet,numberofpet,pettypenow,phonenumber,homeaddress,shelterpetname,organization)values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, jtxtname.getText());
            pst.setString(2, jtxtid.getText());
            
            if(jbtnfemale.isSelected()){
                gender = "Female";
            }
            if(jbtnmale.isSelected()){
                gender = "Male";
            }
            if(jbtnnot2say.isSelected()){
                gender = "Prefer not to say";
            }
            pst.setString(3, gender);
            
            pst.setInt(4,Integer.parseInt(jtxtage.getText()));
            
            if(jbtnhadpetsyes.isSelected()){
                haveorhad = "Yes";
            }
            if(jbtnhadpetsno.isSelected()){
                haveorhad = "No";
            }
            pst.setString(5, haveorhad);
            
            if(jbthowmany0.isSelected()){
                howmany = "0";
            }
            if(jbthowmany1.isSelected()){
                howmany = "1";
            }
            if(jbthowmany2.isSelected()){
                howmany = "2";
            }
            if(jbthowmany3.isSelected()){
                howmany = "More than 2";
            }
            pst.setString(6, howmany);
            
            if(jckbdog.isSelected()){
                pettype+=jckbdog.getText()+" ";
            }
            if(jckbcat.isSelected()){
                pettype+=jckbcat.getText()+" ";
            }
             if(jckbothers.isSelected()){
                pettype+=jckbothers.getText()+" ";
            }
            pst.setString(7, pettype);
            
            pst.setString(8, jtxtphone.getText());
            pst.setString(9, jtxtaddress.getText());
            pst.setString(10, jtxtshelterpetname.getText());
            pst.setString(11, jcb.getSelectedItem().toString());
            
            pst.executeUpdate();
            //DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals.getModel();
            //model.setRowCount(0);
            //show_strayanimals();
            JOptionPane.showMessageDialog(null, "Successful!!!");
            
//            this.toBack();
//            PetInformationPage petinfo = new PetInformationPage();
//            petinfo.setVisible(true);
//            petinfo.toFront();
            new PetInformationPage().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
        
        
    }//GEN-LAST:event_jbtnsubmitActionPerformed

    private void jtxtageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtageKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(this, "Please input an integer");
            jtxtage.setText("");
        }
    }//GEN-LAST:event_jtxtageKeyPressed

    private void jtxtphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtphoneKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(this, "You can just input numbers");
            jtxtphone.setText("");
        }
    }//GEN-LAST:event_jtxtphoneKeyPressed

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
            java.util.logging.Logger.getLogger(AdoptorInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdoptorInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdoptorInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdoptorInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdoptorInformationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jbthowmany0;
    private javax.swing.JRadioButton jbthowmany1;
    private javax.swing.JRadioButton jbthowmany2;
    private javax.swing.JRadioButton jbthowmany3;
    private javax.swing.JRadioButton jbtnfemale;
    private javax.swing.JRadioButton jbtnhadpetsno;
    private javax.swing.JRadioButton jbtnhadpetsyes;
    private javax.swing.JRadioButton jbtnmale;
    private javax.swing.JRadioButton jbtnnot2say;
    private javax.swing.JButton jbtnsubmit;
    private javax.swing.JComboBox<String> jcb;
    private javax.swing.JCheckBox jckbcat;
    private javax.swing.JCheckBox jckbdog;
    private javax.swing.JCheckBox jckbothers;
    private javax.swing.JLabel jlbladdress;
    private javax.swing.JLabel jlblage;
    private javax.swing.JLabel jlblgender;
    private javax.swing.JLabel jlblhadpets;
    private javax.swing.JLabel jlblhowmany;
    private javax.swing.JLabel jlblid;
    private javax.swing.JLabel jlblinfo;
    private javax.swing.JLabel jlblname;
    private javax.swing.JLabel jlblorg;
    private javax.swing.JLabel jlblpettype;
    private javax.swing.JLabel jlblphone;
    private javax.swing.JLabel jlblshelterpetname;
    private javax.swing.JLabel jlbltitle;
    private javax.swing.JTextField jtxtaddress;
    private javax.swing.JTextField jtxtage;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtphone;
    private javax.swing.JTextField jtxtshelterpetname;
    // End of variables declaration//GEN-END:variables
}
