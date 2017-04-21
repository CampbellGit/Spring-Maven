package com.m2i.formation;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.dao.CatalogDAOImpl;
import com.m2i.formation.dao.entity.Product;


public class TestCatalogDAOImpl {
	Product p = new Product();
	static CatalogDAOImpl catalogDAO;
	static ApplicationContext appContext;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		appContext = (ApplicationContext) new ClassPathXmlApplicationContext("root-context.xml");
		
		catalogDAO = (CatalogDAOImpl) appContext.getBean("catalogDAO");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindProductByRef() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindProductByCriteria() {
		Product test = new Product();
		assertNotSame(test, catalogDAO.findProductByCriteria("Truc"));
	}

	@Test
	public void testFindAllProducts() {
		fail("Not yet implemented");
	}

}
