
package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Controller;



public class NewConsultation extends javax.swing.JPanel {
    
 
Controller control = new Controller();


Home homePanel = new Home();

LocalDate date = LocalDate.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String consultationDate = date.format(format);
 
    public NewConsultation() {
        initComponents();   
        consultationDateLabel.setText(consultationDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneLabel = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        patientIdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsultationData = new javax.swing.JTextArea();
        observationsLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        phoneLabel1 = new javax.swing.JLabel();
        consultationDateLabel = new javax.swing.JLabel();
        patientIdEmptyLabel = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        paneLabel.setText("New Consultation");
        add(paneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        txtPatientId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatientIdMouseClicked(evt);
            }
        });
        add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 156, -1));

        patientIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patientIdLabel.setText("Patient ID:");
        add(patientIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 103, -1, -1));

        txtConsultationData.setColumns(20);
        txtConsultationData.setRows(5);
        txtConsultationData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultationDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtConsultationData);
        txtConsultationData.getAccessibleContext().setAccessibleName("");

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 460, 180));
        jScrollPane1.getAccessibleContext().setAccessibleName("Observations");

        observationsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        observationsLabel.setText("Diagnosis:");
        add(observationsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        phoneLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabel1.setText("Consultation Date:");
        add(phoneLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));
        add(consultationDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 140, 30));

        patientIdEmptyLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        patientIdEmptyLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(patientIdEmptyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 150, 20));

        bgLabel.setBackground(new java.awt.Color(242, 39, 222));
        add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 5040, 3660));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

   // get the information from the gui    
 
   if (validateFields()){
   int patientid = Integer.parseInt(txtPatientId.getText());
   String consultation = txtConsultationData.getText();


        //call to persistence and save data
        control.saveConsultation(patientid, consultation, consultationDate);
        System.out.println("patientid: " + patientid + "\n" +                        
                            "consultation: " + consultation + "\n"+ 
                            "Consultation Date: " + consultationDate
        );
        
       JOptionPane.showMessageDialog(null, "Consultation saved Successfully");

   }
   
        
        //System.out.println("Se guardo la info");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        cleanFields();
        //JOptionPane.showMessageDialog(null, "Fields cleaned");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        cleanFields();
        
        homePanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
         patientIdEmptyLabel.setText("");
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtConsultationDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultationDataMouseClicked
         patientIdEmptyLabel.setText("");
    }//GEN-LAST:event_txtConsultationDataMouseClicked
      
    
    private void cleanFields(){
        txtPatientId.setText("");
        txtConsultationData.setText("");  
    }
    
   
    public boolean validateFields(){    
        String input = txtPatientId.getText();

 
   if ( input == null || input.trim().isEmpty() ) {
   // JOptionPane.showMessageDialog(null, "Por favor ingresa un ID válido.");
    patientIdEmptyLabel.setText("ID must be filled");
    return false;
}
   else if(Integer.parseInt(txtPatientId.getText())<=0){
       patientIdEmptyLabel.setText("Please type a valid ID");
       return false;
   }
   else if (txtConsultationData.getText().isEmpty()){
    patientIdEmptyLabel.setText("The Diagnosis mus be filled");
    return false;
   }
   
   return true;
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel consultationDateLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel observationsLabel;
    private javax.swing.JLabel paneLabel;
    private javax.swing.JLabel patientIdEmptyLabel;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextArea txtConsultationData;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables
}
