package fr.insa.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Etudiant {
	private long idEtudiant;
	private String nom;
	private String prenom;
	private String specialite;
	private int annee;

	public Etudiant (){
	}

	public Etudiant (String nom, String prenom, String specialite, int annee){
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setSpecialite(specialite);
		this.setAnnee(annee);
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getId() {
		return idEtudiant;
	}

	public void setId(long id) {
		this.idEtudiant = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
}
