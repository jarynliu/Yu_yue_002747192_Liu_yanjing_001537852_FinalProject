/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ShelterPages;

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
public class PetInformationPage extends javax.swing.JFrame {

/**
     * Creates new form PetInformationPage
     */
        public PetInformationPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        show_strayanimals();
        show_petinformation();
    }
        public ArrayList<PetInformation> petinformationList(){
        ArrayList<PetInformation> petinformationList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query1 = "SELECT * FROM strayanimals";
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(query1);
            
            PetInformation petinformation;
            
            while(rs.next()){
            
                petinformation = new PetInformation(rs.getInt("sno"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getDate("time_arrive"),rs.getString("spay"),rs.getString("disabled"),rs.getString("vaccination"),rs.getString("organization"),rs.getString("pettype"),rs.getBytes("images"));
                petinformationList.add(petinformation);
            
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return petinformationList;
        
    }
        
        
    public ArrayList<StrayAnimals> strayanimalsList(){
        ArrayList<StrayAnimals> strayanimalsList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query1 = "SELECT * FROM strayanimals2";
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(query1);
            
            StrayAnimals strayanimals;
            
            while(rs.next()){
            
                strayanimals = new StrayAnimals(rs.getInt("sno"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getString("time_arrive"),rs.getString("spay"),rs.getString("disabled"),rs.getString("vaccination"),rs.getString("organization"),rs.getString("pettype"),rs.getBytes("images"));
                strayanimalsList.add(strayanimals);
            
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return strayanimalsList;
        
    }
    
    public void show_strayanimals(){
    
        ArrayList<StrayAnimals> list = strayanimalsList();
        DefaultTableModel model = (DefaultTableModel)jtb_display_petinformation2.getModel();
        Object[] row = new Object[10];
        for (int i=0; i<list.size();i++){
        
            row[0] = list.get(i).getSno();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getGender();
            row[3] = list.get(i).getAge();
            row[4] = list.get(i).getTime_Arrive();
            row[5] = list.get(i).getSpay();
            row[6] = list.get(i).getDisabled();
            row[7] = list.get(i).getVaccination();
            row[8]= list.get(i).getOrganization();
            row[9]= list.get(i).getPettype();
            model.addRow(row);
        }
    
    }
    
     public void show_petinformation(){
    
        ArrayList<PetInformation> list = petinformationList();
        DefaultTableModel model = (DefaultTableModel)jtb_display_petinformation1.getModel();
        Object[] row = new Object[10];
        for (int i=0; i<list.size();i++){
        
            row[0] = list.get(i).getSno();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getGender();
            row[3] = list.get(i).getAge();
            row[4] = list.get(i).getTime_arrive();
            row[5] = list.get(i).getSpay();
            row[6] = list.get(i).getDisabled();
            row[7] = list.get(i).getVaccination();
            row[8]= list.get(i).getOrganization();
            row[9]= list.get(i).getPettype();
            model.addRow(row);
        }
    
    }
    
    public PetInformationPage(int id, String uname, String role)
    {
        initComponents();
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
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jlblname3 = new javax.swing.JLabel();
        jtxtname3 = new javax.swing.JTextField();
        jlblgender3 = new javax.swing.JLabel();
        jbtnfemale3 = new javax.swing.JRadioButton();
        jbtnmale3 = new javax.swing.JRadioButton();
        jlblage3 = new javax.swing.JLabel();
        jtxtage3 = new javax.swing.JTextField();
        jlbltimearrive3 = new javax.swing.JLabel();
        jdctimearrive3 = new com.toedter.calendar.JDateChooser();
        jlblspay3 = new javax.swing.JLabel();
        jbtnyes3 = new javax.swing.JRadioButton();
        jbtnno3 = new javax.swing.JRadioButton();
        jlbldisabled3 = new javax.swing.JLabel();
        jbtndyes3 = new javax.swing.JRadioButton();
        jbtndno3 = new javax.swing.JRadioButton();
        jlblvacci3 = new javax.swing.JLabel();
        jbtnvyes3 = new javax.swing.JRadioButton();
        jbtnvno3 = new javax.swing.JRadioButton();
        jlblpettype3 = new javax.swing.JLabel();
        jtxtpettype3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtb_display_petinformation2 = new javax.swing.JTable();
        jlblimage3 = new javax.swing.JLabel();
        jtxtsearch1 = new javax.swing.JTextField();
        jlblsearch1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtb_display_petinformation1 = new javax.swing.JTable();
        jlblsearch2 = new javax.swing.JLabel();
        jtxtsearch2 = new javax.swing.JTextField();
        jbtnappoinment = new javax.swing.JButton();
        jbtnviewappointment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblname3.setText("Name :");

        jlblgender3.setText("Gender :");

        buttonGroup1.add(jbtnfemale3);
        jbtnfemale3.setText("Female");

        buttonGroup1.add(jbtnmale3);
        jbtnmale3.setText("Male");

        jlblage3.setText("Estimate Age :");

        jlbltimearrive3.setText("Time arrive Shelter :");

        jlblspay3.setText("Spay :");

        buttonGroup2.add(jbtnyes3);
        jbtnyes3.setText("Yes");

        buttonGroup2.add(jbtnno3);
        jbtnno3.setText("No");

        jlbldisabled3.setText("Disabled:");

        buttonGroup3.add(jbtndyes3);
        jbtndyes3.setText("Yes");

        buttonGroup3.add(jbtndno3);
        jbtndno3.setText("No");

        jlblvacci3.setText("Vaccination :");

        buttonGroup4.add(jbtnvyes3);
        jbtnvyes3.setText("Yes");

        buttonGroup4.add(jbtnvno3);
        jbtnvno3.setText("No");

        jlblpettype3.setText("Pet Type :");

        jtb_display_petinformation2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Name", "Gender", "Age", "TimeArrive", "Spay", "Disabled", "Vaccination", "Organization", "Pettype"
            }
        ));
        jtb_display_petinformation2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_display_petinformation2jtb_display_strayanimalsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtb_display_petinformation2);

        jlblimage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtxtsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearch1jtxtsearchKeyPressed(evt);
            }
        });

        jlblsearch1.setText("Search Here :");

        jtb_display_petinformation1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Name", "Gender", "Age", "TimeArrive", "Spay", "Disabled", "Vaccination", "Organization", "Pettype"
            }
        ));
        jtb_display_petinformation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_display_petinformation1jtb_display_strayanimalsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtb_display_petinformation1);

        jlblsearch2.setText("Search Here :");

        jtxtsearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearch2jtxtsearchKeyPressed(evt);
            }
        });

        jbtnappoinment.setText("Make an Appoinatment");
        jbtnappoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnappoinmentActionPerformed(evt);
            }
        });

        jbtnviewappointment.setText("View my Appointment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnviewappointment))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlblpettype3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(jlblage3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jlblspay3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlbltimearrive3)
                                                .addComponent(jlbldisabled3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlblvacci3)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtxtage3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jdctimearrive3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtnyes3)
                                            .addComponent(jbtndyes3)
                                            .addComponent(jbtnvyes3))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtnvno3)
                                            .addComponent(jbtndno3)
                                            .addComponent(jbtnno3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtxtpettype3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jlblimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblname3)
                                    .addComponent(jlblgender3))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jbtnfemale3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnmale3))
                                    .addComponent(jtxtname3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jlblsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(jlblsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jbtnappoinment)))
                        .addGap(18, 18, 18)
                        .addComponent(jtxtsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 350, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbtnviewappointment)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblname3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblgender3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnfemale3)
                                .addComponent(jbtnmale3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblage3)
                            .addComponent(jtxtage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbltimearrive3)
                            .addComponent(jdctimearrive3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblspay3)
                            .addComponent(jbtnyes3)
                            .addComponent(jbtnno3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbldisabled3)
                            .addComponent(jbtndyes3)
                            .addComponent(jbtndno3)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblsearch1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblsearch2)
                            .addComponent(jtxtsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblvacci3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnvyes3)
                                .addComponent(jbtnvno3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblpettype3)
                            .addComponent(jtxtpettype3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jlblimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnappoinment))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnappoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnappoinmentActionPerformed
        // TODO add your handling code here:
        AdoptorInformationPage adt = new AdoptorInformationPage();
        adt.setVisible(true);

    }//GEN-LAST:event_jbtnappoinmentActionPerformed

    private void jtb_display_petinformation2jtb_display_strayanimalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_display_petinformation2jtb_display_strayanimalsMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            jtxtname3.setText("");
            buttonGroup1.clearSelection();
            jtxtage3.setText("");

            String dateValue ="1900-10-10";
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
            jdctimearrive3.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jtxtpettype3.setText("");
        jlblimage3.setIcon(null);
        
        int i = jtb_display_petinformation2.getSelectedRow();
        TableModel model = jtb_display_petinformation2.getModel();
        jtxtname3.setText(model.getValueAt(i,1).toString());
        String sex = model.getValueAt(i, 2).toString();
        if (sex.equals("Female")){

            jbtnfemale3.setSelected(true);

        }
        else{

            jbtnmale3.setSelected(true);

        }
        jtxtage3.setText(model.getValueAt(i, 3).toString());

        String dateValue2 =model.getValueAt(i, 4).toString();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue2);
        } catch (ParseException ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        jdctimearrive3.setDate(date);

        String spayy = model.getValueAt(i, 5).toString();
        if (spayy.equals("Yes")){

            jbtnyes3.setSelected(true);

        }
        else{

            jbtnno3.setSelected(true);

        }
        String disabledd = model.getValueAt(i, 6).toString();
        if (disabledd.equals("Yes")){

            jbtndyes3.setSelected(true);

        }
        else{

            jbtndno3.setSelected(true);

        }
        String vaccinationn = model.getValueAt(i, 7).toString();
        if (vaccinationn.equals("Yes")){

            jbtnvyes3.setSelected(true);

        }
        else{

            jbtnvno3.setSelected(true);

        }
        jtxtpettype3.setText(model.getValueAt(i, 9).toString());
        byte[] img = (strayanimalsList().get(i).getPicture());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jlblimage3.getWidth(),jlblimage3.getHeight(),Image.SCALE_SMOOTH));
        jlblimage3.setIcon(imageIcon);
    }//GEN-LAST:event_jtb_display_petinformation2jtb_display_strayanimalsMouseClicked

    private void jtxtsearch1jtxtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearch1jtxtsearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtb_display_petinformation1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_display_petinformation1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtsearch1.getText().trim()));
        
    }//GEN-LAST:event_jtxtsearch1jtxtsearchKeyPressed

    private void jtb_display_petinformation1jtb_display_strayanimalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_display_petinformation1jtb_display_strayanimalsMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            jtxtname3.setText("");
            buttonGroup1.clearSelection();
            jtxtage3.setText("");

            String dateValue ="1900-10-10";
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
            jdctimearrive3.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jtxtpettype3.setText("");
        jlblimage3.setIcon(null);
        
        int i = jtb_display_petinformation1.getSelectedRow();
        TableModel model = jtb_display_petinformation1.getModel();
        jtxtname3.setText(model.getValueAt(i,1).toString());
        String sex = model.getValueAt(i, 2).toString();
        if (sex.equals("Female")){

            jbtnfemale3.setSelected(true);

        }
        else{

            jbtnmale3.setSelected(true);

        }
        jtxtage3.setText(model.getValueAt(i, 3).toString());

        String dateValue2 =model.getValueAt(i, 4).toString();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue2);
        } catch (ParseException ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        jdctimearrive3.setDate(date);

        String spayy = model.getValueAt(i, 5).toString();
        if (spayy.equals("Yes")){

            jbtnyes3.setSelected(true);

        }
        else{

            jbtnno3.setSelected(true);

        }
        String disabledd = model.getValueAt(i, 6).toString();
        if (disabledd.equals("Yes")){

            jbtndyes3.setSelected(true);

        }
        else{

            jbtndno3.setSelected(true);

        }
        String vaccinationn = model.getValueAt(i, 7).toString();
        if (vaccinationn.equals("Yes")){

            jbtnvyes3.setSelected(true);

        }
        else{

            jbtnvno3.setSelected(true);

        }
        jtxtpettype3.setText(model.getValueAt(i, 9).toString());
        byte[] img = (petinformationList().get(i).getPicture());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jlblimage3.getWidth(),jlblimage3.getHeight(),Image.SCALE_SMOOTH));
        jlblimage3.setIcon(imageIcon);
    }//GEN-LAST:event_jtb_display_petinformation1jtb_display_strayanimalsMouseClicked

    private void jtxtsearch2jtxtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearch2jtxtsearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtb_display_petinformation2.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_display_petinformation2.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtsearch2.getText().trim()));
    }//GEN-LAST:event_jtxtsearch2jtxtsearchKeyPressed

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
            java.util.logging.Logger.getLogger(PetInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetInformationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbtnappoinment;
    private javax.swing.JRadioButton jbtndno3;
    private javax.swing.JRadioButton jbtndyes3;
    private javax.swing.JRadioButton jbtnfemale3;
    private javax.swing.JRadioButton jbtnmale3;
    private javax.swing.JRadioButton jbtnno3;
    private javax.swing.JButton jbtnviewappointment;
    private javax.swing.JRadioButton jbtnvno3;
    private javax.swing.JRadioButton jbtnvyes3;
    private javax.swing.JRadioButton jbtnyes3;
    private com.toedter.calendar.JDateChooser jdctimearrive3;
    private javax.swing.JLabel jlblage3;
    private javax.swing.JLabel jlbldisabled3;
    private javax.swing.JLabel jlblgender3;
    private javax.swing.JLabel jlblimage3;
    private javax.swing.JLabel jlblname3;
    private javax.swing.JLabel jlblpettype3;
    private javax.swing.JLabel jlblsearch1;
    private javax.swing.JLabel jlblsearch2;
    private javax.swing.JLabel jlblspay3;
    private javax.swing.JLabel jlbltimearrive3;
    private javax.swing.JLabel jlblvacci3;
    private javax.swing.JTable jtb_display_petinformation1;
    private javax.swing.JTable jtb_display_petinformation2;
    private javax.swing.JTextField jtxtage3;
    private javax.swing.JTextField jtxtname3;
    private javax.swing.JTextField jtxtpettype3;
    private javax.swing.JTextField jtxtsearch1;
    private javax.swing.JTextField jtxtsearch2;
    // End of variables declaration//GEN-END:variables
}
