/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminPages;

import SQLDao.AdminDao;
import finalproject.entity.Admin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pkuhore
 */
public class SystemAdminPage extends JFrame{
    JTextField txtaccount;
    JButton btnselect;
    JButton btndelete;
    JButton btninsert;
    JButton btnupdate;
    AdminDao ad = new AdminDao();
    DefaultTableModel model;
    JTable table;
    
    public SystemAdminPage(){
    
        init();
        initEvent();
    }

    private void init() {
        this.setTitle("System Admin Home");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        JLabel lblaccount = new JLabel ("account info");
        lblaccount.setBounds(20,100,100,30);
        this.add(lblaccount);
        
        txtaccount = new JTextField();
        txtaccount.setBounds(140,100,260,30);
        this.add(txtaccount);
        
        btnselect = new JButton("search");
        btnselect.setBounds(450,100,90,30);
        this.add(btnselect);
        
        btndelete = new JButton("delete");
        btndelete.setBounds(550,100,90,30);
        this.add(btndelete);
        
        btninsert = new JButton("insert");
        btninsert.setBounds(450,450,90,30);
        this.add(btninsert);
        
        Vector<Vector<String>>vData = ad.selectAll();
        getModel(vData);
        table = new JTable(model);
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(5,140,660,410);
        this.add(jsp);
    }
   

    private void initEvent() {
        
        btnselect.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String account = txtaccount.getText();
               getModel(ad.selectByAccount(account));
            }
        
        });
        
        btndelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               int num = table.getSelectedRow();
               if(num<0){
               
                   JOptionPane.showMessageDialog(null, "Please select the row you want to delete");
                   
               }else{
                   int r = JOptionPane.showConfirmDialog(null, "Are you sure to delete it?");
                   if(r==0){
                       int id = Integer.parseInt(model.getValueAt(num,0).toString());
                       if(ad.delete(id)>0){
                       
                           JOptionPane.showMessageDialog(null, "Successfully deleted");
                           model.removeRow(num);
                       }
                   }
               }
            }
        
        });
        
        btninsert.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               Admininsert adi = new Admininsert();
               adi.setVisible(true);
            }

        });
        
        
       
    }
    
    private void getModel(Vector<Vector<String>> vData) {
         Vector<String> vHead = new Vector<String>();
        vHead.add("adid");
        vHead.add("account");
        vHead.add("password");
        vHead.add("role");
        
        if(model==null){
        
            model=new DefaultTableModel(vData, vHead);
            
        } else{
        
            model.setDataVector(vData, vHead);
        }
        
    }
    }

    
    

