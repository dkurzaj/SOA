package fr.insa.modele;

public enum Status {

	ENVOYEE("Envoy�e"), 
	ACCEPTEE_ENT("Accept�e par l'entreprise"), 
	ACCEPTEE_INSA("Accept�e par l'entreprise et par l'INSA"),
	VALIDEE("Accept�e par l'entreprise et par l'INSA et valid�e par l'�tudiant"),
	REFUSEE_ENT("Refus�e par l'entreprise"),
	REFUSEE_INSA("Refus�e par l'INSA");
	
	private String txt;
	
	Status(String txt){
		this.txt=txt;
	}
}
