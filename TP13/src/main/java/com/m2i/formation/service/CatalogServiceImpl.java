package com.m2i.formation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.m2i.formation.dao.ICatalogDAO;
import com.m2i.formation.dao.entity.Product;

@Service("catalogService")
public class CatalogServiceImpl implements ICatalogService {
	
	ICatalogDAO catalogDAO;
	
	

	public ICatalogDAO getCatalogDAO() {
		return catalogDAO;
	}

	public void setCatalogDAO(ICatalogDAO catalogDAO) {
		this.catalogDAO = catalogDAO;
	}

	@Override
	public Product findProductByRef(String ref) {
		return catalogDAO.findProductByRef(ref);
			
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		catalogDAO.addProduct(product);
	}

	@Override
	public void updateProduct(Product product) {
		catalogDAO.updateProduct(product);
		
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return catalogDAO.findAllProducts();
	}

	@Override
	public List<Product> findProductByCriteria(String criteria) {
		// TODO Auto-generated method stub
		return catalogDAO.findProductByCriteria(criteria);
	}

	@Override
	public boolean removeProduct(Product product) {
		// TODO Auto-generated method stub
		return catalogDAO.removeProduct(product);
	}
	
}