package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.ui.FlatButtonBorder;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.SwingConstants;
/**
 *
 * @author tony
 */
public class MainDashboard extends javax.swing.JFrame {

    
//    PANELS
  //  NewPatient registerPanel = new NewPatient();
    ShowPatients showPatientsPanel = new ShowPatients();
    Home homePanel = new Home();
  //  Edit editPanel = new Edit();
    ShowConsultations consultationdPanel = new ShowConsultations();
   // NewConsultation newConsultationPanel = new  NewConsultation();
  //  EditConsultation editConsultationPanel = new EditConsultation();
    //EditPatient editPatientPanel = new EditPatient();

    
    // FLATLAF SWING PANELS
    NewPatientPanel newPatientPanel = new NewPatientPanel();
    EditPatientPanel editPatientPanel = new EditPatientPanel();
    NewConsultationPanel newConsultationPanel = new NewConsultationPanel();
    EditConsultationPanel editConsultationPanel = new EditConsultationPanel();
    
    public MainDashboard() {
        initComponents();

        layeredMain.add(homePanel);
        layeredMain.add(newPatientPanel);
        layeredMain.add(editPatientPanel);
        layeredMain.add(newConsultationPanel);
        
       // layeredMain.add(registerPanel);
        layeredMain.add(showPatientsPanel);
        //layeredMain.add(editPanel);
        
        layeredMain.add(consultationdPanel);
      
        layeredMain.add(editConsultationPanel);
    
        
        
        
        homePanel.setVisible(true);
        newPatientPanel.setVisible(false);
        editPatientPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        
       // registerPanel.setVisible(false);
        showPatientsPanel.setVisible(false);
      //  editPanel.setVisible(false);
        consultationdPanel.setVisible(false);
        
       
        editConsultationPanel.setVisible(false);
     
        
        
        
      //  homeButton.setBorder(FlatButtonBorder);
      
     // FlatSVGIcon icon = new FlatSVGIcon("/mx/tecnm/cdhidalgo/podiatryclinic/icon/1.svg");
     
     
     // ICONS
        
       FlatSVGIcon homeIcon = new FlatSVGIcon("home.svg");
       homeButton.setIcon(homeIcon);
       
       FlatSVGIcon patientsIcon = new FlatSVGIcon("user.svg");
       patientsButton.setIcon(patientsIcon);
       
       FlatSVGIcon newPatientIcon = new FlatSVGIcon("addsquare.svg");
       newPatientButton.setIcon(newPatientIcon);
       
       FlatSVGIcon editPatientIcon = new FlatSVGIcon("edit.svg");
       editPatientButton.setIcon(editPatientIcon);
       
       
       
       FlatSVGIcon consultationsIcon = new FlatSVGIcon("consultation.svg");
       consultationsButton.setIcon(consultationsIcon);
       
       FlatSVGIcon newConsultationIcon = new FlatSVGIcon("addsquare.svg");
       newConsultationButton.setIcon(newConsultationIcon);
       
       FlatSVGIcon editConsultationIcon = new FlatSVGIcon("edit.svg");
       editConsultationButton.setIcon(editConsultationIcon);
       
       
     // homeButton.setHorizontalTextPosition(SwingConstants.RIGHT);  // Texto a la derecha del icono
//homeButton.setVerticalTextPosition(SwingConstants.CENTER); 
        //setIcon();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDashboard = new javax.swing.JPanel();
        newPatientButton = new javax.swing.JButton();
        patientsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        editPatientButton = new javax.swing.JButton();
        consultationsButton = new javax.swing.JButton();
        newConsultationButton = new javax.swing.JButton();
        editConsultationButton = new javax.swing.JButton();
        iconolabel = new javax.swing.JLabel();
        layeredMain = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDashboard.setPreferredSize(new java.awt.Dimension(180, 720));

        newPatientButton.setBackground(new java.awt.Color(242, 242, 242));
        newPatientButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newPatientButton.setText("New Patient");
        newPatientButton.setBorder(null);
        newPatientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientButtonActionPerformed(evt);
            }
        });

        patientsButton.setBackground(new java.awt.Color(242, 242, 242));
        patientsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientsButton.setText("Patients");
        patientsButton.setBorder(null);
        patientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(242, 242, 242));
        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homeButton.setText("Home");
        homeButton.setAutoscrolls(true);
        homeButton.setBorder(null);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        editPatientButton.setBackground(new java.awt.Color(242, 242, 242));
        editPatientButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editPatientButton.setText("Edit Patient");
        editPatientButton.setBorder(null);
        editPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientButtonActionPerformed(evt);
            }
        });

        consultationsButton.setBackground(new java.awt.Color(242, 242, 242));
        consultationsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultationsButton.setText("Consultations");
        consultationsButton.setBorder(null);
        consultationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultationsButtonActionPerformed(evt);
            }
        });

        newConsultationButton.setBackground(new java.awt.Color(242, 242, 242));
        newConsultationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newConsultationButton.setText("New Consultation");
        newConsultationButton.setBorder(null);
        newConsultationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newConsultationButtonActionPerformed(evt);
            }
        });

        editConsultationButton.setBackground(new java.awt.Color(242, 242, 242));
        editConsultationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editConsultationButton.setText("Edit Consultation");
        editConsultationButton.setBorder(null);
        editConsultationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editConsultationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(editConsultationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(editPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(consultationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(iconolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(iconolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelDashboard, java.awt.BorderLayout.LINE_START);

        layeredMain.setMaximumSize(new java.awt.Dimension(400, 400));
        layeredMain.setPreferredSize(new java.awt.Dimension(1280, 760));
        layeredMain.setLayout(new java.awt.CardLayout());
        getContentPane().add(layeredMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
     private void setIcon() {
        Color lightColor = FlatUIUtils.getUIColor("Menu.icon.lightColor", Color.red);
        Color darkColor = FlatUIUtils.getUIColor("Menu.icon.darkColor", Color.red);
        //FlatSVGIcon icon = new FlatSVGIcon("raven/menu/icon/1.svg");
        FlatSVGIcon.ColorFilter f = new FlatSVGIcon.ColorFilter();
        FlatSVGIcon icon = new FlatSVGIcon("1.svg");
        f.add(Color.decode("#969696"), lightColor, darkColor);
        icon.setColorFilter(f);
        iconolabel.setIcon(icon);
    }
    
    
    
    private void newPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientButtonActionPerformed
        // TODO add your handling code here:
      
        homePanel.setVisible(false);
        newPatientPanel.setVisible(true);
        editPatientPanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
        
    }//GEN-LAST:event_newPatientButtonActionPerformed

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsButtonActionPerformed
        // TODO add your handling code here:
        homePanel.setVisible(false);
        newPatientPanel.setVisible(false);
        editPatientPanel.setVisible(false);
        showPatientsPanel.setVisible(true);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
     
    }//GEN-LAST:event_patientsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        
       homePanel.setVisible(true);
        newPatientPanel.setVisible(false);
        editPatientPanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
      
    }//GEN-LAST:event_homeButtonActionPerformed

    private void editPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientButtonActionPerformed
        // TODO add your handling code here:
        
        homePanel.setVisible(false);
        newPatientPanel.setVisible(false);
        editPatientPanel.setVisible(true);
        showPatientsPanel.setVisible(false);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
       
    }//GEN-LAST:event_editPatientButtonActionPerformed

    private void newConsultationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newConsultationButtonActionPerformed
        
        
        homePanel.setVisible(false);
        newPatientPanel.setVisible(false);
        editPatientPanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(true);
        editConsultationPanel.setVisible(false);
       
        
        
    }//GEN-LAST:event_newConsultationButtonActionPerformed

    private void consultationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultationsButtonActionPerformed
        // TODO add your handling code here:
        homePanel.setVisible(false);
        newPatientPanel.setVisible(false);
        editPatientPanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        consultationdPanel.setVisible(true);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
      
    }//GEN-LAST:event_consultationsButtonActionPerformed

    private void editConsultationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editConsultationButtonActionPerformed
        homePanel.setVisible(false);
        newPatientPanel.setVisible(false);
        editPatientPanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(true);
       
    }//GEN-LAST:event_editConsultationButtonActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultationsButton;
    private javax.swing.JButton editConsultationButton;
    private javax.swing.JButton editPatientButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel iconolabel;
    private javax.swing.JLayeredPane layeredMain;
    private javax.swing.JButton newConsultationButton;
    private javax.swing.JButton newPatientButton;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JButton patientsButton;
    // End of variables declaration//GEN-END:variables
}
