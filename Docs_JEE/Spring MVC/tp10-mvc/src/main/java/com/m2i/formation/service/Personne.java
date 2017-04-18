package com.m2i.formation.service;

/** Une classe permettant d'obtenir le poids th�orique en fonction de la taille d'une personne */
public class Personne {

	/** La valeur, exprim�e en centim�tres */
	private double taille;
	
	/** Le constructeur, prend la taille en param�tre */
	public Personne(double valeurTaille) 	{		taille = valeurTaille;	}
	
	/** Pour r�cup�rer la taille de la personne */
	public double getTaille() {		return taille;	}
	
	/** Pour obtenir le poids th�roque : Poidsid�al(homme)=H-100-((H-150)/4) */
	public double getPoids() {		return taille - 100 - ((taille - 150)/4); 	}
}


