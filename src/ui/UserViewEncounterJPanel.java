/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;
import static ui.AddCityJPanel.cityDir;
import static ui.UserViewDoctorsJPanel.patDir;
import static ui.UserViewDoctorsJPanel.username;

/**
 *
 * @author shravyagunda
 */
public class UserViewEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserViewEncounterJPanel
     */
        static CityDirectory cityDir;
    static PatientDirectory patDir;
    static PersonDirectory perDir;
    static HouseDirectory houseDir;
    static EncounterHistory encHist;
    static CommunityDirectory commDir;
    static DoctorDirectory docDir;
    static HospitalDirectory hospDir;
    static String username;
    public UserViewEncounterJPanel(CityDirectory cityDir,PatientDirectory patDir,PersonDirectory perDir,
            HouseDirectory houseDir,EncounterHistory encHist,CommunityDirectory commDir,DoctorDirectory docDir,HospitalDirectory hospDir, String username) {
        initComponents();
           this.cityDir=cityDir;
        this.commDir=commDir;
        this.encHist=encHist;
        this.houseDir=houseDir;
        this.patDir=patDir;
        this.perDir= perDir;
        this.houseDir=houseDir;
        this.docDir = docDir;
        this.hospDir = hospDir;
        this.username =username;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Appointment Date", "Diagnosis", "Next Appointment"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public void populateTable(){
  Patient patobj =  null;
        for(Patient p:patDir.getPatientList()){
            if(p.getUserName().equals(username))
                patobj=p;
        }
        
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    
    
    for(Encounter u : encHist.getEncounterHistory()){
        if(u.getPat().getUserName().equals(username))
        {
                 Object[] row = new Object[4];
        row[0]=u.getDpc().getName();
        
        row[1]=u.getVisit();
        if(u.getDiagn()==null)
            row[2]="To be updated";
        else
            row[2]=u.getDiagn();
        if(u.getNextVisit()==null)
            row[3]="To be updated";
        else
           row[3]=u.getNextVisit();
  
    model.addRow(row);
        }
   
    
    
    }}
}



