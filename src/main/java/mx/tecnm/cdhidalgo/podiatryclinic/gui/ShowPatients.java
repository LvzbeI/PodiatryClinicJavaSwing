/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Controller;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.User;
import mx.tecnm.cdhidalgo.podiatryclinic.persistence.UserJpaController;


public class ShowPatients extends javax.swing.JPanel {
    
Controller control = new Controller();
UserJpaController userJpaController = new UserJpaController();

String[] colums = {"ID", "Name", "Second name", "Sex", "Born date", "Email", 
                            "Phone", "Observations", "Consultation date"};
DefaultTableModel model = new DefaultTableModel(colums, 0);
    public ShowPatients() {
        initComponents();
         
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        searchByNameButton = new javax.swing.JButton();
        searchByIdButton = new javax.swing.JButton();
        searchByNameTextField = new javax.swing.JTextField();
        txtSearchById = new javax.swing.JTextField();
        deletePatientButton = new javax.swing.JButton();
        txtDeletePatient = new javax.swing.JTextField();

        jLabel1.setText("Show all patients");

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        searchByNameButton.setText("Search by Name");
        searchByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameButtonActionPerformed(evt);
            }
        });

        searchByIdButton.setText("Search by Id");
        searchByIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdButtonActionPerformed(evt);
            }
        });

        deletePatientButton.setText("Delete");
        deletePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(searchByNameButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchByNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchByIdButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchById, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(refreshButton)
                        .addGap(74, 74, 74)
                        .addComponent(deletePatientButton)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refreshButton)
                    .addComponent(searchByNameButton)
                    .addComponent(searchByIdButton)
                    .addComponent(searchByNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchById, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePatientButton)
                    .addComponent(txtDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameButtonActionPerformed
        
        cleanTable();
       //int userId = Integer.parseInt(searchByNameTextField.getText());
       String name = searchByNameTextField.getText();
       
       if(validateID(name)){
        List<User> user = userJpaController.findUserByName(name);
      
       for (User u : user) {
         Object[] row = { u.getUserId(), u.getName(), u.getSecondname(), 
            u.getSex(), u.getBornDate(), u.getEmail(), u.getPhone() ,
            u.getObservations(), u.getConsultationDate()};    
            model.addRow(row);
        }
        usersTable.setModel(model);
       
       }
       
      
        
    }//GEN-LAST:event_searchByNameButtonActionPerformed

    private void searchByIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdButtonActionPerformed
        //Find by Id
        
        cleanTable();
         String idValue = txtSearchById.getText();   
       
         if(validateID(idValue)){ 
             int id = Integer.parseInt(txtSearchById.getText());
             User u = userJpaController.findUser(id);
        
         if(!(u==null)){
            Object[] row = { u.getUserId(), u.getName(), u.getSecondname(), 
            u.getSex(), u.getBornDate(), u.getEmail(), u.getPhone() ,
            u.getObservations(), u.getConsultationDate()};    
            model.addRow(row);
            usersTable.setModel(model);
         }
         else{
             JOptionPane.showMessageDialog(null, "The patient with the ID: " + id + " does'n exist");
         }
         
      }

    }//GEN-LAST:event_searchByIdButtonActionPerformed

    private void deletePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientButtonActionPerformed
        
       String idValue = txtDeletePatient.getText();   
       
         if(validateID(idValue)){ 
             int id = Integer.parseInt(txtDeletePatient.getText());
              JOptionPane.showMessageDialog(null, "Patient deleted successfully");
           try {
               userJpaController.destroy(id);
           } catch (Exception ex) {
               Logger.getLogger(ShowPatients.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
        
        
    }//GEN-LAST:event_deletePatientButtonActionPerformed

    
    public void populateTable(){
        
        cleanTable();
        List<User> users = control.getAllUsers();
        
        for (User user : users) {
         Object[] row = { user.getUserId(), user.getName(), user.getSecondname(), 
            user.getSex(), user.getBornDate(), user.getEmail(), user.getPhone() ,
            user.getObservations(), user.getConsultationDate()};    
            model.addRow(row);
        }
        usersTable.setModel(model);
    }
    
    
    
    
    public boolean validateID(String idValue){
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
    
    
    public void cleanTable(){
        model.setRowCount(0);
    }
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletePatientButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchByIdButton;
    private javax.swing.JButton searchByNameButton;
    private javax.swing.JTextField searchByNameTextField;
    private javax.swing.JTextField txtDeletePatient;
    private javax.swing.JTextField txtSearchById;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
