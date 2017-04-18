package com.m2i.formation;

public class TeamInstStatic {

	public static void main(String[] args) {
		ScrumTeam scrumTeam = new ScrumTeam();

		TeamMember developper = new TeamMember();
		developper.setRole("Developper");
		developper.setName("Jean-Mimi");
		developper.setXpYears(1);

		TeamMember productOwner = new TeamMember();
		productOwner.setRole("Product owner");
		productOwner.setName("Micheline");
		productOwner.setXpYears(5);


		TeamMember scrumMaster = new TeamMember();
		scrumMaster.setName("Paquito");
		scrumMaster.setRole("Scrum master");
		scrumMaster.setXpYears(9);
		
		scrumTeam.setProductOwner(productOwner);
		scrumTeam.setDevelopper(developper);
		scrumTeam.setScrumMaster(scrumMaster);
		
		System.out.println(scrumTeam.getProductOwner().getName());


	}

}
