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
    NewPatient registerPanel = new NewPatient();
    ShowPatients showPatientsPanel = new ShowPatients();
    Home homePanel = new Home();
    Edit editPanel = new Edit();
    ShowConsultations consultationdPanel = new ShowConsultations();
    NewConsultation newConsultationPanel = new  NewConsultation();
    EditConsultation editConsultationPanel = new EditConsultation();
    //EditPatient editPatientPanel = new EditPatient();
    PaymentForm payment = new PaymentForm();
    
    // FLATLAF SWING PANELS
    NewPatientPanel newPatientPanel = new NewPatientPanel();
    EditPatientPanel editPatientPanel = new EditPatientPanel();
    
    public MainDashboard() {
        initComponents();

        layeredMain.add(homePanel);
        layeredMain.add(registerPanel);
        layeredMain.add(showPatientsPanel);
        layeredMain.add(editPanel);
        layeredMain.add(newConsultationPanel);
        layeredMain.add(consultationdPanel);
        layeredMain.add(editPatientPanel);
        layeredMain.add(editConsultationPanel);
        layeredMain.add(payment);
         layeredMain.add(newPatientPanel);
        
        
        homePanel.setVisible(true);
        registerPanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        editPanel.setVisible(false);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editPatientPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
        payment.setVisible(false);
        
        newPatientPanel.setVisible(false);
        
        
      //  homeButton.setBorder(FlatButtonBorder);
      
     // FlatSVGIcon icon = new FlatSVGIcon("/mx/tecnm/cdhidalgo/podiatryclinic/icon/1.svg");
       FlatSVGIcon icon = new FlatSVGIcon("home.svg");
      homeButton.setIcon(icon);
     // homeButton.setHorizontalTextPosition(SwingConstants.RIGHT);  // Texto a la derecha del icono
//homeButton.setVerticalTextPosition(SwingConstants.CENTER); 
        //setIcon();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDashboard = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        patientsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        showConsultationsButton = new javax.swing.JButton();
        newConsultationButton = new javax.swing.JButton();
        editConsultationButton = new javax.swing.JButton();
        deleteConsultationButton = new javax.swing.JButton();
        iconolabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        layeredMain = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDashboard.setPreferredSize(new java.awt.Dimension(180, 720));

        registerButton.setBackground(new java.awt.Color(242, 242, 242));
        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add24.png"))); // NOI18N
        registerButton.setText("New Patient");
        registerButton.setBorder(null);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        patientsButton.setBackground(new java.awt.Color(242, 242, 242));
        patientsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientsButton.setText("Show Patients");
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

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Delete Patient");
        jButton1.setBorder(null);

        editButton.setBackground(new java.awt.Color(242, 242, 242));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setText("Edit Patient");
        editButton.setBorder(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        showConsultationsButton.setBackground(new java.awt.Color(242, 242, 242));
        showConsultationsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showConsultationsButton.setText("Show Consultations");
        showConsultationsButton.setBorder(null);
        showConsultationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showConsultationsButtonActionPerformed(evt);
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

        deleteConsultationButton.setBackground(new java.awt.Color(242, 242, 242));
        deleteConsultationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteConsultationButton.setText("Delete Consultation");
        deleteConsultationButton.setBorder(null);

        jButton2.setText("payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteConsultationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(editConsultationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newConsultationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showConsultationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(iconolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showConsultationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(newConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(deleteConsultationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
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
    
    
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
      
        homePanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        //registerPanel.setVisible(true);
        newPatientPanel.setVisible(true);
        editPanel.setVisible(false);      
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsButtonActionPerformed
        // TODO add your handling code here:
        homePanel.setVisible(false);
        showPatientsPanel.setVisible(true);
        registerPanel.setVisible(false);
        editPanel.setVisible(false);      
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
    }//GEN-LAST:event_patientsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        
        homePanel.setVisible(true);
        showPatientsPanel.setVisible(false);
        registerPanel.setVisible(false);
        editPanel.setVisible(false);      
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false); 
        editConsultationPanel.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        
        homePanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        registerPanel.setVisible(false);
        editPanel.setVisible(false);     
        editPatientPanel.setVisible(true);
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void newConsultationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newConsultationButtonActionPerformed
        
        
        homePanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        registerPanel.setVisible(false);
        editPanel.setVisible(false);      
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(true);
        editConsultationPanel.setVisible(false);
        
        
    }//GEN-LAST:event_newConsultationButtonActionPerformed

    private void showConsultationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showConsultationsButtonActionPerformed
        // TODO add your handling code here:
        homePanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        registerPanel.setVisible(false);
        editPanel.setVisible(false);      
        consultationdPanel.setVisible(true);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
    }//GEN-LAST:event_showConsultationsButtonActionPerformed

    private void editConsultationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editConsultationButtonActionPerformed
        homePanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        registerPanel.setVisible(false);
        editPanel.setVisible(false);      
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(true);
    }//GEN-LAST:event_editConsultationButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       homePanel.setVisible(false);
        showPatientsPanel.setVisible(false);
        registerPanel.setVisible(false);
        editPanel.setVisible(false);      
        consultationdPanel.setVisible(false);
        newConsultationPanel.setVisible(false);
        editConsultationPanel.setVisible(false);
        payment.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteConsultationButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editConsultationButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel iconolabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLayeredPane layeredMain;
    private javax.swing.JButton newConsultationButton;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JButton patientsButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton showConsultationsButton;
    // End of variables declaration//GEN-END:variables
}
