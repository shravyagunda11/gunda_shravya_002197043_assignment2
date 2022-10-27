/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
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
import static ui.DocotrJFrame.cityDir;
import static ui.DocotrJFrame.commDir;
import static ui.DocotrJFrame.docDir;
import static ui.DocotrJFrame.docusername;
import static ui.DocotrJFrame.encHist;
import static ui.DocotrJFrame.hospDir;
import static ui.DocotrJFrame.houseDir;
import static ui.DocotrJFrame.patDir;
import static ui.DocotrJFrame.perDir;
import static ui.SystemJFrame.cityDir;
import static ui.SystemJFrame.commDir;
import static ui.SystemJFrame.docDir;
import static ui.SystemJFrame.encHist;
import static ui.SystemJFrame.hospDir;
import static ui.SystemJFrame.houseDir;
import static ui.SystemJFrame.patDir;
import static ui.SystemJFrame.perDir;
import static ui.UserViewEncounterJPanel.encHist;
import static ui.UserViewEncounterJPanel.patDir;
import static ui.UserViewEncounterJPanel.username;

/**
 *
 * @author shravyagunda
 */
public class DoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
      static CityDirectory cityDir;
     static PatientDirectory patDir;
    static PersonDirectory perDir;
    static HouseDirectory houseDir;
    static EncounterHistory encHist;
    static CommunityDirectory commDir;
     DoctorDirectory docDir;
    HospitalDirectory hospDir;
    String docusername;
    
    public DoctorJPanel(CityDirectory cityDir,PatientDirectory patDir,PersonDirectory perDir,HouseDirectory houseDir,EncounterHistory encHist,
            CommunityDirectory commDir,DoctorDirectory docDir,HospitalDirectory hospDir,String docusername) {
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
        this.docusername=docusername;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           model.setRowCount(0);
   
        for(Encounter e:encHist.getEncounterHistory()){
  if(e.getDpc().getUserName().equals(docusername)){
    
    
    
                Object[] row = new Object[3];
                    row[0]=e.getPat().getUserName();
                    row[1]=e.getPat().getProblem();
                    
                    row[2]=e.getPat().getId();
  
    model.addRow(row);
  }
          
        }
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Problem", "SSN"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Patients List");

        jButton1.setText("View Encounter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Appointment Date", "Diagnosis", "Next Visit"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("Edit Vital Signs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 153, 153));
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(690, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(13, 13, 13))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
String username=jTable1.getValueAt(0, 0).toString();

        Patient patobj =  null;
        for(Patient p:patDir.getPatientList()){
            if(p.getUserName().equals(username))
            patobj=p;
        }

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        for(Encounter u : encHist.getEncounterHistory()){
            if(u.getPat().getUserName().equals(username)&&u.getDpc().getUserName().equals(docusername))
            {
                Object[] row = new Object[3];

                row[0]=u.getVisit();
                if(u.getDiagn()==null)
                row[1]="To be updated";
                else
                row[1]=u.getDiagn();
                if(u.getNextVisit()==null)
                row[2]="To be updated";
                else
                row[2]=u.getNextVisit();

                model.addRow(row);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
