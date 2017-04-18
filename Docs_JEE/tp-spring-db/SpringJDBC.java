package com.m2i.formation.model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

	public void saveEmployebyId (Employe employe) {
		java.sql.Connection conn = null; 
		PreparedStatement stmt = null; 
		int i = 0; 
		try {
			final String INSERT_QUERY = "INSERT INTO employe (id, login, password, nom, prenom, email, role) VALUES (?, ?,?,?,?,?,?)"; 
			ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");  
			DataSource datasource = (DataSource) appContext.getBean("datasource2"); 
			conn = datasource.getConnection(); 
			stmt = conn.prepareStatement(INSERT_QUERY); 
			stmt.setString(1, employe.getLogin());
			stmt.setString(2, employe.getPassword());
			stmt.setString(3, employe.getNom());
			stmt.setString(4, employe.getPrenom());
			stmt.setString(5, employe.getEmail());
			stmt.setString(6, employe.getRole());
			i = stmt.executeUpdate(); 
			System.out.println("i : " + i); 
		} catch (SQLException e) { e.printStackTrace(); } 
	}


	
}


