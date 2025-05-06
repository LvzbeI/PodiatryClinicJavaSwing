package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import mx.tecnm.cdhidalgo.podiatryclinic.gui.FormsManager;
import mx.tecnm.cdhidalgo.podiatryclinic.gui.MainDashboard;


import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentListener;

import mx.tecnm.cdhidalgo.podiatryclinic.PodiatryClinic;

public class Login extends JPanel {
  //PodiatryClinic app = new PodiatryClinic();
  
    public Login() {
        init();
    }

     private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        //chRememberMe = new JCheckBox("Remember me");
        info = new Label("Invalid Credentials");
        info.setForeground(Color.RED);
        cmdLogin = new JButton("Login");
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, "" +
                "arc:20;" +
                "[light]background:darken(@background,3%);" +
                "[dark]background:lighten(@background,3%)");

        txtPassword.putClientProperty(FlatClientProperties.STYLE, "" +
                "showRevealButton:true");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]background:darken(@background,10%);" +
                "[dark]background:lighten(@background,10%);" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0");

        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username or email");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");

        JLabel lbTitle = new JLabel("Welcome back!");
        JLabel description = new JLabel("Please sign in to access your account");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +10");
        description.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");
        
        info.setVisible(false);
        
        panel.add(lbTitle);
        panel.add(description);
        panel.add(new JLabel("Username"), "gapy 8");
        panel.add(txtUsername, "h 30!");
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword, "h 30!");
        panel.add(info, "grow 0");
        //panel.add(new JLabel("Username"), "gapy 8");
        panel.add(cmdLogin, "gapy 10");
        panel.add(createSignupLabel(), "gapy 10");
        add(panel);
        
        cmdLogin.addActionListener( ActionEvent ->{
        
     String user = txtUsername.getText();
     String pass =txtPassword.getText();
    
    if (user.equals("admin") && pass.equals("1234")) {
        
     JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

    if (parentFrame != null) {
        parentFrame.dispose(); 
    }
    new MainDashboard().setVisible(true);

    } else {
        info.setVisible(true);
        //JOptionPane.showMessageDialog(this, "Invalid credentials", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
 
    
    
    
        });
        
      DocumentListener clearErrorListener = new DocumentListener() {
    @Override
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        info.setVisible(false);
    }

    @Override
    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        info.setVisible(false);
    }

    @Override
    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        info.setVisible(false);
    }
};


txtUsername.getDocument().addDocumentListener(clearErrorListener);
txtPassword.getDocument().addDocumentListener(clearErrorListener);  
        
        
        
        
        
    }

    private Component createSignupLabel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, "" +
                "background:null");
        JButton cmdRegister = new JButton("<html><a href=\"#\">Sign up</a></html>");
        cmdRegister.putClientProperty(FlatClientProperties.STYLE, "" +
                "border:3,3,3,3");
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdRegister.addActionListener(e -> {
           // FormsManager.getInstance().showForm(new Register());
        });
        JLabel label = new JLabel("Don't have an account ?");
        label.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(cmdRegister);
        return panel;
    }


    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtPassword2;
    private JCheckBox chRememberMe;
    private JButton cmdLogin;
    private Label info;
}
