package mx.tecnm.cdhidalgo.podiatryclinic.logic;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.tecnm.cdhidalgo.podiatryclinic.persistence.PersistenceController;


public class Controller {
    
    PersistenceController persistence = new PersistenceController();

    public void save(String name, String secondname, String sex, String bornDate, 
            String email, String phone, String observations, String consultationDate) {
       
       User user = new User();
        
       user.setName(name);
       user.setSecondname(secondname);
       user.setSex(sex);
       user.setBornDate(bornDate);
       user.setEmail(email);
       user.setPhone(phone);
       user.setObservations(observations);
       user.setConsultationDate(consultationDate);
       
       persistence.save(user);
       
    }
    
    
    public void updatePatient(int id, String name, String secondname, String sex, String bornDate, 
            String email, String phone, String observations, String consultationDate) throws Exception{
       
       
       User user = new User();
       user.setUserId(id);
       user.setName(name);
       user.setSecondname(secondname);
       user.setSex(sex);
       user.setBornDate(bornDate);
       user.setEmail(email);
       user.setPhone(phone);
       user.setObservations(observations);
       user.setConsultationDate(consultationDate);
       
       persistence.updatePatient(user);
       
    
    }
    
   
    
    public List<User> getAllUsers(){
        List<User> users = persistence.getUsers();
    return users;
    }
    
    
     public void saveConsultation(int patientid, String consultationData, String consultationDate){
        
        User patient = new User();
        patient.setUserId(patientid); 
        
        Consultation consultation = new Consultation();
        consultation.setPatient(patient);
        consultation.setConsultation(consultationData);
        consultation.setConsultationDate(consultationDate);

     persistence.saveConsultation(consultation);

    }
     
     
     public void updateConsultation(int consultationID, int patientId, String consultationData, String consultationDate){
         User patient = new User();
         patient.setUserId(patientId);
         
         Consultation consultation = new Consultation();
         consultation.setConsultationId(consultationID);
         consultation.setPatient(patient);
         consultation.setConsultation(consultationData);
         consultation.setConsultationDate(consultationDate);
         
        try {
            persistence.updateConsultation(consultation);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
     
     
//     public List<ConsultationDTO> getAllConsultations(){
//         
//     }
    
    
}
