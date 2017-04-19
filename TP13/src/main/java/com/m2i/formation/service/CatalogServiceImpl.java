package com.m2i.formation.service;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.m2i.formation.dao.ICatalogDAO;
import com.m2i.formation.dao.entity.Product;

@Service("catalogService")
public class CatalogServiceImpl implements ICatalogService {
	
	ICatalogDAO catalogDAO;
	
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public CatalogServiceImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addProduct(Product product) {
		final String INSERT_QUERY = "INSERT INTO `product`(`reference`, `designation`, `price`, `quantity` )VALUES (?,?,?,?)" ; 
		jdbcTemplate.update(INSERT_QUERY, new Object[] {product.getRef(), product.getNom(),product.getPrice(),product.getQuantity()});
	}

	@Override
	public List<Product> findAllProducts() {
		final String SELECT_QUERY = "SELECT * FROM `product " ; 
		return jdbcTemplate.query(SELECT_QUERY, new Object[] {}, new BeanPropertyRowMapper<Product>(Product.class));
	}
	@Override
	public List<Product> findProductByCriteria(String criteria) {
		final String SELECT_QUERY = "SELECT * FROM `product` WHERE `designation` LIKE ?" ; 
		return jdbcTemplate.query(SELECT_QUERY, new Object[] {"%" + criteria + "%"}, new BeanPropertyRowMapper<Product>(Product.class));
	}
	@Override
	public Product findProductByRef(String ref) {
		final String SELECTBYREF_QUERY = "SELECT * FROM `product` WHERE `designation`= ?" ; 
		return (Product) jdbcTemplate.query(SELECTBYREF_QUERY, new Object[] {ref}, new BeanPropertyRowMapper<Product>(Product.class));
	}

	@Override
	public boolean removeProduct(Product product) {
		final String DELETE_QUERY = "DELETE FROM `product` WHERE `reference`=?"; 
		return jdbcTemplate.update(DELETE_QUERY, new Object[] {product.getRef()}) == 1 ? true:false;	
	}
	@Override
	public void updateProduct(Product product) {
		final String Update_QUERY = "UPDATE `product` SET `designation`=?,`price`=?,`quantity`=?,`updated`=? WHERE `reference`=?" ; 
		jdbcTemplate.update(Update_QUERY, new Object[] {product.getNom(),product.getPrice(),product.getQuantity(),product.getUpdated(),product.getRef()});
	}
}