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
public class Org2VolunteerPage extends javax.swing.JFrame {

    /**
     * Creates new form Org2VolunteerPage
     */
    
    String gender;
    String spay;
    String disabled;
    String vaccination;
    String filename = null;
    byte[] strayanimals_image = null;
    
    public Org2VolunteerPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        show_strayanimals();
        show_appointment();
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
    
    public ArrayList<Appointment> appointmentList(){
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query1 = "SELECT * FROM appointment";
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(query1);
            
            Appointment appointment;
            
            while(rs.next()){
            
                appointment = new Appointment(rs.getInt("ano"),rs.getString("name"),rs.getString("id"),rs.getString("gender"),rs.getInt("age"),rs.getString("haveorhadpet"),rs.getString("numberofpet"),rs.getString("pettypenow"),rs.getString("phonenumber"),rs.getString("homeaddress"),rs.getString("shelterpetname"),rs.getString("organization"),rs.getString("appointmentstatus"));
                appointmentList.add(appointment);
            
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return appointmentList;
        
    }
    
    public void show_strayanimals(){
    
        ArrayList<StrayAnimals> list = strayanimalsList();
        DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals.getModel();
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
    
     public void show_appointment(){
    
        ArrayList<Appointment> list = appointmentList();
        DefaultTableModel model = (DefaultTableModel)jtb_display_appointment.getModel();
        Object[] row = new Object[13];
        for (int i=0; i<list.size();i++){
        
            row[0] = list.get(i).getAno();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getId();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getAge();
            row[5] = list.get(i).getHaveorhadpet();
            row[6] = list.get(i).getNumberofpet();
            row[7] = list.get(i).getPettypenow();
            row[8]= list.get(i).getPhonenumber();
            row[9]= list.get(i).getHomeaddress();
            row[10]= list.get(i).getShelterpetname();
            row[11]= list.get(i).getOrganization();
            row[12]= list.get(i).getAppointmentstatus();
            model.addRow(row);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jppetinfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlblname = new javax.swing.JLabel();
        jtxtname = new javax.swing.JTextField();
        jlblgender = new javax.swing.JLabel();
        jbtnfemale = new javax.swing.JRadioButton();
        jbtnmale = new javax.swing.JRadioButton();
        jlblage = new javax.swing.JLabel();
        jtxtage = new javax.swing.JTextField();
        jlbltimearrive = new javax.swing.JLabel();
        jdctimearrive = new com.toedter.calendar.JDateChooser();
        jlblspay = new javax.swing.JLabel();
        jbtnyes = new javax.swing.JRadioButton();
        jbtnno = new javax.swing.JRadioButton();
        jlbldisabled = new javax.swing.JLabel();
        jbtndyes = new javax.swing.JRadioButton();
        jbtndno = new javax.swing.JRadioButton();
        jlblvacci = new javax.swing.JLabel();
        jbtnvyes = new javax.swing.JRadioButton();
        jbtnvno = new javax.swing.JRadioButton();
        jlblpettype = new javax.swing.JLabel();
        jtxtpettype = new javax.swing.JTextField();
        jbtnsave = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_display_strayanimals = new javax.swing.JTable();
        jbtnupdate = new javax.swing.JButton();
        jbtndelete = new javax.swing.JButton();
        jlblimage = new javax.swing.JLabel();
        jbtnimage = new javax.swing.JButton();
        jtxtsearch = new javax.swing.JTextField();
        jlblsearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpappointments = new javax.swing.JPanel();
        jlblname1 = new javax.swing.JLabel();
        jlblid1 = new javax.swing.JLabel();
        jlblgender1 = new javax.swing.JLabel();
        jlblage1 = new javax.swing.JLabel();
        jlblhaveorhad = new javax.swing.JLabel();
        jlblnumberofpet = new javax.swing.JLabel();
        jlblpettypenow = new javax.swing.JLabel();
        jlblphone = new javax.swing.JLabel();
        jlbladdress = new javax.swing.JLabel();
        jlblshelterpetname = new javax.swing.JLabel();
        jtxtid1 = new javax.swing.JTextField();
        jtxtname1 = new javax.swing.JTextField();
        jtxtage1 = new javax.swing.JTextField();
        jtxtphone = new javax.swing.JTextField();
        jtxtaddress = new javax.swing.JTextField();
        jtxtshelterpetname = new javax.swing.JTextField();
        jbtnfemale1 = new javax.swing.JRadioButton();
        jbtnmale1 = new javax.swing.JRadioButton();
        jbtnnotsay = new javax.swing.JRadioButton();
        jbtnyes1 = new javax.swing.JRadioButton();
        jbtnno1 = new javax.swing.JRadioButton();
        jbtn0 = new javax.swing.JRadioButton();
        jbtn1 = new javax.swing.JRadioButton();
        jbtn2 = new javax.swing.JRadioButton();
        jbtn3 = new javax.swing.JRadioButton();
        jcbdog = new javax.swing.JCheckBox();
        jcbcat = new javax.swing.JCheckBox();
        jcbothers = new javax.swing.JCheckBox();
        jlblsearch1 = new javax.swing.JLabel();
        jtxtsearch1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtb_display_appointment = new javax.swing.JTable();
        jtxtstatus = new javax.swing.JTextField();
        jlblstatus = new javax.swing.JLabel();
        jbtnstatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblname.setText("Name :");

        jlblgender.setText("Gender :");

        buttonGroup1.add(jbtnfemale);
        jbtnfemale.setText("Female");

        buttonGroup1.add(jbtnmale);
        jbtnmale.setText("Male");
        jbtnmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmaleActionPerformed(evt);
            }
        });

        jlblage.setText("Estimate Age :");

        jtxtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtageKeyPressed(evt);
            }
        });

        jlbltimearrive.setText("Time arrive Shelter :");

        jlblspay.setText("Spay :");

        buttonGroup2.add(jbtnyes);
        jbtnyes.setText("Yes");
        jbtnyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnyesActionPerformed(evt);
            }
        });

        buttonGroup2.add(jbtnno);
        jbtnno.setText("No");

        jlbldisabled.setText("Disabled:");

        buttonGroup3.add(jbtndyes);
        jbtndyes.setText("Yes");

        buttonGroup3.add(jbtndno);
        jbtndno.setText("No");

        jlblvacci.setText("Vaccination :");

        buttonGroup4.add(jbtnvyes);
        jbtnvyes.setText("Yes");

        buttonGroup4.add(jbtnvno);
        jbtnvno.setText("No");

        jlblpettype.setText("Pet Type :");

        jbtnsave.setText("Save");
        jbtnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsaveActionPerformed(evt);
            }
        });

        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        jtb_display_strayanimals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Name", "Gender", "Age", "TimeArrive", "Spay", "Disabled", "Vaccination", "Organization", "Pettype"
            }
        ));
        jtb_display_strayanimals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_display_strayanimalsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_display_strayanimals);

        jbtnupdate.setText("Update");
        jbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateActionPerformed(evt);
            }
        });

        jbtndelete.setText("Delete");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });

        jlblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnimage.setText("Browse");
        jbtnimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnimageActionPerformed(evt);
            }
        });

        jtxtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchKeyPressed(evt);
            }
        });

        jlblsearch.setText("Search Here :");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblname)
                                    .addComponent(jlblgender))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtnfemale)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnmale))
                                    .addComponent(jtxtname)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jbtndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblpettype, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jlblage, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlblspay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbltimearrive)
                                            .addComponent(jlbldisabled, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblvacci))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jbtnimage, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtage)
                                    .addComponent(jdctimearrive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtnyes)
                                            .addComponent(jbtndyes)
                                            .addComponent(jbtnvyes))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtnvno)
                                            .addComponent(jbtndno)
                                            .addComponent(jbtnno))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtxtpettype))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE))
                            .addComponent(jlblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jtxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblsearch)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtnreset)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblname))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlblgender)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnfemale)
                                    .addComponent(jbtnmale)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlblage)
                                .addComponent(jtxtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlbltimearrive)
                                .addComponent(jdctimearrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlblspay)
                                .addComponent(jbtnyes)
                                .addComponent(jbtnno))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlbldisabled)
                                .addComponent(jbtndyes)
                                .addComponent(jbtndno))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlblvacci)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnvyes)
                                    .addComponent(jbtnvno)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlblpettype)
                                .addComponent(jtxtpettype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(jbtnimage)
                                    .addGap(81, 81, 81))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(jlblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnsave)
                                    .addComponent(jbtnupdate))
                                .addComponent(jbtndelete, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jppetinfoLayout = new javax.swing.GroupLayout(jppetinfo);
        jppetinfo.setLayout(jppetinfoLayout);
        jppetinfoLayout.setHorizontalGroup(
            jppetinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jppetinfoLayout.setVerticalGroup(
            jppetinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pet Information", jppetinfo);

        jlblname1.setText("Name :");

        jlblid1.setText("ID :");

        jlblgender1.setText("Gender :");

        jlblage1.setText("Age :");

        jlblhaveorhad.setText("Have or Had a Pet :");

        jlblnumberofpet.setText("Number of Pet :");

        jlblpettypenow.setText("Pet Type Now :");

        jlblphone.setText("Phone Number:");

        jlbladdress.setText("Home Address :");

        jlblshelterpetname.setText("Shelter Pet Name :");

        jtxtname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtname1ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jbtnfemale1);
        jbtnfemale1.setText("Female");

        buttonGroup5.add(jbtnmale1);
        jbtnmale1.setText("Male");

        buttonGroup5.add(jbtnnotsay);
        jbtnnotsay.setText("Prefer not to Say");

        buttonGroup6.add(jbtnyes1);
        jbtnyes1.setText("Yes");

        buttonGroup6.add(jbtnno1);
        jbtnno1.setText("No");

        buttonGroup7.add(jbtn0);
        jbtn0.setText("0");

        buttonGroup7.add(jbtn1);
        jbtn1.setText("1");

        buttonGroup7.add(jbtn2);
        jbtn2.setText("2");

        buttonGroup7.add(jbtn3);
        jbtn3.setText("More than 2");

        jcbdog.setText("Dog");

        jcbcat.setText("Cat");

        jcbothers.setText("Others");

        jlblsearch1.setText("Search :");

        jtxtsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearch1KeyPressed1(evt);
            }
        });

        jtb_display_appointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ano", "name", "id", "gender", "age", "have or had a pet", "number of pet", "pet type now", "phone number", "home address", "shelter pet name", "Organization", "Status"
            }
        ));
        jtb_display_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_display_appointmentMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtb_display_appointment);

        jlblstatus.setText("Status: ");

        jbtnstatus.setText("Submit");
        jbtnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpappointmentsLayout = new javax.swing.GroupLayout(jpappointments);
        jpappointments.setLayout(jpappointmentsLayout);
        jpappointmentsLayout.setHorizontalGroup(
            jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpappointmentsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jpappointmentsLayout.createSequentialGroup()
                        .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlblpettypenow, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblphone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblshelterpetname, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblnumberofpet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblhaveorhad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblage1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblgender1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblid1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblname1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtname1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtid1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpappointmentsLayout.createSequentialGroup()
                                .addComponent(jbtnfemale1)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnmale1)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnnotsay))
                            .addComponent(jtxtshelterpetname, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpappointmentsLayout.createSequentialGroup()
                                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbdog)
                                    .addComponent(jbtn0)
                                    .addComponent(jbtnyes1))
                                .addGap(34, 34, 34)
                                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnno1)
                                    .addGroup(jpappointmentsLayout.createSequentialGroup()
                                        .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbcat)
                                            .addComponent(jbtn1))
                                        .addGap(33, 33, 33)
                                        .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpappointmentsLayout.createSequentialGroup()
                                                .addComponent(jbtn2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbtn3))
                                            .addComponent(jcbothers)))))
                            .addGroup(jpappointmentsLayout.createSequentialGroup()
                                .addComponent(jtxtage1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(jlblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jtxtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jbtnstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 301, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpappointmentsLayout.createSequentialGroup()
                    .addGap(801, 801, 801)
                    .addComponent(jlblsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addComponent(jtxtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );
        jpappointmentsLayout.setVerticalGroup(
            jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpappointmentsLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblname1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtname1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblid1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtid1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblgender1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnfemale1)
                        .addComponent(jbtnmale1)
                        .addComponent(jbtnnotsay)))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblage1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblstatus)
                        .addComponent(jbtnstatus)))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblhaveorhad)
                        .addComponent(jbtnyes1))
                    .addComponent(jbtnno1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblnumberofpet, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn0, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn2)
                        .addComponent(jbtn3)))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblpettypenow, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbdog)
                        .addComponent(jcbcat)
                        .addComponent(jcbothers)))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblphone)
                    .addComponent(jtxtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbladdress)
                    .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblshelterpetname)
                    .addComponent(jtxtshelterpetname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpappointmentsLayout.createSequentialGroup()
                    .addGap(503, 503, 503)
                    .addGroup(jpappointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblsearch1)
                        .addComponent(jtxtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Appointments", jpappointments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsaveActionPerformed
        // TODO add your handling code here:
        if(jtxtname.getText().trim()==null){
        
            JOptionPane.showMessageDialog(this, "Please input your name");
        
        }
        if(jbtnfemale.isSelected()==false&&jbtnmale.isSelected()==false){
                
                 JOptionPane.showMessageDialog(this, "Please select your gender");
                
                }
        if(jtxtage.getText().trim()==null){
            JOptionPane.showMessageDialog(this, "Please input your age");
        }
        if(jdctimearrive.getDate()==null){
        
            JOptionPane.showMessageDialog(this, "Please select the date");

        }
        if(jbtnyes.isSelected()==false&&jbtnno.isSelected()==false){
        
            JOptionPane.showMessageDialog(this, "Please input spay information");

        }
        if(jbtndyes.isSelected()==false&&jbtndno.isSelected()){
        
            JOptionPane.showMessageDialog(this, "Please input disabled information");

        }
        if(jbtnvyes.isSelected()==false&&jbtnvno.isSelected()==false){
        
            JOptionPane.showMessageDialog(this, "Please input vaccination information");

        }
        if(jtxtpettype.getText().trim()==null){
        
            JOptionPane.showMessageDialog(this, "Please input the pet type");
        
        }
        if(strayanimals_image==null)
        {
            JOptionPane.showMessageDialog(this, "Please upload a photo");
        }
        
        
        else{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query = "insert into strayanimals2(name,gender,age,time_arrive,spay,disabled,vaccination,pettype,images)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, jtxtname.getText());
            if(jbtnfemale.isSelected()){
                gender = "Female";
            }
            if(jbtnmale.isSelected()){
                gender = "Male";
            }
            pst.setString(2, gender);
            pst.setInt(3,Integer.parseInt(jtxtage.getText()));  //这里的数据验证要判断integer
             
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String time_arrive = dateformat.format(jdctimearrive.getDate());

            pst.setString(4, time_arrive);

            if(jbtnyes.isSelected()){
                spay = "Yes";
            }
            if(jbtnno.isSelected()){
                spay = "No";
            }
            pst.setString(5, spay);

            if(jbtndyes.isSelected()){
                disabled = "Yes";
            }
            if(jbtndno.isSelected()){
                disabled = "No";
            }
            pst.setString(6, disabled);

            if(jbtnvyes.isSelected()){
                vaccination = "Yes";
            }
            if(jbtnvno.isSelected()){
                vaccination = "No";
            }
            pst.setString(7,vaccination);
           

            pst.setString(8,jtxtpettype.getText());

            pst.setBytes(9,strayanimals_image);

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals.getModel();
            model.setRowCount(0);
            show_strayanimals();
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");

        }
        catch (Exception ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        jtxtname.setText("");
        buttonGroup1.clearSelection();
        jtxtage.setText("");
        jdctimearrive.setDate(null);
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jtxtpettype.setText("");
        jlblimage.setIcon(null);
        
    }//GEN-LAST:event_jbtnsaveActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        
        jtxtname.setText("");
        buttonGroup1.clearSelection();
        jtxtage.setText("");
        jdctimearrive.setDate(null);
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jtxtpettype.setText("");
        jlblimage.setIcon(null);
        
        jbtnsave.setEnabled(true);

    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jtb_display_strayanimalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_display_strayanimalsMouseClicked
        // TODO add your handling code here:
        int i = jtb_display_strayanimals.getSelectedRow();
        TableModel model = jtb_display_strayanimals.getModel();
        jtxtname.setText(model.getValueAt(i,1).toString());
        String sex = model.getValueAt(i, 2).toString();
        if (sex.equals("Female")){

            jbtnfemale.setSelected(true);

        }
        else{

            jbtnmale.setSelected(true);

        }
        jtxtage.setText(model.getValueAt(i, 3).toString());

        String dateValue2 =model.getValueAt(i, 4).toString();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue2);
        } catch (ParseException ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        jdctimearrive.setDate(date);

        String spayy = model.getValueAt(i, 5).toString();
        if (spayy.equals("Yes")){

            jbtnyes.setSelected(true);

        }
        else{

            jbtnno.setSelected(true);

        }
        String disabledd = model.getValueAt(i, 6).toString();
        if (disabledd.equals("Yes")){

            jbtndyes.setSelected(true);

        }
        else{

            jbtndno.setSelected(true);

        }
        String vaccinationn = model.getValueAt(i, 7).toString();
        if (vaccinationn.equals("Yes")){

            jbtnvyes.setSelected(true);

        }
        else{

            jbtnvno.setSelected(true);

        }
        jtxtpettype.setText(model.getValueAt(i, 9).toString());
        byte[] img = (strayanimalsList().get(i).getPicture());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jlblimage.getWidth(),jlblimage.getHeight(),Image.SCALE_SMOOTH));
        jlblimage.setIcon(imageIcon);
        
        jbtnsave.setEnabled(false);
    }//GEN-LAST:event_jtb_display_strayanimalsMouseClicked

    private void jbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateActionPerformed

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String time_arrive = dateformat.format(jdctimearrive.getDate());

        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            int row = jtb_display_strayanimals.getSelectedRow();
            String value = (jtb_display_strayanimals.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE strayanimals2 SET name = ?,gender=?,age=?,time_arrive=?,spay=?,disabled=?,vaccination=?,pettype=? ,images = ? where sno="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, jtxtname.getText());
            if(jbtnfemale.isSelected()){
                gender = "Female";
            }
            if(jbtnmale.isSelected()){
                gender = "Male";
            }
            pst.setString(2, gender);
            pst.setInt(3,Integer.parseInt(jtxtage.getText()));  //这里的数据验证要判断integer

            pst.setString(4, time_arrive);

            if(jbtnyes.isSelected()){
                spay = "Yes";
            }
            if(jbtnno.isSelected()){
                spay = "No";
            }
            pst.setString(5, spay);

            if(jbtndyes.isSelected()){
                disabled = "Yes";
            }
            if(jbtndno.isSelected()){
                disabled = "No";
            }
            pst.setString(6, disabled);

            if(jbtnvyes.isSelected()){
                vaccination = "Yes";
            }
            if(jbtnvno.isSelected()){
                vaccination = "No";
            }
            pst.setString(7,vaccination);

            pst.setString(8,jtxtpettype.getText());

            pst.setBytes(9,strayanimals_image);

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals.getModel();
            model.setRowCount(0);
            show_strayanimals();
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        jtxtname.setText("");
        buttonGroup1.clearSelection();
        jtxtage.setText("");
        jdctimearrive.setDate(null);
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jtxtpettype.setText("");
        jlblimage.setIcon(null);
        
        jbtnsave.setEnabled(true);

    }//GEN-LAST:event_jbtnupdateActionPerformed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete it ?", "Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
                int row = jtb_display_strayanimals.getSelectedRow();
                String value = (jtb_display_strayanimals.getModel().getValueAt(row, 0).toString());
                String query = "DELETE FROM strayanimals2 where sno="+value;
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals.getModel();
                model.setRowCount(0);
                show_strayanimals();
                JOptionPane.showMessageDialog(null, "Deleted Successfully!");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        jtxtname.setText("");
        buttonGroup1.clearSelection();
        jtxtage.setText("");
        jdctimearrive.setDate(null);
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jtxtpettype.setText("");
        jlblimage.setIcon(null);
        
        jbtnsave.setEnabled(true);

        }
        
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void jbtnimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnimageActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jlblimage.getWidth(),jlblimage.getHeight(),Image.SCALE_SMOOTH));
        jlblimage.setIcon(imageIcon);

        try{

            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;){

                bos.write(buf,0,readNum);

            }
            strayanimals_image = bos.toByteArray();

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jbtnimageActionPerformed

    private void jtxtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_display_strayanimals.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtsearch.getText().trim()));
    }//GEN-LAST:event_jtxtsearchKeyPressed

    private void jtxtname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtname1ActionPerformed

    private void jtxtsearch1KeyPressed1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearch1KeyPressed1
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtb_display_appointment.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_display_appointment.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtsearch1.getText().trim()));
    }//GEN-LAST:event_jtxtsearch1KeyPressed1

    private void jtb_display_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_display_appointmentMouseClicked
        // TODO add your handling code here:
        int i = jtb_display_appointment.getSelectedRow();
        TableModel model = jtb_display_appointment.getModel();
        jtxtname1.setText(model.getValueAt(i,1).toString());
        jtxtid1.setText(model.getValueAt(i,2).toString());
        String sex = model.getValueAt(i, 3).toString();
        if (sex.equals("Female")){

            jbtnfemale.setSelected(true);

        }
        if (sex.equals("Prefer not to say")){

            jbtnnotsay.setSelected(true);

        }
        else{

            jbtnmale.setSelected(true);

        }
        jtxtage1.setText(model.getValueAt(i, 4).toString());

        String haveorhadpet = model.getValueAt(i, 5).toString();
        if (haveorhadpet.equals("Yes")){

            jbtnyes1.setSelected(true);

        }
        else{

            jbtnno1.setSelected(true);

        }
        String numberofpet = model.getValueAt(i, 6).toString();
        if (numberofpet.equals("0")){

            jbtn0.setSelected(true);

        }
        if (numberofpet.equals("1")){

            jbtn1.setSelected(true);

        }
        if (numberofpet.equals("2")){

            jbtn2.setSelected(true);

        }
        else{

            jbtn3.setSelected(true);

        }

        String pettypenow = model.getValueAt(i, 7).toString();
        switch(pettypenow){

            case "Dog " :
            jcbdog.setSelected(true);
            jcbcat.setSelected(false);
            jcbothers.setSelected(false);
            break;
            case "Cat " :
            jcbdog.setSelected(false);
            jcbcat.setSelected(true);
            jcbothers.setSelected(false);
            break;
            case "Others(If you have no pet, just choose this.) " :
            jcbdog.setSelected(false);
            jcbcat.setSelected(false);
            jcbothers.setSelected(true);
            break;
            case "Dog Cat " :
            jcbdog.setSelected(true);
            jcbcat.setSelected(true);
            jcbothers.setSelected(false);
            break;
            case "Dog Others(If you have no pet, just choose this.) " :
            jcbdog.setSelected(true);
            jcbcat.setSelected(false);
            jcbothers.setSelected(true);
            break;
            case "Cat Others(If you have no pet, just choose this.) " :
            jcbdog.setSelected(false);
            jcbcat.setSelected(true);
            jcbothers.setSelected(true);
            break;
            default :
            jcbdog.setSelected(true);
            jcbcat.setSelected(true);
            jcbothers.setSelected(true);
            break;

        }

        jtxtphone.setText(model.getValueAt(i,8).toString());
        jtxtaddress.setText(model.getValueAt(i,9).toString());
        jtxtshelterpetname.setText(model.getValueAt(i,10).toString());
        jtxtstatus.setText(model.getValueAt(i,12).toString());

    }//GEN-LAST:event_jtb_display_appointmentMouseClicked

    private void jbtnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnstatusActionPerformed
        // TODO add your handling code here:
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            int row = jtb_display_appointment.getSelectedRow();
            String value = (jtb_display_appointment.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE appointment SET appointmentstatus=? where ano="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, jtxtstatus.getText());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jtb_display_appointment.getModel();
            model.setRowCount(0);
            show_appointment();
            JOptionPane.showMessageDialog(null, "Status Changed");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jbtnstatusActionPerformed

    private void jtxtageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtageKeyPressed
        // TODO add your handling code here:
        
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(this, "Please input an integer");
            jtxtage.setText("");
        }
    }//GEN-LAST:event_jtxtageKeyPressed

    private void jbtnyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnyesActionPerformed

    private void jbtnmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnmaleActionPerformed

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
            java.util.logging.Logger.getLogger(Org2VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Org2VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Org2VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Org2VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Org2VolunteerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jbtn0;
    private javax.swing.JRadioButton jbtn1;
    private javax.swing.JRadioButton jbtn2;
    private javax.swing.JRadioButton jbtn3;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JRadioButton jbtndno;
    private javax.swing.JRadioButton jbtndyes;
    private javax.swing.JRadioButton jbtnfemale;
    private javax.swing.JRadioButton jbtnfemale1;
    private javax.swing.JButton jbtnimage;
    private javax.swing.JRadioButton jbtnmale;
    private javax.swing.JRadioButton jbtnmale1;
    private javax.swing.JRadioButton jbtnno;
    private javax.swing.JRadioButton jbtnno1;
    private javax.swing.JRadioButton jbtnnotsay;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtnsave;
    private javax.swing.JButton jbtnstatus;
    private javax.swing.JButton jbtnupdate;
    private javax.swing.JRadioButton jbtnvno;
    private javax.swing.JRadioButton jbtnvyes;
    private javax.swing.JRadioButton jbtnyes;
    private javax.swing.JRadioButton jbtnyes1;
    private javax.swing.JCheckBox jcbcat;
    private javax.swing.JCheckBox jcbdog;
    private javax.swing.JCheckBox jcbothers;
    private com.toedter.calendar.JDateChooser jdctimearrive;
    private javax.swing.JLabel jlbladdress;
    private javax.swing.JLabel jlblage;
    private javax.swing.JLabel jlblage1;
    private javax.swing.JLabel jlbldisabled;
    private javax.swing.JLabel jlblgender;
    private javax.swing.JLabel jlblgender1;
    private javax.swing.JLabel jlblhaveorhad;
    private javax.swing.JLabel jlblid1;
    private javax.swing.JLabel jlblimage;
    private javax.swing.JLabel jlblname;
    private javax.swing.JLabel jlblname1;
    private javax.swing.JLabel jlblnumberofpet;
    private javax.swing.JLabel jlblpettype;
    private javax.swing.JLabel jlblpettypenow;
    private javax.swing.JLabel jlblphone;
    private javax.swing.JLabel jlblsearch;
    private javax.swing.JLabel jlblsearch1;
    private javax.swing.JLabel jlblshelterpetname;
    private javax.swing.JLabel jlblspay;
    private javax.swing.JLabel jlblstatus;
    private javax.swing.JLabel jlbltimearrive;
    private javax.swing.JLabel jlblvacci;
    private javax.swing.JPanel jpappointments;
    private javax.swing.JPanel jppetinfo;
    private javax.swing.JTable jtb_display_appointment;
    private javax.swing.JTable jtb_display_strayanimals;
    private javax.swing.JTextField jtxtaddress;
    private javax.swing.JTextField jtxtage;
    private javax.swing.JTextField jtxtage1;
    private javax.swing.JTextField jtxtid1;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtname1;
    private javax.swing.JTextField jtxtpettype;
    private javax.swing.JTextField jtxtphone;
    private javax.swing.JTextField jtxtsearch;
    private javax.swing.JTextField jtxtsearch1;
    private javax.swing.JTextField jtxtshelterpetname;
    private javax.swing.JTextField jtxtstatus;
    // End of variables declaration//GEN-END:variables
}
