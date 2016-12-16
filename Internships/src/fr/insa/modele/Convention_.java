package fr.insa.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-16T15:43:04.559+0100")
@StaticMetamodel(Convention.class)
public class Convention_ {
	public static volatile SingularAttribute<Convention, Long> id;
	public static volatile SingularAttribute<Convention, Etudiant> etud;
	public static volatile SingularAttribute<Convention, Ecole> ecole;
	public static volatile SingularAttribute<Convention, Entreprise> entreprise;
	public static volatile SingularAttribute<Convention, Stage> stage;
	public static volatile SingularAttribute<Convention, Date> dateConvention;
	public static volatile SingularAttribute<Convention, String> urlStock;
}
