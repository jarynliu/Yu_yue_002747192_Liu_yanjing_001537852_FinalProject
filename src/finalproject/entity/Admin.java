/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.entity;

/**
 *
 * @author pkuhore
 */
public class Admin {
    private int adid;
    private String account;
    private String password;
    private String role;
    
    public Admin()
    {
    
    }
    

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "Admin{" + "adid=" + adid + ", account=" + account + ", password=" + password + ", role=" + role + '}';
    }

    public Admin(int adid, String account, String password, String role) {
        this.adid = adid;
        this.account = account;
        this.password = password;
        this.role = role;
    }
    
    
    
}
