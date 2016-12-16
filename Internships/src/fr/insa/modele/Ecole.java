package fr.insa.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Ecole {

	private long idEcole;
	private String nom;
	private String adresse;
	
	public Ecole(){}
	
	public Ecole(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getId() {
		return idEcole;
	}
	public void setId(long id) {
		this.idEcole = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
