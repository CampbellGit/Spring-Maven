package com.m2i.formation.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.m2i.formation.dao.entity.Product;

@Repository("catalogDAO")
public class CatalogDAOImpl implements ICatalogDAO {
	private static final Logger logger = Logger.getLogger(CatalogDAOImpl.class);
	@Resource(name="jdbcTemplate")
	JdbcTemplate jdbcTemplate;

	public void addProduct(Product p) {		
		logger.info("Entrée dans la méthode DAO addProduct.");
		final String INSERT_QUERY = "INSERT INTO product (REF, NOM, PRICE, QUANTITY, UPDATED) VALUES (?,?,?,?,?)"; 
		jdbcTemplate.update(INSERT_QUERY, new Object[] {p.getRef(), p.getNom(), p.getPrice(), p.getQuantity(), p.getUpdated()}); 
		logger.info("Sortie de la méthode DAO addProduct.");
	}

	public void updateProduct(Product p) {		
		logger.info("Entrée dans la méthode DAO updateProduct.");
		final String UPDATE_QUERY = 
				"UPDATE PRODUCT SET REF=?,NOM=?,PRICE=?,QUANTITY=?,UPDATED=? WHERE ID = ?"; 
		jdbcTemplate.update(UPDATE_QUERY, new Object[] {p.getRef(), p.getNom(), 
				p.getPrice(), p.getQuantity(), p.getUpdated(), p.getId()}); 
		logger.info("Sortie de la méthode DAO updateProduct.");
	}


	public boolean removeProduct(Product p) {
		logger.info("Entrée dans la méthode DAO updateProduct.");
		final String DELETE_QUERY = "DELETE FROM PRODUCT WHERE REF = ? "; 
		return jdbcTemplate.update(DELETE_QUERY, p.getRef())==1?true:false; 
		
	}

	public Product findProductByRef(String ref) {		
		logger.info("Entrée dans la méthode DAO findProductByRef.");
		final String SELECT_QUERY = 
				"SELECT * FROM PRODUCT WHERE REF = ?"; 
		logger.info("Fin de la méthode DAO findProductByRef.");
		return jdbcTemplate.queryForObject(SELECT_QUERY, BeanPropertyRowMapper.newInstance(Product.class), ref);

	}

	//public List<Product> findProductByCriteria(String criteria) {		
//		logger.info("Entrée dans la méthode DAO findProductByCriteria.");
//		final String SELECT_QUERY_CRITERIA = 
//				"SELECT * FROM PRODUCT WHERE NOM LIKE ?"; 
//		logger.info("Fin de la méthode DAO findProductByCriteria.");
//		
//		
//		return jdbcTemplate.queryForList(SELECT_QUERY_CRITERIA, Product.class, "%"+criteria+"%");
		
		public List<Product> findProductByCriteria(String criteria) {		
			final String SELECT_QUERY_CRITERIA = 
					"SELECT * FROM PRODUCT WHERE NOM LIKE '%" + criteria + "%'"; 
			List<Product> products = new ArrayList<Product>();
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(SELECT_QUERY_CRITERIA);
			for (Map row : rows) {
				Product product = new Product();
				product.setId(Integer.parseInt(String.valueOf(row.get("ID"))));
				product.setRef((String)row.get("REF"));
				product.setNom((String)row.get("NOM"));
				product.setPrice((String)row.get("PRICE"));
				product.setQuantity(Integer.parseInt(String.valueOf(row.get("QUANTITY"))));
				product.setCreated((Date)row.get("CREATED"));
				product.setUpdated((Date)row.get("UPDATED"));
				products.add(product);
			}
			return products; 
		
	}

	public List<Product> findAllProducts() {	
		logger.info("Entrée dans la méthode DAO findAllProducts.");
		final String SELECT_QUERY_ALL = "SELECT * FROM PRODUCT"; 
		logger.info("Fin de la méthode DAO findAllProducts.");
		return jdbcTemplate.query(SELECT_QUERY_ALL,new Object [] {}, new BeanPropertyRowMapper<Product>(Product.class));
	}
	

}
