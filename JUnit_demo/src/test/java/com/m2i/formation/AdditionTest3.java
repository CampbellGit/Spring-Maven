package com.m2i.formation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest3 {
	protected Addition op = new Addition();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Début classe test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Ciao bye !");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Début method test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("fin method test");
	}

	@Test
	public void testCalculer() {
		assertEquals(5, op.calculer(1, 3));
	
	}

	@Test
	public void testLireSymbole() {
		assertEquals('-', op.lireSymbole());
	}
	
	@Test
	public void testCalculer2() {
		assertEquals(5, op.calculer(2, 3));
	
	}

}
