/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Dimension;
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
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Controller;
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
public class NewPatientPanel extends JPanel{

    
 Controller control = new Controller();
   
 
LocalDate date = LocalDate.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String consultationDate = date.format(format);



private JTextField txtName = new JTextField();
private JTextField txtSecondname = new JTextField();
private JComboBox cmbSex = new JComboBox();
private JFormattedTextField dateEditor = new JFormattedTextField();
private DatePicker datePicker = new DatePicker();
private JTextField txtEmail = new JTextField();
private JTextField txtPhone = new JTextField();
private JTextField txtConsultationDate = new JTextField();
private JTextArea txtObservations = new JTextArea();



    public NewPatientPanel(){
        init();
    }
    
    
    public void init(){
       setLayout(new MigLayout("wrap 2,fillx,insets 10 20 10 20", "[fill,50%][fill,50%]"));
       // setPreferredSize(new Dimension(600, 400)); 
        
        JLabel lbTitle = new JLabel("Register New Patient");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +2;");
        add(lbTitle, "gapy 10 10,span 2");

        
        
        // adding form
        
        add(new JLabel("Name"));
        add(new JLabel("Secondname"));

        // NAME & SECONDNAME
     
        txtName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Name");
        txtSecondname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Secondname");
        add(txtName);
        add(txtSecondname);
        
        
        
        // SEX COMBOBOX
        //add(new JLabel("Sex option type"), "span 2");
        add(new JLabel("Sex Option Type"), "gapy 5 5");
        add(new JLabel("Due Date") , "gapy 5 5");
       
        cmbSex.addItem("-");
        cmbSex.addItem("Male");
        cmbSex.addItem("Female");
       

         // BORNDATE 
        datePicker.setEditor(dateEditor);
       // datePicker.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Select your born date");
        add(cmbSex);
        add(dateEditor);
        

        // EMAIL
        add(new JLabel("Email"), "gapy 5 5");
        add(new JLabel("Phone"), "gapy 5 5");
      
        txtEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "example@mail.com");
       
        
        
        //PHONE
       
        txtPhone.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Phone");
        add(txtEmail);
        add(txtPhone);

        
        // Consultation Date
        add(new JLabel("Consultation Date"), "gapy 5 5");
        add(new JLabel("Observations"), "gapy 5 5");
      
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

       
        
        
        
        // action button
        JButton cancelButton = new JButton("Cancel");
        JButton saveButton = new JButton("Save");
        JButton clearButton = new JButton("Clear");
        
        add(txtConsultationDate,"gapy 5 5");
        add(txtObservations, "gapy 5 5");
        
        
        
         
        add(cancelButton, "grow 0");
        add(saveButton, "grow 0, al trailing");
        add(clearButton, "grow 0");
         
        
        
        clearButton.addActionListener(actionEvent -> {
            cleanFields();  
        });
        
        cancelButton.addActionListener(actionEvent -> {
               toastSuccessMessage("Operation Canceled");
//             ModalDialog.showModal(null, new SimpleModalBorder(null, "Payment Request", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
//                 System.out.println("Hola");
//            }));
            
            //ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.CANCEL_OPTION);
        });

        
        // SAVE INFO
        saveButton.addActionListener(actionEvent -> {
            
            
            
            
         
           String name =txtName.getText();
           String secondname = txtSecondname.getText();
           String sex = cmbSex.getSelectedItem().toString();
           String bornDate = dateEditor.getText();
           String email = txtEmail.getText();
           String phone = txtPhone.getText();
          // String consultationDate2 = consultationDate;
           String observations = txtObservations.getText();
           
           
           
         if(validateFields(name, secondname, sex, bornDate, email, phone, observations)){
   control.save(name, secondname, sex, bornDate, email, phone, observations, consultationDate);
       // JOptionPane.showMessageDialog(null, "Patient saved Successfully");
       
                toastSuccessMessage("Information saved");
           //print(name, secondname, sex, bornDate, email, phone, consultationDate, observations);
} else {
    //JOptionPane.showMessageDialog(null, "Por favor verifica los campos ingresados.");
   }

        });

       
        
        
        
        
        
        
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
     
     
     
      public boolean validateFields(
            String name, 
            String secondname, 
            String sex, 
            String bornDate, 
            String email, 
            String phone, 
            String observations){
        
        // Validar nombre
    if (name.isEmpty()) {
       toastErrorMessage("Please fill the name field");
       // errorLabel.setText("name cannot be empty");
        return false;
    }

    // Validar segundo nombre (opcional, pero si se llena, debe ser válido)
    if (secondname.isEmpty()) {
        toastErrorMessage("Please fill the secondname field");
       // errorLabel.setText("secondname cannot be empty");
        return false;
    }

    // Validar sexo
    if (sex.isEmpty() || (!sex.equalsIgnoreCase("Male") && !sex.equalsIgnoreCase("Female"))) {
        toastErrorMessage("Please select the patient's sex");
       // errorLabel.setText("Select a sex option");
        return false;
    }

    // Validar fecha de nacimiento
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        sdf.setLenient(false); //valids the bornDate is not future
        Date date = sdf.parse(bornDate);
        if (date.after(new Date())) {
            toastErrorMessage("Cannot be a future date");
         //   errorLabel.setText("Invalid date format, example: 04/28/1999");
            return false; // Nit cannot be a future date       
        }
        
    // String formattedDate = sdf.format(date);
    //System.out.println("Valid date: " + formattedDate); // muestra: 04/28/1998
    // bornDate.setText(formattedDate);
    } catch (ParseException e) {
        toastErrorMessage("Invalidad bornm date: must be dd/MM/yyyy");
       // errorLabel.setText("Invalid date format, example: 04/28/1999");
        return false; // 
    }

    // Validar correo electrónico
    if (email.isEmpty() || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
        toastErrorMessage("Invalid email");
        //errorLabel.setText("invalid email ex: abc12@gmail.com");
        return false;
    }

    // Admits phone numbers with 10 digits
    if (phone.isEmpty() || !phone.matches("\\d{10,12}")) {
        toastErrorMessage("The number must contain at least 10 digits.");
      //  errorLabel.setText("Please type a valid phone number(10 digits), example: 7861245676");
        return false;
    }

   
    if (observations.isEmpty()) {
       toastErrorMessage("Please fill the observations field");
        return false;
    }

    return true;
    }
      
      
       private void cleanFields(){
    
        txtName.setText("");
        txtSecondname.setText("");
        cmbSex.setSelectedIndex(0);
        dateEditor.setText("");
        datePicker.setEditor(dateEditor);
        txtEmail.setText("");
        txtPhone.setText("");
        txtObservations.setText("");
    
    }
    
    
    
    
}
