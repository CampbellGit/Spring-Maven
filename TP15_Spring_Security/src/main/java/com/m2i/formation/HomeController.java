package com.m2i.formation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//
//		
//		return "home";
//	}
	
	@RequestMapping(value = "/admin/private", method = RequestMethod.GET)
	public String privatePage() {

		
		return "privatepage";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		System.out.println(request.getRemoteHost());
		
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {

		
		return "login";
	}
}
