package com.entreprise.jobber.models;

import java.util.Date;
import java.util.List;


public class Job {
	
	private Integer idJob;
	
	private String title;
	
	private Entreprise entreprise;
	
	private String description;
	
	private Niveau niveau_qualification;
	
	private TypeContrat typeContrat;
	
	private Date fin_candidature;
	
	private Integer heures_travail;
	
	private List<Demandeur> listes_demandeurs;
	
	private Pays pays;
	
	private Ville ville;
	
}
