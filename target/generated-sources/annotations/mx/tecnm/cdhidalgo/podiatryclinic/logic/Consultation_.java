package mx.tecnm.cdhidalgo.podiatryclinic.logic;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.tecnm.cdhidalgo.podiatryclinic.logic.User;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-06T19:49:56", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Consultation.class)
public class Consultation_ { 

    public static volatile SingularAttribute<Consultation, String> consultationDate;
    public static volatile SingularAttribute<Consultation, User> patient;
    public static volatile SingularAttribute<Consultation, String> consultation;
    public static volatile SingularAttribute<Consultation, Integer> consultationId;

}