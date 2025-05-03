/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdhidalgo.podiatryclinic.persistence;

import java.util.List;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Consultation;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.User;

/**
 *
 * @author tony
 */
public class PersistenceController {
    
    UserJpaController userJpaController = new UserJpaController();
    ConsultationJpaController consultationJpaController = new ConsultationJpaController();
    public PersistenceController() {
    }
    
    // create user in db
    public void save(User user){
         userJpaController.create(user);
    }

    public void updatePatient(User user) throws Exception{
            userJpaController.edit(user);
    }
    
    public List<User> getUsers(){
       List<User> users = userJpaController.findUserEntities();
        return users;
    }
    
    
    public void saveConsultation(Consultation consultation){
        consultationJpaController.create(consultation);
    }
    
    
    public void updateConsultation(Consultation consultation) throws Exception{
        consultationJpaController.edit(consultation);
    }
    
    
}
