package com.m2i.formation.dao;

import org.springframework.stereotype.Repository;

import com.m2i.formation.entity.Employee;

@Repository("iemployeeDAO")
public interface IEmployeeDAO {
	
	public void saveEmployee(Employee employe);

}
