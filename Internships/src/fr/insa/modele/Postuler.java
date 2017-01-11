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
public class Postuler {
	
	private long idPostuler;
	private Etudiant etud;
	private CV cv;
	private LM lm;
	private Stage stage;
	private Date datePostuler;
	private Status status;
	
	public Postuler() {
		super();
	}

	public Postuler(Etudiant etud, CV cv, LM lm, Stage stage, Date datePostuler) {
		super();
		this.etud = etud;
		this.cv = cv;
		this.lm = lm;
		this.stage = stage;
		this.datePostuler = datePostuler;
		this.status=Status.ENVOYEE;
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public long getIdPostuler() {
		return idPostuler;
	}

	public void setIdPostuler(long id) {
		this.idPostuler = id;
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
    @JoinColumn(name = "cv_id",foreignKey = @ForeignKey(name = "CV_ID_FK"))
	public CV getCv() {
		return cv;
	}

	public void setCv(CV cv) {
		this.cv = cv;
	}

	@ManyToOne
    @JoinColumn(name = "lm_id",foreignKey = @ForeignKey(name = "LM_ID_FK"))
	public LM getLm() {
		return lm;
	}

	public void setLm(LM lm) {
		this.lm = lm;
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
	@Column(name = "POSTULER_DATE")
	public Date getDatePostuler() {
		return datePostuler;
	}

	public void setDatePostuler(Date datePostuler) {
		this.datePostuler = datePostuler;
	}
	
	
	public Status getStatus(){
		return this.status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	public void etapeSuivanteValidation(){
		
		switch(this.status) {
			case ENVOYEE:
				this.status=Status.ACCEPTEE_ENT;
				break;
			case ACCEPTEE_ENT:
				this.status=Status.ACCEPTEE_INSA;
				break;
			case ACCEPTEE_INSA:
				this.status=Status.VALIDEE;
				break;
			default:
				break;		
		}
	}
	public void refuserCandidature(){
		
		switch(this.status) {
			case ENVOYEE:
				this.status=Status.REFUSEE_ENT;
				break;
			case ACCEPTEE_ENT:
				this.status=Status.REFUSEE_INSA;
				break;
			default:
				break;
		}
	
	}
	
	

}
