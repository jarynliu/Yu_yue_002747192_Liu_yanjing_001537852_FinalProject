/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShelterPages;

import ShelterPages.BaseDao;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author pkuhore
 */
public class OrgVolunDao extends BaseDao{
    


     public int insert(StrayAnimals strayanimals) {
        int result = 0;
        String sql = "insert into strayanimals(name,gender,age,time_arrive,spay,disabled,vaccination,pettype,images)values(?,?,?,?,?,?,?,?,?)";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setString(1,strayanimals.getName());
        ps.setString(2,strayanimals.getGender());
        ps.setInt(3,strayanimals.getAge());
        ps.setString(4, strayanimals.getTime_Arrive());
        ps.setString(5,strayanimals.getSpay());
        ps.setString(6,strayanimals.getDisabled());
        ps.setString(7,strayanimals.getVaccination());
        ps.setString(8,strayanimals.getPettype());
        ps.setBytes(9,strayanimals.getPicture());
       
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }
     
     public int insert2(StrayAnimals strayanimals) {
        int result = 0;
        String sql = "insert into strayanimals2(name,gender,age,time_arrive,spay,disabled,vaccination,pettype,images)values(?,?,?,?,?,?,?,?,?)";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setString(1,strayanimals.getName());
        ps.setString(2,strayanimals.getGender());
        ps.setInt(3,strayanimals.getAge());
        ps.setString(4, strayanimals.getTime_Arrive());
        ps.setString(5,strayanimals.getSpay());
        ps.setString(6,strayanimals.getDisabled());
        ps.setString(7,strayanimals.getVaccination());
        ps.setString(8,strayanimals.getPettype());
        ps.setBytes(9,strayanimals.getPicture());
       
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }
     
     public int insertadoptorinfo(StrayAnimals strayanimals) {
        int result = 0;
        String sql = "insert into appointment(name,id,gender,age,haveorhadpet,numberofpet,pettypenow,phonenumber,homeaddress,shelterpetname,organization)values(?,?,?,?,?,?,?,?,?,?,?)";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setString(1,strayanimals.getName());
        ps.setString(2,strayanimals.getGender());
        ps.setInt(3,strayanimals.getAge());
        ps.setString(4, strayanimals.getTime_Arrive());
        ps.setString(5,strayanimals.getSpay());
        ps.setString(6,strayanimals.getDisabled());
        ps.setString(7,strayanimals.getVaccination());
        ps.setString(8,strayanimals.getPettype());
        ps.setBytes(9,strayanimals.getPicture());
       
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }
     
     public int update(StrayAnimals strayanimals,int id){
        int result = 0;
        String sql = "UPDATE strayanimals SET name = ?,gender=?,age=?,time_arrive=?,spay=?,disabled=?,vaccination=?,pettype=? ,images = ? where sno= ?";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setString(1,strayanimals.getName());
        ps.setString(2,strayanimals.getGender());
        ps.setInt(3,strayanimals.getAge());
        ps.setString(4, strayanimals.getTime_Arrive());
        ps.setString(5,strayanimals.getSpay());
        ps.setString(6,strayanimals.getDisabled());
        ps.setString(7,strayanimals.getVaccination());
        ps.setString(8,strayanimals.getPettype());
        ps.setBytes(9,strayanimals.getPicture());
        ps.setInt(10,id);
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }
     public int update2(StrayAnimals strayanimals,int id){
        int result = 0;
        String sql = "UPDATE strayanimals2 SET name = ?,gender=?,age=?,time_arrive=?,spay=?,disabled=?,vaccination=?,pettype=? ,images = ? where sno= ?";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setString(1,strayanimals.getName());
        ps.setString(2,strayanimals.getGender());
        ps.setInt(3,strayanimals.getAge());
        ps.setString(4, strayanimals.getTime_Arrive());
        ps.setString(5,strayanimals.getSpay());
        ps.setString(6,strayanimals.getDisabled());
        ps.setString(7,strayanimals.getVaccination());
        ps.setString(8,strayanimals.getPettype());
        ps.setBytes(9,strayanimals.getPicture());
        ps.setInt(10,id);
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }
     
     public int delete (int adid){
        int result = 0;
        String sql ="DELETE FROM strayanimals where sno= ?";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setInt(1,adid);
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        
        close();
        return result;
        
    }
     public int delete2 (int adid){
        int result = 0;
        String sql ="DELETE FROM strayanimals2 where sno= ?";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setInt(1,adid);
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        
        close();
        return result;
        
    }
     
     public ArrayList<StrayAnimals> selectAll(){
        
        ArrayList<StrayAnimals> strayanimalsList = new ArrayList<>();
        String sql ="SELECT * FROM strayanimals";
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            StrayAnimals strayanimals;
            while(rs.next()){
            
                strayanimals = new StrayAnimals(rs.getInt("sno"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getString("time_arrive"),rs.getString("spay"),rs.getString("disabled"),rs.getString("vaccination"),rs.getString("organization"),rs.getString("pettype"),rs.getBytes("images"));
                strayanimalsList.add(strayanimals);
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
        
        return strayanimalsList;
    }
     public ArrayList<StrayAnimals> selectAll2(){
        
        ArrayList<StrayAnimals> strayanimalsList = new ArrayList<>();
        String sql ="SELECT * FROM strayanimals2";
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            StrayAnimals strayanimals;
            while(rs.next()){
            
                strayanimals = new StrayAnimals(rs.getInt("sno"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getString("time_arrive"),rs.getString("spay"),rs.getString("disabled"),rs.getString("vaccination"),rs.getString("organization"),rs.getString("pettype"),rs.getBytes("images"));
                strayanimalsList.add(strayanimals);
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
        
        return strayanimalsList;
    }
     
     public ArrayList<StrayAnimals> selectbyname(String name){
        
        ArrayList<StrayAnimals> strayanimalsList = new ArrayList<>();
        String sql ="SELECT * FROM strayanimals WHERE name like ?";
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
           ps.setObject(1,"%"+name+"%");
            rs = ps.executeQuery();
            StrayAnimals strayanimals;
            while(rs.next()){
            
                strayanimals = new StrayAnimals(rs.getInt("sno"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getString("time_arrive"),rs.getString("spay"),rs.getString("disabled"),rs.getString("vaccination"),rs.getString("organization"),rs.getString("pettype"),rs.getBytes("images"));
                strayanimalsList.add(strayanimals);
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
        
        return strayanimalsList;
    }
     
     public ArrayList<StrayAnimals> selectbyname2(String name){
        
        ArrayList<StrayAnimals> strayanimalsList = new ArrayList<>();
        String sql ="SELECT * FROM strayanimals2 WHERE name like ?";
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
           ps.setObject(1,"%"+name+"%");
            rs = ps.executeQuery();
            StrayAnimals strayanimals;
            while(rs.next()){
            
                strayanimals = new StrayAnimals(rs.getInt("sno"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getString("time_arrive"),rs.getString("spay"),rs.getString("disabled"),rs.getString("vaccination"),rs.getString("organization"),rs.getString("pettype"),rs.getBytes("images"));
                strayanimalsList.add(strayanimals);
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
        
        return strayanimalsList;
    }
     
     public int statusupdate(AppointmentStatus appointmentstatus,int id){
        int result = 0;
        String sql = "UPDATE appointment SET appointmentstatus=? where ano= ?";
        try{
        conn=getConn();
        ps = conn.prepareStatement(sql);
        ps.setString(1, appointmentstatus.getAppointmentstatus());
        ps.setInt(2,id);
        result = ps.executeUpdate();
        }catch(SQLException e){
        
            e.printStackTrace();
        } 
        close();
        return result;
    }
     
     
     
     public ArrayList<Appointment> selectbyid(String id){
        
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        String sql ="SELECT * FROM appointment WHERE id like ?";
        
        try{
            conn =getConn();
            ps = conn.prepareStatement(sql);
           ps.setObject(1,"%"+id+"%");
            rs = ps.executeQuery();
            Appointment appointment;
            while(rs.next()){
            
                appointment = new Appointment(rs.getInt("ano"),rs.getString("name"),rs.getString("id"),rs.getString("gender"),rs.getInt("age"),rs.getString("haveorhadpet"),rs.getString("numberofpet"),rs.getString("pettypenow"),rs.getString("phonenumber"),rs.getString("homeaddress"),rs.getString("shelterpetname"),rs.getString("organization"),rs.getString("appointmentstatus"));
                appointmentList.add(appointment);
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // cath 里面的异常不一样会影响结果，之后看一看这个
        
        return appointmentList;
    }
}
