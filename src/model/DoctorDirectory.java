/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        this.doctorList= new ArrayList();
        
    } 

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor addDoctor(Doctor newDoctor){
        doctorList.add(newDoctor);
        return newDoctor;
    }
    
    public void removeDoctor(Doctor newDoctor){
    doctorList.remove(newDoctor);
    }
    
}
