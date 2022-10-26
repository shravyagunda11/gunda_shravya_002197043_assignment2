/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shravyagunda
 */
public class System {
    PersonDirectory perdir;
    PatientDirectory patdir;
    DoctorDirectory docdir;
    CityDirectory citydir;
    
    public System(){
        perdir = new PersonDirectory();
        patdir = new PatientDirectory();
        docdir = new DoctorDirectory();
        citydir = new CityDirectory();
    }
    
}
