package mx.tecnm.cdhidalgo.podiatryclinic.gui;

import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
//import raven.main.Application;
import mx.tecnm.cdhidalgo.podiatryclinic.PodiatryClinic;
import javax.swing.*;
import java.awt.*;


public class FormsManager {
  //  private Application application;
    private PodiatryClinic application;
    private static FormsManager instance;

    public static FormsManager getInstance() {
        if (instance == null) {
            instance = new FormsManager();
        }
        return instance;
    }

    private FormsManager() {

    }

    public void initApplication(PodiatryClinic application) {
        this.application = application;
    }

    public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            application.setContentPane(form);
            application.revalidate();
            application.repaint();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }
}
