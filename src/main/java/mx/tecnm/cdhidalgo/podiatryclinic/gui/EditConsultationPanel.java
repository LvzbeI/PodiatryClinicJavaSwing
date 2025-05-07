/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Dimension;
import java.awt.Label;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import raven.toast.Notifications;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Controller;
import mx.tecnm.cdhidalgo.podiatryclinic.persistence.ConsultationJpaController;
import net.miginfocom.swing.MigLayout;
import raven.datetime.DatePicker;
import raven.modal.ModalDialog;
import raven.modal.component.ModalBorderAction;
import raven.modal.component.SimpleModalBorder;
import raven.toast.ToastClientProperties;

/**
 *
 * @author tony
 */
public class EditConsultationPanel extends JPanel{

    

Controller control = new Controller();
ConsultationJpaController consultationJpaController = new ConsultationJpaController();
 
LocalDate date = LocalDate.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String consultationDate = date.format(format);

Home homePanel = new Home();
        


private JTextField txtConsultationID = new JTextField();
private JTextField txtPatientID = new JTextField();
private JTextField txtPatientName = new JTextField();
private JTextField txtConsultationDate = new JTextField();
private JTextArea txtObservations = new JTextArea();



    public EditConsultationPanel(){
        
        txtPatientID.setEnabled(false);
        txtPatientName.setEnabled(false);
        txtObservations.setEnabled(false);
        init();
    }
    
    
    public void init(){
       setLayout(new MigLayout("wrap 2,fillx,insets 10 20 10 20", "[fill,50%][fill,50%]"));
       // setPreferredSize(new Dimension(600, 400)); 
        
        JLabel lbTitle = new JLabel("Edit Constultation");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +2;");
        add(lbTitle, "gapy 10 10,span 2");

        
        
        // adding form
        add(new Label("ID"));
        add(new Label("Search ID"));
       
        txtConsultationID.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Type the Consultation ID");
        JButton searchIDButton = new JButton("Search");
        add(txtConsultationID, "grow 1");
        add(searchIDButton, "grow 0");
        
        
        
        
        add(new JLabel("Patient ID"), "gapy 5 5");
        add(new JLabel("Patient Name"), "gapy 5 5");
       // txtPatientID.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Patient ID");
       // txtPatientName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Patient Name");
        add(txtPatientID);
        add(txtPatientName);
        
     
        add(new JLabel("Consultation Date"));
        add(new JLabel("Diagnosis"), "gapy 5 5");
        // NAME & SECONDNAME
       // txtPatientID.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Patient ID");
        txtConsultationDate.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, consultationDate);
        txtConsultationDate.setEditable(false);
        
        // Observations 
        txtObservations.setLineWrap(true);
        txtObservations.setWrapStyleWord(true);
        txtObservations.putClientProperty(
               FlatClientProperties.STYLE, "" +
              "border: 2,2,2,2;" +
              "font: -1;" +
              "background: #FFFFFF;");
          add(txtConsultationDate);
        add(txtObservations, "gapy 5 5");
         // add(new JLabel(" "), "gapy 5 5");
        
         
         
         
        
        // action button
        JButton cancelButton = new JButton("Cancel");
        JButton saveButton = new JButton("Save");
        JButton clearButton = new JButton("Clear");
        
        add(cancelButton, "grow 0");
        add(saveButton, "grow 0, al trailing");
        add(clearButton, "grow 0");
         
        
        
        clearButton.addActionListener(actionEvent -> {
            cleanFields();  
        });
        
        
        
        cancelButton.addActionListener(actionEvent -> {
            toastSuccessMessage("Operation Canceled");
            homePanel.setVisible(true);
            this.setVisible(false);
        });

        
        searchIDButton.addActionListener(actionEvent -> {
            
          String idValue = txtConsultationID.getText(); 
         if(valdidateID(idValue)){ 
             enableFields();
             populate();
            }
            
        });
        
        
        
        
        // SAVE INFO
        saveButton.addActionListener(actionEvent -> {
            
            String idValue = txtConsultationID.getText(); 
        
         if(valdidateID(idValue)){ 
             int consultationID = Integer.parseInt(txtConsultationID.getText());
             String consultation = txtObservations.getText();
             int patientID = Integer.parseInt(txtPatientID.getText());
            
        //call to persistence and save data
        control.updateConsultation(consultationID, patientID, consultation, txtConsultationDate.getText());
        System.out.println("Consultation Id: " + consultationID + "\n" +
                            "patientid: " + patientID + "\n" +                        
                            "consultation: " + consultation + "\n"+ 
                            "Consultation Date: " + consultationDate);
        toastSuccessMessage("Consultation saved Successfully");
        
       //JOptionPane.showMessageDialog(null, "Consultation saved Successfully");
            }
            
            
         
//           String id = txtPatientID.getText();
//
//          // String consultationDate2 = consultationDate;
//          // String observations = txtObservations.getText();
//           
//           
//           
//      if (validateFields()){
//          
//        int patientid = Integer.parseInt(txtPatientID.getText());
//        String consultation = txtObservations.getText();
//
//
//        //call to persistence and save data
//        control.saveConsultation(patientid, consultation, consultationDate);
//        System.out.println("patientid: " + patientid + "\n" +                        
//                            "consultation: " + consultation + "\n"+ 
//                            "Consultation Date: " + consultationDate
//        );
//        
//      // JOptionPane.showMessageDialog(null, "Consultation saved Successfully");
//          toastSuccessMessage("Consultation saved Successfully");
//
//   }

        });

       
        
        
        
        
        
        
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
    
    
     public void print(String name, String secondname, String sex, String bornDate, String email, 
            String phone, String consultationDate2, String observations){
    
            System.out.println("name: " + name);
            System.out.println("secondname: " + secondname);
            System.out.println("sex: " + sex);
            System.out.println("bornDate: " + bornDate);
            System.out.println("email: " + email);
            System.out.println("phone: " + phone);
            System.out.println("consultationDate: " + consultationDate2);
              System.out.println("observations: " + observations);
            
          // add(new JLabel("Hora hora"), "");
    }
     
     
     public void toastErrorMessage(String message){
         
         
      Notifications.getInstance().show(
                   Notifications.Type.ERROR, 
                   Notifications.Location.TOP_CENTER,
                   message);
     }
     
     
     
     public void toastSuccessMessage(String message){
         
         
      Notifications.getInstance().show(
                   Notifications.Type.SUCCESS, 
                   Notifications.Location.TOP_CENTER,
                   message);
     }
     
  

     
     
      public boolean validateFields(){
    
          
          String input = txtPatientID.getText();
     
      if ( input == null || input.trim().isEmpty() ) {
   // JOptionPane.showMessageDialog(null, "Por favor ingresa un ID válido.");
     toastErrorMessage("Please fill the ID field");
    return false;
}
   else if(Integer.parseInt(txtPatientID.getText())<=0){
        toastErrorMessage("Please type a valid ID");
      
       return false;
   }
   else if (txtObservations.getText().isEmpty()){
        toastErrorMessage("The Diagnosis mus be filled");
    return false;
   }
   
   return true;
     
   
    }
      
      
       private void cleanFields(){
         txtConsultationID.setText("");
         txtPatientID.setText("");
         txtPatientName.setText("");
         txtObservations.setText("");
    
    }
    
       
       
       public void populate(){
    
         int id = Integer.parseInt(txtConsultationID.getText());
         ConsultationDTO c = consultationJpaController.findConsultation(id);
         
         if(!(c==null)){
        // txtConsultationID.setText(c.getConsultationId());
         txtPatientID.setText(Integer.toString(c.getPatientId()));
         txtPatientName.setText(c.getPatientName());
         txtConsultationDate.setText(c.getConsultationDate());
         txtObservations.setText(c.getConsultation());
         }
         else{
             toastErrorMessage("The Consultation does'n exist");
             //JOptionPane.showMessageDialog(null, "The consultation with the ID: " + id + " does'n exist");
         }
          
    }

 
   public void enableFields(){
        
         //txtPatientID.setEnabled(true);
         txtObservations.setEnabled(true);
    }
    
    
    
}
