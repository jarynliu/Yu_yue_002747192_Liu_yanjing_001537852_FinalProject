/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pkuhore
 */
public class SearchBase {
    
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String URL ="jdbc:mysql://localhost/petcommunity";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    static{
    
        try{
            Class.forName(DRIVER);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        
        }
    
    }
    
    public Connection getConn() throws SQLException{
    
        return DriverManager.getConnection(URL,USER,PASSWORD);
        
    }
    
    public void close(){
    
        try{
            if(rs!=null) rs.close();
            if(ps!=null) ps.close();
            if(con!=null) con.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    
    }
}
