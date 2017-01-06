package fr.insa.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-16T17:23:34.121+0100")
@StaticMetamodel(Stage.class)
public class Stage_ {
	public static volatile SingularAttribute<Stage, Long> id;
	public static volatile SingularAttribute<Stage, Date> debut;
	public static volatile SingularAttribute<Stage, String> titre;
	public static volatile SingularAttribute<Stage, String> lieu;
	public static volatile SingularAttribute<Stage, Integer> duree;
	public static volatile SingularAttribute<Stage, String> description;
	public static volatile SingularAttribute<Stage, Entreprise> entreprise;
}
