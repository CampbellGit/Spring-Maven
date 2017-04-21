package com.m2i.formation.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.m2i.formation.dao.CatalogDAOImpl;
import com.m2i.formation.dao.ICatalogDAO;
import com.m2i.formation.dao.entity.Product;

@Service("catalogService")
public class CatalogServiceImpl implements ICatalogService {
	private static final Logger logger = Logger.getLogger(CatalogDAOImpl.class);
	@Resource
	ICatalogDAO catalogDAO;
	


	@Override
	public Product findProductByRef(String ref) {
		Product p = new Product();
		try {
			p = catalogDAO.findProductByRef(ref);
		} catch (Exception e) {
			logger.error(e);
		}

		
		return p;
			
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		logger.info("Entrée dans la méthode service addProduct.");
		catalogDAO.addProduct(product);
		logger.info("Fin de la méthode service addProduct.");
	}

	@Override
	public void updateProduct(Product product) {
		logger.info("Entrée dans la méthode service addProduct.");
		catalogDAO.updateProduct(product);
		logger.info("Fin de la méthode service addProduct.");
	}

	@Override
	public List<Product> findAllProducts() {
		logger.info("Entrée dans la méthode service findAllProducts.");
		// TODO Auto-generated method stub
		return catalogDAO.findAllProducts();
	}

	@Override
	public List<Product> findProductByCriteria(String criteria) {
		logger.info("Entrée dans la méthode service findProductByCriteria.");
		return catalogDAO.findProductByCriteria(criteria);
	}

	@Override
	public boolean removeProduct(Product product) {
		logger.info("Entrée dans la méthode service removeProduct.");
		return catalogDAO.removeProduct(product);
	}
	
}