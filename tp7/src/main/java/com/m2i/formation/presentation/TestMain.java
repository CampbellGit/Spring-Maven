package com.m2i.formation.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.entity.Employee;
import com.m2i.formation.service.EmployeeService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService");
		
		Employee ajout = new Employee(7, "Michel3", "Truc4", "Bidule5","Michel6", "Truc7", "Bidule8" ) ;
		System.out.println("OK2");	
		employeeService.createEmployee(ajout);
	}

}
