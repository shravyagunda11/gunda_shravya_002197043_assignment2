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
public class Encounter {
    VitalSigns vital;
    Date visit;
    Doctor dpc;
    Patient pat;
    String diagn;
    Date nextVisit;
    

    public Encounter(VitalSigns vital, Date visit, Doctor dpc, Patient pat, String diagn, Date nextVisit) {
        this.vital = vital;
        this.visit = visit;
        this.dpc = dpc;
        this.pat = pat;
        this.diagn = diagn;
        this.nextVisit = nextVisit;
        
    }

    public VitalSigns getVital() {
        return vital;
    }

    public void setVital(VitalSigns vital) {
        this.vital = vital;
    }

    public Date getVisit() {
        return visit;
    }

    public void setVisit(Date visit) {
        this.visit = visit;
    }

    public Doctor getDpc() {
        return dpc;
    }

    public void setDpc(Doctor dpc) {
        this.dpc = dpc;
    }

    public Patient getPat() {
        return pat;
    }

    public void setPat(Patient pat) {
        this.pat = pat;
    }

    public String getDiagn() {
        return diagn;
    }

    public void setDiagn(String diagn) {
        this.diagn = diagn;
    }

    public Date getNextVisit() {
        return nextVisit;
    }

    public void setNextVisit(Date nextVisit) {
        this.nextVisit = nextVisit;
    }
    

    
}
