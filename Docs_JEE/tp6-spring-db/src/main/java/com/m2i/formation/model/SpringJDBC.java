package com.m2i.formation.model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.m2i.formation.business.Employe;
public class SpringJDBC {

	public Employe getEmployebyId (int id) {

		java.sql.Connection conn = null; 
		PreparedStatement stmt = null; 
		ResultSet rs = null; 
		Employe employe = new Employe(); 
		try {
			final String SELECT_QUERY = "SELECT ID, LOGIN, EMAIL, PASSWORD, PRENOM, NOM, ROLE FROM EMPLOYE WHERE ID = ?"; 
			ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");  
			DataSource datasource = (DataSource) appContext.getBean("datasource2"); 
			conn = datasource.getConnection(); 
			stmt = conn.prepareStatement(SELECT_QUERY); 
			stmt.setInt(1, id);
			rs = stmt.executeQuery(); 
			if (rs.next()) {
				employe.setId(rs.getInt("ID"));
				employe.setLogin(rs.getString("LOGIN"));
				employe.setPrenom(rs.getString("PRENOM"));
				employe.setNom(rs.getString("NOM"));
				employe.setPassword(rs.getString("PASSWORD"));
				employe.setEmail(rs.getString("EMAIL"));
				employe.setRole(rs.getString("ROLE"));
			}
		} catch (SQLException e) { e.printStackTrace(); } 
		return employe; 

	}

	public void saveEmploye (Employe employe) {
		java.sql.Connection conn = null; 
		PreparedStatement stmt = null; 
		int i = 0; 
		try {
			final String INSERT_QUERY = "INSERT INTO employe (id, login, password, nom, prenom, email, role) VALUES (?, ?,?,?,?,?,?)"; 
			ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");  
			DataSource datasource = (DataSource) appContext.getBean("datasource2"); 
			conn = datasource.getConnection(); 
			stmt = conn.prepareStatement(INSERT_QUERY);
			stmt.setInt(1, employe.getId());
			stmt.setString(2, employe.getLogin());
			stmt.setString(3, employe.getPassword());
			stmt.setString(4, employe.getNom());
			stmt.setString(5, employe.getPrenom());
			stmt.setString(6, employe.getEmail());
			stmt.setString(7, employe.getRole());
			i = stmt.executeUpdate(); 
			System.out.println("i : " + i); 
		} catch (SQLException e) { e.printStackTrace(); } 
	}


		public Employe getEmployebyIdJdbcTemplate (int id) {

		final String SELECT_QUERY = "SELECT ID, LOGIN, EMAIL, PASSWORD, PRENOM, NOM, ROLE FROM EMPLOYE WHERE ID = ? "; 
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");  
		JdbcTemplate jdbcTemplate = (JdbcTemplate) appContext.getBean("jdbcTemplate"); 
		
		return jdbcTemplate.queryForObject(SELECT_QUERY, BeanPropertyRowMapper.newInstance(Employe.class), id);
		}
	
	
	
	
	
	
	
			public void saveEmployeJdbcTemplate (Employe employe) {
			final String INSERT_QUERY = "INSERT INTO employe (id, login, password, nom, prenom, email, role) VALUES (?,?,?,?,?,?,?)"; 
			ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");  
			JdbcTemplate jdbcTemplate = (JdbcTemplate) appContext.getBean("jdbcTemplate"); 
			
			jdbcTemplate.update(INSERT_QUERY, new Object[] {employe.getId(), 
					employe.getLogin(), employe.getPassword(), employe.getNom(), 
					employe.getPrenom(), employe.getEmail(), employe.getRole()}); 
			}
	
			
			
			
			
			
			
			
			
}
 