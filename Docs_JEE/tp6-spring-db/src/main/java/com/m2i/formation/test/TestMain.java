package com.m2i.formation.test;

import com.m2i.formation.business.Employe;
import com.m2i.formation.model.SpringJDBC;

public class TestMain {

	public static void main(String[] args) {
		
		SpringJDBC springJDBC = new SpringJDBC(); 
//		Employe employe = springJDBC.getEmployebyId(1); 
//		System.out.println("employe Login : " + employe.getLogin());
//		System.out.println("employe Nom : " + employe.getNom());
		
		Employe employe = new Employe(10, "ddd", "dff", "fff", "sddd", "sdgg", "dgff"); 
		//springJDBC.saveEmployebyId (employe); 
		springJDBC.saveEmployeJdbcTemplate(employe);
		
		//Employe employe = springJDBC.getEmployebyIdJdbcTemplace(2); 
		//System.out.println("employe.getLogin() : " + employe.getLogin()); 
		

	}

}
