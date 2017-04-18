package com.m2i.formation.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m2i.formation.service.Personne;

/** Servlet implementation class Calculateur */
public class Calculateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/** @see HttpServlet#HttpServlet() */
	public Calculateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** On affche le formulaire de saisie de la taille de la personne : */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maVue = "/tailleinput.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);  
		dispatcher.forward(request,response);
	}

	/** @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// On devrait récuperer la valeur saisie par l'utilisateur  
		String valTaille = request.getParameter("taille");
		if (valTaille.isEmpty()) {
		// Pas de valeur: il faudrait afficher un message, etc.  
			valTaille = "20";
		}
		// Action: appliquons le calculateur. Espérons que valTaille représente bien un nombre, sinon...
		Personne pers = new Personne(Double.valueOf(valTaille));
		
		// Enregistrons l'objet dans la requête  
		request.setAttribute("personne", pers);
		// Transfert à la vue
		String maVue = "/poidsoutput.jsp";  
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
		dispatcher.forward(request,response); 
	}

}
