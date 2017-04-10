package com.m21.formation.injection.dyn;

public class TeamMember2 implements ITeamMember {

	private String role = "developper";
	private int xpYears = 2;
	private String name = "Micheline";

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getXpYears() {
		return xpYears;
	}

	public void setXpYears(int xpYears) {
		this.xpYears = xpYears;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String[] getMemberDetails() {
		// TODO Auto-generated method stub
		return new String [] {role, Integer.toString(xpYears), name};
	}
	
	

}
