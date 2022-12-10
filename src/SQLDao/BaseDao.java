/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLDao;

/**
 *
 * @author pkuhore
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.ResultSet;


public class BaseDao {
    private static final String DRIVER= "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/petcommunity";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    Connection conn;  
    PreparedStatement ps;
    ResultSet rs;
    
    
    static{
    
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    
    }
    public Connection getConn() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    
    public void close(){
    
        try {
            if(rs!=null) rs.close();
            if(ps!=null) ps.close();
            if(conn!=null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
}
