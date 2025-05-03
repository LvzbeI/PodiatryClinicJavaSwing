package mx.tecnm.cdhidalgo.podiatryclinic;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.UIManager;
import mx.tecnm.cdhidalgo.podiatryclinic.gui.MainDashboard;



/**
 *
 * @author tony
 */
public class PodiatryClinic {

    public static void main(String[] args) {
        
        
        
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("themes");
        FlatMacLightLaf.setup();
        
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
       
        
           // FlatOneDarkIJTheme.setup();
     //  FlatLightLaf.setup();
      
        
        MainDashboard main = new MainDashboard();
        main.setLocationRelativeTo(null);
      //  main.setVisible(true);
      // prin main = new prin();
        EventQueue.invokeLater(() -> main.setVisible(true));
        
    }
}
