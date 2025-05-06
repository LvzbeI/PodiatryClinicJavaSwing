package mx.tecnm.cdhidalgo.podiatryclinic;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import mx.tecnm.cdhidalgo.podiatryclinic.gui.FormsManager;
import mx.tecnm.cdhidalgo.podiatryclinic.gui.Login;
import mx.tecnm.cdhidalgo.podiatryclinic.gui.MainDashboard;
import raven.toast.Notifications;


public class PodiatryClinic extends JFrame{

    
    private static PodiatryClinic app;
    private  MainDashboard mainForm;
    private  Login loginForm;
    
    public PodiatryClinic(){
        
    setTitle("Podiatry Clinic Login");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(new Dimension(1280, 760));
    setLocationRelativeTo(null);

    FormsManager.getInstance().initApplication(this); // ✅ primero inicializas FormsManager

    loginForm = new Login();            // ✅ luego creas el login
    FormsManager.getInstance().showForm(loginForm);  // ✅ lo muestras

    Notifications.getInstance().setJFrame(this);

    }
 
    public static void main(String[] args) {


        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(() -> {
         app = new PodiatryClinic();          // crea la ventana
            app.setVisible(true);                // muestra la ventana
        });
       
        

        
    }
}