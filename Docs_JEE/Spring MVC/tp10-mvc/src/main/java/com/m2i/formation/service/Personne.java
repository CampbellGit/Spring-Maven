package com.m2i.formation.service;

/** Une classe permettant d'obtenir le poids théorique en fonction de la taille d'une personne */
public class Personne {

	/** La valeur, exprimée en centimètres */
	private double taille;
	
	/** Le constructeur, prend la taille en paramètre */
	public Personne(double valeurTaille) 	{		taille = valeurTaille;	}
	
	/** Pour récupérer la taille de la personne */
	public double getTaille() {		return taille;	}
	
	/** Pour obtenir le poids théroque : Poidsidéal(homme)=H-100-((H-150)/4) */
	public double getPoids() {		return taille - 100 - ((taille - 150)/4); 	}
}


