package com.m2i.formation.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.m2i.formation.dao.EmployeeDAO;
import com.m2i.formation.entity.Employee;

@Service("employeeService")
public class EmployeeService {
//Creation Employe
	private static final Logger logger = Logger.getLogger(EmployeeDAO.class);
	EmployeeDAO employeeDAO;
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public Boolean createEmployee(Employee employee){
		Boolean employeeAdded = true;
		try{
		logger.info("Entrée dans la méthode Service.");
		employeeDAO.saveEmployee(employee);
		logger.info("Sortie de la méthode Service.");
		}
		catch (Exception e){
			employeeAdded = false;
			logger.error(e);
		}
		return employeeAdded;
		
	}

	public EmployeeService(EmployeeDAO employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;
	}
	
}
