package fr.insa.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-16T15:43:47.341+0100")
@StaticMetamodel(LM.class)
public class LM_ {
	public static volatile SingularAttribute<LM, Long> id;
	public static volatile SingularAttribute<LM, Date> dateUpload;
	public static volatile SingularAttribute<LM, String> nom;
	public static volatile SingularAttribute<LM, String> urlStock;
	public static volatile SingularAttribute<LM, Etudiant> etudiant;
}
