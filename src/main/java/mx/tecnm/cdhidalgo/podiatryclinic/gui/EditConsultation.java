
package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Consultation;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Controller;
import mx.tecnm.cdhidalgo.podiatryclinic.persistence.ConsultationJpaController;



public class EditConsultation extends javax.swing.JPanel {
    
 
Controller control = new Controller();
ConsultationJpaController consultationJpaController = new ConsultationJpaController();


Home homePanel = new Home();

LocalDate date = LocalDate.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String consultationDate = date.format(format);
 
    public EditConsultation() {
        initComponents();   

         txtPatientID.setEnabled(false);
         txtConsultationData.setEnabled(false);
        //consultationDateLabel.setText(consultationDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneLabel = new javax.swing.JLabel();
        txtConsultationID = new javax.swing.JTextField();
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
        searchPatientByIDButton = new javax.swing.JButton();
        patientIdLabel1 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        lb12 = new javax.swing.JLabel();
        patientNameLabel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        paneLabel.setText("Edit Consultation");
        add(paneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        txtConsultationID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultationIDMouseClicked(evt);
            }
        });
        add(txtConsultationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 156, -1));

        patientIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patientIdLabel.setText("Consultation ID:");
        add(patientIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        txtConsultationData.setColumns(20);
        txtConsultationData.setRows(5);
        txtConsultationData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultationDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtConsultationData);
        txtConsultationData.getAccessibleContext().setAccessibleName("");

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 460, 180));
        jScrollPane1.getAccessibleContext().setAccessibleName("Observations");

        observationsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        observationsLabel.setText("Diagnosis:");
        add(observationsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        phoneLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabel1.setText("Consultation Date:");
        add(phoneLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));
        add(consultationDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 30));

        patientIdEmptyLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        patientIdEmptyLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(patientIdEmptyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 150, 20));

        searchPatientByIDButton.setText("Search");
        searchPatientByIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientByIDButtonActionPerformed(evt);
            }
        });
        add(searchPatientByIDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        patientIdLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patientIdLabel1.setText("Patient ID:");
        add(patientIdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));
        add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        lb12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb12.setText("Name:");
        add(lb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));
        add(patientNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 186, 120, 30));

        bg.setBackground(new java.awt.Color(242, 39, 222));
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 5040, 3660));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

   // get the information from the gui    
            
        String idValue = txtConsultationID.getText(); 
        
         if(valdidateID(idValue)){ 
             int consultationID = Integer.parseInt(txtConsultationID.getText());
             String consultation = txtConsultationData.getText();
             int patientID = Integer.parseInt(txtPatientID.getText());

             
        //call to persistence and save data
        control.updateConsultation(consultationID, patientID, consultation, consultationDateLabel.getText());
        System.out.println("Consultation Id: " + consultationID + "\n" +
                            "patientid: " + patientID + "\n" +                        
                            "consultation: " + consultation + "\n"+ 
                            "Consultation Date: " + consultationDateLabel.getText()
        );
        
       JOptionPane.showMessageDialog(null, "Consultation saved Successfully");
            }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        cleanFields();
       // JOptionPane.showMessageDialog(null, "Fields cleaned");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        cleanFields();
        
        homePanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void txtConsultationIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultationIDMouseClicked
         patientIdEmptyLabel.setText("");
    }//GEN-LAST:event_txtConsultationIDMouseClicked

    private void txtConsultationDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultationDataMouseClicked
         patientIdEmptyLabel.setText("");
    }//GEN-LAST:event_txtConsultationDataMouseClicked

    private void searchPatientByIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientByIDButtonActionPerformed
       
        
        String idValue = txtConsultationID.getText(); 
         if(valdidateID(idValue)){ 
             enableFields();
             populate();
            }
    }//GEN-LAST:event_searchPatientByIDButtonActionPerformed
      
    
    private void cleanFields(){
        txtConsultationID.setText("");
        txtPatientID.setText("");
        patientNameLabel.setText("");
        txtConsultationData.setText("");  
    }
    
   public boolean valdidateID(String idValue){

    if(idValue == null || idValue.trim().isEmpty()){
    return false;
    }
    try {
        int id = Integer.parseInt(idValue);
        if (id <= 0) {
            //errorLabel.setText("Type a valid ID");
            return false;
        }
    } catch (NumberFormatException e) {
        //errorLabel.setText("ID must be a number");
        return false;
    }
    

     return true;
    
       
   }
    
    
    public boolean validateFields(){    
        String input = txtConsultationID.getText();

 
   if ( input == null || input.trim().isEmpty() ) {
   // JOptionPane.showMessageDialog(null, "Por favor ingresa un ID válido.");
    patientIdEmptyLabel.setText("ID must be filled");
    return false;
}
   else if(Integer.parseInt(txtConsultationID.getText())<=0){
       patientIdEmptyLabel.setText("Please type a valid ID");
       return false;
   }
   else if (txtConsultationData.getText().isEmpty()){
    patientIdEmptyLabel.setText("The Diagnosis mus be filled");
    return false;
   }
   
   return true;
 
    }


 public void populate(){
    
         int id = Integer.parseInt(txtConsultationID.getText());
         ConsultationDTO c = consultationJpaController.findConsultation(id);
         
         if(!(c==null)){
        // txtConsultationID.setText(c.getConsultationId());
         txtPatientID.setText(Integer.toString(c.getPatientId()));
         patientNameLabel.setText(c.getPatientName());
         consultationDateLabel.setText(c.getConsultationDate());
         txtConsultationData.setText(c.getConsultation());
         }
         else{
             JOptionPane.showMessageDialog(null, "The consultation with the ID: " + id + " does'n exist");
         }
          
    }

 
   public void enableFields(){
        
         txtPatientID.setEnabled(true);
         txtConsultationData.setEnabled(true);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel consultationDateLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel observationsLabel;
    private javax.swing.JLabel paneLabel;
    private javax.swing.JLabel patientIdEmptyLabel;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JLabel patientIdLabel1;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchPatientByIDButton;
    private javax.swing.JTextArea txtConsultationData;
    private javax.swing.JTextField txtConsultationID;
    private javax.swing.JTextField txtPatientID;
    // End of variables declaration//GEN-END:variables
}
