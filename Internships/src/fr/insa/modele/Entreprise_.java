package fr.insa.modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-16T15:53:47.811+0100")
@StaticMetamodel(Entreprise.class)
public class Entreprise_ {
	public static volatile SingularAttribute<Entreprise, Long> id;
	public static volatile SingularAttribute<Entreprise, String> nom;
	public static volatile SingularAttribute<Entreprise, String> adresse;
	public static volatile SingularAttribute<Entreprise, String> type;
	public static volatile SingularAttribute<Entreprise, String> domaineActivite;
	public static volatile SingularAttribute<Entreprise, String> nomUtilisateur;
	public static volatile SingularAttribute<Entreprise, String> mdpUtilisateur;
}
