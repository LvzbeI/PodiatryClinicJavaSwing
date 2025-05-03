/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdhidalgo.podiatryclinic.persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.Consultation;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.User;

/**
 *
 * @author tony
 */
public class ConsultationJpaController implements Serializable {
 
       private EntityManagerFactory emf = null;
    
    public ConsultationJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ConsultationJpaController() {
       emf = Persistence.createEntityManagerFactory("PodiatryPU");
    }
    
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    
    public void create(Consultation consultation){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(consultation);
            em.getTransaction().commit();
        } finally {
            if(em !=null){
                em.close();
            }
        } 
    }
    
    
    
    
    
    public void edit(Consultation consultation) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            consultation = em.merge(consultation);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findConsultation1(consultation.getConsultationId()) == null) {
                throw new Exception("La consulta con id " + consultation.getConsultationId() + " ya no existe.");
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
      public void destroy(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consultation consultation;
            try {
                consultation = em.getReference(Consultation.class, id);
                consultation.getConsultationId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The consultation with the " + id + " doesn exist.", enfe);
            }
            em.remove(consultation);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

      
      
    public ConsultationDTO findConsultation1(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ConsultationDTO.class, id);
        } finally {
            em.close();
        }
    }
    
    
    
    public ConsultationDTO findConsultation(Integer id) {
    EntityManager em = getEntityManager();
    try {
        TypedQuery<Object[]> query = em.createQuery(    
        "SELECT c.consultationId, c.patient.userId, u.name, c.consultation, c.consultationDate " +
            "FROM Consultation c JOIN c.patient u " +
            "WHERE c.consultationId = :id", Object[].class);      
        query.setParameter("id", id);
        Object[] result = query.getSingleResult(); 
        
        
         // Ahora mapeamos el resultado al DTO
        return new ConsultationDTO(
            (Integer) result[0],  // consultationId
            (Integer) result[1],  // patientId (userId de la entidad User)
            (String) result[2],   // patientName (nombre del paciente)
            (String) result[3],   // consultation
            (String) result[4]    // consultationDate
        );
    } finally {
        em.close();
    }
}
    
    
    
    
    
  public List<ConsultationDTO> findConsultationByPatientName(String name) {
    EntityManager em = getEntityManager();
    try {
        TypedQuery<ConsultationDTO> query = em.createQuery(
            "SELECT new mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO("
                    + "c.consultationId, "
                    + "c.patient.userId, "
                    + "u.name, "
                    + "c.consultation, "
                    + "c.consultationDate) "
                    + "FROM Consultation c JOIN c.patient u WHERE LOWER (u.name) LIKE :patientname", ConsultationDTO.class);
        query.setParameter("patientname", "%" +  name.toLowerCase() + "%");
      return query.getResultList();  
    } finally {
        em.close();
    }
}
  
  
    public List<ConsultationDTO> findAllConsultationsDTO(){
      EntityManager em = getEntityManager();
      try {
          TypedQuery<ConsultationDTO> query = em.createQuery(
            "SELECT new mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO("
                    + "c.consultationId, "
                    + "c.patient.userId, "
                    + "c.patient.name, "
                    + "c.consultation, "
                    + "c.consultationDate) "
                    + "FROM Consultation c", ConsultationDTO.class);
          return query.getResultList();
      } finally {
        em.close();
    }
   
  }
  
  
  /// the fields belongs to the Entity Java Classes
//  public List<ConsultationDTO> findAllConsultationsDTO(){
//      EntityManager em = getEntityManager();
//      try {
//          TypedQuery<ConsultationDTO> query = em.createQuery(
//"SELECT new mx.tecnm.cdhidalgo.podiatryclinic.logic.ConsultationDTO(c.consultationId, u.userId, u.name, c.consultation, c.consultationDate) "
//           + "FROM Consultation c JOIN User u ON c.patientId = u.userId", ConsultationDTO.class);
//          return query.getResultList();
//      } finally {
//        em.close();
//    }
//   
//  }

    public List<ConsultationDTO> findConsultationEntities() {
        return findConsultationEntities(true, -1, -1);
    }

    public List<ConsultationDTO> findConsultationEntities(int maxResults, int firstResult) {
        return findConsultationEntities(false, maxResults, firstResult);
    }

    private List<ConsultationDTO> findConsultationEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ConsultationDTO.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
    
     public int getConsultationCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Consultation> rt = cq.from(Consultation.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
