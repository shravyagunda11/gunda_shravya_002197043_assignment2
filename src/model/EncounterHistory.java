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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        this.encounterHistory = new ArrayList();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }
    
    
    public Encounter addEncounter(Encounter newenc){
        encounterHistory.add(newenc);
        return newenc;
    }
}
