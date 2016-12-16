package fr.insa.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Entreprise {
	
	private long idEntreprise;
	private String nom;
	private String adresse;
	private String type;
	private String domaineActivite;
	private String nomUtilisateur;
	private String mdpUtilisateur;
	
	
	public Entreprise() {}
	
	public Entreprise(String nom, String adresse, String type, String domaineActivite) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.type = type;
		this.domaineActivite = domaineActivite;
	}
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getId() {
		return idEntreprise;
	}
	public void setId(long id) {
		this.idEntreprise = id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDomaineActivite() {
		return domaineActivite;
	}
	public void setDomaineActivite(String domaineActivite) {
		this.domaineActivite = domaineActivite;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMdpUtilisateur() {
		return mdpUtilisateur;
	}

	public void setMdpUtilisateur(String mdpUtilisateur) {
		this.mdpUtilisateur = mdpUtilisateur;
	}

	
}
