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
import mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Controller;
import mx.tecnm.cdhidalgo.podiatryclinic.persistence.ConsultationJpaController;
import mx.tecnm.cdhidalgo.podiatryclinic.persistence.UserJpaController;


public class ShowConsultations extends javax.swing.JPanel {
    
Controller control = new Controller();
UserJpaController userJpaController = new UserJpaController();
ConsultationJpaController consultationJpaController = new ConsultationJpaController();
    
    
String[] colums = {"ID", "Patient ID", "Name", "Diagnosis", "Date"};
DefaultTableModel model = new DefaultTableModel(colums, 0);
    public ShowConsultations() {
        initComponents();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultationsTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        searchByNameButton = new javax.swing.JButton();
        searchByIdButton = new javax.swing.JButton();
        searchByNameTextField = new javax.swing.JTextField();
        searchByIdTextField = new javax.swing.JTextField();
        deleteConsultationButton = new javax.swing.JButton();
        txtDeleteConsultation = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("CONSULTATIONS VIEW");

        consultationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        consultationsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultationsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(consultationsTable);

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

        deleteConsultationButton.setText("Delete");
        deleteConsultationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteConsultationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addComponent(searchByNameButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchByNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchByIdButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchByIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(refreshButton)
                        .addGap(42, 42, 42)
                        .addComponent(deleteConsultationButton)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(searchByIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteConsultationButton)
                    .addComponent(txtDeleteConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameButtonActionPerformed
        
        cleanTable();
          
        String name = searchByNameTextField.getText();
         if(validateID(name)){
         
          List<ConsultationDTO> consultations = consultationJpaController.findConsultationByPatientName(name);
        
        for (ConsultationDTO c : consultations) {
         Object[] row = { 
             c.getConsultationId(), 
             c.getPatientId(), 
             c.getPatientName(), 
             c.getConsultation(), 
             c.getConsultationDate()};    
            model.addRow(row);
        }
        consultationsTable.setModel(model);
        
        
         }
         
       
        
    }//GEN-LAST:event_searchByNameButtonActionPerformed

    private void searchByIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdButtonActionPerformed
        //Find by Id
        
        cleanTable();
        
        String idValue = searchByIdTextField.getText();
        if(validateID(idValue)){
        int id = Integer.parseInt(searchByIdTextField.getText());
        ConsultationDTO consultation = consultationJpaController.findConsultation(id);
        
        
        Object[] row = { 
            consultation.getConsultationId(), 
            consultation.getPatientId(),
            consultation.getPatientName(), 
            consultation.getConsultation(), 
            consultation.getConsultationDate()
        };    
            model.addRow(row);
       
        consultationsTable.setModel(model);
        
        
        }
        
        
        
        
    }//GEN-LAST:event_searchByIdButtonActionPerformed

    private void deleteConsultationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteConsultationButtonActionPerformed

        
        
          String idValue = txtDeleteConsultation.getText();   
       
         if(validateID(idValue)){ 
             int id = Integer.parseInt(txtDeleteConsultation.getText());
           try {
                consultationJpaController.destroy(id);
                JOptionPane.showMessageDialog(null, "Consultation deleted successfully");
    } catch (Exception ex) {
        Logger.getLogger(ShowConsultations.class.getName()).log(Level.SEVERE, null, ex);
    }
         }
        
        
  
    
        
        
    }//GEN-LAST:event_deleteConsultationButtonActionPerformed

    private void consultationsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultationsTableMouseClicked
        // TODO add your handling code here:
        
//      int filaSeleccionada = consultationsTable.getSelectedRow(); // obtén el índice de la fila seleccionada
//
//if (filaSeleccionada != -1) { // si hay una fila seleccionada
//    Object id = consultationsTable.getValueAt(filaSeleccionada, 0); // suponiendo que el ID está en la columna 0
//     JOptionPane.showMessageDialog(null, "ID seleccionado: " + id.toString());
//   // System.out.println("ID seleccionado: " + id.toString());
//} else {
//    //System.out.println("No hay fila seleccionada");
//    System.out.println("No hay fila seleccionada");
//}
        
    }//GEN-LAST:event_consultationsTableMouseClicked
    
    
    
      public boolean validateID(String idVal){
  
    if(idVal == null || idVal.trim().isEmpty()){
    return false;
    }
    try {
        int id = Integer.parseInt(idVal);
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
    
    
    public void populateTable(){
        
        cleanTable();
        List<ConsultationDTO> consultations = consultationJpaController.findAllConsultationsDTO();
        
        for (ConsultationDTO c : consultations) {
         Object[] row = { c.getConsultationId(), c.getPatientId(), c.getPatientName(), 
             c.getConsultation(), c.getConsultationDate()};    
            model.addRow(row);
        }
        consultationsTable.setModel(model);
    }
    
    
    public void cleanTable(){
        model.setRowCount(0);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable consultationsTable;
    private javax.swing.JButton deleteConsultationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchByIdButton;
    private javax.swing.JTextField searchByIdTextField;
    private javax.swing.JButton searchByNameButton;
    private javax.swing.JTextField searchByNameTextField;
    private javax.swing.JTextField txtDeleteConsultation;
    // End of variables declaration//GEN-END:variables
}
