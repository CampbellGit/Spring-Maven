package com.m21.formation.injection.dyn;

import java.io.File;

import java.util.Arrays;
import java.util.Scanner;

public class TeamInstDyn {

	// Injection de dépendances dynamiques

	public static void main(String[] args) {

		Scanner scanner;
		try {
			scanner = new Scanner(new File("config.txt"));

			String memClassName = scanner.nextLine();
			System.out.println("memberClassName : " + memClassName);
			Class cmember = Class.forName(memClassName);
			System.out.println("cmember : " + cmember);
			ITeamMember member = (ITeamMember) cmember.newInstance();
			System.out.println(member.getMemberDetails()[0]);
			System.out.println(member.getMemberDetails()[1]);
			System.out.println(member.getMemberDetails()[2]);
			System.out.println(Arrays.toString(member.getMemberDetails()));

		}

		catch (Exception e) {

			System.out.println(e);
		}

		finally

		{
			System.out.println("Enfin, je rentre dans le finally");

		}

	}

}
