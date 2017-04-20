package com.m2i.formation.presentation;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m2i.formation.dao.entity.Product;
import com.m2i.formation.service.ICatalogService;

@Controller
public class CatalogController {
	@Resource(name = "catalogService")
	private ICatalogService catalogService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String products(Locale locale, Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";
	}
	@RequestMapping(value="/saveProduct")
	public String save(Product product, Model model){
		if (product.getId() == 0){
			catalogService.addProduct(product);
		}
		else catalogService.updateProduct(product);
		model.addAttribute("product", new Product());
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";		
	}
	
	@RequestMapping(value="/deleteProduct")
	public String delete(String ref, Model model){
		Product p = new Product();
		p.setRef(ref);
		catalogService.removeProduct(p);
		model.addAttribute("product", new Product());
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";
	}
	
	@RequestMapping(value="/editProduct")
	public String edit(String ref, Model model){
		Product p = new Product();
		p.setRef(ref);
		catalogService.findProductByRef(ref);
		model.addAttribute("product", p);
		model.addAttribute("products", catalogService.findAllProducts());
		return "products";
	}
	
	
	
}
