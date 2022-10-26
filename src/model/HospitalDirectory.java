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
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;
     
    
  
    public HospitalDirectory(){
    
        this.hospitalList = new ArrayList();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    
    public Hospital addnewHospital(Hospital newHosp){
        hospitalList.add(newHosp);
        return newHosp;
    }
}
