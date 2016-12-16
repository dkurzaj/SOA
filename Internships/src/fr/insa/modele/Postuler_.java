package fr.insa.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-16T15:45:29.022+0100")
@StaticMetamodel(Postuler.class)
public class Postuler_ {
	public static volatile SingularAttribute<Postuler, Long> id;
	public static volatile SingularAttribute<Postuler, Etudiant> etud;
	public static volatile SingularAttribute<Postuler, CV> cv;
	public static volatile SingularAttribute<Postuler, LM> lm;
	public static volatile SingularAttribute<Postuler, Stage> stage;
	public static volatile SingularAttribute<Postuler, Date> datePostuler;
}
