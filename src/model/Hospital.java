/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shravyagunda
 */
public class Hospital {
   String hospName;
   int builtyr;
   int phone;
   String cit;
   String comm;
   DoctorDirectory doct;

    public Hospital(String hospName, int builtyr, int phone, String cit, String comm, DoctorDirectory doct) {
        this.hospName = hospName;
        this.builtyr = builtyr;
        this.phone = phone;
        this.cit = cit;
        this.comm = comm;
        this.doct = doct;
    }

    public String getCit() {
        return cit;
    }

    public void setCit(String cit) {
        this.cit = cit;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
   

   

    public int getBuiltyr() {
        return builtyr;
    }

    public void setBuiltyr(int builtyr) {
        this.builtyr = builtyr;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

   
   

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public DoctorDirectory getDoct() {
        return doct;
    }

    public void setDoct(DoctorDirectory doct) {
        this.doct = doct;
    }
   
    public String toString(){
        return hospName;
    }
   
}
