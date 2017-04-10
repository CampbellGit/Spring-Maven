package com.m2i.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("tp2_beans.xml");
		
		ScrumTeam scrumTeam = (ScrumTeam) appContext.getBean("scrumTeam");
		
		System.out.println("Developper: " + scrumTeam.getDevelopper().getName());
		System.out.println("Product owner: " + scrumTeam.getProductOwner().getName());		
		System.out.println("Scrum master: " + scrumTeam.getScrumMaster().getName());	
		
	}

}
