package com.m2i.formation;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest2 {

	protected Addition op= new Addition();
	@Test
	public void testCalculer() {
		assertEquals(5, op.calculer(2, 3));
	}

	@Test
	public void testLireSymbole() {
		assertEquals('-', op.lireSymbole());
	}

}
