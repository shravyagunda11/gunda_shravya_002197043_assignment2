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
public class PatientDirectory {
   static ArrayList<Patient> patientList ;
    
   public PatientDirectory(){
    this.patientList = new ArrayList();
}

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
   
      public Patient addPatient(Patient newPatient){
        patientList.add(newPatient);
        return newPatient;
    }  
      
      public void removePatient(Patient newPatient){
          patientList.remove(newPatient);
      }
}
