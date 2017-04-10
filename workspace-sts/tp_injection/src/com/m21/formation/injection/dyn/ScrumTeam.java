package com.m21.formation.injection.dyn;

public class ScrumTeam {
	TeamMember scrumMaster;
	TeamMember developper;
	TeamMember productOwner;

	public TeamMember getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(TeamMember scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public TeamMember getDevelopper() {
		return developper;
	}

	public void setDevelopper(TeamMember developper) {
		this.developper = developper;
	}

	public TeamMember getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(TeamMember productOwner) {
		this.productOwner = productOwner;
	}

}
