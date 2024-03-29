/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import static ui.AddCityJPanel.cityDir;
import model.*;

/**
 *
 * @author shravyagunda
 */
public class AddCommunityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunityJPanel
     */
     CityDirectory cityDir;
     static PatientDirectory patDir;
    static PersonDirectory perDir;
    HouseDirectory houseDir;
    EncounterHistory encHist;
    CommunityDirectory commDir;
     DoctorDirectory docDir;
    HospitalDirectory hospDir;
    public AddCommunityJPanel(CityDirectory cityDir,PatientDirectory patDir,PersonDirectory perDir,
            HouseDirectory houseDir,EncounterHistory encHist,CommunityDirectory commDir,DoctorDirectory docDir,HospitalDirectory hospDir) {
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
        
        populateTable();
        for(City c:cityDir.getCityList()){
            jComboBox1.addItem(c.getCityName());
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

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(846, 482));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Add Community");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("City");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Community Name");

        jLabel2.setText("Area");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Area", "City"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Save Changes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String name = jTextField2.getText();
        int area = Integer.parseInt(jTextField1.getText());
        String city = jComboBox1.getSelectedItem().toString();
        
        String area1 = jTextField1.getText();
        if(name.length()<=0){
         JOptionPane.showMessageDialog(this, "Please enter valid name");
         return;
        }
        
        if(area1.length()<=0){
                  JOptionPane.showMessageDialog(this, "Please enter valid area");
                  return;
        }
        
        if(area1.length()>0&&!area1.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Area can only be numeric");
            return;
        }
        Community c = new Community(name,new HospitalDirectory(),new HouseDirectory(),area,city);
        if(commDir!=null)
            commDir.addCommunity(c);
        
      //search for City
        City cobj=null;
        for(City ci:cityDir.getCityList() ){
           
            if(ci.getCityName().equals(city))
                cobj=ci;
        }
        
        //add community to city's community directory and connect
   
        (cobj.getComm()).addCommunity(c);
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
          int row = jTable1.getSelectedRow();
        
        String name = jTable1.getValueAt(row, 0).toString();
      
        //find the comm obj in directory
        Community obj =null;
        for(Community o:commDir.getCommunityList()){
            if(o.getCommunityName().equals(name))
                obj=o;
        }
        
        String newname = jTextField2.getText();
        int newarea= Integer.parseInt(jTextField1.getText());
        String newcity = jComboBox1.getSelectedItem().toString();
        
        
        obj.setCommunityName(newname);
        obj.setArea(newarea);
        obj.setCityName(newcity);
        populateTable();
        
      
        
         for(House h:houseDir.getHouseList()){
            if(h.getCommName().equals(name))
                h.setCommName(newname);
        }
        
         for(Hospital ho:hospDir.getHospitalList()){
            if(ho.getComm().equals(newname))
                ho.setComm(newname);
        }
                                               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
           for(City c:cityDir.getCityList()){
            jComboBox1.addItem(c.getCityName());
        }
         int row = jTable1.getSelectedRow();
        
        String name = jTable1.getValueAt(row, 0).toString();
        String area = jTable1.getValueAt(row,1).toString();
        String city =jTable1.getValueAt(row,2).toString();
        
        jTextField2.setText(name);
        jTextField1.setText(area);
        jComboBox1.setSelectedItem(city);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

public void populateTable(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    
    
    for(Community u : commDir.getCommunityList()){
    
    Object[] row = new Object[3];
    row[0]=u;
    row[1]=u.getArea();
    row[2]=u.getCityName();
    
  
    model.addRow(row);
    
    
    }}



}
