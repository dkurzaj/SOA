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
public class Convention {
	
	private long idConvention;
	private Etudiant etud;
	private Ecole ecole;
	private Entreprise entreprise;
	private Stage stage;
	private Date dateConvention;
	private String urlStock;
	
	public Convention() {
		super();
	}

	public Convention(Etudiant etud, Ecole ecole, Entreprise entreprise, Stage stage, Date dateConvention,
			String urlStock) {
		super();
		this.etud = etud;
		this.ecole = ecole;
		this.entreprise = entreprise;
		this.stage = stage;
		this.dateConvention = dateConvention;
		this.urlStock = urlStock;
	}
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getId() {
		return idConvention;
	}

	public void setId(long id) {
		this.idConvention = id;
	}
	@ManyToOne
    @JoinColumn(name = "etudiant_id",foreignKey = @ForeignKey(name = "ETUDIANT_ID_FK"))
	public Etudiant getEtud() {
		return etud;
	}

	public void setEtud(Etudiant etud) {
		this.etud = etud;
	}

	@ManyToOne
    @JoinColumn(name = "ecole_id",foreignKey = @ForeignKey(name = "ECOLE_ID_FK"))
	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	@ManyToOne
    @JoinColumn(name = "entreprise_id",foreignKey = @ForeignKey(name = "ENTREPRISE_ID_FK"))
	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	@ManyToOne
    @JoinColumn(name = "stage_id",foreignKey = @ForeignKey(name = "STAGE_ID_FK"))
	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CONVENTION_DATE")
	public Date getDateConvention() {
		return dateConvention;
	}

	public void setDateConvention(Date dateConvention) {
		this.dateConvention = dateConvention;
	}

	public String getUrlStock() {
		return urlStock;
	}

	public void setUrlStock(String urlStock) {
		this.urlStock = urlStock;
	}
	
	

}
