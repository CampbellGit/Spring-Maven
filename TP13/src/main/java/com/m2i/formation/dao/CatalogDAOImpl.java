package com.m2i.formation.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.m2i.formation.dao.entity.Product;

@Repository("catalogDAO")
public class CatalogDAOImpl implements ICatalogDAO {

	@Resource(name="jdbcTemplate")
	JdbcTemplate jdbcTemplate;

	public void addProduct(Product p) {		
		final String INSERT_QUERY = "INSERT INTO product (REF, NOM, PRICE, QUANTITY, UPDATED) VALUES (?,?,?,?,?)"; 
		jdbcTemplate.update(INSERT_QUERY, new Object[] {p.getRef(), p.getNom(), p.getPrice(), p.getQuantity(), p.getUpdated()}); 
	}

	public void updateProduct(Product p) {		
		final String UPDATE_QUERY = 
				"UPDATE PRODUCT SET REF=?,NOM=?,PRICE=?,QUANTITY=?,UPDATED=? WHERE ID = ?"; 
		jdbcTemplate.update(UPDATE_QUERY, new Object[] {p.getRef(), p.getNom(), 
				p.getPrice(), p.getQuantity(), p.getUpdated(), p.getId()}); 
	}


	public boolean removeProduct(Product p) {
		final String DELETE_QUERY = "DELETE FROM PRODUCT WHERE REF = ? "; 
		return jdbcTemplate.update(DELETE_QUERY, p.getRef())==1?true:false; 
	}

	public Product findProductByRef(String ref) {		
		final String SELECT_QUERY = 
				"SELECT * FROM PRODUCT WHERE REF = ?"; 
		return jdbcTemplate.queryForObject(SELECT_QUERY, BeanPropertyRowMapper.newInstance(Product.class), ref);
	}

	public List<Product> findProductByCriteria(String criteria) {		
		final String SELECT_QUERY_CRITERIA = 
				"SELECT * FROM PRODUCT WHERE NOM LIKE ?"; 
		
		return jdbcTemplate.queryForList(SELECT_QUERY_CRITERIA, Product.class, "%"+criteria+"%");
		
	}

	public List<Product> findAllProducts() {		
		final String SELECT_QUERY_ALL = "SELECT * FROM PRODUCT"; 
		return jdbcTemplate.query(SELECT_QUERY_ALL,new Object [] {}, new BeanPropertyRowMapper<Product>(Product.class));
	}
	

}
