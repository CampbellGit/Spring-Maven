package com.m2i.formation.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m2i.formation.service.Personne;

/**
 * Servlet implementation class Calculateur
 */
public class Calculateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public static final String taille 			= "taille";
       public static final String VUE             = "/poidoutput.jsp";



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String taillerecup = request.getParameter("taille");
		int tailleent = Integer.parseInt(taillerecup); 
		
		Personne personne = new Personne();
		personne.setTaille(tailleent);
		personne.setPoids(tailleent - 100 - ((tailleent-150)*4));

		request.setAttribute("personne", personne);
		
		 this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

}
