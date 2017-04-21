package com.m2i.formation.presentation;

import java.util.Locale;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m2i.formation.dao.CatalogDAOImpl;
import com.m2i.formation.dao.entity.Product;
import com.m2i.formation.service.ICatalogService;

@Controller
public class CatalogController {
	private static final Logger logger = Logger.getLogger(CatalogDAOImpl.class);
	@Resource(name = "catalogService")
	private ICatalogService catalogService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String products(Locale locale, Model model) {
		logger.info("Entrée dans le controller /.");
		model.addAttribute("product", new Product());
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";
	}
	@RequestMapping(value="/saveProduct")
	public String save(Product p, Model model){
		logger.info("Entrée dans le controller /saveProduct.");
		if (p.getId() == 0){
			catalogService.addProduct(p);
		}
		else catalogService.updateProduct(p);
		model.addAttribute("product", new Product());
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";		
	}
	
	@RequestMapping(value="/deleteProduct")
	public String delete(String ref, Model model){
		logger.info("Entrée dans le controller /deleteProduct.");
		Product p = new Product();
		p.setRef(ref);
		catalogService.removeProduct(p);
		model.addAttribute("product", new Product());
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";
	}
	
	@RequestMapping(value="/editProduct")
	public String edit(String ref, Model model){
		logger.info("Entrée dans le controller /editProduct.");
		Product p = new Product();
		p.setRef(ref);
		p = catalogService.findProductByRef(p.getRef());
		model.addAttribute("product", p);
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";
	}
	
	
	
}
