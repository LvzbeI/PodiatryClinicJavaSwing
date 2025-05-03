
package mx.tecnm.cdhidalgo.podiatryclinic.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "consultations") 
public class Consultation implements Serializable {
    
   
   // @SequenceGenerator(name = "consultation_seq", sequenceName = "consultations_consultationid_seq", allocationSize = 1)
  //  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consultation_seq")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int consultationId;
    
    @ManyToOne(optional = false) // relación obligatoria con un usuario
    @JoinColumn(name = "patientid", referencedColumnName = "userid")
    private User patient;
     
   // private int patientId; //foreign key
    private String consultation;
    private String consultationDate; //LocalDateTime();
    

    public Consultation() {
    }

   public Consultation(int consultationId, User patient, String consultation, String consultationDate) {
        this.consultationId = consultationId;
        this.patient = patient;
        this.consultation = consultation;
        this.consultationDate = consultationDate;
    }

    public int getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(int consultationId) {
        this.consultationId = consultationId;
    }

//    public int getPatientId() {
//        return patientId;
//    }
//
//    public void setPatientId(int patientId) {
//        this.patientId = patientId;
//    }

    
    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }
    
    
    public String getConsultation() {
        return consultation;
    }

    public void setConsultation(String consultation) {
        this.consultation = consultation;
    }

    public String getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(String consultationDate) {
        this.consultationDate = consultationDate;
    }
 
}
