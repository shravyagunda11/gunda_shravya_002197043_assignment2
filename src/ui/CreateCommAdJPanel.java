/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author shravyagunda
 */
   
    
public class CreateCommAdJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCommAdJPanel
     */
     static CityDirectory cityDir;
    static PatientDirectory patDir;
    static PersonDirectory perDir;
    static HouseDirectory houseDir;
    static EncounterHistory encHist;
    static CommunityDirectory commDir;
    DoctorDirectory docDir;
    HospitalDirectory hospDir;
    public CreateCommAdJPanel(CityDirectory cityDir,PatientDirectory patDir,PersonDirectory perDir,HouseDirectory houseDir,EncounterHistory encHist,CommunityDirectory commDir,DoctorDirectory docDir,HospitalDirectory hospDir) {
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreatePatient = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        btnCreatePatient.setBackground(new java.awt.Color(255, 153, 153));
        btnCreatePatient.setText("Create");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnCreatePatient)
                .addGap(171, 171, 171))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String userName = txtUserName.getText();
        String pass = txtPassword.getText();
     
        //TO SEARCH FOR HOUSE

        //        for(House h:houseDir.getHouseList() ){
            //
            //            if(h.getHouseno().equals(house))
            //                hobj=h;
            //
            //        }

            
            
        Person per = new Person(name,userName, pass, null,null,0,null,"community admin");
        perDir.addPerson(per);
        JOptionPane.showMessageDialog(this, "Community Admin added successfully!");

       
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
