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
    private String time_arrive;
    private String spay,disabled,vaccination,pettype,organization;
    private byte[] picture;
    
    public StrayAnimals(int sno, String name, String gender, int age, String time_arrive, String spay, String disabled, String vaccination, String organization,String pettype, byte[] image)
    {
        this.sno = sno;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.time_arrive = time_arrive;
        this.spay = spay;
        this.disabled = disabled;
        this.vaccination = vaccination;
        this.organization = organization;
        this.pettype = pettype;
        this.picture = image;
    }

    public String getOrganization() {
        return organization;
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

    public String getTime_Arrive() {
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

    public byte[] getPicture() {
        return picture;
    }
    
    
    
}
