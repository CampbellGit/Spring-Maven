package com.m2i.formation.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m2i.formation.service.Temperature;

/**
 * Servlet implementation class Convertisseur
 */
public class Convertisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String temp 			= "temp";
    public static final String VUE             = "/fahrenheitoutput.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maVue = "/celsiusinput.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);  
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String temprecup = request.getParameter("temp");

		
		Temperature temperature = new Temperature();
		temperature.setCelsius(Double.valueOf(temprecup));
		temperature.setFahrenheit(temperature.getFahrenheit());

		request.setAttribute("temperature", temperature);
		
		 this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

}
