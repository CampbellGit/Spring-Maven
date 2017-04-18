package com.m2i.formation.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.m2i.formation.entity.Employee;

public class EmployeeDAO implements IEmployeeDAO {
//Insertion
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void saveEmployee (Employee employe) {
		
		
		final String INSERT_QUERY = "INSERT INTO EMPLOYE (id, password, login, nom, prenom, email, role) VALUES (?,?,?,?,?,?,?)";


		
		jdbcTemplate.update(INSERT_QUERY, new Object[] {employe.getID(), employe.getPassword(),employe.getLogin(),employe.getNom(),employe.getPrenom(), employe.getEmail(),employe.getRole()});


		

	}

}
