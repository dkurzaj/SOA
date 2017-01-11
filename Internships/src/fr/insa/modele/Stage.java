package fr.insa.modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ForeignKey;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Stage {
	
	private long idStage;
	private String titre;
	private String lieu;
	private Date debutStage;
	private int duree;
	private String descriptionStage;
	private Entreprise entreprise;
	
	public Stage () {
		
	}
	
	public Stage (String titre, String lieu, Date debut, int duree, String description, Entreprise entreprise) {
		this.titre = titre;
		this.lieu = lieu;
		this.debutStage = debut;
		this.duree = duree;
		this.descriptionStage = description;
		this.entreprise = entreprise;
	}
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getIdStage() {
		return idStage;
	}

	public void setIdStage(long id) {
		this.idStage = id;
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
		return debutStage;
	}
	public void setDebut(Date debut) {
		this.debutStage = debut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	@Type(type="text")
	public String getDescription() {
		return descriptionStage;
	}
	public void setDescription(String description) {
		this.descriptionStage = description;
	}
	
	@ManyToOne
    @JoinColumn(name = "entreprise_id",foreignKey = @ForeignKey(name = "ENTREPRISE_ID_FK"))
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	

}
