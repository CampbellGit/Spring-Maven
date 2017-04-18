package com.m2i.formation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.service.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pouet !");
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("springContext.xml");
		//On ouvre une instance du bbean
		MonService monService = (MonService) appContext.getBean("monService");
		monService.hello("truc");
	}

}
