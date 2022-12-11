/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLDao;

import finalproject.entity.Admin;
import java.util.Vector;
import java.sql.SQLException;

/**
 *
 * @author pkuhore
 */
public class AdminDao extends BaseDao{
    //search
    public Vector<Vector<String>>  selectAll(){
        
        Vector<Vector<String>> vData = new Vector<Vector<String>>();
        String sql = "select * from tb_admin";
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
            
                Vector<String> v = new Vector<String> ();
                v.add(rs.getString("adid"));
                v.add(rs.getString("account"));
                v.add(rs.getString("password"));
                v.add(rs.getString("role"));
                vData.add(v);
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
        
        return vData;
    }
    
    public Vector<Vector<String>>  selectByAccount(String account){
        
        Vector<Vector<String>> vData = new Vector<Vector<String>>();
        String sql = "select * from tb_admin where account like ?";
        
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
            ps.setObject(1,"%"+account+"%");
            rs = ps.executeQuery();
            
            while(rs.next()){
            
                Vector<String> v = new Vector<String> ();
                v.add(rs.getString("adid"));
                v.add(rs.getString("account"));
                v.add(rs.getString("password"));
                v.add(rs.getString("role"));
                vData.add(v);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
         close();
        return vData;
    }
    //insert
    public int insert(Admin ad){
        int result = 0;
        String sql = "insert into tb_admin values(null,?,?,?)";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setObject(1,ad.getAccount());
        ps.setObject(2,ad.getPassword());
        ps.setObject(3,ad.getRole());
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }
    
    //delete
    
    public int delete (int adid){
        int result = 0;
        String sql = "delete from tb_admin where adid = ?";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setObject(1,adid);
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        
        close();
        return result;
        
    }
    
    //update
     public int update(Admin ad){
        int result = 0;
        String sql = "update tb_admin set account=?,password=?,role=? where adid = ?";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setObject(1,ad.getAccount());
        ps.setObject(2,ad.getPassword());
        ps.setObject(3,ad.getRole());
        ps.setObject(4,ad.getAdid());
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }

    
}
