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
public class Patient extends Person{
    String problem;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public Patient(String prob,String name,
    String userName,
    String password,
    Date dob,
 
    House residence,
    int id,
    int age,
    String gender
            
    ){
        super(name,userName,password,dob,residence,id,gender,"patient");
        this.problem=prob;
        this.age=age;
        
        
    }
    
    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    
    
    //when print obj as 
 public String toString(){
     return name;
    }
}
