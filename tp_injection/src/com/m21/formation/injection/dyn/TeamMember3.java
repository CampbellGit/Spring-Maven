package com.m21.formation.injection.dyn;

public class TeamMember3 implements ITeamMember {

	private String role = "scumMaster";
	private int xpYears = 5;
	private String name = "Jean-Paul";

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
