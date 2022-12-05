/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShelterPages;

import java.util.Date;

/**
 *
 * @author pkuhore
 */
class StrayAnimals {
    
    private int sno;
    private String name,gender;
    private int age;
    private Date time_arrive;
    private String spay,disabled,vaccination,pettype;
    
    public StrayAnimals(int sno, String name, String gender, int age, Date time_arrive, String spay, String disabled, String vaccination, String pettype)
    {
        this.sno = sno;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.time_arrive = time_arrive;
        this.spay = spay;
        this.disabled = disabled;
        this.vaccination = vaccination;
        this.pettype = pettype;
        
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Date getTime_Arrive() {
        return time_arrive;
    }

    public String getSpay() {
        return spay;
    }

    public String getDisabled() {
        return disabled;
    }

    public String getVaccination() {
        return vaccination;
    }

    public String getPettype() {
        return pettype;
    }
    
    
    
}
