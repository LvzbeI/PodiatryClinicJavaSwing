/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Dimension;
import java.awt.Label;
import raven.toast.Notifications;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
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
public class EditPatientPanel extends JPanel{

LocalDate date = LocalDate.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String consultationDate = date.format(format);


    public EditPatientPanel(){
        init();
    }
    
    
    public void init(){
        setLayout(new MigLayout("wrap 2,fillx,insets 10 20 10 20", "[fill,200]"));
       // setPreferredSize(new Dimension(600, 400)); 
        
        JLabel lbTitle = new JLabel("Edit Petient Information");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +2;");
        add(lbTitle, "gapy 10 10,span 2");

        
        
        add(new Label("ID"));
        add(new Label("Search ID"));
        JTextField txtID = new JTextField();
        txtID.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Type the Patient ID");
        JButton searchIDButton = new JButton("Search");
        add(txtID, "grow 1");
        add(searchIDButton, "grow 0");
        
        
        
        // adding form
        
        add(new JLabel("Name"), "gapy 5 5");
        add(new JLabel("Secondname"), "gapy 5 5");

        // NAME & SECONDNAME
        JTextField txtName = new JTextField();
        JTextField txtSecondname = new JTextField();
        txtName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Name");
        txtSecondname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Secondname");
        add(txtName);
        add(txtSecondname);
        
        
        
        // SEX COMBOBOX
        //add(new JLabel("Sex option type"), "span 2");
        add(new JLabel("Sex Option Type"), "gapy 5 5");
        add(new JLabel("Due Date") , "gapy 5 5");
        JComboBox cmbSex = new JComboBox();
        cmbSex.addItem("-");
        cmbSex.addItem("Male");
        cmbSex.addItem("Female");
       

         // BORNDATE 
        JFormattedTextField dateEditor = new JFormattedTextField();
        DatePicker bornDate = new DatePicker();
        bornDate.setEditor(dateEditor);
        add(cmbSex);
        add(dateEditor);
        

        // EMAIL
        add(new JLabel("Email"), "gapy 5 5");
        add(new JLabel("Phone"), "gapy 5 5");
        JTextField txtEmail = new JTextField();
        txtEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "example@mail.com");
       
        
        
        //PHONE
        JTextField txtPhone = new JTextField();
        txtPhone.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Phone");
        add(txtEmail);
        add(txtPhone);

        
        // Consultation Date
        add(new JLabel("Consultation Date"), "gapy n 5");
         add(new JLabel("Observations"), "gapy n 5");
         JTextField txtConsultationDate = new JTextField();
        txtConsultationDate.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, consultationDate);
        txtConsultationDate.setEditable(false);
       
        
        
        // Observations
        JTextArea txtObservations = new JTextArea();
       // textObservations.setEnabled(true);
       // txtObservations.setText("Incoming payment are placed in a secure receiving account to keep\ndestination account details anonymous.");
     //  txtObservations.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Type the observations");
//       txtObservations.putClientProperty(FlatClientProperties.STYLE, "" +
//               "border: 2,2,2,2;" +
//               "font: -1;" +
//               "background: #EFE6E6;");

//txtObservations.setLineWrap(true);
//txtObservations.setWrapStyleWord(true);
//txtObservations.setEditable(true);
//
//txtObservations.setPreferredSize(new Dimension(400, 100));
//
//JScrollPane scrollPane = new JScrollPane(txtObservations);

// Aquí es lo importante: indica tamaño fijo en MigLayout


  
       add(txtConsultationDate,"gapy n 5");
        // add(scrollPane, "gapy n 10, span, w 400!, h 100!, grow 1");
       // add(scrollPane, "span, growx, push");
      add(txtObservations, "gapy n 5");
      // add(textObservations, "gapy 5 5,span 2");

       
        
        
        
        // action button

        JButton cancelButton = new JButton("Cancel");
        
        JButton saveButton = new JButton("Save Changes");
        
        JButton clearButton = new JButton("Clear");
        
        
        
        
        
        cancelButton.addActionListener(actionEvent -> {
            
             ModalDialog.showModal(null, new SimpleModalBorder(null, "Payment Request", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                 System.out.println("Hola");
            }));
            
            //ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.CANCEL_OPTION);
        });

        saveButton.addActionListener(actionEvent -> {
           Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Hello sample message");
           // ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.OK_OPTION);
          // UIManager.put(ToastClientProperties.TOAST_INFO_ICON, new FlatSVGIcon("home.svg"));

        });

        add(cancelButton, "grow 0");
        add(saveButton, "grow 0, al trailing");
        add(clearButton, "grow 0");
    }
    
    
    
    
}
