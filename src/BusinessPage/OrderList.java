/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessPage;

/**
 *
 * @author pkuhore
 */
public class OrderList {
    
    private int orderid;
    private String fullname,email,productname;
    private int orderqty;
    
    
    public OrderList(int orderid,String fullname, String email, String productname, int orderqty)
    {
        this.orderid = orderid;
        this.fullname = fullname;
        this.email = email;
        this.productname = productname;
        this.orderqty = orderqty;
        
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getOrderqty() {
        return orderqty;
    }

    public void setOrderqty(int orderqty) {
        this.orderqty = orderqty;
    }
    
}
