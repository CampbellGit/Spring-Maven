package com.m2i.formation.dao;

import java.util.List;

import com.m2i.formation.dao.entity.Product;

public interface ICatalogDAO {
	public Product findProductByRef(String ref);

	public void addProduct(Product product);

	public void updateProduct(Product product);

	public List<Product> findAllProducts();

	public List<Product> findProductByCriteria(String criteria);

	public boolean removeProduct(Product product);
}
