package fr.insa.modele;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table( name = "STAGES" )
public class Stage {
	
	private long id;
	private String titre;
	private String lieu;
	private Date debut;
	private int duree;
	private String description;
	private long entreprise;
	
	public Stage () {
		
	}
	
	public Stage (String titre, String lieu, Date debut, int duree, String description, long entreprise) {
		this.titre = titre;
		this.lieu = lieu;
		this.debut = debut;
		this.duree = duree;
		this.description = description;
		this.entreprise = entreprise;
	}
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STAGE_DATE")
	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(long entreprise) {
		this.entreprise = entreprise;
	}
	

}
