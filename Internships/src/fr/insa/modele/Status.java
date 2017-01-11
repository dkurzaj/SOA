package fr.insa.modele;

public enum Status {

	ENVOYEE("Envoyée"), 
	ACCEPTEE_ENT("Acceptée par l'entreprise"), 
	ACCEPTEE_INSA("Acceptée par l'entreprise et par l'INSA"),
	VALIDEE("Acceptée par l'entreprise et par l'INSA et validée par l'étudiant"),
	REFUSEE_ENT("Refusée par l'entreprise"),
	REFUSEE_INSA("Refusée par l'INSA");
	
	private String txt;
	
	Status(String txt){
		this.txt=txt;
	}
}
