package fr.insa.modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class LM {
	private long idLM;
	private String nom;
	private String urlStock;
	private Date dateUpload;
	private Etudiant etudiant;
	
	public LM(){}
	
	public LM(String nom, String urlStock, Date dateUpload, Etudiant etudiant) {
		super();
		this.nom = nom;
		this.urlStock = urlStock;
		this.dateUpload = dateUpload;
		this.etudiant = etudiant;
	}
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getId() {
		return idLM;
	}

	public void setId(long id) {
		this.idLM = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrlStock() {
		return urlStock;
	}

	public void setUrlStock(String urlStock) {
		this.urlStock = urlStock;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPLAOD_DATE")
	public Date getDateUpload() {
		return dateUpload;
	}

	public void setDateUpload(Date dateUpload) {
		this.dateUpload = dateUpload;
	}

	@ManyToOne
    @JoinColumn(name = "idEtudiant",foreignKey = @ForeignKey(name = "ETUDIANT_ID_FK"))
	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
	

}
