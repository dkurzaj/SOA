package fr.insa.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-01-06T16:36:40.543+0100")
@StaticMetamodel(CV.class)
public class CV_ {
	public static volatile SingularAttribute<CV, Long> id;
	public static volatile SingularAttribute<CV, Date> dateUpload;
	public static volatile SingularAttribute<CV, Etudiant> etudiant;
	public static volatile SingularAttribute<CV, String> nom;
	public static volatile SingularAttribute<CV, String> urlStock;
}
