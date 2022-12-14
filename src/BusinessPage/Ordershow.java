/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BusinessPage;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pkuhore
 */
public class Ordershow extends javax.swing.JFrame {

    /**
     * Creates new form Ordershow
     */
    BusiOrderDao bod = new BusiOrderDao();
    public Ordershow() {
        initComponents();
        show_orderlist();
    }
    
    public ArrayList<OrderList> orderlistList(){
//        String account = jtxtsearch3.getText();
        ArrayList<OrderList> orderlistList = bod.selectAll();
        return orderlistList;     
    }
    
    public void show_orderlist(){
    
        ArrayList<OrderList> list = orderlistList();
        DefaultTableModel model = (DefaultTableModel)jtborderlist.getModel();
        Object[] row = new Object[5];
        for (int i=0; i<list.size();i++){
        
            row[0] = list.get(i).getOrderid();
            row[1] = list.get(i).getFullname();
            row[2] = list.get(i).getEmail();
            row[3] = list.get(i).getProductname();
            row[4] = list.get(i).getOrderqty();
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

        jlbltitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtborderlist = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtxtfullname = new javax.swing.JTextField();
        jlblemail = new javax.swing.JLabel();
        jtxtemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtorderqty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtproductname = new javax.swing.JTextField();
        jlblorderid = new javax.swing.JLabel();
        jtxtorderid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jtxtfrom = new javax.swing.JTextField();
        jtxtsubject = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxamessage = new javax.swing.JTextArea();
        jbtnsend = new javax.swing.JButton();
        jlblto = new javax.swing.JLabel();
        jlblfrom = new javax.swing.JLabel();
        jlblsubject = new javax.swing.JLabel();
        jlblmessage = new javax.swing.JLabel();
        jtxtto = new javax.swing.JTextField();
        jlbltitle2 = new javax.swing.JLabel();
        jtxtsearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbltitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jlbltitle.setText("List of Orders");

        jtborderlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Full Name", "Email", "Product Name", "OrderQty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtborderlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtborderlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtborderlist);

        jLabel1.setText("Full Name");

        jlblemail.setText("Email");

        jLabel2.setText("OrderQty");

        jLabel3.setText("Product Name");

        jlblorderid.setText("OrderID");

        jtxtfrom.setText("liujaryn@gmail.com");

        jtxtsubject.setText("Pet Community Order Status");

        jtxamessage.setColumns(20);
        jtxamessage.setRows(5);
        jScrollPane2.setViewportView(jtxamessage);

        jbtnsend.setText("Send");
        jbtnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsendActionPerformed(evt);
            }
        });

        jlblto.setText("To");

        jlblfrom.setText("From");

        jlblsubject.setText("Subject");

        jlblmessage.setText("Message");

        jlbltitle2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jlbltitle2.setText("Send Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnsend, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlblfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblsubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtto)
                                    .addComponent(jtxtfrom)
                                    .addComponent(jtxtsubject)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jlbltitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbltitle2)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblto)
                    .addComponent(jtxtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblfrom)
                    .addComponent(jtxtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblsubject)
                    .addComponent(jtxtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblmessage)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbtnsend)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jtxtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchKeyPressed(evt);
            }
        });

        jLabel4.setText("Search Here ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jlbltitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblorderid, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtsearch)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtorderid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jlblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtorderqty, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(jtxtemail)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jtxtproductname))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlbltitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblorderid)
                    .addComponent(jtxtorderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblemail)
                    .addComponent(jtxtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtorderqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtborderlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtborderlistMouseClicked
        // TODO add your handling code here:
        int i = jtborderlist.getSelectedRow();
        TableModel model = jtborderlist.getModel();
        jtxtorderid.setText(model.getValueAt(i,0).toString());
        jtxtfullname.setText(model.getValueAt(i,1).toString());
        jtxtemail.setText(model.getValueAt(i,2).toString());
        jtxtproductname.setText(model.getValueAt(i,3).toString());        
        jtxtorderqty.setText(model.getValueAt(i, 4).toString());
        jtxtto.setText(model.getValueAt(i,2).toString());

        
    }//GEN-LAST:event_jtborderlistMouseClicked

    private void jbtnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsendActionPerformed
        // TODO add your handling code here:
        String ToEmail = jtxtto.getText();
        String FromEmail = jtxtfrom.getText();
        String FromEmailPassword = "qrhdtrufdgrilqjh";
        String Subject = jtxtsubject.getText();

        String host = "smtp.gmail.com";

        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.ssl.trust", host);

        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subject);
            message.setText(jtxamessage.getText());
            Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }

        JOptionPane.showMessageDialog(null,"E-mail is sended!");
    }//GEN-LAST:event_jbtnsendActionPerformed

    private void jtxtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtborderlist.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtborderlist.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtsearch.getText().trim()));
    }//GEN-LAST:event_jtxtsearchKeyPressed

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
            java.util.logging.Logger.getLogger(Ordershow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordershow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordershow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordershow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordershow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnsend;
    private javax.swing.JLabel jlblemail;
    private javax.swing.JLabel jlblfrom;
    private javax.swing.JLabel jlblmessage;
    private javax.swing.JLabel jlblorderid;
    private javax.swing.JLabel jlblsubject;
    private javax.swing.JLabel jlbltitle;
    private javax.swing.JLabel jlbltitle2;
    private javax.swing.JLabel jlblto;
    private javax.swing.JTable jtborderlist;
    private javax.swing.JTextArea jtxamessage;
    private javax.swing.JTextField jtxtemail;
    private javax.swing.JTextField jtxtfrom;
    private javax.swing.JTextField jtxtfullname;
    private javax.swing.JTextField jtxtorderid;
    private javax.swing.JTextField jtxtorderqty;
    private javax.swing.JTextField jtxtproductname;
    private javax.swing.JTextField jtxtsearch;
    private javax.swing.JTextField jtxtsubject;
    private javax.swing.JTextField jtxtto;
    // End of variables declaration//GEN-END:variables
}
