package com.m2i.formation.dao;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.m2i.formation.entity.Employee;

@Repository("employeeDAO")
public class EmployeeDAO implements IEmployeeDAO {
//Insertion
	private static final Logger logger = Logger.getLogger(EmployeeDAO.class);
	JdbcTemplate jdbcTemplate;
	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
	super();
	this.jdbcTemplate = jdbcTemplate;
}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void saveEmployee (Employee employe) {

		
		logger.info("Entrée dans la méthode DAO");
		
		final String INSERT_QUERY = "INSERT INTO EMPLOYE (id, password, login, nom, prenom, email, role) VALUES (?,?,?,?,?,?,?)";


		
		jdbcTemplate.update(INSERT_QUERY, new Object[] {employe.getID(), employe.getPassword(),employe.getLogin(),employe.getNom(),employe.getPrenom(), employe.getEmail(),employe.getRole()});
		logger.info("Sortie de la méthode DAO");

		}

		
	}
	


	


