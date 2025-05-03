
package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Controller;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.User;
import mx.tecnm.cdhidalgo.podiatryclinic.persistence.UserJpaController;



public class EditPatient extends javax.swing.JPanel {
    
 
Controller control = new Controller();
 UserJpaController userJpaController = new UserJpaController();

Home homePanel = new Home();

LocalDate date = LocalDate.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String consultationDate = date.format(format);
 
    public EditPatient() {
        initComponents();
        
        txtName.setEnabled(false);
        txtSecondname.setEnabled(false);
        cmbSex.setEnabled(false);
        txtBornDate.setEnabled(false);
        txtEmail.setEnabled(false);
        txtPhone.setEnabled(false);
        txtObservations.setEnabled(false);
        //consultationDateLabel.setText(consultationDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneLabel = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        secondnameLabel = new javax.swing.JLabel();
        txtSecondname = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        cmbSex = new javax.swing.JComboBox<>();
        borndateLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservations = new javax.swing.JTextArea();
        observationsLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        txtBornDate = new javax.swing.JFormattedTextField();
        phoneLabel1 = new javax.swing.JLabel();
        consultationDateLabel = new javax.swing.JLabel();
        dateFormatLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        searchIDButton = new javax.swing.JButton();
        bgLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        paneLabel.setText("Edit Patitent");
        add(paneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 156, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Name");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 103, -1, -1));

        secondnameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        secondnameLabel.setText("Second Name");
        add(secondnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 137, -1, -1));
        add(txtSecondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 156, -1));

        sexLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sexLabel.setText("Sex");
        add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 189, -1, -1));

        cmbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Male", "Female" }));
        add(cmbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        borndateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        borndateLabel.setText("Born date");
        add(borndateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setText("Email");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        txtEmail.setToolTipText("name@email.com");
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 170, -1));

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabel.setText("Phone");
        add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 133, -1));

        txtObservations.setColumns(20);
        txtObservations.setRows(5);
        jScrollPane1.setViewportView(txtObservations);
        txtObservations.getAccessibleContext().setAccessibleName("");

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 460, 180));
        jScrollPane1.getAccessibleContext().setAccessibleName("Observations");

        observationsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        observationsLabel.setText("Obsertavions");
        add(observationsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, -1, -1));

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, -1, -1));

        txtBornDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("M/d/yyyy"))));
        txtBornDate.setToolTipText("MM/dd/yyyy");
        add(txtBornDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 168, -1));

        phoneLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabel1.setText("Consultation Date:");
        add(phoneLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));
        add(consultationDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 140, 30));

        dateFormatLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dateFormatLabel.setText(" (MM/dd/yyyy)");
        add(dateFormatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));
        add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 200, 20));

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idLabel.setText("ID");
        add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        searchIDButton.setText("Search");
        searchIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDButtonActionPerformed(evt);
            }
        });
        add(searchIDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        bgLabel.setBackground(new java.awt.Color(242, 39, 222));
        add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 5040, 3660));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

    
   // get the information from the gui   
   int id = Integer.parseInt(txtID.getText());
   String idVal = txtID.getText();
   String name = txtName.getText();
   String secondname = txtSecondname.getText();
   String sex = cmbSex.getSelectedItem().toString();
   String bornDate = txtBornDate.getText();
   String email =  txtEmail.getText();
   String phone = txtPhone.getText();
   String observations = txtObservations.getText();
   
   
   if(validateFields(id, idVal, name, secondname, sex, bornDate, email, phone, observations)){
       try {
           control.updatePatient(id, name, secondname, sex, bornDate, email, phone, observations, consultationDate);
       } catch (Exception ex) {
           Logger.getLogger(EditPatient.class.getName()).log(Level.SEVERE, null, ex);
       }
    JOptionPane.showMessageDialog(null, "Information updated Successfully");
   
} else {
    JOptionPane.showMessageDialog(null, "Por favor verifica los campos ingresados.");
   }
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

    private void searchIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDButtonActionPerformed
        // Search by ID
        
         //cleanTable();
        
        String idVal = txtID.getText();   
         if(validateID(idVal)){ 
             enableFields();
             populate();
         }
  
    }//GEN-LAST:event_searchIDButtonActionPerformed
      
    
    private void cleanFields(){
        txtID.setText("");
        txtName.setText("");
        txtSecondname.setText("");
        cmbSex.setSelectedIndex(0);
        txtBornDate.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtObservations.setText("");
    
    }
    
    
    public boolean validateID(String idVal){
  
    if(idVal == null || idVal.trim().isEmpty()){
    return false;
    }
    try {
        int id = Integer.parseInt(idVal);
        if (id <= 0) {
            errorLabel.setText("Type a valid ID");
            return false;
        }
    } catch (NumberFormatException e) {
        errorLabel.setText("ID must be a number");
        return false;
    }
    

     return true;
    }
    
    
   
    public boolean validateFields(
            int id,
            String idVal,
            String name, 
            String secondname, 
            String sex, 
            String bornDate, 
            String email, 
            String phone, 
            String observations){
        

    if(id <=0 || idVal.isEmpty()){
       errorLabel.setText("type a valid ID");
      return false;
    }
        
     
    if (name.isEmpty()) {
        errorLabel.setText("name cannot be empty");
        return false;
    }

 
    if (secondname.isEmpty()) {
        errorLabel.setText("secondname cannot be empty");
        return false;
    }

  
    if (sex.isEmpty() || (!sex.equalsIgnoreCase("Male") && !sex.equalsIgnoreCase("Female"))) {
        errorLabel.setText("Select a sex option");
        return false;
    }


    try {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        sdf.setLenient(false); //valids the bornDate is not future
        Date date = sdf.parse(bornDate);
        if (date.after(new Date())) {
            errorLabel.setText("Invalid date format, example: 04/28/1999");
            return false; // Nit cannot be a future date       
        }
        
    String formattedDate = sdf.format(date);
    //System.out.println("Valid date: " + formattedDate); // muestra: 04/28/1998
    txtBornDate.setText(formattedDate);
    } catch (ParseException e) {
        errorLabel.setText("Invalid date format, example: 04/28/1999");
        return false; // 
    }


    if (email.isEmpty() || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
        errorLabel.setText("invalid email ex: abc12@gmail.com");
        return false;
    }

    // Admits phone numbers with 10 digits
    if (phone.isEmpty() || !phone.matches("\\d{10}")) {
        errorLabel.setText("Please type a valid phone number(10 digits), example: 7861245676");
        return false;
    }

   
    if (observations.isEmpty()) {
        return false;
    }

    return true;
    }
    
    
    public void populate(){
    
         int id = Integer.parseInt(txtID.getText());
         User u = userJpaController.findUser(id);
         
         if(!(u==null)){
           txtName.setText(u.getName());
           txtSecondname.setText(u.getSecondname());
           cmbSex.setSelectedItem(u.getSex());
           txtBornDate.setText(u.getBornDate());
           txtEmail.setText(u.getEmail());
           txtPhone.setText(u.getPhone());
           txtObservations.setText(u.getObservations());
           consultationDateLabel.setText(u.getConsultationDate());
         }
         else{
             JOptionPane.showMessageDialog(null, "The patient with the ID: " + id + " does'n exist");
         }
          
    }
    
    public void enableFields(){
        txtName.setEnabled(true);
        txtSecondname.setEnabled(true);
        cmbSex.setEnabled(true);
        txtBornDate.setEnabled(true);
        txtEmail.setEnabled(true);
        txtPhone.setEnabled(true);
        txtObservations.setEnabled(true);
    }
    
    public void cleanTable(){
        txtID.setText("");
        txtName.setText("");
        txtSecondname.setText("");
        cmbSex.setSelectedIndex(0);
        txtBornDate.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtObservations.setText(""); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel borndateLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> cmbSex;
    private javax.swing.JLabel consultationDateLabel;
    private javax.swing.JLabel dateFormatLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel observationsLabel;
    private javax.swing.JLabel paneLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchIDButton;
    private javax.swing.JLabel secondnameLabel;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JFormattedTextField txtBornDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtObservations;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSecondname;
    // End of variables declaration//GEN-END:variables
}
