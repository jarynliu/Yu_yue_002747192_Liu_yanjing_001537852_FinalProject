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
class PetInformation {
    
    private int sno;
    private String name,gender;
    private int age;
    private Date time_arrive;
    private String spay,disabled,vaccination,pettype;
    private byte[] picture;
    
    public PetInformation(int sno, String name, String gender, int age, Date time_arrive, String spay, String disabled, String vaccination, String pettype, byte[] image)
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
        this.picture = image;
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

    public Date getTime_arrive() {
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
