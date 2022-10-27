/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.House;
import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import static ui.CommunityJFrame.cityDir;
import static ui.CommunityJFrame.commDir;
import static ui.CommunityJFrame.docDir;
import static ui.CommunityJFrame.encHist;
import static ui.CommunityJFrame.hospDir;
import static ui.CommunityJFrame.houseDir;
import static ui.CommunityJFrame.patDir;
import static ui.CommunityJFrame.perDir;
import static ui.LoginJForm.cityDir;
import static ui.LoginJForm.commDir;
import static ui.LoginJForm.docDir;
import static ui.LoginJForm.encHist;
import static ui.LoginJForm.hospDir;
import static ui.LoginJForm.houseDir;
import static ui.LoginJForm.patDir;
import static ui.LoginJForm.perDir;

/**
 *
 * @author shravyagunda
 */
public class SystemJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemJFrame
     */
  static CityDirectory cityDir;
     static PatientDirectory patDir;
    static PersonDirectory perDir;
    static HouseDirectory houseDir;
    static EncounterHistory encHist;
    static CommunityDirectory commDir;
      static DoctorDirectory docDir;
    static HospitalDirectory hospDir;
    
    public SystemJFrame(CityDirectory cityDir,PatientDirectory patDir,PersonDirectory perDir,
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
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel1.setText("   System Admin");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Select the role");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Hospital Admin", "Community Admin" }));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 153, 153));
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Add City");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Add Community");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setText("Add House");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, 158, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1124, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
      String sel = jComboBox1.getSelectedItem().toString();
     if(sel.equals("Patient"))   {
        
     jPanel6.removeAll();
        jPanel6.repaint();
      jPanel6.revalidate();
      
      CreatePatientJPanel pan = new CreatePatientJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
      jPanel6.add(pan);
//      jPanel6.add(createPatientJPanel2);
      jPanel6.repaint();
      jPanel6.revalidate();}
     
     else if(sel.equals("Community Admin")){
          jPanel6.removeAll();
        jPanel6.repaint();
      jPanel6.revalidate();
      
      CreateCommAdJPanel pan2 = new CreateCommAdJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
       jPanel6.add(pan2);
       jPanel6.repaint();
      jPanel6.revalidate();
       
     
     }
     
       else if(sel.equals("Doctor")){
          jPanel6.removeAll();
        jPanel6.repaint();
      jPanel6.revalidate();
      
      CreateDoctorJPanel pan2 = new CreateDoctorJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
       jPanel6.add(pan2);
       jPanel6.repaint();
      jPanel6.revalidate();
       
     
     }
     
       
          else if(sel.equals("Hospital Admin")){
          jPanel6.removeAll();
        jPanel6.repaint();
      jPanel6.revalidate();
      
      CreateHospAdJPanel pan2 = new CreateHospAdJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
       jPanel6.add(pan2);
       jPanel6.repaint();
      jPanel6.revalidate();
       
     
     }
     
      
        
      
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         String sel = jComboBox1.getSelectedItem().toString();
          if(sel.equals("Patient")){
         jPanel6.removeAll();
        jPanel6.repaint();
      jPanel6.revalidate();
      
      ViewPatientJPanel v = new ViewPatientJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
//      jPanel6.add(viewPatientJPanel);
jPanel6.add(v);
      jPanel6.repaint();
      jPanel6.revalidate();}
          
          else
                    jPanel6.removeAll();
        jPanel6.repaint();
      jPanel6.revalidate();
      
      ViewDoctorJPanel v = new ViewDoctorJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
//      jPanel6.add(viewPatientJPanel);
jPanel6.add(v);
      jPanel6.repaint();
      jPanel6.revalidate();
          
          
    
      
      
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginJForm log = new LoginJForm(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel6.removeAll();
        jPanel6.revalidate();
        jPanel6.repaint();

        AddCityJPanel v = new AddCityJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
        //      jPanel6.add(viewPatientJPanel);
        jPanel6.add(v);
        jPanel6.revalidate();
        jPanel6.repaint();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        jPanel6.removeAll();
        jPanel6.revalidate();
        jPanel6.repaint();

        AddCommunityJPanel v2 = new AddCommunityJPanel(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
        //      jPanel6.add(viewPatientJPanel);
        jPanel6.add(v2);
        jPanel6.revalidate();
        jPanel6.repaint();
        //
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel6.removeAll();
        jPanel6.revalidate();
        jPanel6.repaint();

        AddHouse v3 = new AddHouse(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir);
        //      jPanel6.add(viewPatientJPanel);
        jPanel6.add(v3);
        jPanel6.revalidate();
        jPanel6.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemJFrame(cityDir,patDir,perDir,houseDir,encHist,commDir,docDir,hospDir).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables






}