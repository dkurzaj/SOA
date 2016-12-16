package fr.insa.modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-16T12:18:56.652+0100")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ {
	public static volatile SingularAttribute<Etudiant, Long> id;
	public static volatile SingularAttribute<Etudiant, String> nom;
	public static volatile SingularAttribute<Etudiant, String> prenom;
	public static volatile SingularAttribute<Etudiant, String> specialite;
	public static volatile SingularAttribute<Etudiant, Integer> annee;
}
