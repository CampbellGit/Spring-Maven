package com.m2i.formation.service;

import com.m2i.formation.dao.EmployeeDAO;
import com.m2i.formation.entity.Employee;

public class EmployeeService {
//Creation Employe
	EmployeeDAO employeeDAO;
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void createEmployee(Employee employee){
		employeeDAO.saveEmployee(employee);
	}
}
