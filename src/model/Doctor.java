/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author shravyagunda
 */
public class Doctor extends Person{
    int experience;
    String specialisation;
    String degree;
   String hospname;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHospname() {
        return hospname;
    }

    public void setHospname(String hospname) {
        this.hospname = hospname;
    }

    
    public Doctor(String specialisation,int experience, String degree, String hospname, String name,
    String userName,
    String password,
    Date dob,
  
    House residence,
    int id,
 
    String gender){
        super(name,userName,password,dob,residence,id,gender,"doctor");
        
        this.specialisation= specialisation;
      
        this.experience =experience;
        this.degree=degree;
        this.hospname=hospname;
      
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
    public String toString(){
        return name;
    }
    
}
