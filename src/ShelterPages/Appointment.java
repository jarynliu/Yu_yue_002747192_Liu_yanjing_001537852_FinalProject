/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShelterPages;

/**
 *
 * @author pkuhore
 */
class Appointment {
    
    private int ano;
    private int age;
    private String name,id,gender,haveorhadpet,numberofpet,pettypenow,phonenumber,homeaddress,shelterpetname;
    
    public Appointment(int ano, String name, String id,String gender, int age,String haveorhadpet, String numberofpet, String pettypenow, String phonenumber, String homeaddress, String shelterpetname)
    {
        this.ano = ano;
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.haveorhadpet = haveorhadpet;
        this.numberofpet = numberofpet;
        this.pettypenow = pettypenow;
        this.phonenumber = phonenumber;
        this.homeaddress = homeaddress;
        this.shelterpetname = shelterpetname;
    }

    public int getAno() {
        return ano;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getHaveorhadpet() {
        return haveorhadpet;
    }

    public String getNumberofpet() {
        return numberofpet;
    }

    public String getPettypenow() {
        return pettypenow;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public String getShelterpetname() {
        return shelterpetname;
    }
    
}
