package com.m2i.formation.presentation;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.entity.Employee;
import com.m2i.formation.service.EmployeeService;



public class TestMain {
	private static final Logger logger = Logger.getLogger(TestMain.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		logger.info("Entrée dans la méthode Main");
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService");
		
		Employee ajout = new Employee(13, "Michel3", "Truc4", "Bidule5","Michel6", "Truc7", "Bidule8" ) ;
		System.out.println("OK2");	
		employeeService.createEmployee(ajout);
		System.out.println("OK3");	
		logger.info("Sortie de la méthode Main");
		}
		catch (Exception e)
		{
			logger.error("Erreur : "+e);
		}
	}

}
