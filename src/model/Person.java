/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shravyagunda
 */

import java.util.Date;

public class Person {
    String name;
    String userName;
    String password;
    Date dob;
  
    House residence;
    int id;
    
    String gender;
    String role;
  
  
    public Person(String name,
    String userName,
    String password,
    Date dob,

    House residence,
    int id,
    
    String gender,String role
    ){
        
    this.name=name;
    this.userName=userName;
    this.password=password;
    this.dob=dob;
   
    this.residence=residence;
    this.id=id;
  
    this.gender=gender;
    this.role=role;
   
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

 

  

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

  
     
}
