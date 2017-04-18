package com.m2i.formation.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.entity.Employee;

public class TestEmployeService {
	
	static EmployeeService employeeService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");
		employeeService = (EmployeeService) appContext.getBean("employeeService");
		

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
	public void testGetEmployeeDAO() {

	}

	@Test
	public void testSetEmployeeDAO() {

	}

	@Test
	public void testCreateEmployee() {
		Employee ajout = new Employee(15, "Michel3", "Truc4", "Bidule5","Michel6", "Truc7", "Bidule8" ) ;

		assertTrue(employeeService.createEmployee(ajout));
	}

	@Test
	public void testEmployeeService() {

	}

}
