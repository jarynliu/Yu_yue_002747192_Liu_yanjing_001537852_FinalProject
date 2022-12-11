/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessPage;


import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pkuhore
 */
public class BusiOrderDao extends BusinessBaseDao{
    
    
     public ArrayList<OrderList> selectAll(){
        
        ArrayList<OrderList> orderlistList = new ArrayList<>();
        String sql ="SELECT * FROM orderproduct";
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            OrderList orderlist;
            while(rs.next()){
            
                orderlist = new OrderList(rs.getInt("order_id"),rs.getString("fullname"),rs.getString("email"),rs.getString("productname"),rs.getInt("orderqty"));
                orderlistList.add(orderlist);
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
        
        return orderlistList;
    }
     
    
    
    
}
