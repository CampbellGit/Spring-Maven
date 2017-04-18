package com.m2i.formation;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	
	protected Addition op = new Addition();
	
	public void testCalculer() throws Exception{
		assertEquals(4, op.calculer(1, 3));

		
	}
	public void testLireSymabole() throws Exception{
		assertEquals('-', op.lireSymbole());
	
	}
}
