/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdhidalgo.podiatryclinic.logic;

import java.io.Serializable;

public class ConsultationDTO implements Serializable{
    
 
    private int consultationId;
    
    private int patientId; //foreign key
    private String patientName; //table users field "name"
    private String consultation;
    private String consultationDate; 
    
    
     public ConsultationDTO() {
    }

    public ConsultationDTO(int consultationId, int patientId, String patientName, String consultation, String consultationDate) {
        this.consultationId = consultationId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.consultation = consultation;
        this.consultationDate = consultationDate;
    }

    public int getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(int consultationId) {
        this.consultationId = consultationId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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


